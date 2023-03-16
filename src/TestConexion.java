public class TestConexion {
    public static void main(String[] args) throws Exception{
       
        try (Conexion conex = new Conexion()) {
            conex.leerDatos();
       } catch (IllegalStateException ex) {
        System.out.println("ejecutando catch");
        ex.printStackTrace();
       }
       
       
        /* 
        Conexion conex = null;
        try { // puede funcionar con catch o finally
            conex = new Conexion();
            conex.leerDatos();
        } catch (IllegalStateException ise) {
            System.out.println("se recibio exception");
            ise.printStackTrace();
        } finally { //tercera estructura
            System.out.println("ejecutando finally");
            if (conex != null) {
                conex.cerrar();
            }
        }
        */
    }
}
