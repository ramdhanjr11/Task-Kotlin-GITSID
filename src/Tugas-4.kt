// Pembuatan Object Computer
class Computer(val name: String, val spec: List<Spec>)

// Pembuatan Object Spec
class Spec(val type: String, val cpu: String, val display: String, val storage: String, val memory: String, val battery: String)

// Deklarasi sebuah lambda function agar dapat digunakan dibeberapa variable
typealias Arithmetic = (Int, Int) -> Int

// meng-extend ke typealias yang sudah di deklarasikan sebelumnya dan mengimplementasikannya
val pertambahan: Arithmetic = { x, y -> x + y }

val pengurangan: Arithmetic = { x, y -> x - y }

val pembagian: Arithmetic = { x, y -> x / y }

val perkalian: Arithmetic = { x, y -> x * y }

val modulus: Arithmetic = { x, y -> x % y }

fun main() {

    println("""
        Tugas 4 Membuat perulangan dengan data implementasi ArrayListOf bebas memuat data apa aja melalui Intellij Idea, serta menerapkan lambda pada kotlin.
        =====================================================================================================================================================
    """.trimIndent())

    // Pembuatan arraylist pada variable allComputer
    val allComputer = arrayListOf(
            Computer("Asus",
                    arrayListOf(
                            Spec("X422UR", "Intel Celeron 10th Gen", "14 inch", "512gb Ssd", "8gb up to 16gb", "6 cells, 4.2 ~ 8 hrs"),
                            Spec("X432UR", "Intel Core I3 11th Gen", "14 inch", "512gb Ssd", "8gb up to 16gb", "6 cells, 4.2 ~ 8 hrs"),
                            Spec("X442UR", "Intel Core I5 10th Gen", "14 inch", "512gb Ssd", "8gb up to 16gb", "6 cells, 4.2 ~ 8 hrs"),
                            Spec("X452UR", "Intel Core I7 11th Gen", "14 inch", "512gb Ssd", "8gb up to 16gb", "6 cells, 4.2 ~ 8 hrs"),
                            Spec("X462UR", "Intel Core I9 10th Gen", "14 inch", "512gb Ssd", "8gb up to 16gb", "6 cells, 4.2 ~ 8 hrs"),
                    )
            ),
            Computer("Acer",
                    arrayListOf(
                            Spec("Swift", "Intel Celeron 8th Gen", "14 inch amoled", "1 tb hdd", "8gb up to 32gb", "4 cell 3220 mAh ~ 12 hrs"),
                            Spec("Swift 2", "Intel Core I3 8th Gen", "14 inch amoled", "1 tb hdd", "8gb up to 32gb", "4 cell 3220 mAh ~ 12 hrs"),
                            Spec("Swift 3", "Intel Core I5 9th Gen", "14 inch amoled", "1 tb hdd", "8gb up to 32gb", "4 cell 3220 mAh ~ 12 hrs"),
                            Spec("Swift 4", "Intel Core I7 10th Gen", "14 inch amoled", "1 tb hdd", "8gb up to 32gb", "4 cell 3220 mAh ~ 12 hrs"),
                            Spec("Swift 5", "Intel Core I9 11th Gen", "14 inch amoled", "1 tb hdd", "8gb up to 32gb", "4 cell 3220 mAh ~ 12 hrs"),
                    )
            )) // Penggunaan ArrayList

    // Proses pengeluaran data dengan perulangan bercabang (Nested Loop)
    for (i in allComputer.indices) {
        for (j in allComputer[i].spec.indices) {
            println(allComputer[i].getSpecWithComputerName()[j])
            println("===================Type=====================")
        }
        println("=================Computer===================")
    }

    // Deklarasi variable untuk inputan user
    var input: String

    // Melakukan perulangan dengan Do While
    do {
        print("""
        Pilih lah menu dibawah ini..
        1. Pertambahan
        2. Pengurangan
        3. Pembagian
        4. Perkalian
        5. Modulus
        Pilih :
    """.trimIndent())

        // Menerima input berupa string dari user
        input = readLine()!!

        // Melakukan perkondisian dengan menggunakan when
        when (input) {
            "1" -> {
                print("Masukan data awal: ")
                val x = readLine()!!.toInt()
                print("Masukan data kedua: ")
                val y = readLine()!!.toInt()
                println("Hasil : ${pertambahan(x, y)}")

                // Melakukan pengecekan apakah program ingin diulangi kembali atau tidak
                print("Apakah anda ingin mengitung kembali? tekan y atau Y untuk mengulang dan tekan sembarang untuk keluar: ")
                input = readLine()!! // Memasukan nilai input dari user
            }

            "2" -> {
                print("Masukan data awal: ")
                val x = readLine()!!.toInt()
                print("Masukan data kedua: ")
                val y = readLine()!!.toInt()
                println("Hasil : ${pengurangan(x, y)}")

                print("Apakah anda ingin mengitung kembali? tekan y atau Y untuk mengulang dan tekan sembarang untuk keluar: ")
                input = readLine()!!
            }

            "3" -> {
                print("Masukan data awal: ")
                val x = readLine()!!.toInt()
                print("Masukan data kedua: ")
                val y = readLine()!!.toInt()
                println("Hasil : ${pembagian(x, y)}")

                print("Apakah anda ingin mengitung kembali? tekan y atau Y untuk mengulang dan tekan sembarang untuk keluar: ")
                input = readLine()!!
            }

            "4" -> {
                print("Masukan data awal: ")
                val x = readLine()!!.toInt()
                print("Masukan data kedua: ")
                val y = readLine()!!.toInt()
                println("Hasil : ${perkalian(x, y)}")

                print("Apakah anda ingin mengitung kembali? tekan y atau Y untuk mengulang dan tekan sembarang untuk keluar: ")
                input = readLine()!!
            }

            "5" -> {
                print("Masukan data awal: ")
                val x = readLine()!!.toInt()
                print("Masukan data kedua: ")
                val y = readLine()!!.toInt()
                println("Hasil : ${modulus(x, y)}")

                print("Apakah anda ingin mengitung kembali? tekan y atau Y untuk mengulang dan tekan sembarang untuk keluar: ")
                input = readLine()!!
            }

            else -> println("Input tidak sesuai silahkan coba lagi!")
        }
    } while (input == "y" || input == "Y") // Kondisi while jika terpenuhi kondisinya maka akan mengulangi program yang ada didalam body do{}
}

// Extension Function untuk mengambil data spec dengan nama computer
fun Computer.getSpecWithComputerName(): List<String> {
    return spec.map {"""
       PC Name : ${name}
       Type    : ${it.type}
       Cpu     : ${it.cpu}
       Display : ${it.display}
       Storage : ${it.storage}
       Memory  : ${it.memory}
       battery : ${it.battery}
   """.trimIndent() } // Penggunaan lambda map dengan nilai balik List bertipekan String
}