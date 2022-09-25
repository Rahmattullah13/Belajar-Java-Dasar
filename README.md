# Java Dasar

---

## Sejarah Java

- Java adalah bahasa pemrograman yang dibuat oleh James Gosling saat bekerja di Sun Microsystem.
- Java dirilis ke public pada tahun 1995.
- Java adalah bahasa pemrograman berorientasi object dan mendukung pengelolaan memori secara otomatis.
- Saat ini perusahaan Sun Microsystem telah dibeli oleh Oracle.
- Java terkenal dengan " Write Once, Run Anywhere ", karena binary program Java di-generate secara independen dan
  bisa dijalankan di Java Virtual Machine yang terinstall di berbagai sistem operasi.

---

## Teknologi Java

- Java Standard Edition
- Java Enterprise Edition
- Java Micro Edition

---

## Dimana Java Banyak Digunakan?

- Backend, banyak perusahaan besar saat ini menggunakan Java sebagai aplikasi backend-nya seperti Twitter, Netflix,
  Spotify, Amazon, Alibaba, Blibli, dll.
- Big Data, teknologi-teknologi big data yang saat ini populer, kebanyakan adalah teknologi Java seperti Apache Hadoop,
  Elasticsearch, Apache Cassandra, Apache Spark, Apache Kafka, dll.
- Android, di Android kita bisa menggunakan Java dan Kotlin untuk membuat aplikasinya.

---

## JRE vs JDK

- JRE singkatan dari Java Runtime Environment.
- JDK singkatan dari Java Development Kit.

---

## Java Virtual Machine(JVM)

- Java sendiri hanyalah bahasa pemrograman, otak dibalik teknologi Java sebenarnya adalah sebuah
  teknologi yang disebut Java Virtual Machine.
- Java Virtual Machine, merupakan program yang digunakan untuk mengeksekusi binary file Java.
- Karena JVM hanya mengerti binary file, sehingga akhirnya banyak bahasa pemrograman yang mengadopsi teknologi JVM,
  seperti Kotlin, Scala, Groovy, dll.
- Dengan begitu, banyak bahasa pemrograman yang lebih canggih dari Java, namun mereka tetap jalan di JVM yang
  sudah terbukti stabil dan bagus.

---

## OpenJDK

- OpenJDK adalah salah satu implementasi Java Development Kit yang opensource dan gratis.
- [Link OpenJDK](https://openjdk.java.net/)

### OpenJDK vs Pilihan Lain

- Oracle JDK : [Link](https://www.oracle.com/java/technologies/javase-downloads.html)
- Amazon Corretto : [Link](https://aws.amazon.com/id/corretto/)
- Zulu : [Link](https://www.azul.com/downloads/zulu-community/)

---

## Integrated Development Environment

- IDE adalah smart editor yang digunakan untuk mengedit kode program.
- IDE juga digunakan untuk melakukan otomatisasi proses kompilasi kode program dan otomatisasi proses menjalan program.

**IDE untuk Java**

- Intelli JDEA Ultimate/Community : [Link](https://www.jetbrains.com/idea/)
- Eclipse : [Link](https://www.eclipse.org/downloads/packages/)
- NetBeans : [Link](https://netbeans.apache.org/)
- JDeveloper : [Link](https://www.oracle.com/application-development/technologies/jdeveloper.html)

---

## Program Hello World

```java
public class HelloWorld {
    public static void main(String[] args) {
        // CODE PROGRAM
        System.out.println("Hello World");
    }
}
```

---

## Tipe Data Number

- Integer Number
- Floating Point Number

### Integer Number

| Tipe Data | Min                        | Max                       | Size    | Default |
|:----------|:---------------------------|:--------------------------|:--------|:--------|
| byte      | -128                       | 127                       | 1 byte  | 0       |
| short     | -32,768                    | 32,767                    | 2 bytes | 0       |
| int       | -2,147,483,648             | 2,147,483,647             | 4 bytes | 0       |
| long      | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 8 bytes        | 0             |

**Contoh Integer Number**

```java
public class IntegerNumber {
    public static void main(String[] args) {
        // CODE PROGRAM
        byte intByte = 100;
        short intShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L;
    }
}
```

### Floating Point Number

| Tipe Data | Min      | Max      | Size    | Default |
|:----------|:---------|:---------|:--------|:--------|
| float     | 3.4e-038 | 3.4e+038 | 4 byte  | 0.0     |
| double    | 1.7-308  | 1.7+308  | 8 bytes | 0.0     |

**Contoh Floating Point Number**

```java
public class IntegerNumber {
    public static void main(String[] args) {
        // CODE PROGRAM
        float iniFloat = 10.10F;
        double iniDouble = 10.10;
    }
}
```

### Kode : Literals

```java
public class IntegerNumber {
    public static void main(String[] args) {
        // CODE PROGRAM
        int decimalInt = 34;
        int hexDecimal = 0x22;
        int binaryDecimal = 0b100010;
    }
}
```

### Kode : Underscore

```java
public class IntegerNumber {
    public static void main(String[] args) {
        // CODE PROGRAM
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;
    }
}
```

---

## Konversi Tipe Data Number

- Widening Casting(Otomatis) : byte => short => int => long => float => double.
- Narrowing Casting(Manual) : double => float => long => int => char => short => byte.

**Contoh Konversi Tipe Data Number**

```java
public class KonversiNumber {
    public static void main(String[] args) {
        // CODE PROGRAM
        // Konversi Secara Otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Konversi Manual
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
```

---

## Tipe Data Character

- Data Character(huruf) di Java direpresentasikan oleh tipe data char.
- Untuk membuat data char di Java, kita bisa menggunakan tanda petik satu('') diawal dan diakhir karakter.

**Contoh Tipe Data Char**

```java
public class TipeDataChar {
    public static void main(String[] args) {
        // CODE PROGRAM

        char r = 'R';
        char i = 'I';
        char f = 'F';
        char k = 'K';
        char i2 = 'I';

        System.out.print(r);
        System.out.print(i);
        System.out.print(f);
        System.out.print(k);
        System.out.print(i2);
    }
}
```

---

## Tipe Data Boolean

- Tipe data boolean adalah tipe data yang memiliki 2 nilai, yaitu benar dan salah.
- Tipe data boolean di Java direpresentasikan dengan kata kunci boolean.
- Nilai benar direpresentasikan dengan kata kunci true.
- Nilai salah direpresentasikan dengan kata kunci false.
- Default value untuk boolean adalah false.

**Contoh Boolean**

```java
public class TipeDataChar {
    public static void main(String[] args) {
        // CODE PROGRAM

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);
    }
}
```

---

## Tipe Data String

- Tipe data String adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
- Di Java, tipe data String direpresentasikan dengan kata kunci String.
- Untuk membuat String di Java, kita menggunakan karakter petik dua("").
- Default value untuk String adalah null.

**Contoh String**

```java
public class TipeDataString {
    public static void main(String[] args) {
        // CODE PROGRAM

        String firstName = "Rifki";
        String lastName = "Rahmattullah";

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
```

**Menggabungkan String**

```java
public class TipeDataString {
    public static void main(String[] args) {
        // CODE PROGRAM

        String firstName = "Rifki";
        String lastName = "Rahmattullah";
        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);
    }
}
```

---

## Variable

- Variable adalah tempat untuk menyimpan data.
- Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama,
  tidak bisa berubah-ubah seperti di bahasa pemrograman PHP atau Javascript.
- Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya.
- Nama variable tidak boleh mengandung whitespace(spasi, enter, dll), dan tidak boleh seluruhnya number.

**Contoh Variable**

```java
public class Variable {
    public static void main(String[] args) {
        // CODE PROGRAM

        String firstName;
        firstName = "Rifki";

        String lastName = "Rahmattullah";

        int age = 23;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
}
```

### Kata Kunci Var

- Sejak versi Java 10, Java mendukung pembuatan variable dengan kata kunci var, sehingga kita tidak perlu menyebutkan
  tipe datanya lagi.
- Nmaun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus meninisialisasi
  value/nilai dari variable tersebut secara langsung.

**Contoh Var**

```java
public class Variable {
    public static void main(String[] args) {
        // CODE PROGRAM

//    var firstName; // ERROR!
        var firstName = "Rifki";

        var lastName = "Rahmattullah";

        var age = 23;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
}
```

---

## Kata Kunci final

- Secara default, variable di Java bisa diubah-ubah nilainya.
- Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat kita bisa
  menggunakan kata kunci final.
- Istilah variable seperti ini, banyak juga yang menyebutnya dengan konstan.

**Contoh Kata Kunci final**

```java
public class Variable {
    public static void main(String[] args) {
        // CODE PROGRAM

        final String fullName = "Rifki Rahmattullah";
        var age = 23;

        // jika diubah akan Error
//    name = "Ubah nama"; // ERROR!

        System.out.println(fullName);
        System.out.println(age);
    }
}
```

---

## Tipe Data Bukan Primitif

- Tipe data primitif adalah tipe data bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
- Tipe data number, char, boolean, adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
- Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai
  null.
- Tipe data bukan primitif bisa memiliki method/function.
- Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya.

**Representasi Tipe Data Primitif**

| Tipe Data Primitif | Tipe Data Bukan Primitif |
|:-------------------|:-------------------------|
| byte               | Byte                     |
| shor               | Short                    |
| int                | Integer                  |
| long               | Long                     |
| float              | Float                    |
| double             | Double                   |
| char               | Character                |
| boolean            | Boolean                  |

**Note : Jika kita menggunakan tipe data bukan primitif maka default value nya adalah null**

**Contoh Tipe Data Bukan Primitif**

```java
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // CODE PROGRAM

        Integer iniInteger = 100;
        Long iniLong = 1000000L;
        Byte iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        // Contoh konversi dari tipe data primitif ke tipe data bukan primitif
        int umur = 23;

        Integer umurku = umur;

        // Contoh konversi dari tipe data bukan primitif ke tipe data primitif yang tidak sama tipe nya(not compatible).
        short inishortUmur = umurku.shortValue();
        long inilongUmur = umurku.longValue();
        float inifloatUmur = umurku.floatValue();
    }
}
```

---

## Tipe Data Array

- Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama.
- Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.
- Untuk mengakses Array kita bisa menggunakan indeks nya.
- Indeks dimulai dari 0.
- Di Java Array bersifat fix tidak bisa diubah lagi jumlah nya.
- Di Java tidak ada proses penghapusan array, kita hanya bisa mengkosongkan dengan null.

**Operasi di Array**

| Operasi Array        | Keterangan              |
|:---------------------|:------------------------|
| array[index]         | Mengambil data di array |
| array[index] = value | Mengubah data di array  |
| array.length         | Mengambil panjang array |

### Cara Kerja Array

**INSERT IMAGE!!!**

**Contoh Array**

```java
public class Array {
    public static void main(String[] args) {

        // Cara tidak langsung
        String[] stringArray;
        stringArray = new String[3];

        // Cara untuk menambahkan data ke Array
        stringArray[0] = "Rifki";
        stringArray[1] = "Hasby";
        stringArray[2] = "Agifa";

        // Cara untuk mengakses data Array
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Cara mengubah data di dalam Array
        stringArray[2] = "Adhi";

        System.out.println(2);

        // Cara langsung
        String[] stringArray2 = new String[3];

        // Array Initializer
        int[] arrayInt = new int[]{
                10, 32, 12, 43, 90
        };

        long arrayLong = {
                19L, 32L, 65L,
        };

        arrayLong[0] = 100L;

        System.out.println(arrayLong.length);
        System.out.println(arrayLong);
    }
}
```

**Array di dalam Array**

```java
public class Array {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3}, // array ke 0
                {4, 5, 6, 7}, // array ke 1
                {8, 9} // array ke 2
        };

        // cara mengakses
        System.out.println(numbers[0][2]);
        System.out.println(numbers[1][3]);
        System.out.println(numbers[2][1]);
        System.out.println(numbers[0]);
    }
}
```

---

## Operasi Matematika

| Operator | Keterangan  |
|:---------|:------------|
| +        | Penjumlahan |
| -        | Pengurangan |
| *        | Perkalian   |
| /        | Pembagian   |
| %        | Sisa Bagi   |

**Contoh Operasi Matematika**

```java
public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

### Augmented Assignments

| Operator Matematika | Augmented Assignments  |
|:--------------------|:----------------------:|
| a = a + 10          |        a += 10         |
| a = a - 10          |        a -= 10         |
| a = a * 10          |        a *= 10         |
| a = a / 10          |        a /= 10         |
| a = a % 10          |        a %= 10         |

**Contoh Augmented Assignments**

```java
public class OperasiMatematika {
    public static void main(String[] args) {

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);
    }
}
```

### Unary Operator

| Operator | Keterangan        |
|:---------|:------------------|
| ++       | a = a + 1         |
| --       | a = a - 1         |
| -        | Negatif           |
| +        | Positif           |
| !        | Boolean kebalikan |

**Contoh Unary Operator**

```java
public class OperasiMatematika {
    public static void main(String[] args) {

        int c = 100;

        c++;
        System.out.println(c);

        c--;
        System.out.println(c);
    }
}
```

---

## Operasi Perbandingan

- Operasi Perbandingan adalah operasi untuk membandingkan dua buah data.
- Operasi Perbandingan adalah operasi yang menghasilkan nilai boolean(true or false).
- Jika hasil operasinya adalah benar, maka nilainya adalah true.
- Jika hasil operasinya adalah salah, maka nilainya adalah false.

| Operator  | Keterangan              |
|:---------:|:------------------------|
|     >     | Lebih Dari              |
|     <     | Kurang Dari             |
|    >=     | Lebih Dari Sama Dengan  |
|    <=     | Kurang Dari Sama Dengan |
|    ==     | Sama Dengan             |
|    !=     | Tidak Sama Dengan       |

**Contoh Operasi Perbandingan**

```java
public class OperasiPerbandingan {
    public static void main(String[] args) {

        int a = 100;
        int b = 100;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
```

---

## Operasi Boolean

|  Operator   | Keterangan |
|:-----------:|:-----------|
|     &&      | Dan        |
|&#124; &#124;| Atau       |
|      !      | Kebalikan  |

### 1. Operasi && (Dan)

| Nilai 1 | Operator | Nilai 2 | Hasil |
|:-------:|:--------:|:-------:|:-----:|
|  true   |    &&    |  true   | true  |
|  true   |    &&    |  false  | False |
|  false  |    &&    |  true   | false |
|  false  |    &&    |  false  | false |

### 2. Operasi || (Atau)

| Nilai 1 |     Operator     | Nilai 2 | Hasil  |
|:-------:|:----------------:|:-------:|:------:|
|  true   |  &#124; &#124;   |  true   |  true  |
|  true   |  &#124; &#124;   |  false  |  true  |
|  false  |  &#124; &#124;   |  true   |  true  |
|  false  |  &#124; &#124;   |  false  | false  |

### 3. Operasi ! (Kebalikan)

| Operator | Nilai 2 | Hasil |
|:--------:|:-------:|:-----:|
|    !     |  true   | false |
|    !     |  false  | true  |

**Contoh Operasi Boolean**

```java
public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
```

---

## Expression

- Expression adalah kontruksi dari variable, operator, dan pemanggilan method yang mengevaluasi menjadi sebuah single
  value.
- Expression adalah core component dari statement.

## Statement

- Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
- Sebuah statement berisikan execution komplit biasanya diakhiri dengan titik koma.
- Ada beberapa jenis statement :
-
    - Assignment expression
-
    - Penggunaan ++ dan --
-
    - Method invocation
-
    - Object creation expression

## If Statement

- Di Java, if adalah salah satu kata kunci yang digunakan untuk percabangan.
- Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi.
- Hampir di semua bahasa pemrograman mendukung if expression.

**Contoh If Statement**

```java
public class IfStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat anda lulus!");
        }
    }
}
```

---

## Else Statement

- Block if dieksekusi ketika kondisi if bernilai true.
- Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false.
- Hal ini bisa dilakukan menggunakan else expression.

**Contoh Else Statement**

```java
public class IfStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 70;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat anda lulus!");
        } else {
            System.out.println("Anda tidak lulus!");
        }
    }
}
```

---

## Else If Statement

- Kadang dalam if, kita butuh membuat beberapa kondisi.
- Kasus seperti ini, di Java bisa menggunakan Else If expression
- Else if di Java bisa lebih dari satu.

**Contoh Else If Statement**

```java
public class IfStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 70;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
```

---

## Switch Statement

- Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti menggunakan perbandingan ==.
- Swith adalah statement percabangan yang sama dengan if, namun lebih sederhanacara pembuatanya.
- Kondisi di switch statement hanya untuk perbandingan ==.

**Contoh Switch Statement**

```java
public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 70;

        switch (nilai) {
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik!");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus!");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus!");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan!");
        }
    }
}
```

### Switch Lambda

- Di Java versi 14, diperkenalkan switch expression dengan lambda.
- Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break.

**Contoh Switch Lambda**

```java
public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 70;

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik!");
            case "B", "C" -> System.out.println("Anda Lulus!");
            case "D" -> System.out.println("Anda Tidak Lulus!");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan!");
            }
        }
    }
}
```

---

## Kata Kunci Yield

- Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada
  switch statement.
- Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.

**Contoh Switch Tanpa yield**

```java
public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 70;

        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik!");
            case "B", "C" -> System.out.println("Anda Lulus!");
            case "D" -> System.out.println("Anda Tidak Lulus!");
            default -> System.out.println("Mungkin Anda Salah Jurusan!");
        }
    }
}
```

**Contoh Switch Dengan yield**

```java
public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        String ucapan = switch (nilai) {
            case "A":
                yield "WOw Anda lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
    }
}
```

---

## Ternary Operator

- Ternary Operator adalah operator sederhana dari if statement.
- Ternary Operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil,
  jika bernilai false maka nilai kedua diambil.

**Contoh Kode Tanpa Ternary Operator**

```java
public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Silahkan Coba lagi";
        }
    }
}
```

**Contoh Kode Dengan Ternary Operator**

```java
public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan = nilai >= 75 ? "elamat anda lulus" : "Silahkan Coba lagi";

        System.out.println(ucapan);
    }
}
```

---

## For Loop

- For adalah salah satu kata kunci yang bisa dinggunakan untuk melakukan perulangan.
- Block kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi.

**Syntax For Loop**

> for(init statement; kondisi; post statement) {
>
>// block perulangan
>
> }

**Contoh Kode Perulangan Tanpa Henti**

```java
public class ForLoop {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Perulangan Tanpa Henti!!!");
        }
    }
}
```

**Contoh Kode Perulangan Dengan Kondisi**

```java
public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;

        for (; counter <= 10; ) {
            System.out.println("Perulangan Ke : " + counter);
            counter++;
        }
    }
}
```

**Contoh Kode Perulangan Init Statement**

```java
public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;

        for (var counter = 1; counter <= 10; ) {
            System.out.println("Perulangan Ke : " + counter);
            counter++;
        }
    }
}
```

**Contoh Kode Perulangan Dengan Post Statement**

```java
public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;

        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan Ke : " + counter);
        }
    }
}
```

---

## While Loop

- While Loop adalah versi perulangan yang lebih sederhana dibanding for loop.
- Di while loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement.

**Contoh Kode While Loop**

```java
public class WhileLoop {
    public static void main(String[] args) {
        var counter = 1;

        while (counter <= 10) {
            System.out.println("Perulangan Ke : " + counter);
            counter++;
        }
    }
}
```

---

## Do While Loop

- Do While Loop adalah perulangan yang mirip dengan while.
- Perbedaannya hanya pada pengecekan kondisi.
- Pengecekan kondisi di while loop dilakukan diawal sebelum perulangan dilakukan, sedangkan di do while loop
  dilakukan setelah perulangan dilakukan.
- Oleh karena itu dalam do while loop, minimal pasti ada sekali perulangan walaupun kondisi tidak bernilai true.

**Contoh Kode Do While Loop**

```java
public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;

        do {
            System.out.println("Perulangan Ke : " + counter);
            counter++;
        } while (counter <= 10);
    }
}
```

---

## Break & Continue

- Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch.
- Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
- Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke
  perulangan selanjutnya.

**Contoh Kode Break**

```java
public class Break {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan Ke : " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
    }
}
```

**Contoh Kode Continue**

```java
public class Continue {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ke : " + counter);
        }
    }
}
```

---

## For Each

- Kadang kita biasa mengakses data array menggunakan perulangan.
- Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,
  lalu mengakses array menggunakan counter yang kita buat.
- Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array
  secara otomatis.

**Contoh Kode Tanpa For Each**

```java
public class Array {
    public static void main(String[] args) {
        String[] array = {
                "Rifki", "Agus", "Hasby",
                "Agifa", "Adhi", "Gilang"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
```

**Contoh Kode Menggunakan For Each**

```java
public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Rifki", "Agus", "Hasby",
                "Agifa", "Adhi", "Gilang"
        };

        for (var value : array) {
            System.out.println(value);
        }
    }
}
```

---

## Method

- Method adalah block kode program yang berjalan saat kita panggil.
- Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console.
- Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan
  diakhiri dengan block.
- Kita bisa memanggil menthod dengan menggunakan nama method lalu diikuti dengan kurung ().
- Di bahasa pemrograman lain, Method juga disebut dengan function.

**Contoh Kode Method**

```java
public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
    }

    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}
```

---

## Method Parameter

- Kita bisa mengirim informasi ke method yang ingin kita panggil.
- Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat.
- Cara membuat parameter sama seperti cara membuat variable.
- Parameter ditempatkan di dalam kurung () di deklarasi method.
- Parameter bisa lebih dari satu, jika lebih dari satu harus dipisah menggunakan tanda koma.

**Contoh Kode Method Parameter**

```java
public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Rifki", "Rahmattullah");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
```

---

## Method Return Value

- Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method
  mengembalikan nilai.
- Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan.
- Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakn kata kunci return, lalu diikuti
  dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method.
- Di Java, kita hanya bisa menghasilkan 1 data di sebuah method tidak bisa lebih dari satu.

**Contoh Kode Method Return Value**

```java
public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
}
```

---

## Method Variable Argument

- Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti.
- Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut.
- Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu,
  bisa nol atau lebih.
- Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter.

**Contoh Kode Method Variable Argument**

```java
public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Rifki", 80, 90, 78, 77);
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
```

---

## Method Overloading

- Method Overloading adalah kemampuan membuat method dengan nama yang sama lebig dari satu kali.
- Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda,
  entah itu jumlah atau tipe data parameternya.
- Jika ada yang sama, maka program Java kita akan error.

**Contoh Kode Method Overloading**

```java
public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Rifki");
        sayHello("Rifki", "Rahmattullah");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
```

---

## Recursive Method

- Recursive method adalah kemampuan method memanggil method dirinya sendiri.
- Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method,
  seperti contohnya kasus factorial.

**Contoh Kode Factorial Loop**

```java
public class RecursiveLoop {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (int i = 0; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
```

**Contoh Kode Factorial Recursive**

```java
public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
    }

    static int factorialRecursive(int value) {
        if (value = 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
```

### Proble Dengan Recursive

- Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati.
- Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow,
  yaitu error dimana stack method terlalu banyak di Java.
- Kenapa problem ini bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya di dalam Stack,
  jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam,
  maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow.

**Contoh Kode Error StackOverflow**

```java
public class StackOverflow {
    public static void main(String[] args) {
        loop(10000); //Akan menghasilkan StackOverflow
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop Ke : " + value);
            loop(value - 1);
        }
    }
}
```

---

## Scope

- Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat.
- Hal ini disebut scope
- Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau
  jika dibuat didalam block, maka hanya bisa diakses didalam block tersebut

**Contoh Kode Scope**

```java
public class Scope {
    public static void main(String[] args) {
        sayHello("Rifki");
        sayHello("");
    }

    /*
    Variable di Java siklus hidupnya hanya bisa diakses didalam bloknya,
    Jika kita mengakses variable diluar bloknya maka error
    */
    static void sayHello(String name) {
        String hello = "Hi " + name;

        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}

```

---

## Komentar

- Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
- Komentar adalah kode program yang akan di hiraukan saat proses kompilasi, sehingga di binary
  code Java, tidak akan ada kode komentar tersebut
- Biasanya komentar digunakan untuk dokumentas

**Contoh Kode Komentar**

```java
public class Komentar {
    public static void main(String[] args) {
        System.out.println(sum(20, 10));
    }

    /**
     * Method untuk menjumlahkan value1 dan value2
     * @param value1 angka pertama
     * @param value2 angka kedua
     * @return hasil penjumlahan value1 dan value2
     */
    static int sum(int value1, int value2) {
        // Jumlahkan value1 ditambah value2
        return value1 + value2;
    }
}

```