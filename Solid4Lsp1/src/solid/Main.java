package solid;

import solid.lsp.Rectangle;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square rectangle = new Square(5);
        rectangle.setSide(7);

        System.out.printf("В квадрате сторона A = %d\n", rectangle.getSide());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}
