package C3D;

/**
 *
 * @author alrutojch
 */
public class ControlC3D {
    
    private static int tiempo = 0;
    private static String cara3 = "";

    public static void reiniciar(){
        tiempo = 0;
        cara3 = "";
    }

    public static String generaTemp(){
        return "t$"+tiempo++;
    }
    public static void agregarC3D(String sentencia){
        cara3 += sentencia;
    }
    
    public static String getC3D(){
        return cara3;
    }
    
}
