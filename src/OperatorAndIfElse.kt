fun main() {

    // deklarasi variable input
    var input: String? //Mutable variable yang artinya bisa diubah valuenya

    // melakukan perulangan apabila kondisi input terpenuhi dan do akan memulai terlebih dahulu sebelum masuk kedalam kondisi
    do {
        print("""
        Tugas 2 mengenai Operator, variable, dan kondisi
        ================================================
        Pilih menu dibawah ini : 
        1. Pertambahan
        2. Pengurangan
        3. Pembagian
        4. Perkalian
        5. Modulus
        Pilih : 
    """.trimIndent())  // Raw String membuat beberapa string tanpa penggabungan

        input = readLine() // inisialisasi variable input

        if (input == "1") {

            println("Masukan inputan yang ingin ditambahkan...") // println akan membuat baris sedangkan print tidak

            print("a : ")
            val a = readLine()!!.toInt() //not-null assertion operator

            print("b : ")
            val b = readLine()!!.toInt() // val -> immutable variable yang artinya tidak bisa diubah valuenya (constant)

            println("$a + $b = ${a + b}")

            print("Apakah ingin mengitung kembali? tekan y atau Y untuk mengulang..")
            input = readLine()

        } else if (input == "2") {

            println("Masukan inputan yang ingin dikurangkan...")

            print("a : ")
            val a = readLine()!!.toInt()

            print("b : ")
            val b = readLine()!!.toInt()

            println("$a - $b = ${a - b}")

            print("Apakah ingin mengitung kembali? tekan y atau Y untuk mengulang..")
            input = readLine()

        } else if (input == "3") {

            println("Masukan inputan yang ingin dibagikan...")

            print("a : ")
            val a = readLine()!!.toInt()

            print("b : ")
            val b = readLine()!!.toInt()

            println("$a / $b = ${a / b}")

            print("Apakah ingin mengitung kembali? tekan y atau Y untuk mengulang..")
            input = readLine()

        } else if (input == "4") {

            println("Masukan inputan yang ingin dikalikan...")

            print("a : ")
            val a = readLine()!!.toInt()

            print("b : ")
            val b = readLine()!!.toInt()

            println("$a * $b = ${a * b}")

            print("Apakah ingin mengitung kembali? tekan y atau Y untuk mengulang..")
            input = readLine()

        } else if (input == "5") {

            println("Masukan inputan yang ingin dimoduluskan...")

            print("a : ")
            val a = readLine()!!.toInt()

            print("b : ")
            val b = readLine()!!.toInt()

            println("$a % $b = ${a % b}")

            print("Apakah ingin mengitung kembali? tekan y atau Y untuk mengulang..")
            input = readLine()

        } else {
            println("Maaf inputan yang anda masukan tidak ada, silahkan coba lagi..") // else akan berjalan apabila semua kondisi tidak terpenuhi
        }

    } while (input == "y" || input == "Y") // memeriksa kondisi apakah terpenuhi
}