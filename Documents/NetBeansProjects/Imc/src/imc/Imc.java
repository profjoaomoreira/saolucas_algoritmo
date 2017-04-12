package imc;

public class Imc {

    public static void main(String[] args) {
        double peso = 190;
        double altura = 1.80;
        double imc;

        imc = peso / (altura * altura);

        if (imc < 20) {
            System.out.println("voce esta abaixo do peso!");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("voce esta com peso normal!");
        } else if (imc >= 25 && imc <= 30) {
            System.out.println("voce esta com sobre peso!");
        } else if (imc >= 30 && imc <= 40) {
            System.out.println("voce esta obso!");
        } else {
            System.out.println("voce esta com obsidade morbida");
        }

    }
}
