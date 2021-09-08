import java.lang.NumberFormatException

/*
    Tugas 6 Buatlah program Getters and Setters yang mengimplementasikan pembulatan nilai,
    bisa menggunakan percabangan if atau yang lainnya untuk menentukan pembulatan nilainnya.
 */

// Membuat Sebuah kelas dengan nama Nilai dan menerapkan getter dan setter didalamnya
class Nilai {
    var result: Double = 0.0
        get() = field // apabila result diakses dari luar kelas maka nilai ini yang akan diambil
        set(value) { field = value } // apabila result diakses dari luar kelas dan memberikan nilai baru maka nilai asli result tergantikan dengan nilai baru
    // field artinya sebuah value dari induk tersebut
}

//class Nilai(val result: Double = 0.0) untuk mempersingkat bisa menggunakan getter dan setter seperti ini

fun main() {

    // Membuat object dari class Nilai
    val nilai = Nilai()

    print("Masukan angka pecahan 0.0 hingga 10.0 : ")

    // Membuat Try Catch apabila inputan yang dimasukan tidak sesuai maka tidak akan terjadi error
    try {
        nilai.result = readLine()!!.toDouble()
    } catch (e: NumberFormatException) {
        nilai.result = 0.0
    }

    // Meng-inisialisasi result yang ada di object nilai ke dalam variable result
    val result = nilai.result

    // Melakukan perkondisian dengan menggunakan when
    when {
        // penggunaan rangto yang disediakan oleh kotlin
        result in 0.0..0.5 -> println("Nilai bulat : 0.0") // artinya apabila result ada diantara nilai interval 0.0 hingga 0.5 maka lakukan sebuah perintah print
        result in 0.5..1.0 -> println("Nilai bulat : 1.0")
        result in 1.0..1.5 -> println("Nilai bulat : 1.0")
        result in 1.5..2.0 -> println("Nilai bulat : 2.0")
        result in 2.0..2.5 -> println("Nilai bulat : 2.0")
        result in 2.5..3.0 -> println("Nilai bulat : 3.0")
        result in 3.0..3.5 -> println("Nilai bulat : 3.0")
        result in 3.5..4.0 -> println("Nilai bulat : 4.0")
        result in 4.0..4.5 -> println("Nilai bulat : 4.0")
        result in 4.5..5.0 -> println("Nilai bulat : 5.0")
        result in 5.0..5.5 -> println("Nilai bulat : 5.0")
        result in 5.5..6.0 -> println("Nilai bulat : 6.0")
        result in 6.0..6.5 -> println("Nilai bulat : 6.0")
        result in 6.5..7.0 -> println("Nilai bulat : 7.0")
        result in 7.0..7.5 -> println("Nilai bulat : 7.0")
        result in 7.5..8.0 -> println("Nilai bulat : 8.0")
        result in 8.0..8.5 -> println("Nilai bulat : 8.0")
        result in 8.5..9.0 -> println("Nilai bulat : 9.0")
        result in 9.0..9.5 -> println("Nilai bulat : 9.0")
        result in 9.5..10.0 -> println("Nilai bulat : 10.0")
        else -> println("Input yang anda masukan salah, silahkan coba kembali!") // Baris ini akan dijalankan apabila input tidak ada dengan kondisi yang telah dibuat
    }

}