
const hasEstudiado = true;
const hasLimpiado = true;

if (hasEstudiado == true) {
    console.log("Puedes jugar");
}

//LO ANTERIOR PODRÍAMOS ABREVIARLO DE LA SIGUIENTE MANERA
if (hasEstudiado) {
    console.log("Puedes jugar");
} else{
    console.log("Tienes que terminar tus deberes");
}

//Ejemplo para usar el NO ! => que equivale a if(hasEstudiado == false)
if (!hasEstudiado) {
    console.log("Debes estudiar primero");
}

if (hasEstudiado && hasLimpiado) {
    console.log("Puedes ir a jugar");   
}

if (hasEstudiado || hasLimpiado) {
    console.log("Puedes ir a jugar");   
}

const score = 5;

if(score >= 0 && score <5){
    console.log("Insuficiente");
}else if(score >=5 && score <6){
    console.log("Suficiente");
} else if (score >=6 && score < 7) {
       console.log("Bien"); 
} else if (score >=7 && score <9) {
    console.log("Notable");
} else if (score >= 9 && score <=10) {
    console.log("Sobresaliente");
} else {
    console.log("No nota");
}

const consola = "PS5";

switch (consola) {
    case "PS5":
            console.log("Es de Sony");
        break;

    case "NintendoSwitch":
            console.log("Es de Nintendo");
        break;

    case "Xbox":
        console.log("Es de Microsoft");
        break

    default:
            console.log("No conocemos la consola.")
        break;
}

//TERNARIO => aconsejable solo cuando queremos hacer una pregunta y que tengamos 2 opciones
/* De ahí su nombre TERnario:
1- condicion
2- una opcion
3- otra opcion
 */
const age = 18;

age >= 18 ? console.log("Puede pasar") : console.log("No puede pasar");

//ESTRICTAMENTE IGUAL
const x  = 10; 

if (x == "10") {
    console.log("Es igual");
}

if (x === "10") {
    console.log("Es igual");
} else {
    console.log("No es igual");
}
    
