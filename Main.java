public class Main {
    public static void main(String[] args) {
        Book book = new Book("River and the source", 2014, 200);
        Book book1 = new Book("River and the source", 2015, 210);
        Book book2 = new Book("River and the source", 2016, 220);

        Book[] books = {book,book1, book2};
        Library library = new Library("NyC", 1897,books);
        library.displayInfo();



    }


}
