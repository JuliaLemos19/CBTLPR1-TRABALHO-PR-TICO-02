import java.util.Scanner;

/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
*/


public class TP02Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double[][] matriz = new double[3][4];
        
        
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = input.nextDouble();
            }
        }
        
        
        System.out.print("Digite a constante multiplicativa: ");
        double constante = input.nextDouble();
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= constante;
            }
        }
        
        
        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        input.close();
    }
}
