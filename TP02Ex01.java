import java.util.Scanner;

/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
*/


public class TP02Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int v1, v2;
        
        System.out.print("Digite o primeiro valor: ");
        v1 = input.nextInt();
        
        do {
            System.out.print("Digite o segundo valor, maior que o primeiro: ");
            v2 = input.nextInt();
            if (v2 <= v1) {
                System.out.println("O segundo valor deve ser maior que o primeiro. Tente novamente.");
            }
        } while (v2 <= v1);
        
 
        
        input.close();
    }
}
