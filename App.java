import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner leer = new Scanner(System.in);

     // IMPORTANTE//
    // RECORDAR <Trabajador> trabajador = new ArrayList <Trabajador>(); //

    public static ArrayList <Trabajador> trabajador = new ArrayList <Trabajador>();
    public static void main(String[] args) throws Exception {
        boolean salir = true;

        do {
            System.out.println("Escoga una opcion. ");
            System.out.println("1. Añadir");
            System.out.println("2. Mostrar informacion");
            System.out.println("3. Buscar");
            System.out.println("4. Modificar");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            int op = leer.nextInt();
            leer.nextLine();

            switch (op) {
                case 1:
                AddMiembro();
                    break;
                case 2:
                MostrarInfo();
                    break;
                case 3:
                BuscarTrabajador();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                salir = true;
                    break;
                default:
                System.out.println("Opcion no valida. ");
                    break;
            }
        } while (salir);

    }
    public static void AddMiembro(){
        System.out.println("Ingrese el ID del Trabajador. ");
        int IDtrabajador = leer.nextInt();
        System.out.println("Ingrese el Nombre del Trabajador. ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el Cargo del Trabajador. ");
        String Cargo = leer.nextLine();
        System.out.println("Ingrese el Salario del Trabajador. ");
        Double Salario = leer.nextDouble();
        leer.nextLine();


        // SE USAN LAS VARIABLES DEL CONSTRUCTOR DE LA CLASE TRABAJADOR //

        Trabajador nuevoTrabajador = new Trabajador(IDtrabajador, nombre, Cargo, Salario);
    }
    public static void MostrarInfo(){
        for (Trabajador trabajador : trabajador) {
            System.out.println(trabajador.getIDtrabajador());
            System.out.println(trabajador.getNombre());
            System.out.println(trabajador.getCargo());
            System.out.println(trabajador.getSalario());
            System.out.println();
        }
    }
    public static void BuscarTrabajador(){
        System.out.println("Ingrese el ID Del Trabajador que desea buscar. ");
        int CodTra = leer.nextInt();

        for (Trabajador trabajador : trabajador) {
            if (trabajador.getIDtrabajador() == CodTra) {
                System.out.println(trabajador);
                break;
            }
            
        }
    }
    public static void ModificarTrabajador(){
        System.out.println("Ingrese el ID del trabajador que desea modificar. ");
        int CodTra = leer.nextInt();
        for (Trabajador nuevoTrabajador : App.trabajador) {
            if (nuevoTrabajador.getIDtrabajador() == CodTra) {
                break;

            }
        }
        if (trabajador != null) {
            System.out.println("Ingrese el nuevo nombre del trabajador. ");
            String Nnombre = leer.nextLine();
            System.out.println("Ingrese el nuevo Cargo del trabajador. ");
            String Ncargo = leer.nextLine();
            System.out.println("Ingrese el nuevo salario del trabajador. ");
            double Nsalario = leer.nextDouble();

            // INCOMPLETO  -- INCOMPLETO //
            
        }
    }
}
