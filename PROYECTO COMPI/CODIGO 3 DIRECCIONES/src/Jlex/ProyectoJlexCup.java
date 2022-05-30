package Jlex;

/**
 *
 * @author alrutojch
 */
public class ProyectoJlexCup {


    public static void main(String[] args) {
        try {
            parser p = new parser(new Yylex(new java.io.FileInputStream("C:\\Users\\Usuario\\Desktop\\3 Direcciones\\Jlex_Cup_C3D-main\\prueba.mlp")));
            p.parse();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
