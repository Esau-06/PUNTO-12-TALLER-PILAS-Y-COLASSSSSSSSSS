import java.util.Scanner;

public class Metodos {

    public int[][] LlenarMatriz(Scanner sc) {
        System.out.println("Ingrese filas:");
        int n = sc.nextInt();

        System.out.println("Ingrese columnas:");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese valor [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 🔥 SUMA FILAS
    public void SumaFilas(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            System.out.println("Suma fila " + i + ": " + suma);
        }
    }

    // 🔥 SUMA COLUMNAS
    public void SumaColumnas(int[][] matriz) {

        for (int j = 0; j < matriz[0].length; j++) {

            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }

            System.out.println("Suma columna " + j + ": " + suma);
        }
    }
}