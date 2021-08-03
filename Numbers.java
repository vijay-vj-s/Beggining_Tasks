public class Numbers{
	
	
   public static void main(String []arrays){
   
    int size=arrays.length;
	
	if(size==4){
	
	int num1=Integer.parseInt(arrays[0]);
	int num2=Integer.parseInt(arrays[1]); 
    int num3=Integer.parseInt(arrays[2]);
    int num4=Integer.parseInt(arrays[3]);
 

   
   int add1=num1+num2;
   System.out.println("Addition of First Two numbers :" +add1);
   
   int add2=num3+num4;
   System.out.println("Addition of Second Two Numbers :" +add2);
   
   int sub=add2-add1;
   System.out.println("Your ans is :" + sub);
   
 }
  
 
 else 
	 System.out.println("Enter Only Four Arguments :");
 

   }

}