/***
 *
 * Tugas 7 Buatlah program sederhana Class dan Object Kotlin & Class Attribute dengan Parameters
 * seperti pada contoh kasus pada materi, bebas mau diubah dengan topiknya.
 *
 */


// Membuat class baru dengan parameter dan melakukan initialization awal variable atau atribut dengan fungsi init{} saat class pertama kali dipanggil
class Legend(_name: String, _age: Int = 0, _homePlanet: String, _tacticalAbillity: String, _passiveAbillity: String, _ultimateAbillity: String){

    var name: String? = null // Agar terhindar dari error NullPointerException
    var age: Int? = null
    var homePlanet: String? = null
    var tacticalAbillity: String? = null
    var passiveAbillity: String? = null
    var ultimateAbillity: String? = null

    // Akan dijalankan paling awal ketika object dipanggil atau dibuat
    init {
        name = _name
        age = _age
        homePlanet = _homePlanet
        tacticalAbillity = _tacticalAbillity
        passiveAbillity = _passiveAbillity
        ultimateAbillity = _ultimateAbillity
    }

}

fun main() {

    // Melakukan deklarasi array dengan tipe data Legend
    val legends = arrayListOf<Legend>()

    // Menambahkan data array dengan fungsi add
    legends.add(Legend("Bangalore", 36, "Gridiron", "Smoke Launcher", "Double Time", "Rolling Thunder"))
    legends.add(Legend("BloodHound", 0, "Talos", "Eye of the Alifather", "Tracker", "Beast of the Hunt"))
    legends.add(Legend("Caustic", 48, "Gaea", "Nox Gas Trap", "Nox Vision", "Nox Gas Grenade"))
    legends.add(Legend("Crypto", 31, "Gaea", "Surveillance Drone", "Neurolink", "Drone EMP"))
    legends.add(Legend("Fuse", 54, "Salvo", "Knuckle Cluster", "Grenadier", "The Motherlode"))
    legends.add(Legend("Gibraltar", 30, "Solace", "Dome of Protection", "Gun Shield", "Defensive Bombardment"))
    legends.add(Legend("Horizon", 37, "Psamathe", "Gravity Lift", "Spacewalk", "Black Hole"))
    legends.add(Legend("LifeLine", 24, "Psamathe", "D.O.C. Heal Drone", "Combat Medic", "Care Package"))
    legends.add(Legend("Loba", 34, "None", "Burglar’s Best Friend", "Eye for Quality Medic", "Black Market Boutique"))
    legends.add(Legend("Mirage", 30, "Solace", "Psyche Out", "Now You See Me", "Life of the Party"))

    // Membuat variable baru untuk membuat nilai random dari interval 0 hinggal size yang ada di variable legends
    val randomNumber = (0 until legends.size).random()

    // Menampilkan output legends dengan angka acak yang akan ditampilkan
    println("""
        Legend ${randomNumber+1}
        Name                : ${legends[randomNumber].name}
        Age                 : ${legends[randomNumber].age}
        Home Planet         : ${legends[randomNumber].homePlanet}
        Tactical Abillity   : ${legends[randomNumber].tacticalAbillity}
        Passive Abillity    : ${legends[randomNumber].passiveAbillity}
        Ultimate Abillity   : ${legends[randomNumber].ultimateAbillity}
    """.trimIndent())

}