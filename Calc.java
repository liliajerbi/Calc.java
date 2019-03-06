import java.util.Scanner;

class Calc {
	
	public static void main (String[]args){
		Scanner sc=new Scanner (System.in);
		int num=0;
		
		
		System.out.println("Entree un premier nombre");
		String numberOne = sc.nextLine();
		int number_1 = Integer.parseInt(numberOne);
		System.out.println("Entree un signe");
		String signe = sc.nextLine();
		System.out.println("Entree un deuxieme nombre");
		String numberTwo = sc.nextLine();
		int number_2 = Integer.parseInt(numberTwo);
		
		double a = calculer((double)number_1,(double) number_2, signe);
		System.out.println("Le resultat est " + a);
		System.out.println("Voulez vous continuer ? Oui/Non ");
		String rep = sc.nextLine();
		
		while (rep.equals("Oui")) {
			double n1 = (double)number_1;
			n1=a;
			System.out.println("Entree un signe");
			 signe = sc.nextLine();
			System.out.println("Entree un deuxieme nombre");
			 numberTwo = sc.nextLine();
			 number_2 = Integer.parseInt(numberTwo);
			 a = calculer((double)n1,(double) number_2, signe);
			System.out.println("Le resultat est " + a);
			System.out.println("Voulez vous continuer ? Oui/Non ");
			 rep = sc.nextLine();

		}
		
		
			System.out.println("Good bye");
		
		
	}
		
		
	
	public static double calculer (double number_1, double number_2, String signe){
		if (signe.equals("+")){
			return add(number_1, number_2);
		}
		if (signe.equals("-")){
			return subtract(number_1, number_2);
		}
		if (signe.equals("x")){
			return multiply(number_1, number_2);
		}
		if (signe.equals("/")){
			return divide(number_1, number_2);
		}
		if (signe.equals("%")){
			return modulo(number_1, number_2);
		}
		if (signe.equals("^")){
			return power(number_1, number_2);
		}
		else {
			return 0;
		}
}

//addition
	public static double add (double numberOne, double numberTwo) {
		double resultat = numberOne + numberTwo;
		return resultat;	
	}
//soustraction
	public static double subtract (double numberOne, double numberTwo) {
		double resultat = numberOne - numberTwo;
		return resultat;

	}

//multiplication
	public static double multiply (double numberOne, double numberTwo) {
		double resultat = numberOne * numberTwo;
		return resultat;

	}

//division
	public static double divide (double numberOne, double numberTwo) {
		double resultat = numberOne / numberTwo;
		return resultat;

	}

//modulo

	public static double modulo (double numberOne, double numberTwo) {
		double resultat = numberOne % numberTwo;
		return resultat;
	}

//puissance
	public static double power (double numberOne, double numberTwo) {
		double resultat = Math.pow(numberOne, numberTwo);
		return resultat;
	}
	


}
