package Objetitos;

import java.math.BigInteger;

public class Pinguino implements PinguinoSkills {

    //atributo
    private BigInteger id;
    private String name;
    private Integer alas;

    public Pinguino(BigInteger id, String name, Integer alas) {
        this.id = id;
        this.name = name;
        this.alas = alas;
    }

    public Integer getAlas() {
        return alas;
    }

    public void setAlas(Integer alas) {
        this.alas = alas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //metodos
    @Override
    public boolean puedeVolar() {
        return false;
    }

    @Override
    public boolean equals(Object obj) { //Devuelve true o false comparando el objeto y los atributos
        return super.equals(obj);
    }

    @Override
    //crear clon => Crea un nuevo objeto con la misma info
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    Pinguino p = new Pinguino(456, "Alfredo", 7);
    Pinguino p2 = p.clone();
    Pinguino p3 = p2; //son el mismo objeto, le hemos dicho que p3 sea ESE OBJETO p2, es como ponerle un mote
    p == p2; //true, porque tiene las propiedades iguales
    p === p2; //porque no son el mismo objeto
    p3 === p2; //true, porque es el mismo objeto pero con "un mote"




}



