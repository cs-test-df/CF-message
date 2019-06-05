 class SuperClass_Super{
	
	  int a,b,c;
	 
	 public SuperClass_Super(int input1,int input2,int input3) {
		a = input1;
		b= input2;
		c = input3;
	}
	 public SuperClass_Super(SuperClass_Super obj){
		 a = obj.a;
		 b = obj.b;
		 c = obj.c;
		 
	 }
	 public SuperClass_Super(){
		 a=b=c=1;
	 }
	 
	 public int volume(){
		 return a*b*c;
	 }
	 
}
 
 class SubClass_Super extends SuperClass_Super{
	 
	 int d ;
	 public SubClass_Super(){
		 super();
		 d = 1;
	 }
	 public SubClass_Super(int x,int y,int z,int xy){
		 super(x,y,z);
		 d = xy;
	 }
	 public SubClass_Super(SubClass_Super obj){
		 super(obj);
		 d = obj.d;
	 }
	 public int volume(){
		 return a*b*c*d;
	 }
	 
 }




public class Super_Example {

	public static void main(String[] args) {
		SubClass_Super obj1 = new SubClass_Super(45,98,56,48);
		SubClass_Super obj2 = new SubClass_Super();
		SubClass_Super obj3 = new SubClass_Super(obj1);
		
		// values from 1st object reference
		obj1.volume();
		System.out.println("Value of a  from obj1 reference:"+ obj1.a);
		System.out.println("Value of b  from obj1 reference:"+ obj1.b);
		System.out.println("Value of c  from obj1 reference:"+ obj1.c);
		System.out.println("Value of d  from obj1 reference:"+ obj1.d);
		
		obj2.volume();
		System.out.println("Value of a  from obj2 reference:"+ obj2.a);
		System.out.println("Value of b  from obj2 reference:"+ obj2.b);
		System.out.println("Value of c  from obj2 reference:"+ obj2.c);
		System.out.println("Value of d  from obj2 reference:"+ obj2.d);
		
		obj1.volume();
		System.out.println("Value of a  from obj3 reference:"+ obj3.a);
		System.out.println("Value of b  from obj3 reference:"+ obj3.b);
		System.out.println("Value of c  from obj3 reference:"+ obj3.c);
		System.out.println("Value of d  from obj3 reference:"+ obj3.d);
		
		
		

	}

}
