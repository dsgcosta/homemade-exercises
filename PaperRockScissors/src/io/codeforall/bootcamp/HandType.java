package io.codeforall.bootcamp;

public enum HandType {
    ROCK("rock"),
    PAPER("paper"),
    SCISSOR("scissor");

    // property
    private String handDescription;

    // constructor
    HandType(String handDescription) {
        this.handDescription = handDescription;
    }

    // method to get private property
    public String getHandDescription() {
        return handDescription;
    }

    public void setHandDescription() {
        this.handDescription = handDescription;
    }

    public static String showAllHandTypes(){
        String result = "Hand types: ";
        for(HandType handType : HandType.values()){
           result += handType.handDescription + " ";
        }
        return result;
    }
}


