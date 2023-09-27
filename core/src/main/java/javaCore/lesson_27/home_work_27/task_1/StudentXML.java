package javaCore.lesson_27.home_work_27.task_1;

import java.util.Objects;

public class StudentXML {

    private int groupNumber;
    private String name;
    private String surname;
    private String faculty;
    private StudAddress address;

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public StudAddress getAddress() {
        return address;
    }

    public void setAddress(StudAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentXML that)) return false;
        return groupNumber == that.groupNumber && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(faculty, that.faculty) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNumber, name, surname, faculty, address);
    }

    @Override
    public String toString() {
        return "StudentXML{" +
                "groupNumber=" + groupNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", address=" + address +
                '}';
    }
}
