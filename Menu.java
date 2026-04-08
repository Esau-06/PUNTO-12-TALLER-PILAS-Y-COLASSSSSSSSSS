import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        int[][] matriz = null;
        boolean seguir = true;

        while (seguir) {

            System.out.println("\n--- MENU PUNTO 12 ---");
            System.out.println("1) Llenar matriz");
            System.out.println("2) Mostrar matriz");
            System.out.println("3) Suma de filas");
            System.out.println("4) Suma de columnas");
            System.out.println("5) Salir");

            int opt = sc.nextInt();

            switch (opt) {

                case 1:
                    matriz = m.LlenarMatriz(sc);
                    break;

                case 2:
                    if (matriz != null) {
                        m.MostrarMatriz(matriz);
                    } else {
                        System.out.println("Primero llene la matriz");
                    }
                    break;

                case 3:
                    if (matriz != null) {
                        m.SumaFilas(matriz);
                    } else {
                        System.out.println("Primero llene la matriz");
                    }
                    break;

                case 4:
                    if (matriz != null) {
                        m.SumaColumnas(matriz);
                    } else {
                        System.out.println("Primero llene la matriz");
                    }
                    break;

                case 5:
                    seguir = false;
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }

        sc.close();
    }
}