public class Calculator {

    public int add(int a, int b)      { return a + b; }
    public int subtract(int a, int b) { return a - b; }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("add(7, 3)      = " + c.add(7, 3));
        System.out.println("subtract(7, 3) = " + c.subtract(7, 3));
    }
}