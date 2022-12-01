package book.shildt.chapter8;

public class ClassImpConst  implements Const, ConstExt{


    @Override
    public void getX() {
        ConstExt.super.getX();
    }
}
