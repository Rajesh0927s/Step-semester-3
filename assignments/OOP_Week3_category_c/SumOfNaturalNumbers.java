package OOP_Week3_category_c;

public class SumOfNaturalNumbers {

    public void sumOfNaturalNumbers(int n) {

        int counter = 1;
        int sum = 0;

        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

    public static void main(String[] args) {

        SumOfNaturalNumbers obj = new SumOfNaturalNumbers();

        obj.sumOfNaturalNumbers(5);
    }
}
