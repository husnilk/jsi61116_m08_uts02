# Soal 02 UTS PBO

Perusahaan Ojol saat ini memberikan layanan baru bagi pelanggannya. Selain mengantarkan pelanggan (orang), driver ojol juga dapat mengirim barang dan jagain rumah. Tidak semua driver ojol dapat mengerjakan tugas tersebut. Hanya driver ojol dengan keanggotaan tertentu yang dapat mengerjakan tugas tersebut. berikut 

### Driver Ojol Reguler

* Driver ini hanya dapat mengantarkan pelanggan dengan tarif sebagai berikut. Jika macet = false , Rp 3000 untuk 1km pertama, selanjutnya Rp 200 untuk setiap 100m. Sementara itu jika macet Rp 3500 untuk 1km pertama dan Rp 250 untuk 100m berikutnya.
* Tidak bisa antar barang
* Tidak bisa jagain rumah/barang

### Driver Ojol Level 1

*  Driver ini hanya dapat mengantarkan pelanggan dengan tarif sebagai berikut. Jika macet = false , Rp 3000 untuk 1km pertama, selanjutnya Rp 200 untuk setiap 100m. Sementara itu jika macet Rp 4000 untuk 1km pertama dan Rp 300 untuk 100m berikutnya.
 * Bisa antar barang dengan hitungan tarif sama seperti hitungan mengantar orang diatas ditambah + 1000
* Tidak bisa jagain rumah/barang

### Driver Ojol Level 2

* Driver ini hanya dapat mengantarkan pelanggan dengan tarif sebagai berikut. Jika macet = false , Rp 3000 untuk 1km pertama, selanjutnya Rp 200 untuk setiap 100m. Sementara itu jika macet Rp 4000 untuk 1km pertama dan Rp 300 untuk 100m berikutnya.
* Bisa antar barang dengan hitungan tarif sama seperti hitungan mengantar orang diatas ditambah + 1500
* Bisa menjaga rumah/barang dengan tarif Rp 2000 / 15 menit (pembulatan ke atas) untuk 3 jam pertama dan Rp 3000 / 10 menit berikutnya


Realiskan kelas untuk driver ojol diatas dengan menggunakan interface. Dibutuhkan 2 interface yaitu untuk mengantarkan barang dan menjaga rumah. Masing-masing interface memiliki 2 buah method yaitu method untuk menghitung tarif dan method untuk menerima job kirim barang atau jagain rumah. Mereka bisa menerima job jika status mereka saat ini adalah 1.

_Catatan:_

1. _Nama interface dan method tidak ditentukan. Silahkan tentukan sendiri_