package org.example.lesson_18.point_1;

//public class Box<T1, T2, T3>{}
public class Box<T> {

    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
