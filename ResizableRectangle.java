public class ResizableRectangle extends Rectangle implements Resizable {
    
    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(int percent) {
        double widthPctValue = width * (percent / 100.0);
        double lengthPctValue = length * (percent / 100.0);

        width += widthPctValue;
        length += lengthPctValue;
    }

}
