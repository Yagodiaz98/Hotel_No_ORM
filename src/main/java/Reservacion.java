import java.util.Date;

public class Reservacion {
    private Cliente cliente;
    private Habitacion habitacion;
    private String fecha;

    //Constructor
    public Reservacion(Cliente cliente, Habitacion habitacion, String fecha){
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
    }

    //Getters
    public Cliente getCliente(){
        return this.cliente;
    }
    public Habitacion getHabitacion(){
        return this.habitacion;
    }
    public String getFecha(){
        return this.fecha;
    }

    //Setters
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setHabitacion(Habitacion habitacion){
        this.habitacion = habitacion;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
}
