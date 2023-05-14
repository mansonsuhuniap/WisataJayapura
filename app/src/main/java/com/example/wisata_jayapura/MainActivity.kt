package com.example.wisata_jayapura


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList : List<Image> = listOf<Image>(
            Image(
                R.drawable.harlem,
                "HARLEM",
                "TANAH Papua seolah tak pernah habis dengan kekayaan wisata baharinya. Setelah publik internasional takjub dengan pesona Raja Ampat dan Teluk Cenderawasih, ternyata masih ada salah satu destinasi wisata bahari yang mengundang decak kagum. Itulah Pantai Harlem, surga kecil di Jayapura. Pantai Harlem adalah salah satu obyek wisata yang terletak di Kabupaten Jayapura, Papua, tepatnya di Kampung Tablanusu, Distrik Depapre. Kompas mengunjungi tempat itu pada 13 September lalu. Dengan menyewa sebuah mobil jenis multipurpose vehicle, bersama tiga wisatawan lain, kami bertolak dari Kota Jayapura tepat pukul 09.00 WIT. Perjalanan ke Harlem memakan waktu sekitar dua jam dengan jarak tempuh sekitar 60 kilometer. Lamanya waktu perjalanan disebabkan oleh kondisi jalan dari arah Sentani menuju Depapre yang kurang baik. Banyak ruas jalan berlubang, penuh debu, dan sempit."

            ),
            Image(
                R.drawable.danaulove,
                "DANAU LOVE",
                "Danau Love atau Danau Imfote salah satu objek wisata yang memukau di Jayapura, Provinsi Papua yang menarik dijelajahi. Telaga Cinta yang menyuguhkan pemandangan yang indah dikelilingi padang savana.Membicarakan wisata yang ada di kawasan Indonesia bagian timur, memang banyak didominasi oleh wisata pantai. Namun di Kabupaten Jayapura tepatnya pada bagian Sentani Timur, terdapat sebuah wisata yang menyajikan pemandangan keindahan danau dan perbukitan.\n" +
                        "\n" +
                        "Lingkungan sekitarnya yang masih terjaga, membuat suasana di wisata bernama Danau Love atau dikenal dengan sebutan Danau Imfote ini menjadi lebih sejuk. Walaupun tidak ada satupun pohon tinggi yang tumbuh di dekat danau, udara sejuk ini berasal dari terpaan angin.."
            ),
            Image(
                R.drawable.kalibiru,
                "KALI BIRU",
                "Papua adalah salah satu provinsi yang berada di paling timur Indonesia. Provinsi ini mempunyai kekayaan dan potensi wisata yang menarik dan alami dan salah satunya yang berlokasi di kota Jayapura, yaitu Kali Genyem. Lokasinya ada di Berab, Nimbokrang, Jayapura, Papua dan sering disebut Kalibiru atau Kali Biru Genyem.\n" +
                        "\n" +
                        "Jarak tempuh yang harus dilalui oleh wisatawan untuk mencapai tempat ini dari Bandara Sentani membutuhkan waktu sekitar 2 jam. Medannya pun turun naik melalui perbukitan dan pegunungan.\n" +
                        "\n" +
                        "Tapi wisatawan akan disuguhi oleh air sungai atau air kali yang sangat jernih dan berwarna biru. Rasa lelah dari jauhnya perjalanan yang ditempuh akan terbayarkan lunas di wisata Kali Biru Genyem ini.."
            ),
            Image(
                R.drawable.mangrov,
                "MANGROV",
                "Salah satu objek wisata baru di Kota Jayapura, yakni Kawasan Ekowisata Mangrove, Kampung Tobati Jayapura.\n" +
                        "\n" +
                        "Secara administratif Kawasan Ekowisata Mangrove ini berada di Kampung Tobati Distrik Jayapura Selatan, Kota Jayapura. Hanya saja memang lokasinya berdekatan dengan Pantai Hamadi Jayapura, sehingga masyarakat lebih mengenalnya masuk pada area Pantai Hamadi.\n" +
                        "\n" +
                        "Kawasan Ekowisata Mangrove di Kampung Tobati ini, akan menjadi destinasi ekowisata mangrove pertama di Kota Jayapura."

            ),
            Image(
                R.drawable.teletubis,
                "BUKIT TELETUBIS",
                "Bukit Tungkuwiri atau yang lebih dikenal dengan Bukit Teletubbies adalah daerah perbukitan di Kampung Doyo Lama, Distrik Waibu, Kabupaten Jayapura. Sering disebut sebagai Bukit Teletubbies karena bukit yang bersebelahan dengan Danau Sentani di kawasan Pegunungan Cycloop ini, bentuknya hampir sama dengan perbukitan yang ada di serial film anak Teletubbies. Sepanjang jalan setapak saat menuju bukit, kamu dapat menemukan pondok-pondok yang bisa digunakan untuk duduk santai selagi menikmati."
            ),Image(
                R.drawable.basege,
                "PANTAI BASEG",
                "Pantai Base G atau juga dikenal sebagai Tanjung Ria terletak disebelah utara Kota Jayapura, Papua. Pantai Base G berlokasi sekitar 10 km dari Kota Jayapura di Distrik Jayapura Utara. Pantai Base G dapat dikunjungi dengan menggunakan berbagai jenis kendaraan dengan waktu tempuh kurang lebih 20 menit dari kota, dengan akses jalan beraspal. Apabila pengunjung mengambil patokan Bandara Sentani, waktu tempuh darat sekitar 1,5 jam."

            ),
            Image(
                R.drawable.jembatanmerah,
                "JEMBATAN MERAH",
                " Jembatan Youtefa adalah salah satu jembatan di Provinsi Papua yang menghubungkan Holtekamp dengan Hamadi. Jembatan Youtefa memiliki panjang 732 meter dengan lebar 21 meter. Jembatan ini tergolong sebagai jembatan tipe pelengkung baja yang pertama kali dibangun di Papua."
            ),
            Image(
                R.drawable.tablanusu,
                "PANTAI TABLANUSU",
                " HVHVVVHVH."
            ),
            Image(
                R.drawable.bukitjokowi,
                "BUKIT JOKOWI",
                "Papua merupakan rumah bagi pemandangan yang menakjubkan terutama bagi para petualang. Terkenal dengan Raja Ampatnya, Papua juga merupakan rumah bagi destinasi wisata menarik lainnya yang bahkan mampu dijangkau oleh wisatawan dengan anggaran terjangkau."
            ),
            Image(
                R.drawable.airterjunciclop,
                "AIR TERJUN CYCLOP",
                "Terletak di dekat bandara Sentani, air terjun ini dapat dicapai dengan hiking di sepanjang jalur pegunungan selama 20 menit. Untuk menuju tempat ini, Traveler harus siap secara fisik karena akses yang melintasi batuan besar dan tanjakan.\n" +
                        "\n" +
                        "Meskipun perjalanannya cukup menantang, perjalanan ini dibuat berharga dengan pemandangan hutan sekitarnya yang menakjubkan di lereng gunung, batu-batu besar dan air terjun yang jernih. Rasa lelah akan terbayarkan dengan pemandangan alam yang menawan, Air Terjun Cyclop.  Airnya nan jernih mengalir deras di antara bebatuan berpadu dengan rimbunnya pepohonan di sekitar, semakin menambah asri suasana di tempat ini."
            ),
            Image(
                R.drawable.telukyoutefa,
                "TELUK YOUTEFA",
                "Teluk Youtefa menjadi salah satu tujuan wisata Jayapura yang tawarkan panorama alam Papua. Tempat wisata yang masuk dalam area Taman Wisata Alam ini memiliki luas sekitar 1.675 hektar dan terletak di tengah – tengah Teluk Yos Sudarso. Teluk Youtefa ini berada di kawasan Enggros, Wai Mhorock, Abepura, Kota Jayapura."
            ),
            Image(
                R.drawable.skow,
                "SKOW PERBATASAN PNG",
                "Dari jantung Kota Jayapura, Skouw berjarak sekitar 60 kilometer. Skouw termasuk Distrik Jayapura Utara yang berdekatan dengan negara Papua Nugini. \n" +
                        "Skouw menjadi daerah terbuka bagi warga dua negara, Indonesia dan Papua Nugini dalam bertransaksi jual beli, khususnya di pasar tradisional setempat. ."
            ),
            Image(
                R.drawable.pantaipasir6,
                "PANTAI PASIR 6",
                "Terletak di Jayapura Papua, wilayah ini memiliki beberapa deretan pantai yang indah dengan perairan yang langsung terhubung dengan Laut Pasifik. Salah satu pantai ini adalah Pantai Pasir 6 Angkasa.\n" +
                        "\n" +
                        "Karena terletak di ujung kepulauan Indonesia, maka objek wisata ini kurang diketahui oleh masyarakat luas. Meskipun wisata bahari ini memiliki daya tarik yang mampu membuat wisatawan tercengang dengan keindahan alamnya.."
            )
        )

        val recyclerView : RecyclerView = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
