package javaCore.lesson_11.point_1;

import java.lang.reflect.Field;

public class PrivateClubFieldMain {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        PrivateClub privateClub = new PrivateClub();
        System.out.println(privateClub);

        Class<PrivateClub> privateClubClass = PrivateClub.class;
        Field[] declaredFields = privateClubClass.getDeclaredFields();
        for(Field field : declaredFields)
        {
            if(field.getName().equals("clubName"))
            {
                field.setAccessible(true);
                field.set(privateClub, "Mega Club");
            }
        }
        System.out.println(privateClub);

        Field field = privateClubClass.getDeclaredField("clubName");
        field.setAccessible(true);
        field.set(privateClub, "Mega Club 2");
        System.out.println(privateClub);
    }
}
