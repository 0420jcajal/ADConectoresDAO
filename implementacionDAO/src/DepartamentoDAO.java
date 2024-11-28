import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DepartamentoDAO implements IDAO<Departamento, Integer>{

    private Connection connection;
    private PreparedStatement preQuery;
    private boolean exito= false;
    private Departamento departamento;
    private List<Departamento> departamentos;


    private final String[] QUERIES={
        "INSERT INTO departamento(nombre, ubicacion) VALUES(?, ?, ?);",
        "SELECT * FROM departamento WHERE id= ?;",
        "UPDATE jugadores SET nombre= ?, ubicacion = ? WHERE (id = ?);",
        "DELETE FROM departamentos WHERE (id= ?);",
        "SELECT * FROM jugadores;"
    };

    public DepartamentoDAO(){
        connection=Connect2Db.getInstance().getConn();
        departamento= new Departamento();
        departamentos= new ArrayList();
    }




    @Override
    public boolean crearRegistro(Departamento tabla) {
        try {
            preQuery= connection.prepareStatement(QUERIES[0]);
            preQuery.setString(1, tabla.getNombre());
            preQuery.setString (2, tabla.getUbicacion());
            System.out.println(preQuery);
            if(preQuery.executeUpdate()>0){
                exito= true;
            }
        } catch (SQLException e) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, e);
        }    
        return exito; 
       }

    @Override
    public Departamento leerRegistro(Integer idRegistro) {
        try {
            preQuery= connection.prepareStatement(QUERIES[1]);
            preQuery.setInt(1, idRegistro);
            ResultSet data= preQuery.executeQuery();

            if(data.next()){
                departamento.setId(idRegistro);
                departamento.setNombre(data.getString("nombre"));
                departamento.setUbicacion(data.getString("posicion"));
            }
        } catch (SQLException e) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return departamento;
    }

    @Override
    public boolean updateRegistro(Departamento tabla, Integer idRegistro) {
        try {
            preQuery = connection.prepareStatement(QUERIES[2]);
            preQuery.setString(1, tabla.getNombre());
            preQuery.setString(2, tabla.getUbicacion());
            preQuery.setInt(4, idRegistro);
            if (preQuery.executeUpdate() > 0) {
                exito = true;
            }
        } catch (SQLException e) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return exito;
    }

    @Override
    public boolean deleteRegistro(Integer idRegistro) {
        try {
            preQuery = connection.prepareStatement(QUERIES[3]);
            preQuery.setInt(1, idRegistro);
            if (preQuery.executeUpdate() > 0) {
                exito = true;
            }
        } catch (SQLException e) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return exito;
    }

    @Override
    public List<Departamento> leerRegistros() {
        try {
            preQuery= connection.prepareStatement(QUERIES[4]);
            ResultSet data= preQuery.executeQuery();
            while (data.next()){
                departamentos.add( new Departamento(data.getInt("id"), data.getString("nombre"), data.getString("ubicacion")));
            }
        } catch (SQLException e) {
            Logger.getLogger(DepartamentoDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        return departamentos;
    }
    
}
