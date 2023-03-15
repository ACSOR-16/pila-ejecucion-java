public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }
    public static void metodo1(){
        System.out.println("Inicio de metodo1");
        try {
            metodo2();

        } catch (MiExpextion me) {
            me.printStackTrace();
        } 
        System.out.println("Fin de metodo1");
    }
    public static void metodo2(){
        System.out.println("Inicio de metodo2");
        //throw new ArithmeticException();
        // throw new ArithmeticException("Surgió un error");
        throw new MiExpextion("Mi expecion fue lanzada");
    }
}
