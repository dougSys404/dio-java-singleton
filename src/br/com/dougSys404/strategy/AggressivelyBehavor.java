package br.com.dougSys404.strategy;

public class AggressivelyBehavor implements Behavor{

    @Override
    public void move() {
        System.out.println();
        System.out.println("Robot is moving aggressively.....");
    }
}
