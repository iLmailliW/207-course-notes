/**
 * A class representing a rectangle.
 */
public class Rectangle {

  private double width;
  private double height;

  /**
   * Constructs a rectangle.
   *
   * @param w the width of the rectangle.
   * @param h the height of the rectangle.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of the rectangle.
   *
   * @return area of the rectangle, as a double.
   */
  public double area() {
    return width * height;
  }

  /**
   * Mutates the rectangle by scaling height and width.
   *
   * @param factor to scale by.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether another rectangle has a larger area than this one.
   *
   * @param other rectangle to compare to.
   * @return True if the other triangle has a larger area.
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
