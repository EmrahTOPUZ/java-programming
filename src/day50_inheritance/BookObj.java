package day50_inheritance;

public class BookObj {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to Java";
        book.author = "Savic";
        book.type = "Programming book";
        book.price = 85.99;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.title = "Kirk Haramiler";
        audioBook.author = "Omer Seyfettin";
        audioBook.length = 60;
        audioBook.narrator = "Imge";
        audioBook.price = 13.99;
        audioBook.type = "hikaye";
        audioBook.listen();

        Ebook ebook = new Ebook();
        ebook.title = "Tinder Dating book";
        ebook.author = "Emrah Topuz";
        ebook.type = "information";
        ebook.price = 12.99;
        ebook.pages = 1000;
        ebook.readBook();
    }
}
