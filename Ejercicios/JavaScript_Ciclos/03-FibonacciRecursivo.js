function fibonacci(n){
    // caso base
    if(n===0) return 0;
    if(n===1) return 1;
    if( n <= 2 ) return 1;

    // caso general
    return fibonacci(n-1) + fibonacci(n-2);
}
const n= 7;
const salida= `El fibonacci de ${n} es: ${fibonacci(n)}`;
console.log(salida);

// como se hacen los "snippet"