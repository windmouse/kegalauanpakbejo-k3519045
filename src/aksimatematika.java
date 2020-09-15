public class aksimatematika { 

    public static void main(String[] args) {
        
        hitungmatematika2 matematika = new hitungmatematika2(); //matematika adalah instance off class
        
        matematika.luastanah(100, 10000); //luas tanah saya ubah ke centi meter persegi
        
        matematika.ukurankeramika(30); //ukuran keramik 30*30 cm
        matematika.totalhargakeramika(10, 54000); //isi box 10pcs dan harga per box 54.000
       
        matematika.ukurankeramikb(40); //ukuran keramik 40*40 cm
        matematika.totalhargakeramikb(5 , 65000); //isi box 5pcs dan harga per box 65.000
        
         matematika.ukurankeramikc(30, 40); //ukuran keramik 30*40 cm
        matematika.totalhargakeramikc(8, 60000); //isi box 8pcs dan harga per box 60.000
    }
}
