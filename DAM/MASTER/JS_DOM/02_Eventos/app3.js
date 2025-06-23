


//DESCRIBE EL EVENTO EN LA CONSOLA
let handleClick = function(event){
    console.log(event);
}

document.getElementById("btn").addEventListener("click", handleClick);

//DETECTA LA TECLA PRESIONADA EN EL INPUT TIPO TEXTO

const campoTexto = document.getElementById("miCampoTexto");

function handlePressedKey(){
    console.log("Tecla presionada: " + event.key);
}

campoTexto.addEventListener("keydown",handlePressedKey);

//CONTROLA EL CAMPO SELECCIONADO EN UN <SELECT>

const select = document.getElementById("mySelect");

function handleSelection(){
    const seleccion = select.value;
    console.log("Selección cambiada a : " + seleccion);
}

select.addEventListener("change", handleSelection);

//CONTROLAR EL PASO DEL RATÓN POR ENCIMA DE 1 ELEMENTO
const elemento = document.getElementById("miElemento1");

function handleMouseOver(){
    console.log("Pasando el ratón por encima del elemento");
}

elemento.addEventListener("mouseover", handleMouseOver);

//CERRAR MODAL CON TECLA ESC
const modal = document.getElementById("miModal");

function closeModal(event){
    if(event.key === "Escape"){
        modal.style.display = "none";
    }
}

document.addEventListener("keydown", closeModal);