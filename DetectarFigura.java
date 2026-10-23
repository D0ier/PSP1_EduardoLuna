import java.util.Scanner;

public class DetectarFigura {
    private static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> registrarDatos();
                case 2 -> System.out.println("**Saliendo...");
                default -> System.out.println("**Opción inválida\n");
            }
        } while (opcion != 2);

        leer.close();
    }

    public static void registrarDatos() {
        Figura figura = new Figura();

        System.out.print("Ingrese el valor del numero A: ");
        figura.setNumA(leer.nextInt());
        System.out.print("Ingrese el valor del numero B: ");
        figura.setNumB(leer.nextInt());
        System.out.print("Ingrese el valor del numero C: ");
        figura.setNumC(leer.nextInt());

        System.out.println(figura.detectarFigura());
    }

    public static void mostrarMenu() {
        String menu = """
                ---Programa 2---

                1.- Registrar una figura
                2.- Salir

                Seleccione una opción:
                """;
        System.out.println(menu);
    }
}
