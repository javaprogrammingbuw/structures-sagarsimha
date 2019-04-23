import java.util.Scanner;

public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a: " + a + " b: " + b + " c: " + c);

		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		int sum_ = a+b+c;
		int mean_ = (a+b+c)/3;


		int max_ = a;
		if(b>max_){max_=b;}
		if(c>max_){max_=c;}

		int min_ = a;
		if(b<min_){min_=b;}
		if(c<min_){min_=c;}
		 
		System.out.println("Sum: " + sum_ + " Mean: " + mean_ + " Max: " + max_ + " Min: " + min_);		

	}

}
