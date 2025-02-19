package baez.francisco.popcornfactoryv2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var adapter: PeliculaAdapter? = null
    var peliculas = ArrayList<Pelicula>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var gridView: GridView = findViewById(R.id.gridView) as GridView

        cargarPeliculas()
        adapter = PeliculaAdapter(this, peliculas)
        gridView.adapter = adapter

    }

    fun cargarPeliculas() {
        peliculas.add(Pelicula( titulo= "Bones", R.drawable.bones, R.drawable.bonesheader, sinopsis= "Dr. Temperance Brennan is a brilliant, but lonely, anthropologist whom is approached by an ambitious FBI agent, named Seely Booth, to help the bureau solve a series of unsolved crimes by identifying the long-dead bodies of missing persons by their bone structure. But both Agent Booth" ))
        peliculas.add(Pelicula( titulo= "Dr. House", R.drawable.drhouse, R.drawable.househeader, sinopsis= "The series follows the life of anti-social, pain killer addict, witty and arrogant medical doctor Gregory House (Hugh Laurie) with only half a muscle in his right leg. He and his team of medical doctors try to cure complex and rare diseases from very ill ordinary people in the United States of America."))
        peliculas.add(Pelicula( titulo= "Big Hero 6", R.drawable.bighero6, R.drawable.headerbighero6, sinopsis= "When a devastating event befalls the city of San Fransokyo and catapults Hiro into the midst of danger, he turns to Baymax and his close friends adrenaline junkie Go Go Tomago, neatnik Wasabi, chemistry whiz Honey Lemon and fanboy Fred. Determined to uncover the mystery, Hiro transforms his friends into a band of high-tech heroes called 'Big Hero'"))
        peliculas.add(Pelicula( titulo= "Dr. Who", R.drawable.drwho, R.drawable.drwhoheader, sinopsis= "Traveling across time and space, the immortal time-lord known as &#39;The Doctor&#39; travels across the universe with his many companions and his loyal shape-shifting space-ship: The TARDIS. The Doctor faces many threats across many generations: from The Daleks, The Cybermen and his time- lord adversary The Master to the sinister Davros, creator of The Daleks."))
        peliculas.add(Pelicula( titulo= "Friends", R.drawable.friends, R.drawable.friendsheader, sinopsis= "Rachel Green, Ross Geller, Monica Geller, Joey Tribbiani, Chandler Bing and Phoebe Buffay are six 20 something year-olds, living off of one another in the heart of New York City. Over the course of ten years, this average group of buddies goes through massive mayhem, family trouble, past and future romances, fights, laughs, tears and surprises as they learn what it really means to be a friend."))
        peliculas.add(Pelicula( titulo= "Inception", R.drawable.inception, R.drawable.inceptionheader, sinopsis= "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobbs rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming."))
        peliculas.add(Pelicula( titulo= "Leap Year", R.drawable.leapyear, R.drawable.leapyearheader, sinopsis= "A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish tradition which occurs every time the date February 29 rolls around, faces a major setback when bad weather threatens to derail her planned trip to Dublin. With the help of an innkeeper, however, her cross-country odyssey just might result in her getting engaged."))
        peliculas.add(Pelicula( titulo= "Toy Story", R.drawable.toystory, R.drawable.toystoryheader, sinopsis= ""))
        peliculas.add(Pelicula( titulo= "Smallville", R.drawable.smallville, R.drawable.smallvilleheader, sinopsis= ""))
    }


}

class PeliculaAdapter: BaseAdapter {

    var peliculas = ArrayList<Pelicula>()
    var context: Context? = null

    constructor(context: Context, peliculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }
}