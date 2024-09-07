package org.example.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Student student = new Student.Builder("amine","inpt").setAge(19).build();
        System.out.println(student);
    }
}
