package testes;

public class PolegadasParaMetros {
    public static void main(String[] args) {
        double metros;
        int polegadas, contador = 0;

        for ( polegadas = 1; polegadas <= 144; polegadas++ ) {
            metros = polegadas * 39.37;
            System.out.println( metros + " metros equivale a " + polegadas + " polegadas.");

            contador ++;
            if (contador == 12 ) {
                System.out.println();
                contador = 0;
            }
        }

    }
}
