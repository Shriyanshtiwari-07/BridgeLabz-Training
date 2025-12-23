import java.util.*;


public class NullPointerExample{
		
		public static void generateException(){
		String text=null;
		text.length();
		}
		
		public  static void handleException(){
		String text=null;
		try{
			
		text.length();
		}
		catch(NullPointerException ex){
		System.out.println("HAndled Exception: ");
		System.out.println(ex.getMessage());
		} 
		} 
		
		public static void main(String []args)
		{
		try{
			System.out.println("Generating  Exception: ");
			generateException();
		}catch(NullPointerException ex){
		handleException();
		}
		
		}

}