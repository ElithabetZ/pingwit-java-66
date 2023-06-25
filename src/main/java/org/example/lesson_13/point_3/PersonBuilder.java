package org.example.lesson_13.point_3;

public class PersonBuilder {

    public static void main(String[] args) {
        int id = 23;
        String name = "Jaohn";
        Person person = null;
        person = buildPerson(id, name);
    }

    private static Person buildPerson(int id, String name)
    {
        return new Person(id, name);
    }
}
