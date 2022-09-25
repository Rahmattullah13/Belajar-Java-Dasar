public class TipeDataArray {

    public static void main(String[] args) {

        int[] arrayInteger = new int[3]; // 3 adalah jumlah array-nya
        arrayInteger[0] = 100; // untuk mengisi/mengubah nilai array-nya
        arrayInteger[1] = 150;
        arrayInteger[2] = 200;

        // untuk mengakses/mangambil nilai array-nya
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);

        // Mengubah nilai array yg sudah ada.
        arrayInteger[1] = 500;

        System.out.println(arrayInteger[1]);

        // Cara singkat untuk membuat array
        String[] nameNama = {
                "Rifki", "Hasby", "Agus"
        };

        /*
        Di Java tidak ada yang namanya menghapus array,
        yang ada hanya mengubah nilai nya menjadi null/0
        */
        nameNama[2] = null;

        System.out.println(nameNama[2]);

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        // Untuk mengetahui panjang dari array
        System.out.println(arrayLong.length);

        // Membuat array didalam array
        String[][] members = {
                {"Rifki", "Rahmattullah"},
                {"Hasby", "Agus"},
                {"Fikri", "Hardlan"}
        };

        System.out.println(members[1][0]); // Rifki
        System.out.println(members[2][0]); // Hasby
        System.out.println(members[2][1]); // Hardlan
    }
}
