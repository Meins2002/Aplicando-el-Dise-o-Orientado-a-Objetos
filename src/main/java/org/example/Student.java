package org.example;

import java.util.List;
import java.util.ArrayList;


class Student extends Persona {

    //atributos
    private float averageGrade; //calificación promedio
    private List<Course> enrolledCourses;//cursos inscritos



    //constructor
    public Student(String id, String name) {
        super(id , name);
        this.averageGrade = 0f;
        this.enrolledCourses = enrolledCourses;
    }



    //Metodos
    public boolean enrroll(Course course) {
        if (enrolledCourses == null) {
            enrolledCourses = new ArrayList<Course>();
        }
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student { " + "Nombre: " + getName () +  ", Identificación: " + getId() +
                ", averageGrade= " + averageGrade +
                ", enrolledCourses= " + enrolledCourses +
                '}';
    }
    public void Bienvenida (){
        System.out.println("Beinvenido estudiante : " + getName());
    }
}