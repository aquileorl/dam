
const technologies = [
    "Javascript",
    "CSS",
    "HTML",
    "React",
    "Angular",
    "Node.js"
]


const ul = document.createElement("ul");

for (const tech of technologies){
    const li = document.createElement("li");
    li.innerText = tech;
    ul.appendChild(li);
}

document.body.appendChild(ul);

//SI quisiera hacerlo con un FOR NORMAL

/*  
for (let i = 0; i < technologies.length ; i++){
    const li = document.createElement("li");
    li.innerText = technologies[i];
}

*/


//AHORA VAMOS A CREAR UN BOTÓN QUE ACTIVE EL MODO NOCHE EN LA WEB
const button = document.createElement("button");
button.innerText = "Change Theme" ;



button.addEventListener("click" , () => {
    document.body.classList.toggle("dark");
});

document.body.appendChild(button);