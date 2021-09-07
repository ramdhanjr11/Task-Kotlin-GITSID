/**
* Tugas 3 M Ramdhan Syahputra 
* Membuat perulangan dengan for dan implementasi Break and Continue
*/

fun main() {

    // println adalah fungsi untuk menampilkan output
    println("""
        Tugas 3 Membuat perulangan dengan For dan implementasi Break and Continue
        =========================================================================
    """.trimIndent())

    // Membuat variable / menginisialisasi array dengan arrayLitOf
    val dummy = arrayListOf<String>()

    // Melakukan perulangan dengan for
    for (i in 1..100) {
        // Melakukan perkondisian
        when {
            i % 5 == 0 -> {
                println("Boom")
                dummy.add("Boom")
            }
            i % 3 == 0 -> {
                println("GITS.ID")
                dummy.add("GITS.ID")
            } else -> println(i)
        }
    }

    println("=========================================")

    // Membuat variable / menginisialisasi int 
    var jumlahGitsId = 0

    // Melakukan perulangan pada variable dummy
    for (j in dummy) {
        if (j.equals("Boom")){
            continue
        }
        jumlahGitsId++ // Akan menambahkan data pada variable jumlahGitsId
    }

    println("Jumlah GITS.ID yang muncul adalah $jumlahGitsId")
    println("Jumlah Boom yang muncul adalah ${dummy.size-jumlahGitsId}")

    println("=========================================")

    // Membuat variable / menginisialisasi array
    val month = arrayOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

    // Melakukan perulangan pada variable month 
    for (i in month) {
        if (i.equals("Februari")) {
            continue
        } else if(i.equals("Oktober")) {
            break
        }
        print("$i ")
    }
}
