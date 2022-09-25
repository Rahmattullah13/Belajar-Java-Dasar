public class ForEach {
    public static void main(String[] args) {
        /*
        Digunakan untuk mengambil nilai array satu persatu.
        */

        String[] names = {
                "Rifki", "Hasby", "Hardlan",
                "Fikri", "Agifa", "Agus"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("MENGGUNAKAN FOR EACH");

        for (var name: names){
            System.out.println(name);
        }
    }
}
