//Soal no 4
//Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
//remove(0), remove(3), remove(2) -> berguna untuk membuang char pada posisi index yang telah di tentukan

import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
    //String[] nama = {"O","L","O","N"};
    ArrayList<String> namaku = new ArrayList<String>();
    namaku.add("O"); // POSISI 0
    namaku.add("L"); // POSISI 1
    namaku.add("O"); // POSISI 2
    namaku.add("N"); // POSISI 3
    
    System.out.println("ArrayList sebelum remove:");
    for(String var: namaku){
         System.out.println(var);
    }

    //namaku.remove(0); // maka yang dibuang adalah char "O"    
    namaku.remove(3); // maka yang dibuang adalah char "N"
    //namaku.remove(2); // maka yang dibuang adalah char "O"

    System.out.println("ArrayList setelah remove:");
          for(String var2: namaku){
           System.out.println(var2);
            }
    }
}

