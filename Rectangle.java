public class Rectangle extends Figure{
    double a;
    double b;
    public Rectangle(Point center, double a, double b){
        if(a <= 0 || b <= 0){
            System.out.println("Неверные параметры фигуры");
        }else {
            this.center = center;
            this.a = a;
            this.b = b;
        }
    }
    public double area(){
        return a*b;
    }
    public double perimeter(){
        return 2*(a+b);
    }
    public void draw(){
        System.out.println("Нарисован прямоугольник с координатами " + center);
    }
    public void draw(Color color){
        System.out.println("Нарисован прямоугольник " + colorToString(color)
                + "с координатами " + center);
    }
}