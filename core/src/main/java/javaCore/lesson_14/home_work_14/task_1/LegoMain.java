package javaCore.lesson_14.home_work_14.task_1;

public class LegoMain {

    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("Hey", 11, LegoColor.ORANGE);
        LegoAnnotationService[] services = new LegoAnnotationService[]{
                new NotEmptyValidationService(), new SizeValidationService(), new ColorValidationService()
        };

        for (LegoAnnotationService service: services) {
            ValidationResult result = service.validate(lego);
            System.out.println(result);
        }
    }
}
