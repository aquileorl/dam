
const titulo = document.querySelector("h1");
console.log(titulo);

const divP = document.querySelector("div > p");
console.log(divP);

const allDivP = document.querySelectorAll("div > p");
console.log(allDivP);

console.log(titulo.parentElement);

const divpp = document.querySelector("div");
console.log(divpp.children);

//Crear elementos

let nuevoH2 = document.createElement("h2");
let nuevoParrafo = document.createElement("p");

//Crear nodos de texto
let textoH2 = document.createTextNode("Hola Mundo Cruel");
let textoParrafo = document.createTextNode("Viva España y Hala Madrid");

let cabecera = document.querySelector("h1");

//Añadimos nodos hijos al elemento seleccionado
cabecera.appendChild(nuevoH2);
cabecera.appendChild(nuevoParrafo);

//Recuperamos el nodo padre del elemento seleccionado
let padre = cabecera.parentNode;

//Insertamos nuevoH2 justo antes del elemento cabecera
padre.insertBefore(nuevoH2, cabecera);


