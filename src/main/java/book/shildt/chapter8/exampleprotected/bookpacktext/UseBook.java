package book.shildt.chapter8.exampleprotected.bookpacktext;

class UseBook {
    public static void main(String[] args) {
        book.shildt.chapter8.examplebook.boockpack.Book[] books = new book.shildt.chapter8.examplebook.boockpack.Book[5];

        books[0] = new book.shildt.chapter8.examplebook.boockpack.Book("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
        books[1] = new book.shildt.chapter8.examplebook.boockpack.Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new book.shildt.chapter8.examplebook.boockpack.Book("Искусство программирования на Java", "Герберт Шилдт", 2005);
        books[3] = new book.shildt.chapter8.examplebook.boockpack.Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new book.shildt.chapter8.examplebook.boockpack.Book("В дороге", "Джек Керуак", 2012);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

    }
}
