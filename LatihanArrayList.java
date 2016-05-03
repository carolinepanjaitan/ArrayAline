package latihanarraylist;

import java.util.ArrayList;

public class LatihanArrayList {

    public static void main(String[] args) {
        // buat sebuah array list
        ArrayList buah = new ArrayList();
        System.out.println("Size awal al: " + buah.size());
        
        // tambah objek/ elemen/ item
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        buah.add("Duku");
        buah.add("Sirsak");
        buah.add("Anggur");
        buah.add(7, "Semangka");
        buah.add(2, "Kiwi");
        buah.add(6, "Pisang");
        buah.add(1, "Pepaya");
        System.out.println("Size al setelah add: " + buah.size());
        
        // tampilan isi array list
        System.out.println("Isi al setelah add: " + buah);
        
        // hapus objek/ element/ item dari array list
        buah.remove("Pepaya");
        buah.remove(3);
        buah.remove("Duku");
        buah.remove(5);
        System.out.println("Size al setelah remove: " + buah.size());
        System.out.println("Isi al setelah remove: " + buah);   
    }
}
