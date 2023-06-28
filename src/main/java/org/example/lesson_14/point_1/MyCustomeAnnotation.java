package org.example.lesson_14.point_1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)

@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomeAnnotation {
}
