import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int eleccion;
        System.out.println("*#  MENU DE GESTION DE LA BASE DE DATOS. *#");
        System.out.println("Indica donde desea realizar las operaciones: ");
        System.out.println("[1] Tabla Departamento");
        System.out.println("[2] Tabla Empleado");
        System.out.println("[3] Tabla Clientes");
        System.out.println("[4] Tabla Proyecto");
        System.out.println("[0] Salir del Gestor");
        Scanner sc = new Scanner(System.in);
        eleccion= sc.nextInt();
        switch (eleccion){
            case 1:
            Departamento departamento= new Departamento();
            IDAO dao= DAOFactory.getDao(DAOFactory.DaoType.DEPARTAMENTO);
            int idDepartamento;
             List<Departamento> departamentos = new ArrayList();
            boolean terminar= false;
            do {
                System.out.println("*# GESTIÓN DE LOS DEPARTEMENTOS #*");
                System.out.println("¿Qué acción quieres realizar?");
                System.out.println("[1] Crear registro\n"
                        + "[2] Actualizar registro\n"
                        + "[3] Eliminar registro\n"
                        + "[4] Buscar un registro\n"
                        + "[5] Mostrar todos los registros\n"
                        + "[0] Salir");
                int eleccionDos = sc.nextInt();
    
                switch (eleccionDos) {
                    case 1:
                        System.out.println("|REGISTRAR DEPARTAMENTO|");
                        System.out.println("Inserta nombre del departamento: ");
                        departamento.setNombre(sc.next());
                        System.out.println("Ubicacion del departamento: ");
                        departamento.setUbicacion(sc.next());
                        break;
                    case 2:
                        System.out.println("|ACTUALIZAR DEPARTAMENTO|");
                        System.out.println("Id del Departamento: ");
                        idDepartamento = sc.nextInt();
                        System.out.println("Inserta nombre: ");
                        departamento.setNombre(sc.next());
                        System.out.println("Ubicacion del departamento: ");
                        departamento.setUbicacion(sc.next());
                        System.out.println(dao.updateRegistro(departamento, idDepartamento));
                        break;
                    case 3:
                        System.out.println("|ELIMINAR DEPARTAMENTO|");
                        System.out.println("Id del Departamento: ");
                        idDepartamento = sc.nextInt();
                        System.out.println(dao.deleteRegistro(idDepartamento));
                        break;
                    case 4:
                        System.out.println("|BUSCAR DEPARTAMENTO|");
                        System.out.println("Id del departamento: ");
                        idDepartamento = sc.nextInt();
                        dao.leerRegistro(idDepartamento);
                        System.out.println(dao.leerRegistro(idDepartamento));
                        break;
                    case 5:
                        System.out.println("|LISTA DE REGISTROS|");
                        departamentos.clear();
                        departamentos = dao.leerRegistros();
                        for (Departamento registro : departamentos) {
                            System.out.println(registro.toString());
                        }
                        break;
                    case 0:
                        System.out.println("|SALIENDO...|");
                        break;
                    default:
                        System.out.println("Opción no válida!");
                }
                
                if (eleccionDos == 0) {
                    terminar = true;
                }else{
                    System.out.println("¿Realizar otra acción? [1] Sí/[2] No");
                    eleccionDos = sc.nextInt();
                    if(eleccionDos != 1){
                        terminar = true;
                        System.out.println("|SALIENDO...|");
                    }
                }
    
            } while (!terminar);
    
        }
    }
}
