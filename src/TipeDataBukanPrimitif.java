public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 10;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);
        System.out.println(iniInteger);
        System.out.println(iniLong);

        iniByte = 100;

        System.out.println(iniByte);

        /*
        Untuk melakukan konversi dari tipe data primitif ke
        tipe data yang bukan primitif
        */
        int iniInt = 100;

        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);

        // Jika kita ingin menkonversi nilai yang tidak compatible,
        // kita bisa menggunakan method
        int age = 23;

        Integer ageObject = age;

        int ageAggain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float iniFloat = ageObject.floatValue();

        System.out.println(shortAge);
        System.out.println(byteAge);

        Long amount = 100000L;

        amount.floatValue();
        amount.byteValue();
        amount.shortValue();
    }
}
