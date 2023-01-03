import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List listaMain = new ArrayList();

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
}
