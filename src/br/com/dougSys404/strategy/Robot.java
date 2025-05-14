package br.com.dougSys404.strategy;

public class Robot {

    private Behavor strategy;

    public void setStrategy(Behavor behavor){
        this.strategy = behavor;
    }

    public void move(){
        strategy.move();
    }
}
