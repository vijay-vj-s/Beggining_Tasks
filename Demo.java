public class Demo{
	
	public static void main(String[] arrays){
	System.out.println("HELLO JAVA");

    int size=arrays.length;
	if(size==0){
		System.out.println("pls provide arguments");
	}
	if(size==1){
		System.out.println("first day of the week is :" +arrays[0]);
        
	}
	if(size==2){
		System.out.println("first day of the week is :" +arrays[0]);
		System.out.println("second day of the week is :" +arrays[1]);
		
	}
	else
		System.out.println("Enter the valid arguments :");
	
	}
}