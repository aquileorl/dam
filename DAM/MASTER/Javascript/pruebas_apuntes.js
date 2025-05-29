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

//splice(): Cambia el contenido array eliminando existentes y/o agregando nuevos
array.splice(2,1,'a','b');
console.log(array);

