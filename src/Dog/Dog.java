package Dog;

public class Dog {
  private String name;
  private int age;

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

  public void setAge(int a) {
    this.age = a;
  }
  public void setName(String n) {
    this.name = n;
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
