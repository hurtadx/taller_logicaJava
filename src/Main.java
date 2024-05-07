import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido:");
        String nombre = dato.nextLine();

        System.out.println("Ingrese su cedula:");
        int cedula = dato.nextInt();
        dato.nextLine();

        System.out.println("Ingrese su direccion:");
        String direccion = dato.nextLine();

        System.out.println("Ingrese el correo:");
        String correo = dato.nextLine();

        System.out.println("BIENVENIDO. ¿QUÉ DESEA COMPRAR?");
        System.out.println("(1) Consolas");
        System.out.println("(2) PC");
        System.out.println("(3) Accesorios");
        int opcionCompra = dato.nextInt();

        switch (opcionCompra) {
            case 1:
                comprarConsolas(dato);
                break;
            case 2:
                comprarPC(dato);
                break;
            case 3:
                comprarAccesorios(dato);
                break;
            default:
                System.out.println("¡VUELVA PRONTO!");
        }
    }

    public static void comprarConsolas(Scanner dato) {
        System.out.println("ESTAS SON LAS MARCAS QUE OFRECEMOS:");
        System.out.println("1. Sony");
        System.out.println("2. Nintendo");
        System.out.println("3. Microsoft");
        int marca = dato.nextInt();

        switch (marca) {
            case 1:
                comprarSony(dato);
                break;
            case 2:
                comprarNintendo(dato);
                break;
            case 3:
                comprarMicrosoft(dato);
                break;
            default:
                System.out.println("Marca no válida. ¡VUELVA PRONTO!");
        }
    }

    public static void comprarSony(Scanner dato) {
        System.out.println("ESTAS SON LAS CONSOLAS DE SONY:");
        System.out.println("1. PS5");
        System.out.println("2. PS4");
        System.out.println("3. PS3");
        int opcion = dato.nextInt();
        int precio;

        switch (opcion) {
            case 1:
                precio = 30000000;
                break;
            case 2:
                precio = 20000000;
                break;
            case 3:
                precio = 15000000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }

    public static void comprarNintendo(Scanner dato) {
        System.out.println("ESTAS SON LAS CONSOLAS DE NINTENDO:");
        System.out.println("1. switch lite");
        System.out.println("2. switch oled");
        System.out.println("3. switch");
        int opcion = dato.nextInt();
        int precio;

        switch (opcion) {
            case 1:
                precio = 700000;
                break;
            case 2:
                precio = 17000000;
                break;
            case 3:
                precio = 15000000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }

    public static void comprarMicrosoft(Scanner dato) {
        System.out.println("ESTAS SON LAS CONSOLAS DE MICROSOFT:");
        System.out.println("1. XBOX series x");
        System.out.println("2. XBOX series s");
        System.out.println("3. XBOX one");
        int opcion = dato.nextInt();
        int precio;

        switch (opcion) {
            case 1:
                precio = 20000000;
                break;
            case 2:
                precio = 18000000;
                break;
            case 3:
                precio = 14000000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }

    public static void comprarPC(Scanner dato) {
        System.out.println("ESTOS SON LOS TIPOS DE PC QUE OFRECEMOS:");
        System.out.println("1. PC ryzen 5 4650g");
        System.out.println("2. PC rx 5500 xt");
        System.out.println("3. PC rtx 3090 ti");
        int opcion = dato.nextInt();
        int precio;
        switch (opcion) {
            case 1:
                precio = 20000000;
                break;
            case 2:
                precio = 38000000;
                break;
            case 3:
                precio = 64000000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }

    public static void comprarAccesorios(Scanner dato) {
        System.out.println("ESTOS SON LOS TIPOS DE ACCESORIOS QUE OFRECEMOS:");
        System.out.println("1. Ropa");
        System.out.println("2. Figuras");
        System.out.println("3. Perifericos");
        int opcion = dato.nextInt();
        switch (opcion) {
            case 1:
                ropa(dato);
                break;
            case 2:
                figuras(dato);
                break;
            case 3:
                perifericos(dato);
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }
    }

    public static void ropa (Scanner dato){
        System.out.println("ESTOS SON LAS CAMISAS QUE OFRECEMOS:");
        System.out.println("1. camisa estampada portal 2");
        System.out.println("2. camisa estampada uncharted");
        System.out.println("3. gorra bordada warzone");
        int opcion = dato.nextInt();
        int precio;
        switch (opcion) {
            case 1, 2:
                precio = 70000;
                break;
            case 3:
                precio = 50000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }
    public static void figuras (Scanner dato){
        System.out.println("ESTOS SON LAS FIGURAS QUE OFRECEMOS:");
        System.out.println("1. glados portal 2 15cm");
        System.out.println("2. joel the last of us 30cm");
        System.out.println("3. gohan ssj2 40cm");
        int opcion = dato.nextInt();
        int precio;
        switch (opcion) {
            case 1:
                precio = 300000;
                break;
            case 2:
                precio = 700000;
                break;
            case 3:
                precio = 1200000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }

    public static void perifericos (Scanner dato){
        System.out.println("ESTOS SON LAS PERIFICOS QUE OFRECEMOS:");
        System.out.println("1. Mouse");
        System.out.println("2. Monitor");
        System.out.println("3. Teclado");
        int opcion = dato.nextInt();
        int precio;
        switch (opcion) {
            case 1, 2:
                precio = 70000;
                break;
            case 3:
                precio = 50000;
                break;
            default:
                System.out.println("Opción no válida. ¡VUELVA PRONTO!");
                return;
        }

        realizarCompra(dato, precio);
    }

    public static void realizarCompra(Scanner scanner, int precio) {
        System.out.println("¿CUÁNTAS DESEA COMPRAR?");
        int cantidad = scanner.nextInt();
        System.out.println("Va a comprar " + cantidad);
        System.out.println("Total a pagar: " + (cantidad * precio));
    }
}