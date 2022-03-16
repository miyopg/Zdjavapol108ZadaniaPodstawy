package pl.sdacademy.java.basic.exercises.day3.Task7;

public class Poem {
    private Author creator;
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }
    public void print(){
        System.out.println(this);
            }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public Author getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return "Poem" +
                creator +
                ", stropheNumber: " + stropheNumber;
    }
}
