const btn = document.getElementById('calcular');

const potencia=()=>{
    let exponente =parseInt(document.getElementById('exponente').value);
    let base = parseInt(document.getElementById('base').value);
    if (exponente>=0 && base>0){
        if (exponente === 0) return 1;
        if (base === 1) return base;
        return base * potencia((exponente-1), base);
    } else {
        return 0;
    }
}

// btn.addEventListener('click', potencia);

let resultado= document.getElementById("resp").textContent = "Resultado de la potencia es= " + potencia();
btn.addEventListener('click', resultado);
// document.getElementById("resp").textContent = "Resultado de la potencia es= " + potencia();

