package week1day1assesment;

public class Calculator {
	public static int addition(int add1, int add2) {
		int addition = add1 + add2;
		return addition;
			}
	public static double subtraction(double sub1, double sub2) {
		double subtraction = sub1 - sub2;
		return subtraction;
			}
	public static double Multiply(double mul1, double mul2) {
		double Multiply = mul1*mul2;
		return Multiply;
			}
	public  void Division(int div1, int div2) {
		if (div2>0) {
		int Division = div1/div2;
		System.out.println("Division Value is = " + Division);
		}
		else {
			System.out.println("not eligible for division");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator CalC = new Calculator();
	
		System.out.println("Addition Value is = " + addition(5,5));
		System.out.println("Subtraction Value is = " + subtraction(25,5));
		System.out.println("Multiplication Value is = " + Multiply(25,5));
		//System.out.println("Division Value is = " + Division(25,5));
		CalC.Division(15, 5);
	}
}


