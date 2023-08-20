package org.example.lesson_14.home_work_14.task_1;

import java.lang.reflect.Field;

public class NotEmptyValidationService implements LegoAnnotationService{
    @Override
    public ValidationResult validate(Lego lego) throws IllegalAccessException {
        Field[] declaredField = lego.getClass().getDeclaredFields();
        ValidationResult validationResult = new ValidationResult(true, "Ok");
        for (Field field: declaredField) {
            NotEmptyTwo annotation = field.getAnnotation(NotEmptyTwo.class);
            if(annotation != null){
                field.setAccessible(true);
                Object value = field.get(lego);
                if(value instanceof String){
                    String fieldValue = (String) value;
                    if(fieldValue.isEmpty()){
                        validationResult = new ValidationResult(false, field.getName() + " is invalid");
                        break;
                    }
                }
            }
        }
        return validationResult;
    }
}
