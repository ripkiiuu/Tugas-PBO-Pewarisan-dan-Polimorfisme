import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapesList = new ArrayList<>();
        int menu = 0;

        System.out.println("=========================================");
        System.out.println("Selamat Datang di Aplikasi Geometri Sederhana");
        System.out.println("=========================================");

        while (menu != 5) {
            System.out.println("\nMenu Pembuatan Objek:");
            System.out.println("1. Buat Square");
            System.out.println("2. Buat Circle");
            System.out.println("3. Buat Cylinder");
            System.out.println("4. Tampilkan Semua Bentuk (Demonstrasi Polimorfisme)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double side = scanner.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String colorSquare = scanner.next();
                    // Demonstrasi Polimorfisme (Shape = Square)
                    Shape s1 = new Square(side, colorSquare);
                    shapesList.add(s1);
                    System.out.println("Square berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.print("Masukkan radius: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String colorCircle = scanner.next();
                    Shape s2 = new Circle(radius, colorCircle);
                    shapesList.add(s2);
                    System.out.println("Circle berhasil ditambahkan!");
                    break;
                case 3:
                    System.out.print("Masukkan radius alas: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Masukkan tinggi silinder: ");
                    double cylHeight = scanner.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String colorCylinder = scanner.next();
                    Shape s3 = new Cylinder(cylHeight, cylRadius, colorCylinder);
                    shapesList.add(s3);
                    System.out.println("Cylinder berhasil ditambahkan!");
                    break;
                case 4:
                    System.out.println("\n--- Daftar Semua Bentuk (Polimorfisme) ---");
                    if(shapesList.isEmpty()) {
                        System.out.println("Belum ada bentuk yang dibuat.");
                    } else {
                        // Memanggil metode printInfo() secara dinamis pada runtime
                        for (Shape p : shapesList) {
                            p.printInfo();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}