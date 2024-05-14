import java.util.Scanner; //Scanner to get user input

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        calc_loop:
        while (true) {

            System.out.println("Wat zou je willen doen?");
            System.out.println("1. Optellen");
            System.out.println("2. Aftrekken");
            System.out.println("3. Vermenigvuldigen");
            System.out.println("4. Delen");
            System.out.println("");

            int userInput = sc.nextInt();

            if (userInput >= 1 && userInput <= 4) {

                System.out.println("Eerste getal?");
                int num1 = sc.nextInt();

                System.out.println("Tweede getal?");
                int num2 = sc.nextInt();

                Calculator calc = new Calculator(num1, num2);

                if (userInput == 1) {
                    calc.optellen();
                } else if (userInput == 2) {
                    calc.aftrekken();
                } else if (userInput == 3) {
                    calc.vermenigvuldigen();
                } else if (userInput == 4) {
                    calc.delen();
                }

            } else {
                System.err.println("Kies een getal uit de lijst.");
                continue calc_loop;
            }

            System.out.println();
    }


    }
}
