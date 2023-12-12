public class DataHolder {

    private int value1;
    private double value2;
    private String text;

    public void sum(int x, int y) {
        int result = x + y;
        System.out.println("Sum: " + result);
    }

    public void uppercaseText(String input) {
        this.text = input.toUpperCase();
        System.out.println("Uppercase Text: " + text);
    }
}

public class Main {

    public static void main(String[] args) {
        DataHolder data = new DataHolder();
        data.value1 = 10;
        data.value2 = 20.5;
        data.text = "hello";

        data.sum(data.value1, 5);
        data.uppercaseText("world");
    }
}
