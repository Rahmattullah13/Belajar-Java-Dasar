public class OperasiBoolean {
    public static void main(String[] args) {
        /*
        - Operasi &&(Dan) hanya akan bernilai true, jika kedua nilai benilai true.
        - Operasi ||(atau) akan berniali true jika ada salah satu nilai yg bernilai true,
        jika kedua nilai bernilai false maka hasilnya false.
        - Operasi !(kebalikan) jika bernilai true maka hasilnya false, begitupun sebaliknya.
        */
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
