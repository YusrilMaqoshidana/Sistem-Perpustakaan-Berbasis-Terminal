<hr>

<h2>1. Mediator Pattern</h2>

<h3>Deskripsi</h3>
<p><strong>Mediator Pattern</strong> menyederhanakan komunikasi antara banyak objek dengan memperkenalkan objek mediator. Dalam proyek ini, <code>LoanMediator</code> berfungsi sebagai mediator antara objek <code>Admin</code> dan <code>Mahasiswa</code>, memungkinkan mereka untuk saling mengirim dan menerima pesan tanpa mengetahui satu sama lain secara langsung.</p>

<h3>Langkah Implementasi</h3>
   <h4>a. Membuat Interface <code>LoanMediator</code></h4>
<p><code>LoanMediator</code> adalah sebuah interface yang mendefinisikan kontrak untuk mediator. Interface ini mencakup metode untuk mengirim pesan dan menambah pengguna.</p>

![carbon (1)](https://github.com/user-attachments/assets/080c8006-60c6-4d3b-8244-77b733f7d602)
<h4>b. Membuat Kelas <code>ChatRoomImpl</code></h4>
<p><code>ChatRoomImpl</code> adalah implementasi konkret dari interface <code>LoanMediator</code>. Kelas ini menyediakan logika untuk mengirim pesan dan menambah pengguna.</p>

   ![carbon](https://github.com/user-attachments/assets/0d6dbcf1-fa21-4e2b-8eb8-88c6ecefc190)
<h4>c. Menggunakan Mediator dalam Kode</h4>
<p>Untuk mengimplementasikan mediator, kita membuat instance mediator dan menambahkan pengguna (<code>Admin</code> dan <code>Mahasiswa</code>) ke dalamnya. Pengguna kemudian dapat mengirim dan menerima pesan melalui mediator.</p>

![carbon (2)](https://github.com/user-attachments/assets/852cb4de-5b0d-4d11-800c-6d03ddc69e3e)
<h4>d. Hasil</h4>
<p>Berikut adalah contoh hasil ketika Mediator Pattern diimplementasikan.</p>
![image](https://github.com/user-attachments/assets/696ac8a3-c961-4618-8996-d3d5c3782efb)

<hr>
<h2>2. Observer Pattern</h2>

<h3>Deskripsi</h3>
<p><strong>Observer Pattern</strong> menetapkan ketergantungan satu-ke-banyak antara objek. Ketika satu objek (subjek) mengubah keadaan, semua dependensinya (observer) diberi tahu secara otomatis. Dalam proyek ini, <code>Admin</code> berfungsi sebagai subjek, dan objek <code>Mahasiswa</code> adalah observer-nya.</p>

<h3>Langkah Implementasi</h3>
   <h4>a. Membuat Interface <code>Subject</code></h4>
<p>Interface <code>Subject</code> mendefinisikan metode untuk mendaftarkan, menghapus, dan memberi notifikasi kepada observer.</p>
 ![carbon (3)](https://github.com/user-attachments/assets/78eb59b5-1de8-486a-9581-dfdc4b9ed944)

  <h4>b. Membuat Interface <code>Observer</code></h4>
<p>Interface <code>Observer</code> mendefinisikan metode untuk menerima pembaruan. Interface ini diimplementasikan oleh kelas-kelas yang ingin mengamati perubahan.</p>
![carbon (5)](https://github.com/user-attachments/assets/8ecdf33f-056c-4eb1-b0c7-8f8bced6c8c9)

  <h4>c. Mengimplementasikan <code>Admin</code> sebagai Subjek</h4>
<p>Kelas <code>Admin</code> mengimplementasikan interface <code>Subject</code>. Kelas ini mengelola daftar observer dan memberi tahu mereka ketika suatu peristiwa terjadi, seperti penambahan buku baru ke dalam repositori.</p>
![carbon (4)](https://github.com/user-attachments/assets/42d8ebc7-2b3f-46bc-8350-4bfe05404018)

  <h4>d. Mengimplementasikan <code>Mahasiswa</code> sebagai Observer</h4>
<p>Kelas <code>Mahasiswa</code> mengimplementasikan interface <code>Observer</code> dan memperluas kelas <code>User</code>. Kelas ini menerima notifikasi dari kelas <code>Admin</code> dan menanganinya sesuai kebutuhan. Selain itu, kelas ini menunjukkan penggunaan <strong>Builder Pattern</strong> untuk menyederhanakan pembuatan objek.</p> 
![carbon (6)](https://github.com/user-attachments/assets/bc193bbc-ce45-4892-b317-601e3be7ea31)

<h4>d. Hasil</h4>
<p>Berikut adalah contoh hasil ketika Observer Pattern diimplementasikan.</p>
![image](https://github.com/user-attachments/assets/2e9e3767-08b4-4489-80f3-cdc5f614aeab)

<hr>
<h3>Ringkasan</h3>
<ul>
    <li><strong>Mediator Pattern</strong>: Memfasilitasi komunikasi antara <code>Admin</code> dan <code>Mahasiswa</code> menggunakan <code>LoanMediator</code>.</li>
    <li><strong>Observer Pattern</strong>: Memungkinkan <code>Admin</code> memberi notifikasi kepada beberapa objek <code>Mahasiswa</code> tentang perubahan, seperti penambahan buku baru.</li>
</ul>
<p>Kedua pola desain ini meningkatkan modularitas, keterbacaan, dan kemudahan pemeliharaan kode dengan mengurangi ketergantungan langsung antar objek.</p>

