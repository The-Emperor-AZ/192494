import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el nombre y precio de cada uno de los productos:");
        String nombreProducto1 = input.nextLine();
        float precoProducto1 = input.nextFloat();
        input.nextLine();

        String nombreProducto2 = input.nextLine();
        float precioProducto2 = input.nextFloat();
        input.nextLine();

        String nombreProducto3 = input.nextLine();
        float precioProducto3 = input.nextFloat();
        input.nextLine();

        String nombreProducto4 = input.nextLine();
        float precioProdcucto4 = input.nextFloat();
        input.nextLine();
        
        String nombreProducto5 = input.nextLine();
        float precioProducto5 = input.nextFloat();
        input.nextLine();

        float impuestoProduc1 = (precoProducto1 * 0.19f);
        float descuentoProdu1 = (precoProducto1 > 10000) ? (precoProducto1 * 0.10f) : 0;
        float totalProduc1 = precoProducto1 + impuestoProduc1 - descuentoProdu1;

        float impuestoProduc2 = (precioProducto2 * 0.19f);
        float descuentoProduc2 = (precioProducto2 > 10000) ? (precioProducto2 * 0.10f) : 0;
        float totalProduc2 = precioProducto2 + impuestoProduc2 - descuentoProduc2;

        float impuestoProduc3 = (precioProducto3 * 0.19f);
        float descuentoProduc3 = (precioProducto3 > 10000) ? (precioProducto3 * 0.10f) : 0;
        float totalProduc3 = precioProducto3 + impuestoProduc3 - descuentoProduc3;

        float impuestoProduc4 = (precioProdcucto4 * 0.19f);
        float descuentoProduc4 = (precioProdcucto4 > 10000) ? (precioProdcucto4 * 0.10f) : 0;
        float totalProduc4 = precioProdcucto4 + impuestoProduc4 - descuentoProduc4;

        float impuestoProduc5 = (precioProducto5 * 0.19f);
        float descuentoProduc5 = (precioProducto5 > 10000) ? (precioProducto5 * 0.10f) : 0;
        float totalProduc5 = precioProducto5 + impuestoProduc5 - descuentoProduc5;

        System.out.println("Producto: " + nombreProducto1 + ", Precio final: " + totalProduc1);
        System.out.println("Producto: " + nombreProducto2 + ", Precio final: " + totalProduc2);
        System.out.println("Producto: " + nombreProducto3 + ", Precio final: " + totalProduc3);
        System.out.println("Producto: " + nombreProducto4 + ", Precio final: " + totalProduc4);
        System.out.println("Producto: " + nombreProducto5 + ", Precio final: " + totalProduc5);

        float suma = totalProduc1 + totalProduc2 + totalProduc3 + totalProduc4 + totalProduc5;
        System.out.println("El total de la compra es: " + suma);

        input.close();
    }
}

