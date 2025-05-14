package br.com.dougSys404.singleton;

public class SingletonLazy {
    /**
     * Singleto preguiçoso
     */
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if (instance == null) instance = new SingletonLazy();

        return instance;
    }
}
