package ni.edu.uam.facturacion.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 */

public class facturacion {

	public static void main(String[] args) throws Exception {
		// DBServer.start("miaplicacion-db"); // Comenta o elimina, HSQLDB ya no es necesario
		AppServer.run("facturacion");
	}

}
