public class Dimensions{
        public int calculateSquareArea(int side){
	    int squareArea=side*side;
		return squareArea;
	   }
	     public int calculateRectangleArea(int length,int breadth){
		 int rectangleArea=length*breadth;
		 return rectangleArea;
	   }
	     public int calculateTriangleArea(int base,int height){
		 int TriangleArea=(base*height)/2;
		 return TriangleArea;
	   }
	 	public int calculateSquarePerimeter(int side){
	    int squarePerimeter=4*side;
		return squarePerimeter;
	   }
	     public int calculateRectanglePerimeter(int length,int breadth){
		 int rectanglePerimeter=2*(length+breadth);
		 return rectanglePerimeter;
	   }


}