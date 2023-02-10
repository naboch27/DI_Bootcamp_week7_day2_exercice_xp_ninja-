package Exercice_2;

public class Player {

    private String name;

    private int age;

    private String gameType;

    public Player() {
    }

    public Player(String name, int age, String gameType) {
        this.name = name;
        this.age = age;
        this.gameType = gameType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGameType() {
        return gameType;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + ", gameType=" + gameType + "]";
    }

    

}
