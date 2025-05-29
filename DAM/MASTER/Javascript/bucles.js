
//BUCLE FOR
const alumnos = ["Emilio", "Aida", "David", "Fernando"];

for (let i= 0; i < alumnos.length ; i++) {
    console.log(alumnos[i] + " , ");
    
}


//BUCLE FOR-OF, es una forma abreviada de hacer lo de arriba.

for (const alumno of alumnos) {

    console.log(alumno);
    
}


//

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
console.log(promedio);