import java.util.Scanner;

/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
*/

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz (no máximo 10): ");
        int linhas = input.nextInt();
        System.out.print("Digite o número de colunas da matriz (no máximo 10): ");
        int colunas = input.nextInt();

            
         while(linhas > 10 || colunas > 10 || linhas <= 0 || colunas <= 0){
  
         System.out.println("A ordem da matriz não é válida. Por favor, insira valores entre 1 e 10.");              
        System.out.print("Digite o número de linhas da matriz (até 10): ");
       
        linhas = input.nextInt();
        
        System.out.print("Digite o número de colunas da matriz (até 10): ");
         
        colunas = input.nextInt();
            
      }
        


        
        double[][] matriz = new double[linhas][colunas];

       
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = input.nextDouble();
            }
        }

        
        System.out.println("\nMatriz Original:");
        exibirMatriz(matriz);
        
        System.out.println("\nMatriz Transposta:");
        exibirMatriz(transporMatriz(matriz));

        input.close();
    }

    
    public static double[][] transporMatriz(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        double[][] transposta = new double[colunas][linhas];

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        return transposta;
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
