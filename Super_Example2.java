
class Super_Super{
	String txt;
	Super_Super(){
		txt ="This is from Super Class";
	}
}

class Sub_Sub extends Super_Super{
	String txt; // this hides txt from superclass
	public Sub_Sub() {
	txt = "This is from Sub Class";
	}
	void Display(){
		System.out.println(super.txt);// gets txt value from superclass
		System.out.println(txt); // gets txt value from subclass
	}
}


public class Super_Example2 {

	public static void main(String[] args) {
		Sub_Sub obj = new Sub_Sub();
		obj.Display();

	}

}
