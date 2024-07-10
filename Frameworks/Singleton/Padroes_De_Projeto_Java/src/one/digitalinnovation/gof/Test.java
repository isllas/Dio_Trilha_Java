package one.digitalinnovation.gof;

public class Test {

    public static void main(String[] args) {

        //Testes relacionados ao Design Patter Singleton.
        
        Singleton_Lazy lazy = Singleton_Lazy.getInstancia();
        System.out.println(lazy);
        lazy = Singleton_Lazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

    }

}
