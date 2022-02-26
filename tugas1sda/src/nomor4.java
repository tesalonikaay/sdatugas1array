//Soal no 4
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
//indexOf(a), indexOf(c), indexOf(q) -> berguna untuk mencari posisi dari char yang di minta

import java.util.ArrayList;

public class nomor4 {
    public static void main(String[] args) {
    //String[] nama = {"O","L","O","N"};
    ArrayList<String> namaku = new ArrayList<String>();
    namaku.add("O");
    namaku.add("L");
    namaku.add("O");
    namaku.add("N");  

    System.out.println(namaku.indexOf("a")); // Hasil ERROR karena tidak ada char "a" didalam string
    System.out.println(namaku.indexOf("c")); // Hasil ERROR karena tidak ada char "c" didalam string
    System.out.println(namaku.indexOf("q")); // Hasil ERROR karena tidak ada char "q" didalam string

    }
}

