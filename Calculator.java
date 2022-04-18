package week1.day2.assignments;

public class Calculator {
	public int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public double mul(double num1, double num2)
	{
		return num1*num2;
	}
	public float divide(float num1, float num2)
	{
		return num1/num2;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Sum of the numbers : " + obj.add(1,2,3));
		System.out.println("Subtraction of the numbers : " + obj.sub(12,7));
		System.out.println("Multiplication of the numbers : " + obj.mul(5,7.999));
		System.out.println("Division of the numbers : " + obj.divide(12,3));

	}

}
