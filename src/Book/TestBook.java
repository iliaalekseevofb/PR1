package Book;

public class TestBook {
  public static void main (String[] args) {
    Book book1 = new Book();
    Book book2 = new Book("Приключения Шерлока Холмса", "Артур Конан Дойл");
    Book book3 = new Book(500);
    Book book4 = new Book("Убийство на Ниле", "Агата Кристи", 400);

    System.out.println(book1.getName());
    System.out.println(book1.getPages());

    book1.setName("Something");
    book1.setAuthor("Someone");
    book3.setPages(300);

    System.out.println(book1.getName());
    System.out.println(book1.getAuthor());
    System.out.println(book2.getAuthor());
    System.out.println(book2.getPages());
    System.out.println(book3.getPages());
    System.out.println(book4.getPages());

    book4.setAuthor("Someone");

    System.out.println(book4.getAuthor());
    System.out.println(book4);
  }
}