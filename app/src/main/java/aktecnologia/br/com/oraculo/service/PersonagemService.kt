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

            p = Personagem()
            p.nome = "ANDREW"
            p.urlFoto="https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_andrew.jpg?alt=media&token=6e3b33b8-65db-43ca-b827-762728355ffd"
            personagens.add(p)

            p = Personagem()
            p.nome = "MISHA"
            p.urlFoto="https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_misha.jpg?alt=media&token=a3ea1feb-8e53-485a-b212-376b96c73891"
            personagens.add(p)

            p = Personagem()
            p.nome = "NIKITA"
            p.urlFoto = "https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_nikita.jpg?alt=media&token=5539120d-3889-464a-9bd1-387a368e73af"
            personagens.add(p)
            p = Personagem()

            p.nome = "FORD"
            p.urlFoto = "https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_ford.jpg?alt=media&token=a18eb2e8-3381-4aa3-965c-b72dc00fa30a"
            personagens.add(p)

            return personagens
        }
    }
}