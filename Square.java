public class Square extends Rectangle{
    public Square(Point center, double a){
        super(center, a, a);
    }
    public void draw(){
        System.out.println("Нарисован квадрат с координатами " + center);
    }
    public void draw(Color color){
        System.out.println("Нарисован квадрат " + colorToString(color)
                + "с координатами " + center);
    }
}
