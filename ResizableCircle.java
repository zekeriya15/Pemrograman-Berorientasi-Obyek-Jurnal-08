public class ResizableCircle extends Circle implements Resizable {
    
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double pctValue = radius * (percent / 100.0);

        radius += pctValue;

        // radius *= (1 + percent / 100.0);
    }
}
