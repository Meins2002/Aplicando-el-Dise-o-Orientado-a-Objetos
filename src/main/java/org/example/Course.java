package org.example;

class Course implements Saludo {

    //atributos privados
    private String Name;
    private String Code;
    private int Credits;

    //constructor
    public Course(String Name, String Code, int Credits) {
        this.Name = Name;
        this.Code = Code;
        this.Credits = Credits;
    }

    //Getters: acceder a los atributos privados
    public String getName (){
        return Name;
    }
    public String getCode () {
        return Code;
    }
    public int getCredits(){
        return Credits;
    }

    //Setters: para modificar los atributos privados
    public void setName(String Name){
        this.Name = Name;
    }
    public void setCode(String Code){
        this.Code = Code;
    }
    public void setCredits(int Credits){
        this.Credits = Credits;
    }

    @Override
    public void Bienvenida (){
        System.out.println("Bienvenedos a esta Curso: " + Name );
    }
}
