public class TestShape {
	
   public static void main(String[] args) {

      Circle circle;
      Square square;

      circle = new Circle( 22, 8, 6.75 );
      square = new Square( 7, 2, 20);

      System.out.print(circle.getName() + ": \n" + circle.toString());
      System.out.println("\nArea = " + circle.getArea());
      System.out.println(" ");
      System.out.print(square.getName() + ": \n" + square.toString());
      System.out.println("\nArea = " + square.getArea());
      
   }
   
}
