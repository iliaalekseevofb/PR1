package Ball;

public class Ball {
  // Variables
  private String color;
  private double weight;

  // Constructors (overloaded)
  public Ball() {
    color = "Red";
    weight = 300.0;
  }
  public Ball(String c) {
    color = c;
    weight = 300.0;
  }
  public Ball(double w) {
    color = "Red";
    weight = w;
  }
  public Ball(String c, double w) {
    color = c;
    weight = w;
  }

  // Methods
  public void setColor(String color) {
    this.color = color;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public String getColor() {
    return this.color;
  }
  public double getWeight() {
    return this.weight;
  }

  @Override
  public String toString() {
    return this.color + " ball has a weight of " + this.weight + " grams";
  }
}
