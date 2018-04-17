package aktecnologia.br.com.oraculo.service

import aktecnologia.br.com.oraculo.model.Personagem
import android.content.Context

class PersonagemService{

    companion object {
        fun getPersonagens(context: Context): List<Personagem>{
            val personagens = mutableListOf<Personagem>()

            var p = Personagem()
            p.nome = "KELLY"
            p.urlFoto = "https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_kelly.jpg?alt=media&token=f8a52f51-4def-4802-83e5-76d81100f8db"
            personagens.add(p)
            p = Personagem()
            p.nome = "OLIVIA"
            p.urlFoto="https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_olivia.jpg?alt=media&token=d74e1439-79b1-450a-a219-b16871e0a45f"
            personagens.add(p)
            return personagens
        }
    }
}