public class DoWhileLoop {
    public static void main(String[] args) {
        // minimal akan di looping satu kali walaupun nilai nya false
        var counter = 100;

        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 10);
    }
}
