public class ForLoop {
    public static void main(String[] args) {
        /*
        for(init statement; kondisi; post statement) {
            block perulangan
        }
        */

        // Invite Loop
//        for(;;) {
//            System.out.println("Perulangan");
//        }

        for(var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan" + counter);
        }
    }
}
