package one.digitalinnovation.gof;

/**     
 * Singleton "Lazy Holder".
 * @author isllas
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
private SingletonLazyHolder(){
    super();
}

public static SingletonLazyHolder getInstancia(){
   
    return InstanceHolder.instancia;
}

}
