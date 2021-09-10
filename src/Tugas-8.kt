/***
 * Buatlah program Inheritance atau Pewarisan pada Kotlin bebas
 * mau memuat informasi soal merk leptop atau merk lainnya tidak masalah.
 */

open class User(val name: String) {
    open fun doActivity(name: String) {
        println("${this.name} sedang bersama $name")
    }
}

class Mahasiswa(name: String) : User(name) {
    override fun doActivity(name: String) {
        println("${this.name} belajar di kampus merdeka PT. Gits Indonesia bersama $name")
    }

    fun doWorkClass() {
        println("${this.name} mengerjakan tugas...")
    }

    fun doAttendClass() {
        println("${this.name} menghadiri kelas...")
    }
}

class Mentor(name: String) : User(name) {
    override fun doActivity(name: String) {
        println("Kak ${this.name} mengajar/mementori mahasiswa $name di Studi Independen GITS Indonesia")
    }

    fun doCheckWorkClass() {
        println("Kak ${this.name} mengecek tugas mahasiswa dan menilainya...")
    }

    fun doTeach() {
        println("Kak ${this.name} melakukan sharing bersama teman teman mahasiswa...")
    }
}

class Pic(name: String) : User(name) {
    override fun doActivity(name: String) {
        println("Bapak ${this.name} Pembimbing mitra PT. Gits Indonesia di kelas $name")
    }
}

fun main() {

    val mahasiswa = Mahasiswa("M Ramdhan Syahputra")
    val mentor = Mentor("Khoirul Huda")
    val pic = Pic("Zulfikar Syaharrudin")


    println("Mahasiswa")
    println("-----------------------------------------")
    mahasiswa.doActivity("Fachmi")
    mahasiswa.doWorkClass()
    mahasiswa.doAttendClass()

    println()
    println("Mentor")
    println("-----------------------------------------")
    mentor.doActivity("M Ramdhan Syahputra")
    mentor.doTeach()
    mentor.doCheckWorkClass()

    println()
    println("PIC")
    println("-----------------------------------------")
    pic.doActivity("Android Kotlin - GITS Studi Independen Batch 1")
}