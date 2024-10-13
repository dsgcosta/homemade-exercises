public enum HandType {
    PAPER("paper"),
    ROCK("rock"),
    SCISSOR("scissor");

    private String description;

    HandType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
