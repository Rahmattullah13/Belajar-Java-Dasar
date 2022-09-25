public class Break {
    public static void main(String[] args) {

        // Jika kita ingin menghentikan perulangan total pakai break;

        var counter = 1;

        while (true) {
            System.out.println("Perulangan " + counter);
            counter++;

            if(counter > 10) {
                break;
            }
        }
    }
}
