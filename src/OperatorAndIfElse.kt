fun main() {

    var input: String? //Mutable variable yang artinya bisa diubah valuenya

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
    """.trimIndent())

        input = readLine()

        if (input == "1") {

            println("Masukan inputan yang ingin ditambahkan...")

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
            println("Maaf inputan yang anda masukan tidak ada, silahkan coba lagi..")
        }

    } while (input == "y" || input == "Y")
}