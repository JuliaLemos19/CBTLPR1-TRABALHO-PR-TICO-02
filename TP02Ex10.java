import java.util.Scanner;

/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a ordem da matriz, um valor até 10: ");
        int ordem = input.nextInt();
        
        if (ordem <= 0 || ordem > 10) {
            System.out.println("A ordem da matriz não é válida. Por favor, insira um valor entre 1 e 10.");
            return;
        }
        
        double[][] matriz = new double[ordem][ordem];
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o elemento para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = input.nextDouble();
            }
        }
        
        if (!ehMatrizQuadrada(matriz)) {
            System.out.println("A matriz não é quadrada. Por favor, insira uma matriz de ordem MxM.");
            return;
        }
        
        if (calcularDeterminante(matriz) == 0) {
            System.out.println("A matriz é singular (determinante igual a zero). Não é possível calcular a matriz inversa.");
            return;
        }
        
        double[][] inversa = calcularMatrizInversa(matriz);
        
        System.out.println("\nMatriz Original:");
        exibirMatriz(matriz);
        
       
        System.out.println("\nMatriz Inversa:");
        exibirMatriz(inversa);
        
        input.close();
    }
  
    public static boolean ehMatrizQuadrada(double[][] matriz) {
        return matriz.length == matriz[0].length;
    }
    
    
    public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;
        
        if (ordem == 1) {
            return matriz[0][0];
        } else if (ordem == 2) {
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        } else {
            double determinante = 0;
            for (int i = 0; i < ordem; i++) {
                double[][] subMatriz = new double[ordem - 1][ordem - 1];
                for (int j = 1; j < ordem; j++) {
                    for (int k = 0, l = 0; k < ordem; k++) {
                        if (k != i) {
                            subMatriz[j - 1][l++] = matriz[j][k];
                        }
                    }
                }
                determinante += matriz[0][i] * Math.pow(-1, i) * calcularDeterminante(subMatriz);
            }
            return determinante;
        }
    }
    
    public static double[][] calcularMatrizInversa(double[][] matriz) {
        int ordem = matriz.length;
        double[][] matrizAdjunta = new double[ordem][ordem];
        double determinante = calcularDeterminante(matriz);
        
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                double[][] subMatriz = new double[ordem - 1][ordem - 1];
                for (int k = 0, p = 0; k < ordem; k++) {
                    if (k != i) {
                        for (int l = 0, q = 0; l < ordem; l++) {
                            if (l != j) {
                                subMatriz[p][q++] = matriz[k][l];
                            }
                        }
                        p++;
                    }
                }
                double cofator = Math.pow(-1, i + j) * calcularDeterminante(subMatriz);
                matrizAdjunta[j][i] = cofator / determinante;
            }
        }
        
        return matrizAdjunta;
    }
    
    public static void exibirMatriz(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
