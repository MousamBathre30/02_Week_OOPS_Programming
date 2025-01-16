
import java.util.Scanner;
public class PalindromChecker{

   private String text;
   
    PalindromChecker(String text){
	  this.text = text;
	}
     
	public boolean check(){
		int start = 0;
		int end = text.length() - 1;
		while(start > end){
			
			if(text.charAt(start) != text.charAt(end)){
				return false;
			}
			
			end --;
			start ++;
		}
		return true;
	}
	
	public void getans(boolean ans){
		
		if(ans == true){
			System.out.println("Given String is Palindrom");
		}else{
			System.out.println("Given String is Not Palindrom");
		}
	}
   public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
	 String text = scanner.nextLine().toLowerCase().trim();
     PalindromChecker p = new PalindromChecker(text);
	boolean ans = p.check();
	p.getans(ans);
   }

}