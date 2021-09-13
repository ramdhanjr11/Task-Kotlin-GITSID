import java.lang.NumberFormatException

/**
 *
 * Tugas 9 Buatlah program Nested dan Inner Class pada Kotlin bebas mamu memuat informasi apa saja ya.
 *
 */

class Football(team: Builder) {
    val teamName = team._teamName
    val teamLeague = team._teamLeague
    val player = team._player
    val coach = team._coach

    // Menggunakan Builder Pattern dan merupkan inner class dari class Football
    class Builder(teamName: String) {

        var _teamName = teamName
        var _teamLeague: String? = null
        var _player: List<Player>? = null
        var _coach: String? = null

        fun setTeamLeague(value: String): Builder {
            this._teamLeague = value
            return this
        }

        fun setPlayer(value: List<Player>): Builder {
            this._player = value
            return this
        }

        fun setCoach(value: String): Builder {
            this._coach = value
            return this
        }

        fun create(): Football {
            return Football(this)
        }
    }

}

// Data class untuk menampung data player
data class Player(
    val name: String,
    val backNumber: Int,
    val position: String,
    val nation: String
)


fun main() {

    // inisiasi player
    val barcelonaPlayers = ArrayList<Player>().apply {
        // Forwards
        add(Player("Braithwaith", 12, "Forward", "Denmark"))
        add(Player("Memphis Depay", 9, "Forward", "Netherlands"))
        add(Player("Sergio Agüero", 19, "Forward", "Argentina"))
        add(Player("Luuk de Jong", 17, "Forward", "Netherlands"))
        add(Player("Ousmane Dembélé", 7, "Forward", "France"))
        add(Player("Yusuf Demir", 11, "Forward", "Austria"))
        add(Player("Ansu Fati", 10, "Forward", "Spain"))

        // Midfielders
        add(Player("Busquets", 5, "Midfielder", "Spain"))
        add(Player("Coutinho", 14, "Midfielder", "Brazil"))
        add(Player("Frenkie de Jong", 21, "Midfielder", "Netherlands"))
        add(Player("Pedri", 16, "Midfielder", "Spain"))
        add(Player("Riqui Puig", 6, "Midfielder", "Spain"))
        add(Player("Nico", 28, "Midfielder", "Spain"))
        add(Player("Gavi", 30, "Midfielder", "Spain"))

        // Defenders
        add(Player("Alejandro Balde", 31, "Defender", "Spain"))
        add(Player("Ronald Araújo", 4, "Defender", "Uruguay"))
        add(Player("Sergiño Dest", 2, "Defender", "USA"))
        add(Player("Eric García", 24, "Defender", "Spain"))
        add(Player("Jordi Alba", 18, "Defender", "Spain"))
        add(Player("Clément Lenglet", 15, "Defender", "France"))
        add(Player("Óscar Mingueza", 22, "Defender", "Spain"))
        add(Player("Piqué", 3, "Defender", "Spain"))
        add(Player("Sergi Roberto", 20, "Defender", "Spain"))
        add(Player("Samuel Umtiti", 23, "Defender", "France"))

        // Goalkeepers
        add(Player("Arnau Tenas", 36, "Goalkeeper", "Spain"))
        add(Player("Iñaki Peña", 26, "Goalkeeper", "Spain"))
        add(Player("Neto", 13, "Goalkeeper", "Brazil"))
        add(Player("Marc-André ter Stegen", 1, "Goalkeeper", "Germany"))
    }

    // Meng-implementasikan builder
    val barcelona = Football.Builder("Barcelona")
        .setTeamLeague("Spanish")
        .setPlayer(barcelonaPlayers)
        .setCoach("Ronald Koeman")
        .create()

    println("""
        Football
        =================
        Team Name               : ${barcelona.teamName}
        Team League             : ${barcelona.teamLeague}
        Coach                   : ${barcelona.coach}
        Number of Teams         : ${barcelona.player?.size} 
        Number of Goalkeepers   : ${barcelona.player?.filter { it.position == "Goalkeeper" }?.size}
        Number of Defenders     : ${barcelona.player?.filter { it.position == "Defender" }?.size}
        Number of Midfielders   : ${barcelona.player?.filter { it.position == "Midfielder" }?.size}
        Number of Forwards      : ${barcelona.player?.filter { it.position == "Forward" }?.size}
        =================
    """.trimIndent())

    var input: String?

    // Menggunakan lambda function untuk menampilkan data
    val showData: (List<Player>) -> Unit = {
        for (i in it) {
            println("""
                Back Number     : ${i.backNumber}
                Name            : ${i.name}
                Position        : ${i.position}
                Nation          : ${i.nation}
                =================
            """.trimIndent())
        }
        print("do you wanna repeat again? please type y or Y to repeat, if not you can type anything... ")
        input = readLine()
    }

    // Melakukan perulangan didalam blok do apabila kondisi dalam while terpenuhi
    do {
        println("""
            Select the following menu below here...
            1. Show detail of Goalkeepers
            2. Show detail of Defenders
            3. Show detail of Midfielders
            4. Show detail of Forwards
            Select : 
        """.trimIndent())

        // Try Catch untuk menghindari error ketika user memasukan data yang tidak sesuai
        try {
            input = readLine().toString()
        } catch (e: NumberFormatException) {
            input = null
            println(e.toString())
        }

        // Menggunakan kondisi when untuk menampilkan data sesuai inputan user
        when (input) {
            "1" -> showData(barcelona.player!!.filter { it.position == "Goalkeeper" }) // Memanggil fungsi lambda dan melakukan pasing data berupa ArrayList<Player>/List<Player>
            "2" -> showData(barcelona.player!!.filter { it.position == "Defender" })
            "3" -> showData(barcelona.player!!.filter { it.position == "Midfielder" })
            "4" -> showData(barcelona.player!!.filter { it.position == "Forward" })
        }
    } while (input == "Y" || input == "y")
}