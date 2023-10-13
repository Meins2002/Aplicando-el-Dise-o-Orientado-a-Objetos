package org.example;

import java.util.List;

class Mentor extends Persona {


    //atributos privasos
    private float yearsOfExperience;
    private boolean isActive;
    private List<Course> coursesToTeach;



    //Constructor
    public Mentor (String id, String name){
        super(id, name);
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = true;
        this.coursesToTeach = coursesToTeach;
    }



    //Getters: acceder a los atributos privados
    public float getyearsOfExperience (){
        return yearsOfExperience;
    }
    public boolean getisActive(){
        return isActive;
    }

    public List<Course> getCoursesToTeach() {
        return coursesToTeach;
    }

    @Override
    public String toString() {
        return "Mentor { " + "Nombre del docente: " + getName() + ", Identificación: " + getId() +
                ", yearsOfExperience=" + yearsOfExperience +
                ", isActive=" + isActive +
                ", coursesToTeach=" + coursesToTeach +
                " }" ;
    }
    public void Bienvenida (){
        System.out.println("Bienvenido mentor: " + getName());
    }


}
