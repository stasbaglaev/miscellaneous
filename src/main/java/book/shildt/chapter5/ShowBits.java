package book.shildt.chapter5;

public class ShowBits {
    int numBits;

    public ShowBits(int numBits) {
        this.numBits = numBits;
    }

    public void show(long val) {
        int spacer = 0;
        long mask = 1;
        mask <<= numBits - 1;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            spacer++;
            if (spacer == 8) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        ShowBits bits8 = new ShowBits(8);
//        bits8.show(123);

        ShowBits bits32 = new ShowBits(64);
        bits32.show(237658768);
    }
}
