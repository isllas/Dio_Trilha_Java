package one.digitalinnovation.gof;

/**     
 * Singleton "Preguiçoso".
 * @author isllas
 */

public class Singleton_Lazy {

private static Singleton_Lazy instancia;

private Singleton_Lazy(){
    super();
}

public static Singleton_Lazy getInstancia(){
    if (instancia == null) {
        instancia = new Singleton_Lazy();
    }
    return instancia;
}

}
