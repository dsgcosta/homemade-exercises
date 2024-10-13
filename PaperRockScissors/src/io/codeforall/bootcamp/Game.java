package io.codeforall.bootcamp;

public class Game {

    // gets playerName from class Player
    private Player playerName;

    // gets handType from class HandType
    private static HandType handType;



    // constructor
    public Game(Player playerName, HandType handType){
        this.playerName = playerName;
        this.handType = NumberGenerator.getNumberForHandType();
    }

    // method to get player
    public Player getGamePlayerName() {
        return playerName;
    }


    public HandType getGameHandDescription() {
        return handType;
    }


    /*
    public static String play() {

        Player player1  = new Player("Daniela");
        Player player2  = new Player("Pedro");

        Player[] players = new Player[] {player1, player2};

        for (Player player : players) {
            System.out.println("Jogador: " + player.getPlayerName());
        }
        return players[0].getPlayerName();
    }
    */


    public static String firstPlay(){

        Player player1  = new Player("Bruno");
        Player player2  = new Player("Daniela");

        //Game newGame = new Game(player1, handType);
        //System.out.println(newGame.playerName, newGame.handType);

        Player[] players = new Player[] {player1, player2};

        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getPlayerName() + " + " + NumberGenerator.getNumberForHandType());

        }
        return players[0].getPlayerName();

    }








        //HandType rock = HandType.ROCK;
        //firstGame.randomizeHandType();
        //Game firstGame = new Game(player3, rock);
        //System.out.println("firstPlay: " + firstGame.getGamePlayerName().getPlayerName() + "HandType: " + firstGame.getGameHandDescription().getHandDescription());
}

