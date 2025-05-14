package br.com.dougSys404.singleton;

/**
 * Singleton apressado
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}
