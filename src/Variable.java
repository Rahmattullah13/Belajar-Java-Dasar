public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Rifki Rahmattullah";

        int age = 23;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Mengubah nilai variable
        name = "Hasby";
        System.out.println(name);

        /*
        Kata kunci Var digunakan ketika kita ingin menulis sebuah variable
        lebih simple tanpa harus menulis tipe datanya terlebih dahulu.
        */
        var firstName = "Rifki";
        var lastName = "Rahmattullah";

        System.out.printf(firstName);
        System.out.printf(lastName);

        /*
        Jika kita ingin sebuah variable yg nilai nya
        tidak bisa diubah kita bisa pakai kata kunci Final,
        final adalah sebuah variable konstan.
        */
        final String application = "Belajar Java";
    }
}
