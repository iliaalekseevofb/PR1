package Ball;

public class TestBall {
  public static void main (String[] args) {
    Ball b1 = new Ball();
    Ball b2 = new Ball("Blue");
    Ball b3 = new Ball(500.0);
    Ball b4 = new Ball("Green", 100.0);

    b2.setWeight(1200);
    b3.setColor("Violet");

    System.out.println(b2.getColor());
    System.out.println(b2.getWeight());
    System.out.println(b3.getColor());
    System.out.println(b3.getWeight());

    System.out.println(b3);
  }
}
