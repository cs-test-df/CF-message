
public class VariableLengthArguments_Varargs {
	
	//declaring variable length Arguments
	public static void Display(String s,int...variables){
		for(int count : variables)
		System.out.println("This is repeated based on varargs. Varargs Value :"+count);
	}
	public static void Display(boolean...variables){
		for(boolean b : variables){
			if(b){
				System.out.println("Value is true");
			}
			else{
				System.out.println("value is False");
			}
		}
	}
	public static void Display(int...var){
		for(int a : var)
		System.out.println("This method can cause ambiguity if no paramenter is passed while calling the function . Value Passed in this iteration :" + a);
		
	}

	public static void main(String[] args) {
		
		//methods are static so can be called directly as they are enclosed in same class
		Display("Ashish",12,23,30);
		// Display();   This gives error as Java do not understand which method to overload
		Display(10,23,34,34,55,56);
		Display(true,false,true,true,false);
		
	}

}
