package tech.inversa.ejemplolistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.ListView
import android.widget.Toast

class GridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        val frutas = ArrayList<Fruta>()

        frutas.add(Fruta("Manzana", R.drawable.manzana))
        frutas.add(Fruta("Plátano", R.drawable.platano))
        frutas.add(Fruta("Sandía", R.drawable.sandia))
        frutas.add(Fruta("Durazno", R.drawable.durazno))

        val laLista = findViewById<GridView>(R.id.gvLista)

        // val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        val adaptador = AdaptadorCustom(this, frutas)

        laLista.adapter = adaptador

        laLista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_SHORT).show()
        }
    }
}
