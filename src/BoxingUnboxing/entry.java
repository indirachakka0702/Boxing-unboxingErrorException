package BoxingUnboxing;

public class entry {

	public static void main(String[] args) 
	{
		// both are premetive datatype
		int i=50; 
		float f =0;
		
		Integer j=10; // class and object
		Float f2;
		
		int[] iArr = {2,4,5}; // limitation we can't add element one more
		
		//j.  you can see so many option check due to object(class)
		//i.   data type you can't see any option due to data type
	// conversion of primitive datatype into  object
	// called Boxing-> java will do by default
		
	// unboxing means convertion obect to its premitive datatype
		//Boxing or Autoboxing::
		//case1
		boxing(i); // int primitive data type
        // case2
		Integer j2=10;
		j2=i;
		//Unboxing::
		//case1
		Integer objNum = new Integer(100);
		unboxing(objNum);
		//case2
		Integer objNum2 = new Integer(5);
		int num2 = objNum2;
		System.out.println(num2);
	}
	
	static void boxing(Integer num) // Integer object--> boxing
	{
		System.out.println(num);
	}
	static void unboxing(int i)
	{
		System.out.println(i);
	}
	

}
