class Operators
{
	public static void main(String args[])
	{
		//Assingment operators [=,+=,-=,*=,/=,%=]
		System.out.println("Assingment operators [=,+=,-=,*=,/=,%=]");
		int a = 10;
		System.out.println("The value of a is : " + a);
		int b = a;
		System.out.println("The value of b is : " + b);
		int c = 2;
		c += a;
		System.out.println("The value of c is : " + c);
		int d = 15;
		d -= a;
		System.out.println("The value of d is : " + d);
		int e = 2;
		e *= a;
		System.out.println("The value of e is : " + e);
		int f = 20;
		f /= a;
		System.out.println("The value of f is : " + f);
		int g = 30;
		g %= a;
		System.out.println("The value of g is : " + g + "\n");
		
		//Relational operators[==, >, <, >=, <= ,!=]
		System.out.println("Relational operators[==, >, <, >=, <= ,!=]");
		int x = 90;
		int y = 64;
		System.out.println("x=90 & y=64");
		System.out.println("x==y : " + (x==y));
		System.out.println("x>y : " + (x>y));
		System.out.println("x<y : " + (x<y));
		System.out.println("x>=y : " + (x>=y));
		System.out.println("x<=y : " + (x<=y));
		System.out.println("x!=y : " + (x!=y) + "\n");
		
		
		//logical operators[&&, ||, !]
		System.out.println("logical operators[&&, ||, !]");
		int p = 3;
		int q = 5;
		System.out.println("(p>q) && (p==q) : " + ((p>q) && (p==q)));
		System.out.println("(p<=3) && (q>=5) : " + ((p<=3) && (q>=5)));
		System.out.println("(p>3) || (q<5) : " + ((p>3) && (q<5)));
		System.out.println("!(p==3) && (q<5) : " + (!(p==3) && (q<5)) + "\n");
	}
}