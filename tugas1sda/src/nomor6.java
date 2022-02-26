//Soal no 6
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
//add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j) --> menyisipkan char tertentu pada index tertentu

import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) {
    //String[] namaku = {"O","L","O","N"};
    ArrayList<String> namaku = new ArrayList<String>();
    namaku.add("O");
    namaku.add("L");
    namaku.add("O");
    namaku.add("N");

    namaku.add(0,"e");
    System.out.println("Element setelah menambahkan string e " + namaku);

    namaku.add(2,"f");
    System.out.println("Element setelah menambahkan string f " + namaku);

    namaku.add(3,"g");
    System.out.println("Element setelah menambahkan string g " + namaku);

    namaku.add(4,"h");
    System.out.println("Element setelah menambahkan string h " + namaku);

    namaku.add(6,"h");
    System.out.println("Element setelah menambahkan string h " + namaku);

    namaku.add(-3,"j");
    System.out.println("Element setelah menambahkan string j " + namaku);     // hasil error karena tidak ada index -3

              
    }
}

