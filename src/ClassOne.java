public class ClassOne {
    private int number;
    public ClassOne(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printNumber() {
        System.out.println("Your number is: " + number);
    }

    public void addNumber(int number) {
        this.number += number;
    }
}
