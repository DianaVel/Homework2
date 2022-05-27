
public class Main {

	public static void main(String[] args) {
// Exercise 3
		
		Rectangle rec1; 
		
//Compilation error			
//		rec1.getWidth();

// Returns null pointer exception		
//		rec1 = null;
//		rec1.getLength();

//Instance variables are initialized by default		
		rec1 = new Rectangle();
		double len = rec1.getLength();
		double width = rec1.getWidth();
		System.out.println("Length: "+len + "  Width : "+width);
		
// == will return false 		
		Rectangle rec2 = new Rectangle();
		System.out.println(rec2==rec1);

// == will return true
		rec2=rec1;
		System.out.println(rec2==rec1);
		
// Setter of rec2 will impact the result got from getter of rec1
		double rec1len = rec1.getLength();
		rec2.setLength(5);
		System.out.println(rec1len==rec1.getLength());
		
		
//Exercise 4 
		rec1.setLength(4);
		rec1.setWidth(5);
		
		rec2 = new Rectangle();
		rec2.setLength(2);
		rec2.setWidth(3);
		
		System.out.println(Rectangle.compareArea(rec1, rec2));
		
		rec1.setLength(3);
		rec1.setWidth(2);
		
		System.out.println(Rectangle.compareArea(rec1, rec2));
		
		
//Exercise 5 
		int var;
//compilation error		
//		var ++;

		
	}
	
	int var ;

}
