public class Triangle extends Figure {
    double a;
    public Triangle(Point center, double a){
        if(a <= 0){
            System.out.println("Неверные параметры фигуры");
        }else {
            this.center = center;
            this.a = a;
        }
    }

    public double area() {
        return a*a*Math.sqrt(3)/4;
    }
    public double perimeter(){
        return 3*a;
    }
    public void draw(){
        System.out.println("Нарисован треугольник с координатами " + center);
    }
    public void draw(Color color){
        System.out.println("Нарисован треугольник " + colorToString(color)
                + "с координатами " + center);
    }
}
