import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

		if( 0<b && b<10){
			switch(a%b){
  				case 0:
    				System.out.println("Zero");
    				break;
  				case 1:
    				System.out.println("One");
    				break;
    			case 2:
    				System.out.println("Two");
    				break;
    			case 3:
    				System.out.println("Three");
    				break;
    			case 4:
    				System.out.println("Four");
    				break;
    			case 5:
    				System.out.println("Five");
    				break;
    			case 6:
    				System.out.println("Six");
    				break;
    			case 7:
    				System.out.println("Seven");
    				break;
    			case 8:
    				System.out.println("Eight");
    				break;
    			case 9:
    				System.out.println("Nine");
    				break;
    			default:
    				System.out.println("None");	
			}
		}
		else{
			System.out.println("Achtung! Achtung! Wrong Values entered!");
		}

	}

}
