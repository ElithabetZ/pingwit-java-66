package javaCore.lesson_14.point_1;

public class LegoMain {
    public static void main(String[] args) throws IllegalAccessException {
        Lego lego = new Lego("", 11);
        LegoAnnotationService[] services = new LegoAnnotationService[] {
                new NotEmptyValidationService()
        };
        for(LegoAnnotationService service: services){
            ValidateOnResult result = service.isValidate(lego);
            System.out.println(result);
        }
    }
}
