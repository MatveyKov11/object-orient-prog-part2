public class PaintExample {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(-1.5, 0);
        Circle c = new Circle(p1, 4);
        Rectangle r = new Rectangle(p2, 4, 5);
        Triangle t = new Triangle(p3, -1);
        t = new Triangle(p3, 1);
        Square s = new Square(p1, 10);
        System.out.println(s.area());
        System.out.println(t.perimeter());
        System.out.println(r.area());
        System.out.println(c.perimeter());
        c.draw();
        r.draw(Drawable.Color.GREEN);
        t.draw();
        s.draw(Drawable.Color.RED);
        FigureUtil.draw(c, Drawable.Color.BLUE);
        FigureUtil.draw(r);
        FigureUtil.draw(t, Drawable.Color.YELLOW);
        FigureUtil.draw(s);
        System.out.println(FigureUtil.perimeter(s));
        System.out.println(FigureUtil.area(t));
        System.out.println(FigureUtil.perimeter(r));
        System.out.println(FigureUtil.area(c));
    }
}
