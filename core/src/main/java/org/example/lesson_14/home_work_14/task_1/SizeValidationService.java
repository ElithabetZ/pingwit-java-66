package org.example.lesson_14.home_work_14.task_1;

import java.lang.reflect.Field;

public class SizeValidationService  implements LegoAnnotationService{

    @Override
    public ValidationResult validate(Lego lego) throws IllegalAccessException {
        Field[] declaredField = lego.getClass().getDeclaredFields();
        ValidationResult validationResult = new ValidationResult(true, "Ok");
        for (Field field: declaredField) {
            Size annotation = field.getAnnotation(Size.class);
            if(annotation != null){
                field.setAccessible(true);
                Object value = field.get(lego);
                if(value instanceof Integer){
                    Integer fieldValue = (Integer) value;
                    int min = annotation.min();
                    int max = annotation.max();
                    if(!(fieldValue>= min && fieldValue<=max)){
                        validationResult = new ValidationResult(false, field.getName() + " is invalid");
                        break;
                    }
                }
            }
        }
        return validationResult;
    }
}
