public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }
    public static void metodo1(){
        System.out.println("Inicio de metodo1");
        metodo2();
        System.out.println("Fin de metodo1");
    }
    public static void metodo2(){
        System.out.println("Inicio de metodo2");
        for(int i =1; i<= 5; i++){
        System.out.println("i");
        try {//intenta error
            // int numero = 0;
            // int resultado = i/numero;
            // System.out.println(resultado);
            String test = null;
            System.out.println(test.toString());

        } catch(ArithmeticException exception) {//atrapa error

            System.out.println("Atrapa Arihmetic");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        catch(NullPointerException exception) {//atrapa error
            
            System.out.println("Atrapa Nullpointer");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
        }
        System.out.println("Fin de metodo2");
    }
}
