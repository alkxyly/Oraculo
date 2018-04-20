package aktecnologia.br.com.oraculo.fragment


import aktecnologia.br.com.oraculo.PersonagemDetalheActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import aktecnologia.br.com.oraculo.R
import aktecnologia.br.com.oraculo.adapter.PersonagemAdapter
import aktecnologia.br.com.oraculo.model.Personagem
import aktecnologia.br.com.oraculo.service.PersonagemService
import android.content.Intent
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import org.jetbrains.anko.startActivity

class PersonagensFragment : Fragment() {
    private var personagens = listOf<Personagem>()
    var recyclerView : RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_personagens, container, false)
    }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view?.findViewById<RecyclerView>(R.id.recycleView)
        recyclerView?.layoutManager = LinearLayoutManager(activity)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.setHasFixedSize(true)

    }

     override fun onResume() {
        super.onResume()
        taskPersonagens()
    }

    fun taskPersonagens(){
        this.personagens = PersonagemService.getPersonagens(this!!.context!!)
        recyclerView?.adapter = PersonagemAdapter(personagens,{
            personagem: Personagem -> onClickPersonagem(personagem)
        })
    }
    fun onClickPersonagem(personagem: Personagem){
      activity!!.startActivity<PersonagemDetalheActivity>("personagem" to personagem)
    }
    companion object {
        fun newInstance() : PersonagensFragment = PersonagensFragment()
    }

}
