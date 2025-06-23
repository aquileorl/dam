
//PARA CUANDO LA PÁGINA SE TERMINA DE CARGAR

window.addEventListener("load", function(){
    console.log("LA PÁGINA SE HA CARGADO CORRECTAMENTE");
});


// PARA CADA VEZ QUE EL USUARIO REDIMENSIONA EL TAMAÑO DE LA VENTANA

window.addEventListener("resize", function(){
    console.log("LA VENTANA ESTÁ CAMBIANDO DE TAMAÑO");
})

//PARA CADA VEZ QUE SE HACE SCROLL ARRIBA O ABAJO

window.addEventListener("scroll", function(){
    console.log("ESTÁS SURFEANDO LA WEB!!");
});