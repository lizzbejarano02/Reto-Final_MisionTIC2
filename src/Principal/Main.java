
package Principal;

import Controlador.*;
import Modelo.*;
import Vistas.*;

public class Main {

    public static void main(String[] args) {
        //1. Creamos la instancia de la clase conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
        ListarModeloDB listas = new ListarModeloDB();
        listas.getListaGerentes();
        listas.getListaOperarios();
        listas.getListaDomiciliarios();
        //2. Creamos una instancia de la vista Login
        Login login = new Login();
        //3. Mediante la instancia de la vista llamamos el método que la hace visible
        login.setVisible(true);
    }
}
