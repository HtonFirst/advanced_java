package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friend1List = new ArrayList<>();
        friend1List.add(Action.STONE);
        friend1List.add(Action.PAPER);
        friend1List.add(Action.SCISSORS);

        List<Action> friend2List = new ArrayList<>();
        friend2List.add(Action.SCISSORS);
        friend2List.add(Action.SCISSORS);
        friend2List.add(Action.PAPER);

        BestFriend friend1 = new BestFriend("Alex", exchanger, friend1List);
        BestFriend friend2 = new BestFriend("Vova", exchanger, friend2List);



    }


}

enum Action {
    STONE, SCISSORS, PAPER
}

class BestFriend extends Thread {
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> actionList;

    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> actionList) {
        this.name = name;
        this.exchanger = exchanger;
        this.actionList = actionList;
        this.start();
    }

    public void whoWins(Action myAction, Action friendAction) {
        if (myAction == Action.STONE && friendAction == Action.SCISSORS
        || myAction == Action.PAPER && friendAction == Action.STONE
        || myAction == Action.SCISSORS && friendAction == Action.PAPER) {
            System.out.println(name + " WINS!!!");
        }
    }
    
    public void run() {
        Action exchangeResult;
        for (Action action: actionList) {
            try {
                exchangeResult = exchanger.exchange(action);
                whoWins(action, exchangeResult);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
