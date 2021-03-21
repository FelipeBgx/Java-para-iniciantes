package testes;
import java.util.Scanner;

public class CalculaPesoNaLua {
    public static void main(String[] args) {
        double pesoTerra;
        double pesoLua;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu peso em Kg: ");
        pesoTerra = scanner.nextDouble();

        pesoLua = pesoTerra * 0.17;

        System.out.println("Seu peso na lua seria referente a : " + pesoLua + "Kg");

    }
}
