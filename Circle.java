public class Circle extends Figure{
    double r;
    public Circle(Point center, double r){
        if(r <= 0){
            System.out.println("Неверные параметры фигуры");
        }else {
            this.center = center;
            this.r = r;
        }
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter() {
        return 2*Math.PI*r;
    }
    public void draw(){
        System.out.println("Нарисован круг с координатами " + center);
    }
    public void draw(Color color){
        System.out.println("Нарисован круг " + colorToString(color)
                + "с координатами " + center);
    }
}