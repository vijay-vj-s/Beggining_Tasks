import java.util.Scanner;
public class DimensionsRunner{
       public static void main(String[]args){
	   
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter your choice :-");
      System.out.println("1.Calculate Square Area :"); 
	  System.out.println("2.Calculate Rectangle Area :"); 
	  System.out.println("3.calculate Triangle Area :");
	  System.out.println("4.calculate Square Perimeter :");
	  System.out.println("5.calclate Rectangle Perimeter :");
	  int choice =s1.nextInt();
	 
	  Dimensions dimensions=new Dimensions();
	  switch(choice){
	  
	 case 1:
	      System.out.println("Enter the side");
		  int side=s1.nextInt();	  
		  int squareArea=dimensions.calculateSquareArea(side);
	      System.out.println("Square Area is :"+squareArea);
		  break;
		 
     case 2:
		  System.out.println("Enter the rectangle length :");
		  int length=s1.nextInt();
		  System.out.println("Enter the rectangle breadth :");
		  int breadth=s1.nextInt();		 
		  int rectangleArea=dimensions.calculateRectangleArea(length, breadth);
		  System.out.println("Rectangle Area is :" +rectangleArea);
		  break;
	  
    case 3:
		  System.out.println("Enter the triangle base");
		  int base=s1.nextInt();
		  System.out.println("Enter the triangle Height");
		  int height=s1.nextInt();		  
		  int trianglearea=dimensions.calculateTriangleArea( base, height);
		  System.out.println("Triangle Area is :" +trianglearea);
		  break;
		 
	 case 4:
		  System.out.println("Enter the Square Side");
		  side=s1.nextInt();	  
		  int squarePerimeter=dimensions.calculateSquarePerimeter( side);
		  System.out.println("Square Perimter is :"+squarePerimeter);
		  break;
		
	case 5:
	     System.out.println("Enter the rectangle length");
	     length=s1.nextInt();
		 System.out.println("Enter the rectangle breadth");
		 breadth=s1.nextInt();
		 int rectanglePerimeter=dimensions.calculateRectanglePerimeter( length, breadth);
		 System.out.println("Rectangle Perimter is :" + rectanglePerimeter);
		
	   }
    } 
}

