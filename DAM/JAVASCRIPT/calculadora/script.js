

function calculadora(a,b) {
    console.log("Suma: ", a + b);
    console.log("Resta: ", a - b);
    console.log("Multiplicación: ", a * b);
    console.log("División: ", a / b);
    

}

function comparar(n1, n2) {

    console.log("¿Son iguales? ", n1 == n2 ); //Esto nos devolverá true o false
    console.log("Son iguales? ", n1 === n2); //Este '===' comparara TIPO y CONTENIDO. El '==' solo compara contenido.
    console.log("¿n1 es mayor que n2? ", n1>n2);
    console.log("¿n1 es menor que n2? ", n1 < n2);


}

comparar(10,10.0);

function calcular(){

    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    let operacion = document.getElementById("operacion").value;
    let resultado;

    switch(operacion){
        case "sumar": 
            resultado = num1 + num2;
            break;

        case "restar":
            resultado = num1 - num2;
            break;

        case "multiplicar":
            resultado = num1 * num2;
            break;
        
        case "dividir":
            if(num2 == 0 ) {
                document.getElementById("resultado").innerText = "No se puede dividir por 0"; //Inserta un texto como "valor" en el párrafo
                return; //con esto salimos de la función sin devolver nada, y se para la función para que no continue ejecutando el código de más abajo
                //de lo contrario, pese a mostrar el mensaje, saldría del if y haría la división que tenemos debajo, dando error. 
            }

            resultado = num1 / num2 ;
            break;

        case "modulo":
            resultado = num1 % num2 ;
            break;

        default:
            resultado = "Operación no válida";
    }

        document.getElementById("resultado").innerHTML = "RESULTADO: " + resultado;

}

function comparar(){
     
    let valor1 = parseFloat(document.getElementById("valor1").value);
    let valor2 = parseFloat(document.getElementById("valor2").value);
    let operacion = document.getElementById("comparacion").value;
    let resultado;

    switch(operacion){
        case "==":
            resultado = valor1 == valor2 ? "Verdadero" : "Falso";
            break;

        case "===":
            resultado = valor1 === valor2 ? "Verdadero" : "Falso";
            break;

        case "!=":
            resultado = valor1 != valor2 ? "Verdadero" : "Falso";
            break;
        
        case "!==": 
            resultado = valor1 !== valor2 ? "Verdadero" : "Falso";
            break;

        case ">":
            resultado = parseFloat(valor1) > parseFloat(valor2) ? "Verdadero" : "Falso";
            break;

        case "<":
            resultado = parseFloat(valor1) < parseFloat(valor2) ? "Verdadero" : "Falso";
            break;

        case ">=":
            resultado = parseFloat(valor1) >= parseFloat(valor2) ? "Verdadero" : "Falso";
            break;

        case "<=":
            resultado = parseFloat(valor1) <= parseFloat(valor2) ? "Verdadero" : "Falso";
            break;  

        default:
            resultado = "Operación no válida";

    }

    document.getElementById("resultadoComparacion").innerText = "Resultado: "+ resultado;

}