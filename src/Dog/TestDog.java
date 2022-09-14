package Dog;

public class TestDog {
  public static void main (String[] args) {
    Dog d1 = new Dog();
    Dog d2 = new Dog("Rex");
    Dog d3 = new Dog ("Sammy", 3);
    System.out.println(d1.getAge());
    System.out.println(d1.getName());
    d1.setAge(5);
    d1.setName("Lola");
    System.out.println(d1.getAge());
    System.out.println(d1.getName());
    System.out.println(d3);
    d2.intoHumanAge();
    d1.intoHumanAge();
  }
}
