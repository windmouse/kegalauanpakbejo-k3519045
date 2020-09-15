/**
 *
 * @Author : Jerry Ignatius Padoma / K3519045
 */
public class hitungmatematika2 {
    double luastanah, ukurankeramika, totalhargakeramika, //atribut dalam kelas ini yang saya pakai adalah double
           ukurankeramikb, totalhargakeramikb,
            ukurankeramikc, totalhargakeramikc
           
           ;

 void luastanah (double a, double b){ 
        luastanah = a*b; //luas tanah saya ubah ke centimeter persegi
                }  
    
void ukurankeramika (int a){ 
        ukurankeramika = a*a; //luas keramik sisi*sisi
        
                }

void totalhargakeramika (double a, double b){
        totalhargakeramika = luastanah/ukurankeramika/a*b; //total harga = luas tanah:ukuran:isi per box*harga per box
        System.out.println("Harga total dengan keramik A: "+totalhargakeramika); //untuk menampilkan total harga box A
                }

void ukurankeramikb (int a){
        ukurankeramikb = a*a; //luas keramik sisi*sisi
                }

void totalhargakeramikb (double a, double b){
        totalhargakeramikb = luastanah/ukurankeramikb/a*b; //total harga = luas tanah:ukuran:isi per box*harga per box
        System.out.println("Harga total dengan keramik B: "+totalhargakeramikb); //untuk menampilkan total harga box B
                }
    
void ukurankeramikc (double a, double b){
        ukurankeramikc = a*b; //luas keramik sisi*sisi
                }
    

void totalhargakeramikc (double a, double b){
        totalhargakeramikc = luastanah/ukurankeramikc/a*b; //total harga = luas tanah:ukuran:isi per box*harga per box
        System.out.println("Harga total dengan keramik C: "+totalhargakeramikc); //untuk menampilkan total harga box C
                }

}