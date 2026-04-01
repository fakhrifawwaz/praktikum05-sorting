import java.util.Scanner;

public class MainDosen15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen15 data = new DataDosen15();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Insertion Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode  : "); String kd = sc.nextLine();
                    System.out.print("Nama  : "); String nm = sc.nextLine();
                    System.out.print("JK (true=L/false=P): "); boolean jk = sc.nextBoolean(); sc.nextLine();
                    System.out.print("Usia  : "); int age = sc.nextInt(); sc.nextLine();
                    data.tambah(new Dosen15(kd, nm, jk, age));
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data diurutkan ASC:");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data diurutkan DSC:");
                    data.tampil();
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data diurutkan Insertion Sort:");
                    data.tampil();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}