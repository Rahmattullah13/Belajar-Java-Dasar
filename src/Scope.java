public class Scope {
    public static void main(String[] args) {
        sayHello("Rifki");
        sayHello("");
    }

    /*
    Variable di Java siklus hidupnya hanya bisa diakses didalam bloknya,
    Jika kita mengakses variable diluar bloknya maka error
    */
    static void sayHello(String name){
        String hello = "Hi " + name;

        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
