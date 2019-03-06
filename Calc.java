import java.util.Scanner;

class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entree un premier nombre");
        String line = sc.nextLine();
        double number1 = (double) Integer.parseInt(line);
        System.out.println("Entree un signe");
        String signe = sc.nextLine();
        System.out.println("Entree un deuxieme nombre");
        line = sc.nextLine();
        double number2 = (double) Integer.parseInt(line);

        double result = calculate(number1, number2, signe);
        System.out.println("Le resultat est " + result);
        System.out.println("Voulez vous continuer ? Oui/Non ");
        String answer = sc.nextLine();

        while (answer.equalsIgnoreCase("Oui")) {
            System.out.println("Entree un signe");
            signe = sc.nextLine();
            System.out.println("Entree un deuxieme nombre");
            line = sc.nextLine();
            number2 = (double) Integer.parseInt(line);
            result = calculate((double) result, number2, signe);
            System.out.println("Le resultat est " + result);
            System.out.println("Voulez vous continuer ? Oui/Non ");
            answer = sc.nextLine();
        }

        System.out.println("Good bye");
    }

    public static double calculate(double number1, double number2, String signe) {
        if (signe.equals("+")) {
            return add(number1, number2);
        }
        if (signe.equals("-")) {
            return subtract(number1, number2);
        }
        if (signe.equals("x")) {
            return multiply(number1, number2);
        }
        if (signe.equals("/")) {
            return divide(number1, number2);
        }
        if (signe.equals("%")) {
            return modulo(number1, number2);
        }
        if (signe.equals("^")) {
            return power(number1, number2);
        }
        return 0;
    }

    //addition
    public static double add(double number1, double number2) {
        double resultat = number1 + number2;
        return resultat;
    }

    //soustraction
    public static double subtract(double number1, double number2) {
        double resultat = number1 - number2;
        return resultat;

    }

    //multiplication
    public static double multiply(double number1, double number2) {
        double resultat = number1 * number2;
        return resultat;

    }

    //division
    public static double divide(double number1, double number2) {
        double resultat = number1 / number2;
        return resultat;

    }

    //modulo
    public static double modulo(double number1, double number2) {
        double resultat = number1 % number2;
        return resultat;
    }

    //puissance
    public static double power(double number1, double number2) {
        double resultat = Math.pow(number1, number2);
        return resultat;
    }
}
