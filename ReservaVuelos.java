 import java.util.Scanner;

public class ReservaVuelos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int asientos = 100;

        // Datos del pasajero
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese su destino: ");
        String destino = sc.nextLine();

        // Verificar asientos
        if (asientos == 0) {
            System.out.println("No hay asientos disponibles.");
            return;
        }

        // Tipo de boleto
        System.out.print("Tipo de boleto (economico / ejecutivo): ");
        String tipo = sc.nextLine().toLowerCase();

        String ruta;

        if (tipo.equals("economico")) {
            ruta = "Ruta básica";
        } else {
            ruta = "Ruta premium";
        }

        // Equipaje
        System.out.print("Número de maletas: ");
        int maletas = sc.nextInt();

        if (maletas > 2) {
            System.out.println("Error: Excede el límite de 2 maletas.");
            return;
        }

        for (int i = 1; i <= maletas; i++) {
            System.out.print("Peso de la maleta " + i + " (kg): ");
            double peso = sc.nextDouble();

            if (peso > 23) {
                System.out.println("Error: La maleta " + i + " excede los 23 kg permitidos.");
                return;
            }
        }

        // Confirmar reserva
        asientos--;

        // Resumen
        System.out.println("\n===== RESERVA CONFIRMADA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
        System.out.println("Destino: " + destino);
        System.out.println("Tipo de boleto: " + tipo);
        System.out.println("Ruta asignada: " + ruta);
        System.out.println("Asientos restantes: " + asientos);
        System.out.println("==============================");

        sc.close();
    }
}
