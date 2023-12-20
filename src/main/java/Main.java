public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Грибоедов");
        Author author2 = new Author("Аркадий и Борис", "Стругатские");

        Book book1 = new Book("Горе от Ума", author1, 1822);
        Book book2 = new Book("Трудно быть богом", author2, 1963);

//        book2.setYear(2023);

        System.out.println(book1);
        System.out.println(book2);
    }
}