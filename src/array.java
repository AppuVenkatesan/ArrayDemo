import java.util.Arrays;
import java.util.List;

public class array {

	public static void main(String[] args) {
		
	int[] arr = new int [4];
	
	arr[0] = 11;
	arr[1] = 12;
	arr[2] = 14;
	arr[3] = 16;
	
	
	int arr2[] = {1,3,4,6};
	
	System.out.println("Just for git");
	System.out.println("Just for git1");
	
	System.out.println("for user2 commit");  //for user2
	
	for (int i=0;i<arr2.length;i++) {
		
		System.out.println(arr2[i]);
		
		
		
	}
	
    for (int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);

	}
    
    
   String [] name = {"nature", "India" , "abcd"};
   
   for (String s : name) {
	   
	   System.out.println(s);
	   
	  
   }
   
  List <String> lst = Arrays.asList(name);
  
 boolean status = lst.contains("nature");
 
 System.out.println(status);

}
	
}
