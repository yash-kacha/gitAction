public class sum {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static int doSum(int a ,int b)
    {
        return a+b;
    }

    public static void checkTest() {
        testDoSum(5, 3, 8);
        testDoSum(0, 0, 0);
        testDoSum(-2, 2, 0);
        testDoSum(100, 200, 300);
        testDoSum(-5, -3, -8);
        testDoSum(Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        testDoSum(Integer.MIN_VALUE, 0, Integer.MIN_VALUE);
        testDoSum(12345, 67890, 80235);
        testDoSum(-100, 50, -50);
        testDoSum(9999, -9999, 0);
    }
    
    private static void testDoSum(int a, int b, int expected) {
        int result = doSum(a, b);
        if (result == expected) {
            System.out.println("Test passed: doSum(" + a + ", " + b + ") == " + expected);
        } else {
            System.out.println("Test failed: doSum(" + a + ", " + b + ") returned " + result + ", expected " + expected);
        }
    }
//yash is here
}
