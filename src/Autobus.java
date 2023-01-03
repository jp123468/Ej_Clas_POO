public class Autobus extends Vehiculo{
    private int NumPLazas;


    public Autobus(String marca, String modelo,
                   double precioAlquiler , int Numplazas) {
        super(marca, modelo, precioAlquiler);
        setPlazas(Numplazas);
    }

    private void setPlazas(int Numplazas) {
        this.NumPLazas = Numplazas;
    }
    public  void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.print("\t" + "PLazas: "+ NumPLazas);
    }
}
