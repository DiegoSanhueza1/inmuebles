import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        HashMap<String,Cliente> Clientes = new HashMap<String,Cliente>();
        HashMap<String,Vendedor> Vendedores = new HashMap<String,Vendedor>();
        ArrayList<Inmueble> Inmuebles = new ArrayList<Inmueble>();
        menu(Clientes,Vendedores,Inmuebles);
    }

    private static void menu(HashMap<String,Cliente> clientes, HashMap<String,Vendedor> vendedores, ArrayList<Inmueble> inmuebles) {
        int opcion;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("*****MENU******");
            System.out.println("(1)Agregar Clientes");
            System.out.println("(2)Agregar Vendedores");
            System.out.println("(3)Agregar Inmueble");
            System.out.println("(4)Dar de baja un inmueble");
            System.out.println("(5)Buscar inmueble por...");
            System.out.println("(6)Ver Clientes");
            System.out.println("(7)Ver Vendedores");
            System.out.println("(8)Ver inmuebles");
            System.out.println("(9)Salir");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:agregarClientes(clientes);
                    break;
                case 2:agregarVendedores(vendedores);
                    break;
                case 3:agregarInmueble(inmuebles);
                    break;
                case 4:darDeBajaInmueble(inmuebles);
                    break;
                case 5:buscarInmueble(inmuebles);
                    break;
                case 6:verClientes(clientes);
                    break;
                case 7:verVendedores(vendedores);
                    break;
                case 8:verInmuebles(inmuebles);
                    break;
            }
        }while (opcion!=9);

    }

    private static void verInmuebles(ArrayList<Inmueble> inmuebles) {
        System.out.println("******************************");
        System.out.println(inmuebles);
        System.out.println("******************************");
    }

    private static void verVendedores(HashMap<String, Vendedor> vendedores) {
        System.out.println("******************************");
        System.out.println(vendedores);
        System.out.println("******************************");
    }

    private static void verClientes(HashMap<String, Cliente> clientes) {
        System.out.println("******************************");
        System.out.println(clientes);
        System.out.println("******************************");
    }

    private static void buscarInmueble(ArrayList<Inmueble> inmuebles) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("(1)Tipo Construccion");
        System.out.println("(2)Precio");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
        }
    }

    private static void darDeBajaInmueble(ArrayList<Inmueble> inmuebles) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(inmuebles);
        System.out.println("para borrar ingrese el indice");
        int indice = teclado.nextInt();
        inmuebles.remove(indice);
        System.out.println("inmuble borrado");
    }

    private static void agregarInmueble(ArrayList<Inmueble> inmuebles) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el tipo de construccion");
        String tipoConstruccion = teclado.next();
        System.out.println("ingrese el precio");
        int precio = teclado.nextInt();
        System.out.println("ingrese ubicacion/ciudad/direccion");
        String ubicacion = teclado.next();
        Inmueble inmueble = new Inmueble(tipoConstruccion,ubicacion,precio);
        inmuebles.add(inmueble);
    }

    private static void agregarVendedores(HashMap<String, Vendedor> vendedores) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el rut");
        String rut = teclado.next();
        System.out.println("Ingrese la direccion");
        String direccion = teclado.next();
        System.out.println("Ingrese titulo Profesional");
        String titulo = teclado.next();
        System.out.println("----estado civil----");
        System.out.println("(1)Soltero");
        System.out.println("(2)Casado");
        System.out.println("(3)Viudo");
        int estadoCivil = teclado.nextInt();
        Vendedor vendedor = new Vendedor(nombre,rut,direccion,titulo,estadoCivil);
        vendedores.put(rut,vendedor);
        System.out.println("vendedor agregado");
    }

    private static void agregarClientes(HashMap<String, Cliente> clientes) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el rut");
        String rut = teclado.next();
        System.out.println("Ingrese la direccion");
        String direccion = teclado.next();
        Cliente cliente = new Cliente(nombre,rut,direccion);
        clientes.put(rut,cliente);
        System.out.println("cliente agregado");
        System.out.println();
    }
}
