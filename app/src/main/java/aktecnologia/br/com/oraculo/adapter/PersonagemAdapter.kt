package aktecnologia.br.com.oraculo.adapter

import aktecnologia.br.com.oraculo.R
import aktecnologia.br.com.oraculo.model.Personagem
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.personagens_adapter.view.*
import org.w3c.dom.Text

class PersonagemAdapter( val personagens: List<Personagem>,
                         val onClick: (Personagem) -> Unit): RecyclerView.Adapter<PersonagemAdapter.PersonagensViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonagensViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.personagens_adapter,parent,false)
        val holder = PersonagensViewHolder(view)
        return holder
    }

    override fun getItemCount() = personagens.size
    override fun onBindViewHolder(holder: PersonagensViewHolder, position: Int) {
       val context = holder.itemView.context

        val personagem = personagens[position]
        holder.tNome.text = personagem.nome
        holder.progress.visibility = View.VISIBLE

        Picasso.with(context).load(personagem.urlFoto).fit().into(holder.img,
                object : com.squareup.picasso.Callback{
                    override fun onSuccess() {
                        holder.progress.visibility = View.GONE
                    }

                    override fun onError() {
                        holder.progress.visibility = View.GONE
                    }
                })
        holder.itemView.setOnClickListener{onClick(personagem)}
    }


    class PersonagensViewHolder(view: View): RecyclerView.ViewHolder(view){
        var tNome: TextView
        var img: ImageView
        var progress: ProgressBar
        var cardView: CardView
        init {
            tNome =  view.findViewById<TextView>(R.id.nomePersonagem)
            img = view.findViewById<ImageView>(R.id.fotoPersonagem)
            progress =  view.findViewById<ProgressBar>(R.id.progress)
            cardView = view.findViewById<CardView>(R.id.card_view)
        }

    }
}