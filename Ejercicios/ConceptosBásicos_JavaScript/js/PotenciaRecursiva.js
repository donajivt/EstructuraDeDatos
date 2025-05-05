const btn = document.getElementById('calcular');
const r = document.getElementById('resp');

const calcularPotencia = () =>{
    let exponente =parseInt(document.getElementById('exponente').value);
    let base = parseInt(document.getElementById('base').value);

    let salida= "";
    if(isNaN(base) || isNaN(exponente) || base<= 0 || exponente <0){
        salida = 'Los valores no son validos';
        r.innerHTML= salida;
        return;
    }
    let resp = potencia(base, exponente);
    salida = `La potencia de ${base} a la ${exponente} es igual a ${resp}`;
    r.innerHTML= salida;
}

function potencia(ba, e){
    if(e == 0)
        return 1;
    else
        return ba * potencia(ba, e -1);
}


btn.addEventListener('click',calcularPotencia);