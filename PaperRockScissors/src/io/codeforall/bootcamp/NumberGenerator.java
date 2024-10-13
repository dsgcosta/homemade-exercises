package io.codeforall.bootcamp;

public class NumberGenerator {
    public static HandType handType;

    public static HandType getNumberForHandType() {

        int randomNum = (int)(Math.random() * 4);

        switch (randomNum) {
            case 1:
                handType = HandType.ROCK;
                break;
            case 2:
                handType = HandType.SCISSOR;
                break;
            case 3:
                handType = HandType.PAPER;
                break;
            default:
                System.out.println("Invalid hand type");
        }
        return handType;
    }
}