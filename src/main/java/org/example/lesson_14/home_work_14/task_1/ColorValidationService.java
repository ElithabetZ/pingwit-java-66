package org.example.lesson_14.home_work_14.task_1;

import java.lang.reflect.Field;

public class ColorValidationService implements LegoAnnotationService{
    @Override
    public ValidationResult validate(Lego lego) throws IllegalAccessException {
        Field[] declaredField = lego.getClass().getDeclaredFields();
        ValidationResult validationResult = new ValidationResult(true, "Ok");
        for (Field field: declaredField) {
            ValidColor annotation = field.getAnnotation(ValidColor.class);
            if(annotation != null){
                field.setAccessible(true);
                Object value = field.get(lego);
                if(value instanceof LegoColor){
                    LegoColor fieldValue = (LegoColor) value;
                    LegoColor[] colors = annotation.colors();
                    for (LegoColor color: colors) {
                        if(fieldValue == color){
                            validationResult = new ValidationResult(false, field.getName() + " is invalid");
                            break;
                        }
                    }
                }
            }
        }
        return validationResult;
    }
}
