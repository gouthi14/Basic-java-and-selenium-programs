package arrays;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	      boolean bool = false;
	      
	      try {
	      
	         // create new file
	         File f = new File("goutham.txt");
	         
	         // tries to create new file in the system
	         bool = f
	         
	         // prints
	         System.out.println("File created: "+bool);
	         
	         // deletes file from the system
	         f.delete();
	         
	         // delete() is invoked
	         System.out.println("delete() method is invoked");
	         
	         // tries to create new file in the system
	         bool = f.createNewFile();
	         
	         // print
	         System.out.println("File created: "+bool);
	            
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
	}


