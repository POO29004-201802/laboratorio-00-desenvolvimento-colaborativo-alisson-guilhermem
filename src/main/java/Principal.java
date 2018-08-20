import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a dimensão do quadrado");
        int a = teclado.nextInt();

        quadrado x = new quadrado(a);

        String A[][] = x.retmatriz();

        int i, j;

        for (i = 0; i <A.length; i++) {
            for (j = 0; j <A.length; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println(" ");
        }
    }
}
