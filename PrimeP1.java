class PrimeP1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) { // range 1to100
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}