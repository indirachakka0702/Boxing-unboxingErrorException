package ErrorsException;

public class entry {

	public static void main(String[] args) 
	{
		//error- abnormal behavior of the code
		// exception- abnormal behavior but we can except
		/*int[] iArr = {2,4,5};
		
	  try {
		  System.out.println(iArr[1]);
		  System.out.println("End of try");
	      }
	  catch(Exception e)
	      {
		  // there should be one catch exception mandatory
		  //Block of code to handle errors
		  System.out.println("I Found Exception");
		  // you can do some actions in this block
    	  }
	  System.out.println("End");*/
		/*int[] iArr = {2,4,5};  
		for(int i=0;i<iArr.length;i++)// no need to try catch we already checking arraylength
		{
			System.out.println(iArr[i]);
		}*/
		
		String str = null;
		int[] iArr = {2,4,5};
		try
		 {
			  System.out.println(str.charAt(4)); // unchecked
			  System.out.println(iArr[5]);
		 }
		 catch(StringIndexOutOfBoundsException a) // unchecked
		 {
			    //System.out.println("What Exception printing: "+a);
			    System.out.println(str.length());
		 }
		 catch(NullPointerException a)
		 {
			 //System.out.println(a);
			 str="default";
			 System.out.println("Inside null pointer exception");
		 }
		 catch(Exception a)
		 {
			 System.out.println(a);
		 }
		 finally  // finally will execute irrespective of whether it throw exception or not
		 {
			 System.out.println("Im final");
		 }
		
		 System.out.println("END");
		 // nested try catch
		 try {
			 // try1 this blocks 
			 // if any exception--> catch block
		    }
		 catch(Exception a)
		 {
			 try
			 {
				 //it will try2 here if it is failed in the previous
				 // if you are getting any exception
			 }
			 catch(Exception b)
			 {
				// coming to this catch 
			 }
		 }
	}

	// 1. checked exception: compile time: ex 
	//2. unchecked excetion: run time
}
