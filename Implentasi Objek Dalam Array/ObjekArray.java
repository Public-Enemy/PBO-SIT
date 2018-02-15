public class ObjekArray{
    public static void main(String[] args) {
        int loop;
        String[] NamaBuku = {"Subversif!","Tuhan dan Negara","1984"}; // Array String berisi Judul Buku yang akan disikan ke Objek
        int[] HargaJual = {45000,35000,83000}; // Array Int berisi Harga Buku yang akan disikan ke Objek
        int Total = 0; // variable sebagai penyimpan angka akumulasi
        objekNovel[] NovelKonan = new objekNovel[3]; // array yang terdiri dari Objek dengan besar array 3
        for(loop = 0 ; loop <= 2 ; loop++ ){ // perulangan untuk mengakses setiap objek
            NovelKonan[loop] = new objekNovel(); // Konstruktor Objek pada Array Objek , karena Array tersebut masih kosong hanya bertipe data obejkNovel
            NovelKonan[loop].namaBuku = NamaBuku[loop]; // Inisilaisasi attribute namabuku dari Array Objek NovelKoran berdasarkan indeksnya
            NovelKonan[loop].hargaJual = HargaJual[loop]; // Inisilaisasi attribute hargaJual dari Array Objek NovelKonan berdasarkan indeksnya
            NovelKonan[loop].hargaBuku = (int) ((HargaJual[loop]) * 0.8); // Inisilaisasi attribute hargaBuku dari Array Objek NovelKoran berdasarkan indeksnya
            Total += HargaJual[loop]; // akumulasi harga total
            System.out.println(" Nama Buku : " + NovelKonan[loop].namaBuku + "\n Harga Beli: " + HargaJual[loop] + "\n Harga Jual " + NovelKonan[loop].hargaBuku + " \n "); // cetak semua atribute objek NovelKonan
        }
        System.out.println("Total Harga Beli : \n "+ Integer.toString(Total) + "\n"); // cetak harga total 
        Total = (int) (Total * 0.8);
        System.out.println("Total Harga Jual : \n "+ Integer.toString(Total) + "\n"); // cetak harga jual setelah 
    }
    
}
