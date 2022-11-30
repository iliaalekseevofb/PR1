package Dog;

public class Dog {
  // Variables
  private String name;
  private int age;

  // Constructors (overloaded)
  public Dog() {
    name = "Doggy";
    age = 0;
  }
  public Dog(String n) {
    name = n;
    age = 0;
  }
  public Dog(String n, int a) {
    name = n;
    age = a;
  }

  // Methods
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
  public String toString() {
    return this.name + ", age " + this.age;
  }
  public void intoHumanAge() {
    System.out.println(this.name + "'s age in human ages is " + this.age * 7 + " years");
  }
}
