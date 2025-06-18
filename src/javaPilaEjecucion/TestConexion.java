package javaPilaEjecucion;

public class TestConexion {
	
	 public static void main(String[] args) throws Exception {

		 Conexion con = null;
		 try( Conexion conexion = new Conexion() ) {
			     conexion.leerDatos();
			 	 con = new Conexion();
		         con.leerDatos();
		         con.cerrar();
		 } catch(IllegalStateException ex){
		         System.out.println("Surgió un error en la conexión ");
		 } finally {
		         con.cerrar();
		 }
     }
}
