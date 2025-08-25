
public class Demo05 {
    static int areaAfterResize(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            r.setWidth(5);
            r.setHeight(4);
            return r.area();
        } else if (shape instanceof Square) {
            Square s = (Square) shape;
            s.setSide(5); // For square, we set one side
            return s.area();
        }
        return shape.area();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Simple SOLID Solution ===");
        
        // Test Rectangle
        Rectangle rectangle = new Rectangle(3, 3);
        System.out.println("Rectangle area after resize: " + areaAfterResize(rectangle)); // 20
        
        // Test Square
        Square square = new Square(3);
        System.out.println("Square area after resize: " + areaAfterResize(square)); // 25
        
        // Test with different initial values
        System.out.println("\n--- Different initial values ---");
        Rectangle rect2 = new Rectangle(1, 1);
        Square square2 = new Square(1);
        
        System.out.println("Rectangle (1x1) -> (5x4): " + areaAfterResize(rect2)); // 20
        System.out.println("Square (1x1) -> (5x5): " + areaAfterResize(square2)); // 25
    }
}
