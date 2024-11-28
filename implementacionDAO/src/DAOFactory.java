public class DAOFactory {
    public enum DaoType{
        DEPARTAMENTO, EMPLEADO, CLIENTES, PROYECTO
    }
    public static IDAO getDao (DaoType daoType){
        IDAO dao= null;
        switch(daoType){
            case DEPARTAMENTO:
                dao= new DepartamentoDAO();
                break;
        }
        return dao;
    }
}
