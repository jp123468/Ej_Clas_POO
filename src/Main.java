import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        List listaMain = new ArrayList();
        opcion = menu();
        while (opcion != 0){
            switch (opcion){

                case 1:
                    listaMain.add(new Vehiculo("Mercedes" , "E" , 55)) ;
                    listaMain.add(new Vehiculo("Porsche" , "F10" , 250));

                    break;
                case 2:
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        System.out.println("Gracias por usar");

        listaMain.add(new Vehiculo("Mercedes" , "E" , 55)) ;
        listaMain.add(new Autobus("Mercedes" , "M20" , 100,20));
        listaMain.add(new Turismo("BMW" , "525" , 50,4));
        listaMain.add(new Turismo("Audi" , "A4" , 55,4));
        listaMain.add(new Autobus("Mercedes" , "M10" , 120,30));
        listaMain.add(new Vehiculo("Porsche" , "F10" , 250));
        imprimirLista((ArrayList)listaMain);
    }
    private static void imprimirLista(ArrayList lista){
        for( int i = 0 ; i < lista.size(); i++ ){
            Vehiculo v= (Vehiculo)lista.get(i);
            v.imprimirAtributos();
            System.out.println("");
        }
    }
    private static int menu () {
        int opcion = -1;
        while (opcion < 0 || opcion > 3) {
            System.out.println("Menu Patio Tuerca");
            System.out.println("0.- Salir");
            System.out.println("1.- Ingrese un nuevo Vehiculo");
            System.out.println("2.- Ingrese un nuevo Autobus");
            System.out.println("3.- Ingrese un nuevo vehiculo para Turismo");
            System.out.println("ingrese una opcion ");
            opcion = lectura.nextInt();

            if (opcion < 0 || opcion > 3) {
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }
}
