public class Calculator {

    int getal1;
    int getal2;

    public Calculator(int getal1, int getal2) {

        this.getal1 = getal1;
        this.getal2 = getal2;
    }

    public void optellen() {
        System.out.println("Het resultaat: "+getal1+" + "+getal2+" = "+(getal1+getal2));
    }

    public void aftrekken() {
        System.out.println("Het resultaat: "+getal1+" - "+getal2+" = "+(getal1-getal2));
    }

    public void vermenigvuldigen() {
        System.out.println("Het resultaat: "+getal1+" x "+getal2+" = "+(getal1*getal2));
    }

    public void delen() {
        if (getal2 == 0) {
            System.out.println("Delen door 0 is niet toegestaan");
        } else {
            System.out.println("Het resultaat: " + getal1 + " / " + getal2 + " = " + (getal1 / getal2));
        }
    }

}