public class Sample1{
  public static void main(String []arrays){
	  int size=arrays.length;
	  int[] a = new int[arrays.length];
	  boolean valid = true;
	  if(size==4){
 for(int i=0;i<arrays.length;i++){
	 try{
		a[i]=Integer.parseInt(arrays[i]);
		 
	 }
	 catch(Exception e){
		 valid = false;
		 e.printStackTrace();
		 System.out.println("Error at position" + i);
	           }
	       }
	  }
	  int sum = 0;
	  if(valid) {
	  for(int x: a) {
		  sum+=x;
		  
	  }
	  System.out.println(sum);
	  }
}}