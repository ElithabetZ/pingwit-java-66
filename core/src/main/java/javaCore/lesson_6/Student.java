package javaCore.lesson_6;

public class Student {
    static String className;
    static int howManyIteration;
    String name;
    String surname;
    int age;

    {
        System.out.println("init block");
    }

    static{
        howManyIteration = 2;
        System.out.println("Init block");
    }

    public Student(String stName, String stSurname, int age){
        name = stName;
        this.surname = stSurname;
        this.age = age;
        howManyIteration++;
    }

        void displayInfo(){
            System.out.println("Name "+name+" Age "+age);
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

}
