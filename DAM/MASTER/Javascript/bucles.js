
//BUCLE FOR
const alumnos = ["Emilio", "Aida", "David", "Fernando"];

for (let i= 0; i < alumnos.length ; i++) {
    console.log(alumnos[i] + " , ");
    
}


//BUCLE FOR-OF, es una forma abreviada de hacer lo de arriba. Bucle especializadn en recorrer
// elementos iterables (arrays, strings, mapas..)

for (const alumno of alumnos) {

    console.log(alumno);
    
}


//Usando objetos

const notas = [
    {nombre: "Base de datos", nota: 8},
    {nombre: "Programación", nota: 8.3},
    {nombre: "HTML", nota: 7.3},
];


let total = 0;
for (const nota of notas) {
    console.log(nota.nota);
    total += nota.nota;  
};

console.log(total);
let promedio = 0; 
promedio = total / notas.length;
console.log("El promedio de las notas es: ", promedio);



//bucle for in => enfocado a recorrer objetos

/* PRIMERO VAMOS A VER CÓMO RECORRER UN OBJETO SI NO PUDIÉRAMOS USAR FOR-IN  */
const user = {
    username: "aquileo",
    email: "aquileo@gmail.com",
};

//Object.keys me dará un array con todas las claves del objeto que le mande
const claves = Object.keys(user); //claves = ["username", "email"];


for(let i= 0; i < claves.length; i++){

    //nos guardamos la clave en cada iteración
    const key = claves[i]; 

    /* En lugar de usar . para acceder a la propiedad de los objetos
    usamos los corchets para poder obtener una propiedad de nuestro objeto
    con la variable key
    , que en cada vuelta del bucle será una clave del objeto.
    
    Con el . no podemos porque dentro de nuestro objeto no hay atributo que se llame key,
    no podemos hacer un user.key, porque no existe
    Por eso usamos el método con corchetes*/
    console.log(user[key]);
}
//o hacer esto
for(let i=0; i<claves.length;i++){
    console.log(user[claves[i]]);
}

//AHORA VAMOS A VER LO FÁCIL QUE ES CON FOR-IN recorrer el objeto

const user2 = {
    username: "emilio",
    email: "emilius@gmail.com",
};

for (const key in user2){
    console.log(user2[key]);
}


//BUCLE FOR-EACH => para recorrer arrays
const numbers = [1,2,3,4,5,6,7];

numbers.forEach(number) => {
    console.log(number);
}
