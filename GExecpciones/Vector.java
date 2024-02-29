
import java.util.Scanner;

public class Vector{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int vector[] = {0,1,2,3,4};
    
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        try {
            System.out.print("Añade valor: ");
            int valor = sc.nextInt();

            if (valor < 0 || valor > vector.length - 1) {
                throw new ArrayIndexOutOfBoundsException("Valor fuera del rango");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Estás fuera del vector");
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(i);
        }
    }
}