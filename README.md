# Tugas PBO - Inheritance dan Polimorfisme (Sistem Geometri)

Repositori ini berisi implementasi tugas ke-2 mata kuliah Pemrograman Berorientasi Objek (PBO). Proyek ini difokuskan pada penerapan empat pilar utama OOP, khususnya **Pewarisan (Inheritance)** dan **Polimorfisme (Polymorphism)**, melalui simulasi bentuk-bentuk geometri. Program ini dijalankan melalui antarmuka baris perintah (CLI) yang interaktif.

## Deskripsi Kelas

1. **`Shape.java` (Superclass)**
   Kelas dasar (induk) untuk semua bentuk. Kelas ini merangkum properti umum yaitu `color` (warna) dan memiliki metode `printInfo()` yang nantinya akan di-*override* oleh kelas turunannya.

2. **`Square.java` (Subclass dari Shape)**
   Kelas ini mewarisi `Shape` dan merepresentasikan bangun datar persegi. Menambahkan atribut spesifik yaitu `side` (panjang sisi) serta metode `area()` untuk menghitung luas. Metode `printInfo()` dimodifikasi (*override*) untuk menampilkan informasi persegi beserta luasnya.

3. **`Circle.java` (Subclass dari Shape)**
   Kelas ini mewarisi `Shape` dan merepresentasikan bangun datar lingkaran. Menambahkan konstanta `PI`, atribut `radius` (jari-jari), serta metode `area()`. 

4. **`Cylinder.java` (Subclass dari Circle)**
   Kelas ini mendemonstrasikan **Multilevel Inheritance** dengan mewarisi kelas `Circle`. Kelas ini merepresentasikan bangun ruang silinder dengan menambahkan atribut `height` (tinggi). Karena mewarisi `Circle`, kelas ini dapat menggunakan metode `area()` milik lingkaran sebagai luas alas untuk menghitung `volume()`.

5. **`Main.java` (Driver Class)**
   Kelas utama yang menjalankan program dengan menu CLI interaktif (menggunakan `Scanner`). Kelas ini menggunakan struktur data `ArrayList<Shape>` untuk menyimpan semua objek (Persegi, Lingkaran, Silinder) ke dalam satu wadah yang sama.

---

## Penerapan Konsep Polimorfisme
Program ini menunjukkan polimorfisme (*Run-time Polymorphism / Dynamic Method Dispatch*) di dalam kelas `Main`. 
Meskipun array list dideklarasikan dengan tipe induk (`ArrayList<Shape>`), ia dapat menampung objek `Square`, `Circle`, dan `Cylinder`. Ketika menu nomor 4 dipilih, program akan memanggil metode `printInfo()` dari referensi `Shape`. Java secara dinamis akan mengeksekusi metode `printInfo()` yang sesuai dengan bentuk asli objek tersebut pada saat program berjalan.

---

## Hasil Eksekusi Program (Output)

### Penjelasan Alur Menu:
1. **Menu 1, 2, 3 (Pembuatan Objek):** Pengguna diminta menginputkan dimensi (sisi/radius/tinggi) beserta warnanya. Objek akan dibuat sesuai jenisnya dan dimasukkan ke dalam `ArrayList<Shape>`.
2. **Menu 4 (Tampilkan Semua Bentuk):** Program mencetak informasi seluruh bentuk yang telah dibuat sebelumnya. Ini membuktikan bahwa metode `printInfo()` yang dieksekusi berbeda-beda tergantung jenis bangunannya (berkat *Method Overriding*), meskipun semuanya dipanggil dari *list* bertipe `Shape`.
3. **Menu 5 (Keluar):** Menghentikan program.