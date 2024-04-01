/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/


public class TP02Ex06 {
    public static void main(String[] args) {
    
        String[][] matriz = new String[2][3];

        
        matriz[0][0] = "Julia";
        matriz[0][1] = "Luiza";
        matriz[0][2] = "Bruna";
        matriz[1][0] = "Carla";
        matriz[1][1] = "Sofia";
        matriz[1][2] = "Érica";

       
        System.out.println("Valores na matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}