package Javaconcepts;

public class Arithmaticoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=4,b=8;

System.out.println(a+b);
System.out.println(a*b);
System.out.println( a-b);
System.out.println(a/b);
System.out.println(a%b);


a=b;
System.out.println(b);
System.out.println(a+=b);
System.out.println(a-=b);
System.out.println(a*=b);
System.out.println(a/=b);
System.out.println(a%=b);

System.out.println(a++);
System.out.println(++a);
System.out.println(++a);
System.out.println(--a);
System.out.println(a--);
System.out.println(a--);


System.out.println("4. Logical operator");
System.out.println("Logical AND operator");

System.out.println((7 > 3) && (3 > 1));  
System.out.println((7 > 3) && (3 < 1));	

System.out.println("Logical OR operator");

System.out.println((7 > 3) || (3 < 1));
System.out.println((7 < 3) || (3 < 1));

System.out.println("Logical NOR operator");
System.out.println (!( 7 == 7));
System.out.println (!(25 > 24));
System.out.println (!(30 < 25 ));
System.out.println("---------------------------------------");
	


System.out.println("Relational Operators");
System.out.println("a=" +a + " b=" +b);
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a>=b);
System.out.println(a<=b);
System.out.println("---------------------------------------");



System.out.println("Ternary operator");
System.out.println((a>b) ? (a+b):(a-b));
}
	

	}


