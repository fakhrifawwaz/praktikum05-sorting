import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); // buang newline

        for (int i = 0; i < n; i++) {
            System.out.println("-- Data Mahasiswa ke-" + (i+1) + " --");
            System.out.print("NIM   : "); String nim = sc.nextLine();
            System.out.print("Nama  : "); String nama = sc.nextLine();
            System.out.print("Kelas : "); String kelas = sc.nextLine();
            System.out.print("IPK   : "); double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        System.out.println("\nData setelah Bubble Sort (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData setelah Selection Sort (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC):");
        list.insertionSort();
        list.tampil();

        sc.close();
    }

}