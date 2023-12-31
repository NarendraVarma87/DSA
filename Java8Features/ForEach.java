package Java8Features;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        List<String> games = new ArrayList<>();
        games.add("Cricket");
        games.add("Kabbadi");
        games.add("Volleyball");
        games.add("Shuttle");
        games.add("KO-KO");
        games.forEach(game -> {
            System.out.println(game);
        });
        System.out.println("Here method referance calling...");
        games.stream().forEach(System.out::println);
    }
}
