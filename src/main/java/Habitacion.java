public class Habitacion {
    private int numero;
    private String tipo;
    private int precio;

    //Constructor
    public Habitacion(int numero, String tipo, int precio){
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    //Getters
    public int getNumero(){
        return this.numero;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getPrecio(){
        return this.precio;
    }
    //Setters
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
}