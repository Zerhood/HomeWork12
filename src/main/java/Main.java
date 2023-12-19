public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Aleksandr", "Griboedov");
        Author author2 = new Author("Arkadiy and Boris", "Strugatskie");

        Book book1 = new Book("Gore ot Uma", author1, 1822);
        Book book2 = new Book("Trudno byt' bogom", author2, 1963);

        book2.setYear(2023);

        System.out.println(book1);
        System.out.println(book2);
    }
}