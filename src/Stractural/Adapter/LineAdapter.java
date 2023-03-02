package Stractural.Adapter;

public class LineAdapter implements Shape {
    private Line lineAdaptee;

    public LineAdapter(Line lineAdaptee) {
        this.lineAdaptee = lineAdaptee;
    }

    @Override
    public void Draw(int x1, int y1, int x2, int y2) {
        lineAdaptee.Draw(x1, y1, x2,y2);
    }
}
