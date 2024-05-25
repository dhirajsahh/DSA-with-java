public class DigitsFrequency {

    static int FrequencyOfDigits(int n, int target) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == target)
                count++;
            n = n / 10;

        }
        return count;
    }

    public static void main(String[] args) {
        int n = 3243233;
        int target = 3;
        int frequency = FrequencyOfDigits(n, target);
        System.out.println(frequency);

    }
}
