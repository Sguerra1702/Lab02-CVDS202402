package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        if (args.length > 0) {
            String nombre = "";
            for (int i = 0; i<args.length; i++) {
                nombre += args[i] + " ";
            }
            System.out.println( "Hola " + nombre + "!" );
        }else {
            System.out.println( "Hello World!" );
        }
    }
}

