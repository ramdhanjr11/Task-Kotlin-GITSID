fun main() {

    println("""
        Tugas 3 Membuat perulangan dengan For dan implementasi Break and Continue
        =========================================================================
    """.trimIndent())

    val dummy = arrayListOf<String>()

    for (i in 1..100) {
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

    var jumlahGitsId = 0

    for (j in dummy) {
        if (j.equals("Boom")){
            continue
        }
        jumlahGitsId++
    }

    println("Jumlah GITS.ID yang muncul adalah $jumlahGitsId")
    println("Jumlah Boom yang muncul adalah ${dummy.size-jumlahGitsId}")

    println("=========================================")

    val month = arrayOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

    for (i in month) {
        if (i.equals("Februari")) {
            continue
        } else if(i.equals("Oktober")) {
            break
        }
        print("$i ")
    }
}