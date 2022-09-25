public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 80, 80, 80};
        sayCongrats("Rifki", values);

        // Method Variable Argument
        sayCongrats("Hasby", 80, 75, 78, 60, 80);
    }

    static void  sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
