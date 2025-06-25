
const btn = document.querySelector("#btn");

btn.addEventListener("click", (ev) => {
    const p = document.createElement("p");
    p.innerText = "Has hecho click";
    document.body.appendChild(p);

    const h1 = document.createElement("h1");
    h1.innerText = "has hecho click otra vez creando h1";
    document.body.appendChild(h1);
})

window.addEventListener("scroll", (ev) => {
    console.log(ev);
});