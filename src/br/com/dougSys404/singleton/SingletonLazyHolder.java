package br.com.dougSys404.singleton;

/**
 * Singleton lazy holder -> thread safe
 */

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
