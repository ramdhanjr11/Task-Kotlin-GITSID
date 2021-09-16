package com.muramsyah.gits.tugas12.utils

import com.muramsyah.gits.tugas12.R
import com.muramsyah.gits.tugas12.data.University

object DataHelper {
    private val universityNames = arrayOf(
        "Universitas Muhammadiyah Sukabumi",
        "Universitas Nusa Putra",
        "Universitas Bina Sarana Informatika (UBSI)",
        "STIE & STKIP PGRI Sukabumi",
        "STIE Pasim Sukabumi",
        "STH Pasundan",
        "STAI Sukabumi",
        "STAI Syamsul\'ulum",
        "STISIP Widyapuri Mandiri",
        "STKIP Bina Mutiara",
        "STIKES Kota Sukabumi",
        "Institut Manajemen Wiyata Indonesia (IMWI)",
        "International Professional Institute (IPI)",
        "Politeknik Sukabumi",
        "AMIK & AKPAR Citra Buana Indonesia"
    )

    private val universityAddress = arrayOf(
        "Jl. R. Syamsudin, SH. No. 50 Kota Sukabumi Jawa Barat Indonesia 43113",
        "Jl. Raya Cibatu Cisaat No.21, Cibolang Kaler, Kec. Cisaat, Sukabumi Regency, Jawa Barat 43155",
        "Jl. Cemerlang No.8, Sukakarya, Kec. Warudoyong, Kota Sukabumi, Jawa Barat 43135",
        "Jl. Karamat No.69, Karamat, Kec. Gunungpuyuh, Kota Sukabumi, Jawa Barat 43122",
        "Jl. Prana No.8a, Cikole, Kec. Cikole, Kota Sukabumi, Jawa Barat 43113",
        "Jl. Pasundan, Nyomplong, Kec. Warudoyong, Kota Sukabumi, Jawa Barat 43131",
        "Jl. Lio Balandongan Sirnagalih, Jl. Begeg No.74, Cikondang, Kec. Citamiang, Kota Sukabumi, Jawa Barat 43161",
        "Jl. Bhayangkara No.27-29, Gunungpuyuh, Kec. Gunungpuyuh, Kota Sukabumi, Jawa Barat 43123",
        "Komplek Gelanggang Pemuda Cisaat, Jl. Raya Cisaat No.6, Sukamanah, Kec. Cisaat, Sukabumi Regency, Jawa Barat 43152",
        "Jl. Pembangunan Jl. Selakaso Kulon, Pasirhalang, Kec. Sukaraja, Kota Sukabumi, Jawa Barat 43192",
        "Jl. Karamat No.36, Karamat, Kec. Sukabumi, Kota Sukabumi, Jawa Barat 43122",
        "Jl. Gudang, Kebonjati, Kec. Cikole, Kota Sukabumi, Jawa Barat 43113",
        "Jl. Sriwidari No.126, Selabatu, Kec. Cikole, Kota Sukabumi, Jawa Barat 43121",
        "Jl. Babakan Sirna No.25, Benteng, Kec. Warudoyong, Kota Sukabumi, Jawa Barat 43132",
        "Jl. KH. Ahmad Sanusi No.52, Karang Tengah, Kec. Gunungpuyuh, Kota Sukabumi, Jawa Barat 43121"
    )

    private val universitySummaries = arrayOf(
        "Universitas Muhammadiyah Sukabumi didirikan berdasarkan kajian dan studi kelayakan yang dilakukan pengurus Pimpinan Daerah Muhammadiyah (PDM) Sukabumi, tanggal 1 Desember 2000 yang memutuskan untuk segera merealisasikan Keputusan Musyawarah Daerah Muhammadiyah 1996, yaitu mendirikan Universitas Muhammadiyah Sukabumi yang disingkat UMMI dengan kampus yang berada di komplek Perguruan Muhammadiyah Jl. R. Syamsudin, S.H. No. 50 Sukabumi",
        "Universitas Nusa Putra berdiri berdasarkan Keputusan Menteri Riset, Teknologi dan Pendidikan Tinggi Nomor : 108/KPT/I/2018 Tentang Perubahan Bentuk Sekolah Tinggi Teknologi Nusa Putra di Sukabumi yang dikelola oleh Yayasan Perguruan Nusa Putra Sukabumi menjadi Universitas Nusa Putra di Sukabumi yang diselenggarakan oleh Yayasan Perguruan Nusa Putra Sukabumi. Tepatnya pada hari Jumat tanggal 02 Februari 2018, sejak hari itulah secara resmi Universitas Nusa Putra yang sering di singkat NPU (Nusa Putra University) secara resmi berdiri.",
        "Perubahan Akademi Bina Sarana Informatika (BSI) menjadi Universitas Bina Sarana Informatika (UBSI) telah diresmikan. Penyerahan Surat Keputusan Perubahan Akademi BSI menjadi Universitas Bina Sarana Informatika (UBSI) ini berlangsung di BSI Convention Center, Jalan Raya Kaliabang nomor 8, Perwira, Bekasi Utara, Bekasi, Jawa Barat. Surat Keputusan tersebut diserahkan langsung oleh Sekretaris Jenderal Kementrian Riset, Teknologi dan Pendidikan Tinggi, Prof Ainun Naâ€™im PhD, MBA, kepada Pengurus Yayasan Bina Sarana Informatika, Efriadi Salim yang didampingi Direktur BSI Naba Aji Notoseputro.",
        "Pada awal tahun 60-an, tepatnya antara tahun 1964 sampai dengan tahun 1973, Universitas Pendidikan Indonesia yang ketika itu masih bernama IKIP-Bandung menyelenggarakan program ekstension di Sukabumi. Lewat program ini dihasilkan 165 orang lulusan Sarjana Muda.",
        "YAPASIM berdiri pada tanggal 11 Juni 1996 dengan akta notaris No 41 didepan notaris Dr Wiratni Ahmadi SH. Pendirian YAPASIM ini ditujukan untuk menjadi lembaga pengelola pendidikan tinggi. Oleh karena itu, setelah YAPASIM berdiri tidak berapa lama sesudah itu pendiri mengajukan izin kepada Direktur Jenderal Pendidikan Tinggi Departemen Pendidikan dan Kebudayaan untuk mendirikan Sekolah Tinggi Ilmu Ekonomi yang diberi nama STIE PASIM.",
        "Sekolah Tinggi Hukum Pasundan adalah sebuah perguruan tinggi swasta yang terdapat di Sukabumi, Jawa Barat, Indonesia. Kampusnya beralamat di Jalan Pasundan Nomor 117 Sukabumi 43131 website:www.sth-pasundan.ac.id.",
        "Sekolah Tinggi Ilmu Agama Islam (STAI) Sukabumi berdiri pada 4 Maret 1974 di bawah naungan Yayasan Pembangunan Sukabumi. STAI Sukabumi sebagai lembaga Pendidikan Agama Islam, merupakan pengembangan dari Fakultas Syari’ah Institut Agama Islam (IAIN) Sunan Gunung Djati Bandung Cabang Sukabumi yang ditarik ke pusatnya di Bandung berdasarkan SK Menteri Agama RI No 15 tahun 1974.",
        "Sekolah Tinggi Agama Islam (STAI) Syamsul Ulum Gunungpuyuh Sukabumi, merupakan salah satu perguruan tinggi tertua di Kota Sukabumi, berdiri sejak tahun 1994, telah dan akan banyak menghasilkan para alumni yang berkualitas dibuktikan dengan salah satu indikatornya yaitu keberhasilan sejumlah banyak alumninya yang dianggap berhasil dimasyarakat. Baik sebagai pejabat pemerintahan maupun tokoh masyarakat yang berkiprah di bidang pendidikan, ekonomi serta politik dan lain sebagainya.",
        "Sekolah Tinggi Ilmu Sosial dan Ilmu Politik (STISIP) Widyapuri Mandiri Sukabumi berada di bawah naungan Yayasan Sukabumi Mandiri. Didirikan pada tahun 1998 atas prakarsa Pemerintah Kabupaten Sukabumi dalam hal ini Bupati Sukabumi Drs. H. U. Moch. Muchtar, M.Si. yang sekarang menjadi Ketua Yayasan.",
        "Sekolah Tinggi Keguruan dan Ilmu Pendidikan (STKIP) Bina Mutiara Sukabumi, merupakan lembaga Pendidikan Tinggi yang ingin berperan aktif mengukir sejarah perjuangan bangsa, mengabdikan dirinya bagi kepentingan pembangunan tanah air melalui tridharma perguruan tinggi untuk membangun manusia yang unggul, berdaya saing, berbudaya dan berjati diri sehingga menjadi warga masyarakat, warga bangsa, warga negara maupun warga masyarakat dunia yang mampu mensejahterakan dirinya dengan yang lain.",
        "STIKES Kota Sukabumi merupakan lembaga pendidikan keperawatan dan kebidanan hasil konversi AKPER Kota Sukabumi, sampai saat ini meluluskan 4162 tenaga kesehatan yang keseluruhannya telah bekerja di instansi pemerintah, TNI, POLRI dan swasta dalam maupun luar negeri. Tim Pengajar adalah dosen-dosen yang berkompeten dalam bidangnya, terdiri dari S-2 Keperawatan, S-2 Kesehatan, S-1 Keperawatan, Sarjana Kesehatan, Dokter Spesialis dan Sarjana Keilmuan lainnya. Mahasiswa yang berprestasi akan dibebas.",
        "Institut Manajemen Wiyata Indonesia dengan akronim IMWI, adalah sebuah Perguruan Tinggi Swasta yang terletak di Kota Sukabumi, Jawa Barat, yang secara geografis berada di antara Kota Jakarta dan Kota Bandung. Kota Pegunungan yang memiliki udara yang sejuk yang berada di ketinggian 600 meter di atas permukaan laut dan terletak di kaki Gunung Gede yang megah.",
        "Banyaknya pengangguran di Indonesia mayoritas bersumber dari lulusan SMA dan SMK baik negeri maupun swasta dimana setiap tahun terus bertambah. Kenyataan pahit tersebut masih diperparah dengan mayoritas lulusan PERGURUAN TINGGI yang hanya sekedar asal kuliah demi gengsi tanpa memikirkan peluang kerja/prospek pekerjaansetelah lulus kelak.",
        "Politeknik Sukabumi didirikan oleh Yayasan Pendidikan Kusumah Bangsa Milik Pemerintah Kota Sukabumi, berdasarkan akta notaris Luciana Tirtaman, SH. Nomor. 74 tanggal 20 Juni 2002 dan Keputusan Menteri Hukum dan HAM Nomor: AHU-2330.AH.01.02.TAHUN 2008 tanggal 6 Juni 2008.",
        "Sejalan dengan arah kebijakan pemerintah dalam upaya mengoptimalisasikan Sumber Daya Manusia Indonesia melalui pendidikan, Yayasan Buana Pratama menyelengagarakan Perguruan Tinggi Informatika dan Pariwisata Citra Buana Indonesia dengan SK Mendiknas No. 183/D/0/2001 dan SK. Dirjen Dikti No. 3999/D/T/ 2003 yang selaras dengan kebijakan Pendidikan Nasional."
    )

    private val universityWebsites = arrayOf(
        "https://ummi.ac.id/",
        "https://nusaputra.ac.id/",
        "http://bsi.ac.id/",
        "https://stkippgrisukabumi.ac.id/",
        "https://www.stiepasim.ac.id/",
        "https://sth-pasundan.ac.id/",
        "https://www.staisukabumi.ac.id/",
        "https://staisyamsululum.ac.id/",
        "http://stisipwidyapuri-smi.ac.id/",
        "http://stkipbms.ac.id/",
        "https://www.stikesmi.ac.id/",
        "https://www.imwi.ac.id/",
        "https://www.ipi.ac.id/",
        "https://www.polteksmi.ac.id/",
        "https://www.cbi.ac.id/"
    )

    private val universityTelphones = arrayOf(
        "(0266) 218345",
        "+62266210594",
        "0896-1185-1851",
        "(0266) 226016",
        "(0266) 241000",
        "(0266) 222097",
        "(0266) 225464",
        "(0266) 231605",
        "(0266) 222867",
        "(0266) 6243531",
        "(0266) 210215",
        "(0266) 235717",
        "(0266) 6220778",
        "(0266) 215417",
        "(0266) 225920"
    )

    private val universityPhotos = intArrayOf(
        R.drawable.logo_ummi,
        R.drawable.logo_nusa,
        R.drawable.logo_bsi,
        R.drawable.logo_stie_pgri,
        R.drawable.logo_stie_pasim,
        R.drawable.logo_sth_pasundan,
        R.drawable.logo_stai_sukabumi,
        R.drawable.logo_stai_syamsyululum,
        R.drawable.logo_stisip_widyapuri,
        R.drawable.logo_stkip_binamutiara,
        R.drawable.logo_stikes_sukabumi,
        R.drawable.logo_imwi,
        R.drawable.logo_ipi_sukabumi,
        R.drawable.logo_poltek_sukabumi,
        R.drawable.logo_amik
    )

    val listData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (position in universityNames.indices) {
                val university = University()
                university.name = universityNames[position]
                university.address = universityAddress[position]
                university.web = universityWebsites[position]
                university.telphone = universityTelphones[position]
                university.photo = universityPhotos[position]
                university.summary = universitySummaries[position]
                list.add(university)
            }
            return list
        }
}