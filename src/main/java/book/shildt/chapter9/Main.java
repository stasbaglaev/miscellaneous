package book.shildt.chapter9;

public class Main {

    public static void main(String[] args) {

        try {
            get(1);
        } catch (StasunException e) {
            System.out.println(e.getMessage());
            System.out.println("Стасун негодник!");
        }


    }

    static void get(int i) {
        throw new StasunException();
    }
}
