import java.util.Scanner;

public class ajj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el nombre y precio de cada uno de los productos:");
        String nombreProducto = input.nextLine();
        float precoProducto = input.nextFloat();
        input.nextLine();

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("El producto: " + (i+1) + "con precio : " + precoProducto);

        }
        input.close();

    }
}