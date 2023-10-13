package org.example;

public abstract class Persona implements Saludo {

    //atributos
    private String id;
    private String name;

    //constructor
    public Persona(String id , String name){
        this.id = id;
        this.name = name;
    }



    //Metodos

    //get
    public String getId(){
        return id;
    }
    public  String getName(){
        return name;
    }

    //set
    public void setId(String id){
        this.id = id;

    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString () {
        return "id: " + id + "name: " + name;
    }

    @Override
    public abstract void Bienvenida();

}
