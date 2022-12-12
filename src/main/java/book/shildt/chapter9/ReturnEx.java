package book.shildt.chapter9;

public class ReturnEx {

//    public static void main(String[] args) {
//
//        try {
//            System.out.println("Блок try");
//        } catch (final ArithmeticException | ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Блок catch");
//        } finally {
//            System.out.println("Блок finally");

    public static void main(String[] args) {

        try {
            System.out.println("Блок try");
            throw new StringIndexOutOfBoundsException("Стасун сгенерировал");
        } catch ( StringIndexOutOfBoundsException exp) {
            System.out.println("Блок catch");
            exp.printStackTrace();
            System.out.println();
            exp = new StringIndexOutOfBoundsException("Стасун падла");
            throw exp;
        } finally {
            System.out.println("Блок finally");
        }
    }
//        }
//    }

}


