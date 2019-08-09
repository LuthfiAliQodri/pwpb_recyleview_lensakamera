package org.luthfi.aplikasilistlensakamera;

import java.util.ArrayList;

public class LensaData {
    public static String[] [] data = new String[][] {
            {"Canon EF 50mm f/1.8 STM", "Canon", "Garansi Resmi 1 Tahun" , "Rp 1.645.000" , "Canon EF 50mm f/1.8 STM adalah salah satu focal length yang paling serbaguna dan banyak tersedia di pasaran. Lensa klasik ini dipasangkan dengan perangkat tambahan untuk sistem AF dan desain fisik yang membuatnya baik lebih cepat dan lebih kecil. Tepatnya 50mm f/1.8 memiliki panjang 4.1 cm, sedangkan beratnya sekitar 130 gram. Lensa ini berdiameter cukup lebar sehingga bisa dipasangkan dengan kamera bersensor APS-C seperti Canon 700D, 1200D hingga kamera bersensor full frame seperti Canon 6D atau 5D." ,"https://www.plazakamera.com/wp-content/uploads/2015/11/Jual-Lensa-Canon-EF-50mm-f-1.8-STM.jpg"},
            {"Canon EF-S 55-250mm f/4-5.6 IS STM", "Canon", "Garansi Resmi 1 Tahun" , "Rp 3.790.000" , "Lensa Canon EF-S 55-250mm f/4-5.6 IS STM adalah lensa zoom yang memiliki jangkauan panjang, dan menyediakan kisaran panjang fokus setara 35mm, 88-400mm, yang mencakup perspektif panjang potret hingga telefoto agar sesuai dengan pekerjaan dengan materi subjek yang jauh. Sangat diuntungkan jangkauan lensa ini adalah penggabungan stabilisasi gambar, yang bekerja untuk meminimalkan munculnya goyangan kamera hingga 3,5 langkah kecepatan rana untuk mendukung penggunaan genggam dalam kondisi rendah cahaya." ,"https://www.plazakamera.com/wp-content/uploads/2015/04/Canon-EF-S-55-250mm-f4-5.6-IS-STM-a.jpg"},
            {"Canon EF-S 10-18mm f/4.5-5.6 IS STM", "Canon", "Garansi Resmi 1 Tahun" , "Rp 3.995.000" , "Canon EF-S 10-18mm f/4.5-5.6 IS STM adalah lensa wide-angle zoom yang di desain untuk DSLR EOS bersensor APS-C yang bisa dipasang focal length antara 16-28.8mm sampai dengan 35mm. Desain optik Canon EF-S 10-18mm f/4.5-5.6 IS STM menggabungkan satu elemen aspherical, satu elemen UD (Ultra-low dispresion), dan satu elemen diameter besar untuk meminimalisir penyimpangan berwarna sepanjang  zoom range dan berkontribusi untuk ketajaman dan kejelasan gambar." ,"https://www.plazakamera.com/wp-content/uploads/2015/09/EF-S-10-18mm-f4.5-5.6-IS-STM.jpg"},
            {"SONY SAL 35mm F1.4 G", "Sony", "Garansi Resmi 1 Tahun" , "Rp 13.900.000" , "Lensa lensa wide angle Prime 35mm f/1.4 G dari Sony adalah lensanya yang cepat, Wide-Angle G-Series yang menampilkan elemen asferis untuk mengoreksi distorsi, mengurangi aberasi sferis, dan menghasilkan kualitas gambar yang lebih tajam. Aperture besar f/1.4 membuat lensa ini sangat bagus untuk kondisi cahaya rendah. Hal ini dibangun dari 10 elemen dalam 8 kelompok memberikan tajam, foto yang jelas di seluruh kisaran zoom. Ini memiliki jarak pemfokusan minimum dari satu kaki dan diameter filter Front-end dari 55mm." ,"https://www.plazakamera.com/wp-content/uploads/2015/03/Jual-Lensa-SONY-SAL-35mm-F1.4-G-Series-Lens.jpg"},
            {"SONY SAL 100mm F2.8 Macro", "Sony", "Garansi Resmi 1 Tahun" , "Rp 8.519.000" , "Lensa autofocus Macro AF 100mm f/2.8 dari Sony adalah lensa makro Mid-telefoto yang berfokus sedekat 1,2 ′ jauh dari subjek Anda, dengan rasio reproduksi maksimum 1:1 – yang berarti subjek Anda dapat muncul seukuran ukuran dalam gambar close-up ini. Hal ini kompatibel dengan Sony Alpha dan Minolta Maxxum SLR kamera. Desain elemen mengambang ganda menghilangkan aberasi dan memastikan hasil yang tajam dan kontras tinggi." ,"https://www.plazakamera.com/wp-content/uploads/2015/03/Jual-Lensa-SONY-SAL-100mm-F2.8-Macro.jpg"},

    };

    public  static ArrayList<Lensa> getListData(){
        ArrayList<Lensa> list = new ArrayList<>();
        for (String[] adata: data){
            Lensa lensa = new Lensa();
            lensa.setName(adata[0]);
            lensa.setFrom(adata[4]);
            lensa.setPhoto(adata[5]);
            list.add(lensa);
        }
        return  list;
    }
}
