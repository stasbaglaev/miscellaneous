package book.shildt.chapter5;

class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if ((ob.a == this.a) & (ob.b == this.b) & (ob.c == this.c)) {
            return true;
        } else {
            return false;
        }
    }

    boolean sameVolume(Block ob) {
        if (ob.volume == this.volume) {
            return true;
        } else {
            return false;
        }
    }
}

class PassOb {
    public static void main(String args[]) {
        Block obi = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);
        System.out.println("obi имеет те же размеры, что и оЬ2:" + obi.sameBlock(ob2));
        System.out.println("obi имеет те же размеры, что и оЬЗ: " + obi.sameBlock(ob3));
        System.out.println("obi имеет тот же объем, что и оЬЗ: " + obi.sameVolume(ob3));

    }
}