package javaPilaEjecucion;

public class Conexion implements AutoCloseable {
	
	public Conexion () {
        System.out.println("Abriendo conexión");
    }


    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }


    public void cerrar() {
        System.out.println("Cerrando conexión ");
    }


	public void close() throws Exception {

	}
}


	
	

