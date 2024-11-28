public class Empleado {
    private int id;
    private int id_departamento;
    private int id_proyecto;
    private String nombre;
    private String apellidos;
    private String DNI;
    private float salario;
    public Empleado(int id, int id_departamento, int id_proyecto, String nombre, String apellidos, String dNI,
            float salario) {
        this.id = id;
        this.id_departamento = id_departamento;
        this.id_proyecto = id_proyecto;
        this.nombre = nombre;
        this.apellidos = apellidos;
        DNI = dNI;
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_departamento() {
        return id_departamento;
    }
    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    public int getId_proyecto() {
        return id_proyecto;
    }
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }


}
