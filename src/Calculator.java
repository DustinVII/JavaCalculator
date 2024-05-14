import java.util.Scanner; //Scanner to get user input

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//test
        while (true) {
            System.out.println("");
            System.out.println("Kies je optie:");
            System.out.println("1. Optellen");
            System.out.println("2. Aftrekken");
            System.out.println("3. Vermenigvuldigen");
            System.out.println("4. Delen");
            System.out.println("");
            String optie = scanner.nextLine();
            System.out.println("Eerste getal?");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Tweede getal?");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Het resultaat is:");
            switch (optie) {
                case "1":
                    System.out.println(optellen(num1, num2));
                    break;
                case "2":
                    System.out.println(aftrekken(num1, num2));
                    break;
                case "3":
                    System.out.println(vermenigvuldigen(num1, num2));
                    break;
                case "4":
                    System.out.println(delen(num1, num2));
                    break;
                default:
                    System.out.println("Het moet een getal zijn van 1 t/m 4.");
                    break;
            }
        }
    }

    public static Object optellen(int num1, int num2) {
        return num1+num2;
    }

    public static Object aftrekken(int num1, int num2) {
        return num1-num2;
    }

    public static Object vermenigvuldigen(int num1, int num2) {
        return num1*num2;
    }

    public static Object delen(int num1, int num2) {
        if (num2==0) {
            return "Delen door 0 is niet toegestaan";
        } else {
            return num1 / num2;
        }
    }
}
