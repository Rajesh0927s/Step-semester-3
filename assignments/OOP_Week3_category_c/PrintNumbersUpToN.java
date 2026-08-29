package OOP_Week3_category_c;

public class PrintNumbersUpToN {

    public void printNumbersUpToN(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        PrintNumbersUpToN obj = new PrintNumbersUpToN();

        obj.printNumbersUpToN(5);
    }
}