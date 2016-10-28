package righttriangle;


/**
 * RightTriangle class is tested.
 * @author Madison Nguyen
 */
public class testRightTriangle {
    
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(1,3);
        
        System.out.println("Triangle 1 base: " + triangle1.getBase());
        System.out.println("Triangle 1 height: " + triangle1.getHeight());
        System.out.println(triangle1.toString());
        
        System.out.println("\n");
        
        RightTriangle triangle2 = new RightTriangle();
        
        System.out.println("Triangle 2 base: " + triangle2.getBase());
        System.out.println("Triangle 2 height: " + triangle2.getHeight());
        System.out.println(triangle2.toString());
    }
}