public class Cliente {
    //Inicializamos las variables del objeto Cliente
    private String nombre;
    private int telefono;
    private String nacionalidad;

    //Creamos el Constructor
    public Cliente(String nombre, int telefono, String nacionalidad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;

    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

}
