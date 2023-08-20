package org.example.lesson_14.point_1;

import java.lang.reflect.Field;

public class NotEmptyValidationService implements LegoAnnotationService{

    @Override
    public ValidateOnResult isValidate(Lego lego) throws IllegalAccessException {
        Field[] declaredField = lego.getClass().getDeclaredFields();
        ValidateOnResult validateOnResult = new ValidateOnResult(true, "ok");
        for(Field field : declaredField){
            NotEmpty annotation = field.getAnnotation(NotEmpty.class);
            if(annotation != null){
                field.setAccessible(true);
                Object value = field.get(lego);
                if(value instanceof String){
                    String fieldValue = (String) value;
                    fieldValue.isEmpty();
                    validateOnResult = new ValidateOnResult(false, field.getName()+"is not valid");
                    break;
                }
            }
        }
        return validateOnResult;
    }
}
