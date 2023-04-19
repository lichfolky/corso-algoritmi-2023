package restogreedy;

import java.util.Arrays;

public class TestResto {
    public static void main(String[] args) {
        RestoGreedy greedy = new RestoGreedy();
        System.out.println("0.95:" + greedy.restoGreedy(0.95));
        System.out.println("1.00:" + greedy.restoGreedyLimitato(1));
        System.out.println("0.95:" + greedy.restoGreedyLimitato(0.95));
        System.out.println("0.05:" + greedy.restoGreedy(0.05));
        System.out.println("0.8:" + greedy.restoGreedy(0.8));
    }
}
