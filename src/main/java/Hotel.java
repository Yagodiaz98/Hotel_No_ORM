import java.util.List;

public class Hotel {
    private List<Habitacion> listaHabitaciones;
    private List<Reservacion> listareservas;

    public Hotel(List<Habitacion> listaHabitaciones, List<Reservacion> listareservas){
        this.listaHabitaciones = listaHabitaciones;
        this.listareservas = listareservas;
    }

    //Getters
    public List<Habitacion> getListaHabitaciones(){
        return this.listaHabitaciones;
    }
    public List<Reservacion> getListareservas(){
        return this.listareservas;
    }

    //Setters
    public void setListaHabitaciones(List<Habitacion> getListaHabitaciones){
        this.listaHabitaciones=listaHabitaciones;
    }
    public void setListareservas(List<Reservacion> getListaReservas){
        this.listareservas=listareservas;
    }
}
