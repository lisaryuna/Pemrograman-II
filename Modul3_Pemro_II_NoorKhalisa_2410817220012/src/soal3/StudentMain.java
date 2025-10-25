package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name  = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();
                    studentList.add(new Student(name,nim));
                    System.out.println("Mahasiswa " + name + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String removeNIM = scanner.nextLine();
                    boolean removed =  studentList.removeIf(student -> student.getNim().equals(removeNIM));
                    if (removed) {
                        System.out.println("Mahasiswa dengan NIM " + removeNIM + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + removeNIM + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String searchNIM = scanner.nextLine();
                    boolean found = false;
                    for (Student student : studentList) {
                        if (student.getNim().equals(searchNIM)) {
                            System.out.println("Data Mahasiswa ditemukan: ");
                            System.out.println("NIM: " + student.getNim() + ", Nama: " + student.getName());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + searchNIM + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa");
                    if (studentList.isEmpty()) {
                        System.out.println("Tidak ada data mahaasiswa.");
                    } else {
                        for (Student student : studentList) {
                            System.out.println("NIM: " + student.getNim() + ", Nama: " + student.getName());
                        }
                    }
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}
