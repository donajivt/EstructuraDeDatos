function factorialFor(n){
    let fact = 1;

    for(let i = 1; i <= n; i++){
        fact *= i;
    }
    return fact;
}

const factForFlecha = n => {
    let fact = 1;

    for(let i = 1; i <= n; i++){
        fact *= i;
    }
    return fact;
}
const fact1 = factorialFor(5);
const fact2 = factForFlecha(10); 
const salida = `El factorial utilizando una función clásica es ${fact1}, 
El factorial utilizando una función de flecha es: ${fact2}`;

//console.log(salida);
alert(salida);