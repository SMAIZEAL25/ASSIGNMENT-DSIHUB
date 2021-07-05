package com.oghenovo.fotbolprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf(
            Football(
                R.drawable.ic_bale,
                "Bale",
                "Branko"
            ),
            Football(
                R.drawable.ic_balle,
                "Balle",
                "Chalie"
            ),
            Football(
                R.drawable.ic_benzima,
                "Benzima",
                "Drivar"
            ),
            Football(
                R.drawable.ic_bravo,
                "Bravo",
                "Shellile"
            ),
            Football(
                R.drawable.ic_degia,
                "Degia",
                "Pallemo"
            ),
            Football(
                R.drawable.ic_dennis,
                "Dennis",
                "Dennilson"
            ),
            Football(
                R.drawable.ic_kain,
                "Kain",
                "Cain"
            ),
            Football(
                R.drawable.ic_messi,
                "Messi",
                "Lennon"
            ),
            Football(
                R.drawable.ic_oscar,
                "Oscar",
                "Olivera"
            ),
            Football(
                R.drawable.ic_pepe,
                "Pepe",
                "Canavero"
            ),
            Football(
                R.drawable.ic_ramos,
                "Ramos",
                "Segio"
            ),
            Football(
                R.drawable.ic_ronaldo,
                "Ronaldo",
                "Christiano"
            ),
            Football(
                R.drawable.ic_rooney,
                "Rooney",
                "Wayne"
            ),
            Football(
                R.drawable.ic_silva,
                "Silva",
                "Anderson"
            ),
            Football(
                R.drawable.ic_skipo,
                "Skipo",
                "Alantara"
            ),
            Football(
                R.drawable.ic_sterlin,
                "Sterlin",
                "Rackem"
            ),
            Football(
                R.drawable.ic_stoic,
                "Stoic",
                "Curve"
            ),
            Football(
                R.drawable.ic_marvel,
                "Marvel",
                "Socarry"
            ),
            Football(
                R.drawable.ic_bowler,
                "Bowler",
                "Raman"
            ),
            Football(
                R.drawable.ic_oghenovo,
                "Oghenovo",
                "Egbegbedia"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = FootballAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
