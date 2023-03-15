public class TestCuentaException {
    public static void main(String[] args) {
        
        Cuenta cuentaOscar = new Cuenta();
        try {
            cuentaOscar.deposita();
        } catch (MiExpextion Me) {
            System.out.println("Expection atrapada");
            Me.printStackTrace();
        }
    }

}