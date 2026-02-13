class SmithNumber {
    public static void main(String[] args) {
        int n = 666;
        int temp = n;

        int sumDigits = 0;
        while (temp > 0) {
            sumDigits += temp % 10;
            temp = temp / 10;
        }

        int sumFactors = 0;

        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                int x = i;
                while (x > 0) {
                    sumFactors += x % 10;
                    x = x / 10;
                }
                n = n / i;
            }
        }

        if (n > 2) {
            int x = n;
            while (x > 0) {
                sumFactors += x % 10;
                x = x / 10;
            }
        }

        if (sumDigits == sumFactors) {
            System.out.println("Smith Number");
        } else {
            System.out.println("Not a Smith Number");
        }
    }
}
