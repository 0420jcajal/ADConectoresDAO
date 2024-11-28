public class Proyecto {
    private int id;
    private String nombre;
    private String ubicacion;
    private int id_cliente;
    public int getId() {
        return id;
    }
    public Proyecto(int id, String nombre, String ubicacion, int id_cliente) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.id_cliente = id_cliente;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
