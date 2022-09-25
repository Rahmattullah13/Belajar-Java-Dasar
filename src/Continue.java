public class Continue {
    public static void main(String[] args) {
        /*
        Continue digunakan untuk menghentikan perulangan saat ini
        dan melanjutkan ke perulangan berikutnya.
        jika kita mendapatkan angka genap akan diteruskan
        ke perulangan berikutnya.
        */

        for(var counter = 1; counter <= 100; counter++) {
            if(counter % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
