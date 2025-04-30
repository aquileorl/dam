
//Vamos a definir un elemento vector 

let personas =  JSON.parse(localStorage.getItem("personas")) || [];

let editIndex =-1; //indice no válido para un vector, por tanto es seguro inicializarlo así

window.onload = () => {

    actualizarTabla();

};


document.getElementById("agregar").addEventListener("click",function(){

    let nombreP = document.getElementById("nombre").value.trim();
    let edadP = parseFloat(document.getElementById("edad").value.trim());
    let ocupacionP = document.getElementById("ocupacion").value.trim();
    let generoSeleccionado = document.querySelector('input[name="genero"]:checked');
    let generoP = generoSeleccionado ? generoSeleccionado.value : "No seleccionado";


    if(nombreP == "" || edadP == "" || ocupacionP == ""){
        alert("Por favor, completa todos los campos.");
        return;
    }

    //AHORA DEBEMOS AÑADIR LOS VALORES AL VECTOR

    //creamos objeto persona con los 3 atributos a los que queremos asignarle los valores
    let persona = {
        nombre: nombreP, //el primer nombre es el nombre de la etiqueta, el segundo nombre es la variable con el valor
        edad: edadP,
        ocupacion: ocupacionP,
        genero: generoP
    };

    //ahora añadimos los valores de la persona
    personas.push(persona);

    guardarLocalStorage();

    //ahora limpiamos las casillas del formulario
    document.getElementById("nombre").value="";
    document.getElementById("edad").value="";
    document.getElementById("ocupacion").value="";
    if(generoSeleccionado){
        generoSeleccionado.checked = false;
    }
    

    //actualizamos la tabla con la función que creamos abajo
    actualizarTabla();
    


}); //addEventListener -> significa
//que a ese elemento (al botón agregar) le voy a añadir un escuchador de eventos, una persona
//que estará mirando con prismáticos al botón. 


function actualizarTabla(){

    /*1º-> Tengo que referenciar al trozo de código HTML donde quiero isnertar las filas.
    En nuestro código, será en el tbody de la tabla, que ya le dimos la id="tablaPersonas"*/

    let tabla = document.getElementById("tablaPersonas");

    // Ahora borro la tabla entera. 
    tabla.innerHTML = "";

    //Creo el bucle donde crearemos una fila

    for(let i = 0 ; i < personas.length; i++){
        
        //Creamos la variable fila y le metemos el código correspondiente
        let fila = ` 

            <tr>
                <td> ${personas[i].nombre} </td> 
                <td>  ${personas[i].edad} </td>
                <td>  ${personas[i].ocupacion}   </td>
                <td> ${personas[i].genero} </td>
                <td> 
                    <button class=edit-button id=editarPersona onclick="editarPersona(${i})">Editar</button>
                    <button class=delete-button id="eliminarPersona" onclick="borrarPersona(${i})"> Eliminar </button> 
                </td>


            </tr>
        `;

        //Ahora enviamos la fila a la tabla
        tabla.innerHTML += fila;
    }
}

function borrarPersona(index){
    personas.splice(index,1); //método con el que podemos eliminar elementos de un vector
    //splice(argumento 1, argumento 2); -> argumento 1: posición de la cual quiero partir
    //argumento 2: cuántos elementos quiero eliminar desde la posición de argumento 1 (en nuestro caso solo 1);
    guardarLocalStorage();
    actualizarTabla();
}

function editarPersona(index){
    
    let persona = personas[index];

    document.querySelector("#nombre").value = persona.nombre;
    document.querySelector("#edad").value = persona.edad;
    document.querySelector("#ocupacion").value = persona.ocupacion;
    
    let radios = document.querySelectorAll('input[name="genero"]');
    
    radios.forEach(radio => {
       
        if(radio.value === persona.genero){
            radio.checked = true;
        }
    });

    document.querySelector("#agregar").style.display = "none" ;
    document.querySelector("#editar").style.display = "block";

    editIndex = index;

}

document.querySelector("#editar").addEventListener("click",function(){

    if(editIndex == -1) return;

    personas[editIndex].nombre = document.getElementById("nombre").value.trim();
    personas[editIndex].edad = document.getElementById("edad").value.trim();
    personas[editIndex].ocupacion = document.getElementById("ocupacion").value.trim();

    let generoSeleccionado3 = document.querySelector('input[name="genero"]:checked');
    let gendre2 = generoSeleccionado3 ? generoSeleccionado3.value : "No Seleccionado";
    personas[editIndex].genero = gendre2;

    guardarLocalStorage();
    actualizarTabla();

    document.querySelector("#agregar").style.display = "block";
    document.querySelector("#editar").style.display = "none";

    document.getElementById("nombre").value= "";
    document.getElementById("edad").value= "";
    document.getElementById("ocupacion").value ="";
    if(generoSeleccionado3){
        generoSeleccionado3.checked = false;
    }

    editIndex = -1;


});


function guardarLocalStorage(){
    localStorage.setItem("personas" , JSON.stringify(personas));
}

function exportarXML(){

    let xml='<?xml version="1.0" encoding="UTF-8" ?>';
    xml += '<personas>';
    personas.forEach( p => {
        xml +=`<persona>
            <nombre> ${p.nombre} </nombre>
            <edad> ${p.edad} </edad>
            <ocupacion> ${p.ocupacion} </ocupacion>
            <genero> ${p.genero} </genero>
        </persona>
        `
    });
    xml += '</personas>';

    const blob = new Blob([xml], {type:"application/xml"});

    const a = document.createElement("a");
    a.href = URL.createObjectURL(blob);
    a.download = "personas.xml";
    a.click();
}
