public interface Drawable {
    enum Color{
        RED, GREEN, BLUE, YELLOW, BLACK, WHITE
    }
    void draw();
    void draw(Color color);
}
