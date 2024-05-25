public abstract class Figure implements Drawable{
    Point center;
    public abstract double area();
    public abstract double perimeter();
    public String colorToString(Color color){
        if(color == Color.BLACK){
            return "чёрного цвета ";
        } else if (color == Color.GREEN) {
            return "зелёного цвета ";
        } else if (color == Color.BLUE) {
            return "синего цвета ";
        } else if (color == Color.RED) {
            return "красного цвета ";
        } else if (color == Color.WHITE) {
            return "белого цвета ";
        }else {
            return "жёлтого цвета ";
        }
    }
}