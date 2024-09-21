package math.ReverseInteger_7;

public class Main {

    public static void main(String[] args) {
        System.out.println(new MyStackBasedSolution().reverse(123));
        System.out.println(new MyStackBasedSolution().reverse(-123));
        System.out.println(new MyStackBasedSolution().reverse(-2147483648));

        System.out.println("---");

        System.out.println(new EditorialSolution().reverse(123));
        System.out.println(new EditorialSolution().reverse(-123));
        System.out.println(new EditorialSolution().reverse(-2147483648));
    }
}
