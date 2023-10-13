package org.example;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("2070782", "Daniela Padilla");
        student.Bienvenida();

        Mentor mentor = new Mentor("139471357", "James Florez");
        mentor.Bienvenida();

        Course course = new Course("Clase Java", "ALGO", 100);
        course.Bienvenida();
        Course course2 = new Course("Operating Systems", "OSP", 80);
        student.enrroll(course);
        student.enrroll(course2);


        System.out.println(student);
        System.out.println(mentor);
        System.out.println(course);
    }

}