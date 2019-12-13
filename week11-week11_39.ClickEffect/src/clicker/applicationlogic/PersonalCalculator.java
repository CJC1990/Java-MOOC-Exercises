package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {

    private int numberOfClicks;

    public PersonalCalculator() {
        numberOfClicks = 0;
    }

    @Override
    public int giveValue() {
        return numberOfClicks;
    }

    @Override
    public void increase() {
        numberOfClicks++;
    }

}
