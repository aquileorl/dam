
//Vamos a definir un elemento vector 

let personas = [];



document.getElementById("agregar").addEventListener("click",function(){

    let nombreP = document.getElementById("nombre").value.trim();
    let edadP = parseFloat(document.getElementById("edad").value.trim());
    let ocupacionP = document.getElementById("ocupacion").value.trim();


    if(nombreP == "" || edadP == "" || ocupacionP == ""){
        alert("Por favor, completa todos los campos.");
        return;
    }

    //AHORA DEBEMOS AÑADIR LOS VALORES AL VECTOR

    //creamos objeto persona con los 3 atributos a los que queremos asignarle los valores
    let persona = {
        nombre: nombreP, //el primer nombre es el nombre de la etiqueta, el segundo nombre es la variable con el valor
        edad: edadP,
        ocupacion: ocupacionP
    };

    //ahora añadimos los valores de la persona
    personas.push(persona);

    //ahora limpiamos las casillas del formulario
    document.getElementById("nombre").value="";
    document.getElementById("edad").value="";
    document.getElementById("ocupacion").value="";

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


            </tr>
        `;

        //Ahora enviamos la fila a la tabla
        tabla.innerHTML += fila;
    }
}