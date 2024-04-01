import java.util.Scanner;

/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.
*/

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double[][] matrizOriginal = new double[3][4];
        
       
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matrizOriginal[i][j] = input.nextDouble();
            }
        }
        
       
        System.out.print("Digite a constante multiplicativa: ");
        double constante = input.nextDouble();
        
        
        double[][] matrizResultante = new double[3][4];
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultante[i][j] = matrizOriginal[i][j] * constante;
            }
        }
        
    
        System.out.println("\nMatriz Original:");
        exibirMatriz(matrizOriginal);
        
        
        System.out.println("\nMatriz Resultante:");
        exibirMatriz(matrizResultante);
        
        input.close();
    }
    

    public static void exibirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
