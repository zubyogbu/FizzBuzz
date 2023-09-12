public class Multiples {

    public static void main(String[] args) {

        int x = 0;

        for (int n = 999; n > 0; n--){

            if (n % 3 == 0){
                x++;
            } else if (n % 5 == 0) {
                x++;
            }
        }
        System.out.println(x);
    }

}
