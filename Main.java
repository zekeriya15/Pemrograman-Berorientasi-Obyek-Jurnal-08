public class Main {
    public static void main(String[] args) {

        ResizableCircle circle = new ResizableCircle(10);

        System.out.println("Circle");
        System.out.printf("original area: %.2f%n", circle.getArea());
        System.out.printf("original perimeter: %.2f%n", circle.getPerimeter());

        int resize = 20;
        circle.resize(resize);
        System.out.printf("After adding %d%% of size, area: %.2f%n", resize, circle.getArea());
        System.out.printf("After adding %d%% of size, perimeter: %.2f%n", resize, circle.getPerimeter());

        System.out.println();


        ResizableRectangle rectangle = new ResizableRectangle(10, 5);

        System.out.println("rectangle");
        System.out.println("original area: "+ rectangle.getArea());
        System.out.println("original perimeter: " + rectangle.getPerimeter());

        // int resize = 20;
        rectangle.resize(resize);
        System.out.println("adding " + resize + "% of size, area: " + rectangle.getArea());
        System.out.println("adding " + resize + "% of size, perimeter: " + rectangle.getPerimeter());
        

    }
}
