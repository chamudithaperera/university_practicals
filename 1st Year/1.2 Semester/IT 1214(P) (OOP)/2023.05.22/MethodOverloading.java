class MethodOverloading{
	
	int num1,num2,num3;
	double num4,num5;
	
	public int sum(int a, int b){//m1
		return a+b;
	}
	
	public int sum(int a, int b, int c){//m2
		return a+b+c;
	}
	
	public int sum(double a, double b){//m3
		return (int)(a+b);
	}
	
	public int sum(double a, int b){//m4
		return (int)(a+b);
	}
	
	public static void main(String[] args){
		MethodOverloading ob = new MethodOverloading();
		
		System.out.println(ob.sum(5,9)); //m1
		
		System.out.println(ob.sum(3.6,9.38)); //m3
		
		System.out.println(ob.sum(5,9,14)); //m2
		
		System.out.println(ob.sum(5.7,9)); //m4
	}
}