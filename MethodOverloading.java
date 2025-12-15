package java2projects;

	public class MethodOverloading {
		    
		    
		    void display(int num) {
		        System.out.println("Displaying Integer: " + num);
		    }
		    
		    
		    void display(char ch) {
		        System.out.println("Displaying Character: " + ch);
		    }
		    
		    
		    void display(String str) {
		        System.out.println("Displaying String: " + str);
		    }

		   
		    public static void main(String[] args) {
		        
		        // Create an object of the class
		        MethodOverloading obj = new MethodOverloading();
		        
		        // Call the display method with different types of arguments
		        
		        // 1. Call with an integer -> executes display(int num)
		        obj.display(26); 
		        
		        // 2. Call with a character -> executes display(char ch)
		        obj.display('K'); 
		        
		        // 3. Call with a string -> executes display(String str)
		        obj.display("welcome !"); 
		    }
		

	}


