/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

/**
 *
 * @author falya amrina zahra
 */
class mesinPencari {
    mesinPencari(String a, String b) {
        int pj1, pj2, i1, i2, i3;
        String data, dicari;
        data = a.toLowerCase();//data dijadikan huruf kecil
        dicari = b.toLowerCase();//dicari juga dijadikan huruf kecil
        boolean ketemu, ditemukan = false;
        pj1 = a.length();//panjang karakter data
        pj2 = b.length();//panjang karakter yang dicari
        i1 = 0;//indeks1
        ketemu = false;//ketemu bernilai false
        while ((i1 < pj1) && !ketemu) {//jalankan jika syarat tersebut
            if (pj2 > (pj1 - i1)) {//jika pj2(yang dicari) > selisih pj1 dgn i1(data)
                break;//berhenti
            }
            i3 = i1;//i3=i1
            ketemu = true;//ketemu bernilai false dikarenakan pj1(data) lebih panjang daripada pj2(dicari)
            for (i2 = 0; i2 < pj2; i2++) {//perulangan untuk mencari kesamaan
                if (data.charAt(i3) == dicari.charAt(i2)) {//pencocokan karakter 1 per 1 
                    i3++;//i3 ditambah
                } else {//jika tidak cocok akan break dan, mengulangi proses dari awal
                    ketemu = false;
                    break;
                }
            }
            if (ketemu) {//jika ketemu
                ditemukan = true;
                break;//berhenti
            } else {
                ditemukan = false;
                i1++;//proses untuk mengulangi perulangan
 
            }
        }
        if (ditemukan) {
            System.out.println("Kata " + b + " Ditemukan pada Kalimat " + a + " ,Mulai Karakter ke " + (i1 ) + " Hingga " + (i1));
        } else {
            System.out.println("Kata " + b + " Tidak ditemukan Satupun pada Kalimat " + a);
        }
    }
}
    


