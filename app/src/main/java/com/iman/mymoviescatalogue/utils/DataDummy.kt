package com.iman.mymoviescatalogue.utils

import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.data.MoviesEntity

object DataDummy {
    fun generateDummyMovies(): List<MoviesEntity> {

        val movies = ArrayList<MoviesEntity>()

        movies.add(
            MoviesEntity("Alita: Battle Angel",
            "02/12/2019", 72,
            "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            "Aksi, Cerita Fiksi, Petualangan", R.drawable.poster_alita))
        movies.add(MoviesEntity("Aquaman",
            "21/12/2018", 69,
            "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
            "Aksi, Petualangan, Fantasi", R.drawable.poster_aquaman))
        movies.add(MoviesEntity("Bohemian Rhapsody",
            "02/11/2018", 80,
            "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
            "Musik, Drama, Sejarah", R.drawable.poster_bohemian))
        movies.add(MoviesEntity("Creed II",
            "21/11/2018", 69,
            "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
            "Drama", R.drawable.poster_creed))
        movies.add(MoviesEntity("Avengers: Infinity War",
            "27/04/2018", 83,
            "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "Petualangan, Aksi, Cerita Fiksi", R.drawable.poster_infinity_war))
        movies.add(MoviesEntity("Master Z: Ip Man Legacy",
            "26/12/2018", 57,
            "Menyusul kekalahannya dari Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi itu tidak lama sebelum campuran orang asing, uang, dan pemimpin tiga serangkai menariknya sekali lagi ke pertarungan.",
            "Aksi", R.drawable.poster_master_z))
        movies.add(MoviesEntity("The Arrow",
            "10/10/2012", 66,
            "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow.",
            " Aksi, Cerita Fiksi, Petualangan", R.drawable.poster_arrow))
        movies.add(MoviesEntity("Cold Persuit",
            "08/02/2019", 56,
            "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
            "Aksi, Kejahatan, Cerita Seru", R.drawable.poster_cold_persuit))
        movies.add(MoviesEntity("Glass",
            "16/01/2019", 72,
            "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
            "Cerita Seru, Drama, Cerita Fiksi", R.drawable.poster_glass))
        movies.add(MoviesEntity("How to Train Your Dragon",
            "26/03/2010", 78,
            "Sebagai putra seorang pemimpin Viking di puncak kejantanan, Hiccup Horrendous Haddock III yang pemalu menghadapi ritual peralihan: dia harus membunuh seekor naga untuk membuktikan keberanian prajuritnya. Tetapi setelah menjatuhkan naga yang ditakuti, dia menyadari bahwa dia tidak lagi ingin menghancurkannya, dan malah berteman dengan binatang buas itu - yang dia beri nama Toothless - yang membuat ayah pejuangnya kecewa.",
            "Fantasi, Petualangan, Animasi, Keluarga", R.drawable.poster_how_to_train))

        return movies
    }

    fun generateDummyTvShow(): List<MoviesEntity> {

        val tv_show = ArrayList<MoviesEntity>()

        tv_show.add(
            MoviesEntity("Hewan Fantastis: Kejahatan Grindelwald",
                "16/11/2018", 69,
                "Gellert Grindelwald telah melarikan diri dari penjara dan telah mulai mengumpulkan pengikut ke tujuannya — meninggikan penyihir di atas semua makhluk non-magis. Satu-satunya yang bisa menghentikannya adalah penyihir yang pernah disebutnya sebagai sahabat terdekatnya, Albus Dumbledore. Namun, Dumbledore akan perlu mencari bantuan dari penyihir yang telah menggagalkan Grindelwald sebelumnya, mantan muridnya, Newt Scamander, yang setuju untuk membantu, tidak menyadari bahaya yang ada di depan. Garis-garis digambar saat cinta dan kesetiaan diuji, bahkan di antara teman-teman dan keluarga sejati, di dunia sihir yang semakin terbagi.",
                "Petualangan, Fantasi, Drama", R.drawable.poster_crimes))
        tv_show.add(MoviesEntity("Doom Patrol",
            "15/02/2019", 76,
            "Anggota Doom Patrol masing-masing mengalami kecelakaan mengerikan yang memberi mereka kemampuan super - tetapi juga membuat mereka terluka dan cacat. Trauma dan tertindas, tim menemukan tujuan melalui The Chief, yang mengumpulkan mereka untuk menyelidiki fenomena paling aneh yang ada - dan untuk melindungi Bumi dari apa yang mereka temukan.",
            "Sci-fi & Fantasy, Aksi & Petualangan, Komedi", R.drawable.poster_doom_patrol))
        tv_show.add(MoviesEntity("Dragon Ball",
            "26/02/2009", 81,
            "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
            "Komedi, Sci-fi & Fantasy, Animasi, Aksi & Petualangan", R.drawable.poster_dragon_ball))
        tv_show.add(MoviesEntity("Fairy Tail",
            "21/11/2018", 77,
            "Lucy adalah seorang gadis berusia 17 tahun, yang ingin menjadi penyihir sejati. Suatu hari ketika mengunjungi Kota Harujion, dia bertemu dengan Natsu, seorang pemuda yang mudah sakit dengan segala jenis transportasi. Tapi Natsu bukan sembarang anak biasa, dia adalah anggota dari salah satu guild penyihir paling terkenal di dunia: Fairy Tail.",
            "Aksi & Petualangan, Animasim Komedi, Sci-fi & Fantasy", R.drawable.poster_fairytail))
        tv_show.add(MoviesEntity("Family Guy",
            "31/01/1999", 69,
            "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
            "Animasi, Komedi", R.drawable.poster_family_guy))
        tv_show.add(MoviesEntity("The Flash",
            "07/10/2014", 76,
            "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
            "Drama, Sci-fi & Fantasy", R.drawable.poster_flash))
        tv_show.add(MoviesEntity("Gotham",
            "22/09/2014", 75,
            "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
            "Drama, Kejahatan, Sci-fi & Fantasy", R.drawable.poster_gotham))
        tv_show.add(MoviesEntity("Grey's Anatomy",
            "27/03/2005", 56,
            "Ikuti kehidupan pribadi dan profesional sekelompok dokter di Rumah Sakit Gray Sloan Memorial di Seattle.",
            "Draka", R.drawable.poster_grey_anatomy))
        tv_show.add(MoviesEntity("Naruto Shippuden",
            "15/02/2007", 86,
            "Naruto Shippuuden adalah kelanjutan dari serial TV animasi asli Naruto. Kisah ini berkisah tentang Uzumaki Naruto yang lebih tua dan sedikit lebih matang dan upayanya untuk menyelamatkan temannya Uchiha Sasuke dari cengkeraman Shinobi seperti ular, Orochimaru. Setelah 2 setengah tahun, Naruto akhirnya kembali ke desanya Konoha, dan mulai mewujudkan ambisinya, meskipun itu tidak akan mudah, karena Ia telah mengumpulkan beberapa musuh (lebih berbahaya), seperti organisasi shinobi. ; Akatsuki.",
            "Animasi, Aksi & Petualangan, Sci-fi & Fantasy ", R.drawable.poster_naruto_shipudden))
        tv_show.add(MoviesEntity("The Simpsons",
            "17/12/1989", 78,
            "Bertempat di Springfield, kota rata-rata di Amerika, pertunjukan ini berfokus pada kejenakaan dan petualangan sehari-hari keluarga Simpson; Homer, Marge, Bart, Lisa dan Maggie, serta ribuan pemain virtual. Sejak awal, serial ini telah menjadi ikon budaya pop, menarik ratusan selebriti menjadi bintang tamu. Acara ini juga menjadi terkenal karena satirnya yang tak kenal takut terhadap kehidupan politik, media, dan Amerika secara umum.",
            "Keluarga, Animasi, Komedi", R.drawable.poster_the_simpson))

        return tv_show
    }
}