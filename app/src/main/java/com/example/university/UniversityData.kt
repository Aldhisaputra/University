package com.example.university

object UniversityData {

    private val universityName = arrayOf(
        "Binus",
        "Institut Pertanian Bogor",
        "Institut Teknologi Bandung",
        "Institut Teknologi Sepuluh Nopember",
        "Telkom University",
        "Universitas Brawijaya",
        "Universitas Gadjah Mada",
        "Universitas Indonesia",
        "Universitas Diponegoro",
        "Universitas Negeri Jakarta",
        "Universitas Negeri Yogyakarta",
        "Unuversity Pendidikan Indonesia",
    )

    private val universityDetail = arrayOf(
        "Binus University adalah sebuah perguruan tinggi swasta terkemuka di Indonesia yang berlokasi di Jakarta. Berdiri sejak 1974, universitas ini menawarkan berbagai program pendidikan tinggi dalam berbagai disiplin ilmu, seperti bisnis, teknologi informasi, desain, komunikasi, dan seni. Dikenal sebagai pusat inovasi dan teknologi, Binus University telah menciptakan banyak lulusan sukses yang berkontribusi pada perkembangan industri di Indonesia. Universitas ini juga dikenal karena fasilitas modernnya, kurikulum yang terus diperbarui, dan kolaborasi dengan berbagai perusahaan dan industri. Dengan komitmen pada kualitas pendidikan dan perkembangan profesional, Binus University tetap menjadi pilihan utama bagi para pelajar di Indonesia.",
        "Institut Pertanian Bogor (IPB), terletak di Bogor, Indonesia, adalah institusi pendidikan tinggi terkemuka dengan fokus kuat pada ilmu pertanian, lingkungan, dan kehutanan. Didirikan pada tahun 1963, IPB telah berkembang menjadi pusat keunggulan dalam penelitian pertanian dan ilmu-ilmu terkait. Kampus hijau yang luas dan indahnya lingkungan alamnya menciptakan atmosfer yang unik untuk belajar dan penelitian. IPB menawarkan berbagai program studi, termasuk pertanian, kehutanan, dan ilmu lingkungan. Selain itu, institut ini aktif dalam berbagai kegiatan penelitian, pengabdian masyarakat, dan kerja sama dengan lembaga-lembaga internasional. IPB memainkan peran penting dalam pengembangan keberlanjutan dan ketahanan pangan di Indonesia.",
        "Institut Teknologi Bandung (ITB), terletak di Bandung, Indonesia, adalah salah satu universitas teknologi terkemuka di Asia Tenggara. Didirikan pada tahun 1920, ITB dikenal karena reputasi akademiknya yang kuat dan kontribusi besar dalam pengembangan teknologi dan sains di Indonesia. Kampusnya yang megah mencakup berbagai disiplin ilmu, termasuk teknik, ilmu komputer, sains alam, seni, dan humaniora. ITB mengutamakan penelitian dan kerja sama industri, menjembatani kesenjangan antara teori dan praktik. Perguruan tinggi ini juga mempromosikan nilai-nilai keberlanjutan dan inovasi dalam pendidikan. ITB adalah pusat keunggulan pendidikan tinggi yang berperan penting dalam perkembangan teknologi dan ilmu pengetahuan di Indonesia.</item><item>Institut Teknologi Sepuluh Nopember (ITS) adalah institusi pendidikan tinggi yang terkemuka di Surabaya, Indonesia. Didirikan pada tanggal 10 November 1957, ITS terkenal karena fokusnya pada teknologi, sains, dan teknik. Kampusnya yang modern menyediakan fasilitas berkualitas tinggi untuk mahasiswa dan peneliti. ITS menawarkan berbagai program studi, termasuk teknik sipil, teknik mesin, teknologi informasi, dan ilmu kelautan. Universitas ini dikenal atas penekanannya pada inovasi, penelitian, dan pengabdian masyarakat. ITS aktif dalam mengembangkan solusi teknologi untuk masalah sosial dan ekonomi. Dengan dedikasinya terhadap pendidikan tinggi berkualitas dan kontribusi yang berkelanjutan, ITS memainkan peran penting dalam kemajuan teknologi di Indonesia.",
        "Telkom University adalah institusi pendidikan tinggi yang terletak di Bandung, Jawa Barat, Indonesia. Universitas ini didirikan oleh PT Telekomunikasi Indonesia Tbk (Telkom), salah satu perusahaan telekomunikasi terbesar di Indonesia. Telkom University mengkhususkan diri dalam ilmu teknologi, bisnis, dan kreativitas. Kampusnya yang modern dan dilengkapi dengan fasilitas canggih menciptakan lingkungan belajar yang inovatif. Telkom University menawarkan berbagai program studi, termasuk teknik, manajemen bisnis, komunikasi, dan seni. Universitas ini berfokus pada pengembangan keterampilan dan pengetahuan yang relevan dengan kebutuhan industri telekomunikasi dan teknologi informasi. Telkom University juga berperan dalam mendorong inovasi dan kewirausahaan di Indonesia.",
        "Universitas Brawijaya, yang terletak di Malang, Jawa Timur, adalah salah satu universitas terkemuka di Indonesia. Universitas ini didirikan pada tahun 1963 dan telah tumbuh menjadi pusat pendidikan dan penelitian yang penting. Kampusnya yang luas dan indah, dengan berbagai fasilitas modern, menciptakan lingkungan belajar yang inspiratif. Universitas Brawijaya menawarkan berbagai program studi di berbagai bidang, termasuk ilmu pertanian, teknik, kedokteran, dan humaniora. Selain itu, universitas ini aktif dalam penelitian, pengabdian masyarakat, dan kerja sama dengan lembaga-lembaga internasional. Universitas Brawijaya berperan penting dalam pengembangan ilmu pengetahuan, inovasi, dan pendidikan di Indonesia.",
        "Universitas Gadjah Mada (UGM) adalah salah satu universitas terkemuka di Indonesia, terletak di Yogyakarta. Didirikan pada tahun 1949, UGM memiliki reputasi yang kuat dalam bidang pendidikan dan penelitian. Kampusnya yang luas dan indah, dengan arsitektur tradisional Jawa yang menawan, menciptakan lingkungan akademik yang unik. UGM menawarkan beragam program studi, termasuk ilmu sosial, teknik, kedokteran, dan humaniora. Universitas ini juga aktif dalam penelitian dan kerja sama internasional. Dengan komitmen terhadap keberlanjutan, inovasi, dan pengabdian masyarakat, UGM memainkan peran penting dalam mengembangkan ilmu pengetahuan dan mencetak generasi yang berkomitmen untuk pembangunan Indonesia.",
        "Universitas Indonesia (UI) adalah salah satu institusi pendidikan tinggi paling bergengsi di Indonesia, terletak di Depok, Jawa Barat. Didirikan pada tahun 1849, UI memiliki warisan sejarah yang kaya dan reputasi yang kuat dalam pendidikan, penelitian, dan pengabdian masyarakat. Kampusnya yang luas dan modern menciptakan atmosfer belajar yang dinamis dan inklusif. UI menawarkan berbagai program studi di berbagai bidang, termasuk ilmu sosial, ilmu alam, teknik, kedokteran, dan humaniora. Universitas ini dikenal atas kontribusinya dalam penelitian dan pengembangan, serta kerja sama internasional yang luas. UI terus berperan penting dalam perkembangan ilmu pengetahuan dan pembangunan Indonesia.",
        "Universitas Diponegoro (Undip) adalah salah satu perguruan tinggi terkemuka di Indonesia, terletak di Semarang, Jawa Tengah. Undip didirikan pada tahun 1957 dan memiliki sejarah yang kaya serta reputasi akademik yang kuat. Kampusnya yang luas dan modern menawarkan fasilitas terbaik untuk pembelajaran dan penelitian. Undip menawarkan berbagai program studi di berbagai bidang, termasuk ilmu alam, ilmu sosial, teknik, dan kedokteran. Universitas ini aktif dalam penelitian, pengabdian masyarakat, dan kerja sama industri. Undip memainkan peran penting dalam pengembangan ilmu pengetahuan dan ekonomi di Jawa Tengah dan seluruh Indonesia.",
        "Universitas Negeri Jakarta (UNJ) adalah lembaga pendidikan tinggi yang terletak di Jakarta, ibu kota Indonesia. Didirikan pada tahun 1964, UNJ adalah salah satu universitas negeri terkemuka di wilayah tersebut. Kampusnya yang modern dan berlokasi strategis menyediakan lingkungan belajar yang memadai. UNJ menawarkan berbagai program studi di berbagai bidang, termasuk pendidikan, ilmu sosial, ilmu alam, dan humaniora. Universitas ini memiliki komitmen kuat terhadap pengembangan sumber daya manusia yang berkualitas dan berkontribusi dalam pengembangan pendidikan di Indonesia. Dengan fokus pada penelitian dan pengabdian masyarakat, UNJ memainkan peran penting dalam perkembangan sosial dan ekonomi Jakarta dan sekitarnya.",
        "Universitas Negeri Yogyakarta (UNY) adalah institusi pendidikan tinggi yang terletak di Yogyakarta, Indonesia. Didirikan pada tahun 1964, UNY memiliki warisan budaya dan sejarah yang kaya serta reputasi kuat dalam pendidikan dan penelitian. Kampus yang berlokasi di lingkungan budaya dan sejarah Yogyakarta menawarkan lingkungan belajar yang inspiratif. UNY menawarkan berbagai program studi di berbagai bidang, termasuk ilmu pendidikan, seni, ilmu sosial, dan ilmu alam. Universitas ini mengutamakan penelitian dan pengembangan ilmu pengetahuan serta berkontribusi aktif dalam pengembangan pendidikan di Indonesia. UNY memainkan peran penting dalam pertumbuhan sosial dan ekonomi Yogyakarta dan sekitarnya.",
        "University Pendidikan Indonesia (UPI), terletak di Bandung, Indonesia, adalah institusi pendidikan tinggi yang terkemuka dalam bidang pendidikan dan ilmu sosial. Berdiri pada tahun 1954, UPI telah memainkan peran penting dalam pembangunan pendidikan di Indonesia. Kampusnya yang indah menawarkan fasilitas modern dan lingkungan akademik yang memotivasi. UPI menawarkan beragam program studi, terutama dalam bidang pendidikan, sastra, ilmu sosial, dan seni. Universitas ini mendorong pengembangan pengetahuan dan keterampilan pendidikan yang relevan. Dengan komitmen terhadap penelitian, pengabdian masyarakat, dan inovasi pendidikan, UPI terus menjadi kontributor penting dalam pengembangan sistem pendidikan dan pengembangan sumber daya manusia di Indonesia.",

        )

    private val universityImage = intArrayOf(
        R.drawable.binus,
                R.drawable.ipb,
        R.drawable.itb,
        R.drawable.its,
        R.drawable.telyu,
        R.drawable.ub,
        R.drawable.ugm,
        R.drawable.ui,
        R.drawable.um,
        R.drawable.undip,
        R.drawable.unj,
        R.drawable.upi,

    )

    val listData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (position in universityName.indices) {
                val university = University()
                university.name = universityName[position]
                university.description = universityDetail[position]
                university.photo = universityImage[position]
                list.add(university)
            }
            return list
        }
}