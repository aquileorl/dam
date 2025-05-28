
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

document.getElementById("fileInput").addEventListener("change", function(event){

    const file = event.target.files[0];

    /*
    Ahora pondremos una medida de seguridad para asegurarse de que 
    haya un archivo antes de intentar hacer algo con él, como leerlo o procesarlo.
    */
    if(!file){
        alert("No se seleccióno ningún archivo");
        return;
    }
    
    
    const reader = new FileReader();
    reader.readAsText(file);

    reader.onload = function(e){

        const xmlString = e.target.result; //obtenemos en la variable el contenido dentro del archivo en tipo texto

        
        const parser = new DOMParser();
        const xmlDoc = parser.parseFromString(  xmlString   ,  "application/xml"   );

        //Ahora construimos el vector, posicionando en cada posicion cada elemento <persona>
        const personas2 = xmlDoc.getElementsByTagName("persona");

        /*
            personas2 no es exactamente un array como nuestro vector personas original, es una colección de nodos,
            un tipo especial de colección que SE PARECE A UN ARRAY, llamada HMTLCollection. Veremos que es por 
            eso que en el bucle de abajo para volcar el contenido de personas2 a personas es necesarios hacerlo 
            de la forma que lo hacemos:
        */

        //vaciamos el vector personas original, porque queremos el que haya en nuestro archivo, volcado en personas2
        personas = [];

        //ahora rellenamos el vector personas con los objetos que haya en personas2
        for(let i= 0; i < personas2.length ; i++){
            
            const p = personas2[i];
            let nombre =  p.getElementsByTagName("nombre")[0]?.textContent        || "";
            let edad =  p.getElementsByTagName("edad")[0]?.textContent        || "";
            let ocupacion =  p.getElementsByTagName("ocupacion")[0]?.textContent        || "";
            let genero =  p.getElementsByTagName("genero")[0]?.textContent        || "";

            personas.push({nombre, edad, ocupacion, genero});
        }

        guardarLocalStorage();
        actualizarTabla();
        alert("Datos cargados");
    }

});