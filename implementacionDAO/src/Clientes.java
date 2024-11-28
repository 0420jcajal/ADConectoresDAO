public class Clientes {
    private int id;
    private String nombre;
    private String persona_contacto;
    private String tfno_contacto;
    private String CIF;
    public int getId() {
        return id;
    }
    public Clientes(int id, String nombre, String persona_contacto, String tfno_contacto, String cIF) {
        this.id = id;
        this.nombre = nombre;
        this.persona_contacto = persona_contacto;
        this.tfno_contacto = tfno_contacto;
        CIF = cIF;
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
    public String getPersona_contacto() {
        return persona_contacto;
    }
    public void setPersona_contacto(String persona_contacto) {
        this.persona_contacto = persona_contacto;
    }
    public String getTfno_contacto() {
        return tfno_contacto;
    }
    public void setTfno_contacto(String tfno_contacto) {
        this.tfno_contacto = tfno_contacto;
    }
    public String getCIF() {
        return CIF;
    }
    public void setCIF(String cIF) {
        CIF = cIF;
    }

    
}
