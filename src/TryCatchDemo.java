
public class TryCatchDemo {
    public static void main(String args[]) {
        /*try {
            int number = 56 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("the number should not divide by Zero");
        }
        System.out.println("Rest of the code");*/
        try {
            int num[] = new int[5];
            num[5] = 89 / 0;
        }
        //catch (Exception e) {System.out.println("The common error is catched");}

        catch (ArithmeticException e) {System.out.println("Arithmetic exception is catched");}

        catch (ArrayIndexOutOfBoundsException e){System.out.println("Array Index Out Of Bounds Exception is catched");}

        catch (Exception e) {System.out.println("The common error is catched");}

        System.out.println("Rest of the code");
    }
}
