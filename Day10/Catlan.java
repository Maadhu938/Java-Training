class Catalan {

    static int catalan(int n) {

        if(n <= 1)
            return 1;

        int res = 0;

        for(int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }

        return res;
    }

    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++) {
            System.out.print(catalan(i) + " ");
        }
    }
}