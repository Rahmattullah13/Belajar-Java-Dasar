public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "Z";

        switch (nilai) {
            case "A":
                System.out.println("WOW! Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // Switch Lamda
        switch (nilai){
            case "A" -> System.out.println("WOW! Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai Anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan!");
            }
        }

        // Kata kunci yield
        String ucapan;
        ucapan = switch (nilai) {
            case "A":
                yield "WOW! Anda lulus dengan baik";
            case "B", "C":
                yield "Nilai Anda cukup baik";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan!";
        };
        System.out.println(ucapan);
    }
}
