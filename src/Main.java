import com.fasilkom.librarian.Akun;
import com.fasilkom.screen.Display;
import com.fasilkom.screen.DisplayAdmin;
import com.fasilkom.screen.DisplayStudent;
import com.fasilkom.student.Student;
import com.fasilkom.student.StudentBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainDisplay();
    }

    public static void mainDisplay() {
        Scanner scanner = new Scanner(System.in);
        String role = "";

        while (!role.equals("0")) {  // Tambahkan loop agar program tidak berhenti setelah memilih role
            System.out.println();
            System.out.println("====== Pilih Rolemu ======");
            System.out.println("1. Admin Perpustakaan");
            System.out.println("2. Mahasiswa");
            System.out.println("Ketik '0' untuk keluar.");
            System.out.print("Masukkan rolemu: ");
            role = scanner.nextLine();
            displayDetailRole(role);
        }
    }

    public static void displayDetailRole(String number) {
        if (number.equals("1")) {
            displayDetailAdmin();
        } else if (number.equals("2")) {
            displayDetailStudent();
        } else if (!number.equals("exit")) {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }

    public static void displayDetailStudent() {
        System.out.println();
        System.out.println("====== Data diri ======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        Long nimToLong = Long.parseLong(nim);
        System.out.print("Masukkan Nama Fakultas: ");
        String faculty = scanner.nextLine();
        // Pembuatan objek Student, misalnya
        Student dataStudent = new StudentBuilder().setName(name).setNim(nimToLong).setFaculty(faculty).build();
        DisplayStudent tampilan = new DisplayStudent();
        tampilan.display(dataStudent);
    }

    public static void displayDetailAdmin() {
        System.out.println();
        System.out.println("====== Login for Admin ======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        // Akun admin login check, misalnya
        Akun admin = new Akun();
        if (admin.login(email, password)){
            DisplayAdmin adminIsTrue = new DisplayAdmin();
            adminIsTrue.display();
        } else {
            System.out.println();
            System.out.println("Email atau Password salah!");
            System.out.println();
            String kosong = scanner.nextLine();
        }

    }
}
