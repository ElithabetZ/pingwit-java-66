package javaCore.lesson_15.point_3;

public class FinallyAdvancedExample {

    public static void main(String[] args) {
        System.out.println(returnExample());
    }

    private static String message(){
        try{
            Integer.valueOf("bjebdwke");
        } catch (NumberFormatException e){
            System.exit(1);
            System.out.println("aaaaaaaaa");
        } finally {
            return "Block finally value";
        }
    }

    private static String returnExample(){
        try{
            Integer.valueOf("feirjfir");
        } catch(NumberFormatException e){
            System.out.println("sssss");
            return "Catch";
        } finally {
            return "finally value";
        }
    }
}
