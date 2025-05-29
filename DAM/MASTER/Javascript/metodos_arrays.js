let array = [1,2,3,4,5];

//push()
array.push(6);

console.log(array); //<-- 1,2,3,4,5,6
array.push(7,8);
console.log(array); //<-- 1,2,3,4,5,6,7,8

//pop() -> Elimina último elemento y lo devuelve
let ultimoElemento = array.pop();
console.log(array); //<-- 1,2,3,4,5,6,7
console.log(ultimoElemento);//<-- 8

//shift(): Elimina el primer elemento array y lo devuelve
let primerElemento = array.shift();
console.log(array); // 2,3,4,5,6,7
console.log(primerElemento); //1

//unshift(): Añade uno o más elementos al inicio del array y devuelve la nueva longitud del array
let insertaYtamanyo = array.unshift(0);
console.log(array); // 0,2,3,4,5,6,7
console.log(insertaYtamanyo); //7

//slice(): Devuelve entre la parte del array entre posiciones indicadas
let trozo = array.slice(0,3);
console.log(trozo);



//concat(): Retorna un nuevo array que resulta de hacer una concatenacion con otro array
let array2 = ["CR7", "Messi"];
let nuevoArray = array.concat(array2);
console.log(nuevoArray);


//indexOf(): Retorna la PRIMERA posición donde se encuentra el elemento que añadimos como argumento
console.log(nuevoArray.indexOf("CR7")); //<-- 7
console.log(nuevoArray.indexOf(2));// <-- 1

//sort(): Ordena los elementos del array
console.log(nuevoArray.sort());

//reverse(): Invierte los elementos del array
console.log(nuevoArray.reverse());

//toString -> convertirá el array en un String
console.log(nuevoArray.toString());