package Javaconcepts;

public class Arithmaticoperation2 {
	public void add(int a,int b) {
		System.out.println("Addition:" + (a+b));
	}
	
	public void Sub(int a,int b) {
		System.out.println("Subtraction:" + (a-b));
	}
	
	public void multiplication(int a,int b) {
		System.out.println("Multiplication:" + (a*b));
	}
	public void div(int a,int b) {
		System.out.println("division:" + (a/b));
		}

	public void modulus(int a,int b) {
		System.out.println("Modulus:" + (a%b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5,b=7;
Arithmaticoperation2 math=new Arithmaticoperation2();
math.add(a, b);
math.Sub(a, b);
math.multiplication(a, b);
math.div(a, b);
math.modulus(a, b);

	}

}
