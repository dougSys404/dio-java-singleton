package br.com.dougSys404.service;

import br.com.dougSys404.facade.Facade;
import br.com.dougSys404.singleton.SingletonEager;
import br.com.dougSys404.singleton.SingletonLazy;
import br.com.dougSys404.singleton.SingletonLazyHolder;
import br.com.dougSys404.strategy.*;

import java.util.Scanner;

public final class AuxiliaryService {

    public static void auxiliaryCaller(){

        Scanner sc = new Scanner(System.in);

            System.out.println("Escolha os exercícios:");
            System.out.println("1 - Singleton");
            System.out.println("2 - Strategy");
            System.out.println("3 - Facade");
            System.out.println("0 - Sair");
            System.out.print("Option: ");
            int option = sc.nextInt();

            switch (option){
                case 1 -> getSingletonClasses();
                case 2 -> getStrategyClasses();
                case 3 -> getFacadeClasses();
            }
        }

    public static void getSingletonClasses(){


        System.out.println("----------------------------------------------------------");
        System.out.println("Singleton lazy");
        System.out.println();
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();

        System.out.println("printing lazy1: " + lazy1);
        System.out.println("printing lazy2: " + lazy2);

        System.out.println();
        System.out.println("Comparing both objects with equals: " + lazy1.equals(lazy2));

        System.out.println("----------------------------------------------------------");
        System.out.println("Singleton Eager");
        System.out.println();

        SingletonEager eager1 = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();

        System.out.println("printing eager1: " + eager1);
        System.out.println("printing eager2: " + eager2);

        System.out.println();
        System.out.println("Comparing both objects with equals: " + eager1.equals(eager2));


        System.out.println("----------------------------------------------------------");
        System.out.println("Singleton lazy holder");
        System.out.println();

        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstance();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();

        System.out.println("printing lazyHolder1: " + lazyHolder1);
        System.out.println("printing lazyHolder2: " + lazyHolder2);

        System.out.println();
        System.out.println("Comparing both objects with equals: " + lazyHolder1.equals(lazyHolder2));
    }

    public static void getStrategyClasses() {
        System.out.println("-----------------------------------------------");
        System.out.println("Java's strategies");
        System.out.println("Implementing move interfaces into a robot");


        Behavor commom = new CommonBehavor();
        Behavor defense = new DefenseBehavor();
        Behavor agressive = new AggressivelyBehavor();

        Robot robot = new Robot();

        robot.setStrategy(commom);

        robot.move();

        robot.setStrategy(defense);

        robot.move();

        robot.setStrategy(agressive);

        robot.move();
    }

    public static void getFacadeClasses(){

        Facade facade = new Facade();

        System.out.println();
        facade.migrateCustomer("Douglas", "00000-00");

    }

}

