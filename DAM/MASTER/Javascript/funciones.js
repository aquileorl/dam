function pokemonAttack(){
    console.log("Pikachu, Impact Trueno!");
}

function pokemonAttackParam(name,attack){
    console.log(`¡${name}, ${attack}!`);
}

pokemonAttack();
pokemonAttackParam("Charmander", "Ascuas");

/* Imaginar querer un ataque por defecto cuando no le pasemos el argumento attack a nuestra función.
Podemos especificar un valor llamado “default” (predeterminado) en la declaración de función usando =
Ahora, si no existe el parámetro attack, obtendrá el valor 'Ataque arena'. */
function pokemonAttackParam1(name,attack = "Placaje"){
    console.log(`!${name}, ${attack}!`);
}

pokemonAttackParam1("Onyx");

//Vamos ahora a realizar una función que nos saque los datos de un OBJETO, que será usuario
function describeUser(user){
    console.log("Nombre: "+ user.name);
    console.log("Apellido: "+ user.lastname);
    console.log("Trabajo "+ user.job);
}

describeUser({
    name: "Emilius",
    lastname: "Black",
    job: 'Programador',
});