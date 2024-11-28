import java.util.List;

/**
 * @param <T> Clase que corresponde al modelo del dao
 * @param <V> Tipo de dato del id del modelo
 */

public interface IDAO<T, V> {

    public boolean crearRegistro(T tabla);

    public T leerRegistro(V idRegistro);

    
    public boolean updateRegistro(T tabla, V idRegistro);

    
    public boolean deleteRegistro(V idRegistro);

    
    public List<T> leerRegistros();
}