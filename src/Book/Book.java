package Book;

public class Book {
  // Variables
  private String name;
  private String author;
  private int pages;

  // Constructor (overloaded)
  public Book() {
    name = "Any name";
    author = "Any author";
    pages = 0;
  }
  public Book(String n, String a) {
    name = n;
    author = a;
    pages = 0;
  }
  public Book(int p) {
    name = "Any name";
    author = "Any author";
    pages = p;
  }
  public Book(String n, String a, int p) {
    name = n;
    author = a;
    pages = p;
  }

  // Methods
  public void setName(String n) {
    this.name = n;
  }
  public void setAuthor(String a) {
    this.author = a;
  }
  public void setPages(int p) {
    this.pages = p;
  }
  public String getName() {
    return this.name;
  }
  public String getAuthor() {
    return this.author;
  }
  public int getPages() {
    return this.pages;
  }
 public String toString() {
    return this.author + "'s " + this.name + " has " + this.pages + " pages";
 }
}