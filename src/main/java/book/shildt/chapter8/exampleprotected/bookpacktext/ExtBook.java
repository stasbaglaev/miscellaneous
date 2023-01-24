package book.shildt.chapter8.exampleprotected.bookpacktext;

public class ExtBook extends book.shildt.chapter8.exampleprotected.boockpack.Book {
    private String publisher;

    public ExtBook(String title, String author, int pubDate, String publisher) {
        super(title, author, pubDate);
        this.publisher = publisher;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return super.title;
    }

    public String getAuthor() {
        return super.author;
    }

    public int getPubDate() {
        return super.pubDate;
    }

    public void setTitle(String title) {
        super.title = title;
    }

    public void setAuthor(String author) {
        super.author = author;
    }

    public void setPubDate(int pubDate) {
        super.pubDate = pubDate;
    }
}


class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018, "Вильямс");
        books[1] = new ExtBook("Java: полное руководство,10-е издание", "Герберт Шилдт", 2018, "Вильямс");
        books[2] = new ExtBook("Искусство программирования на Java", "Герберт Шилдт", 2003, "Диалектика");
        books[3] = new ExtBook("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
        books[4] = new ExtBook("В дороге", "Джек Керуак", 2012, "Азбука");

        for (ExtBook book : books) {
            book.show();
        }

        // Поиск книг по автору
        System.out.println("Все книги Герберта Шилдта:");
        for (ExtBook book : books) {
            if (book.getAuthor() == "Герберт Шилдт") {
                System.out.println(book.getTitle());
            }
        }

    }
}