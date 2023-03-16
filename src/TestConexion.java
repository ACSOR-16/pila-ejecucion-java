public class TestConexion {
    public static void main(String[] args) {
        Conexion conex = new Conexion();
        try { // puede funcionar con catch o finally
            conex.leerDatos();
            conex.cerrar();
        } catch (IllegalStateException ise) {
            System.out.println("se recibio exception");
            ise.printStackTrace();
            conex.cerrar();
        } finally { //tercera estructura
            System.out.println("ejecutando finally");
            conex.cerrar();
        }
    }
}
