package functions;

public class sumElements {
    public static void main(String[] args) {
        int[] r = {54,23,66,12};

        System.out.println(sumSecondAndThirdElement(new int[]{2, 3, 4, 5}));

    }
    public static int sumSecondAndThirdElement(int[] intArray)
    {
        int sum = intArray[1] + intArray[2];

        return sum;
    }
}
