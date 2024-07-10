package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Singleton.Singleton_Lazy;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.Strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.Strategy.ComportamentoNormal;
import one.digitalinnovation.gof.Strategy.Robo;

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

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

    }

}
