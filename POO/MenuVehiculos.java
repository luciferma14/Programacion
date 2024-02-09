import java.util.Scanner;

public class MenuVehiculos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bicicleta bici = new Bicicleta();
        Coche carro = new Coche();

        int opc;
        
        do{
            System.out.println("              VEHICULOS"); 
            System.out.println("====================================="); 
            System.out.println("1. Anda en bicicleta"); 
            System.out.println("2. Anda en coche"); 
            System.out.println("3. Ver kilometraje de la bicicleta"); 
            System.out.println("4. Ver kilometraje del coche"); 
            System.out.println("5. Ver kilometraje total"); 
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");
            System.out.print("Elige una opción (1-7): ");
            opc = sc.nextInt();
            System.out.println(" ");

            switch (opc) {
                case 1:
                    bici.anda(10);
                    System.out.println("Se han sumado 10 km");
                    System.out.println(" ");
                    break;
                case 2:
                    carro.anda(100);
                    System.out.println("Se han sumado 100 km");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Km Bici: " + bici.getKilometrosRecorridos());
                    break;
                case 4:
                    System.out.println("Km Coche: " + carro.getKilometrosRecorridos());
                    break;
                case 5:
                    System.out.println("Km Totales: " + Vehiculo.getKilometrosTotales());
                    break;
                case 6:
                    System.out.println("Vehiculos: " + Vehiculo.getVehiculosCreados());
                    break;
                case 7:
                    System. exit(0);
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(true);
    }
}
