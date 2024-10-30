
import com.fasilkom.mediator.ChatRoomImpl;
import com.fasilkom.mediator.LoanMediator;
import com.fasilkom.model.Admin;
import com.fasilkom.model.Book;
import com.fasilkom.model.Mahasiswa;
import com.fasilkom.model.User;
import com.fasilkom.repository.BookRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Admin admin = new Admin.AdminBuilder().setId(666).setName("Samuel").setEmail("Samuel@gmail.com").setPassword("Samuel123").build();

        // Builder Pattern
        Mahasiswa mahasiswa1 = new Mahasiswa.MahasiswaBuilder()
                .setId(101)
                .setName("Mahasiswa A")
                .setEmail("mahasiswaA@example.com")
                .setPassword("passwordA")
                .setProdi("Teknik Informatika")
                .build();
        Mahasiswa mahasiswa2 = new Mahasiswa.MahasiswaBuilder()
                .setId(102)
                .setName("Mahasiswa B")
                .setEmail("mahasiswaB@example.com")
                .setPassword("passwordB")
                .setProdi("Teknik Informatika")
                .build();

        // Observe Pattern
        admin.registerObserver(mahasiswa1);
        admin.registerObserver(mahasiswa2);
        Book book = new Book.BookBuilder().setTitle("The Power of Habit").setBookId(1).setIsAvailable(true).setGenre("Self Improvement").setPublicationYear(2020).setAuthor("Charles Duhigg").build();
        admin.addBook(book);
        admin.removeObserver(mahasiswa2);
        admin.addBook(book);

        displayAllBook();

        LoanMediator mediator = new ChatRoomImpl();


        User mahasiswa3 = new Mahasiswa.MahasiswaBuilder().setMediator(mediator).setId(1).setEmail("222410102000@gmail.com").setName("Witan Sulaiman").setPassword("Witan123").setProdi("Teknologi Biologi").build();
        User mahasiswa4 = new Mahasiswa.MahasiswaBuilder().setMediator(mediator).setId(2).setEmail("222410102002@gmail.com").setName("Gibran Efishery").setPassword("Gibran123").setProdi("MIPA").build();

        mediator.addUser(admin);
        mediator.addUser(mahasiswa3);
        mediator.addUser(mahasiswa4);

        admin.send("Selamat datang di sistem Perpustakaan Universitas!");
        mahasiswa4.send("Saya ingin pinjam buku Dunia Shopie, Apakah masih ada?");
        mahasiswa3.send("Saya juga mau pinjam buku");
        displayAllBook();
    }

    private static void displayAllBook() {
        BookRepository bookRepository = new BookRepository();
        List<Book> books = bookRepository.getAllBooks();

        System.out.println("Daftar Buku:");
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
        } else {
            for (Book book : books) {
                System.out.println("- ID: " + book.getBookId() + ", Judul: " + book.getTitle());
            }
        }
    }
}
