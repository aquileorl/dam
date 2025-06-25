
//Fecha y hora actual

const fechaActual = new Date();

console.log(fechaActual);

// Fecha personalizada: año, mes (0-11), día, horas, minutos, segundos, milisegundos
const fechaEspecifica = new Date(2025, 5, 18, 14, 30, 0, 0);
console.log(fechaEspecifica);


//Obtener año actual
console.log(fechaActual.getFullYear());

//Obtener mes actual (Van del 0 al 11)
console.log(fechaActual.getMonth());

//Obtener día del mes (Van del 1 al 7)
console.log(fechaActual.getDay());

//Obtener la hora actual (Del 0 al 24)
console.log(fechaActual.getHours());

//Obtener los minutos
console.log(fechaActual.getMinutes());

//Obtener los segundos
console.log(fechaActual.getSeconds());

//Obtener los milisegundos
console.log(fechaActual.getMilliseconds());

//Formatear fecha para mostrar al usuario
const fechaFormateada = fechaActual.toLocaleDateString('es-ES');
console.log(fechaFormateada);

//También podemos usar:
const soloFecha = fechaActual.toDateString();
console.log(soloFecha);