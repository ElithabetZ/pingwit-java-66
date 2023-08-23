package org.example.lesson_26.home_work_26;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int groupNum;
    private Address address;
    private Contact contact;
    private List<Subject> favSubjects;

    public Student(){

    }
    public Student(String name, String surname, int groupNum, Address address, Contact contact, List<Subject> favSubjects) {
        this.name = name;
        this.surname = surname;
        this.groupNum = groupNum;
        this.address = address;
        this.contact = contact;
        this.favSubjects = favSubjects;
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

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Subject> getFavSubjects() {
        return favSubjects;
    }

    public void setFavSubjects(List<Subject> favSubjects) {
        this.favSubjects = favSubjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return groupNum == student.groupNum && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address) && Objects.equals(contact, student.contact) && Objects.equals(favSubjects, student.favSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, groupNum, address, contact, favSubjects);
    }

    @Override
    public String toString() {
        return "Student:" + "\n"+
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupNum=" + groupNum + ", \n"+
                " address=" + address + ", \n"+
                " contact=" + contact + ", \n"+
                " favSubjects=" + favSubjects +"\n";
    }
}
