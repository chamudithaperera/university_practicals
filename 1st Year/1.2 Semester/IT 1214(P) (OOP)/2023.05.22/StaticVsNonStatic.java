class StaticVsNonStatic{
	public static void message(){
		System.out.println("Hi! from static method");
	}
	
	public static void message2(){
		System.out.println("Hi! from method");
	}
	
	public static void main(String[] args){
		message();
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.message2();
	}
}