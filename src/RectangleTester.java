public class RectangleTester {
    public static void main(String[] args) {
        //test your rectangle here
        Rectangle rect1 = new Rectangle(7.45676, 394.488543);
        double expectedPerimeter = 2*7.45676 + 2*394.488543;
        System.out.println(expectedPerimeter);
        System.out.println(rect1.calculatePerimeter());
    }
}
