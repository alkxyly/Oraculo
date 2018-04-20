package aktecnologia.br.com.oraculo.service

import aktecnologia.br.com.oraculo.model.Personagem
import android.content.Context

class PersonagemService{

    companion object {
        fun getPersonagens(context: Context): List<Personagem>{
            val personagens = mutableListOf<Personagem>()

            var p = Personagem()
            p.nome = "KELLY (Shimada Kiriko)"
            p.urlFoto = "https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_kelly.jpg?alt=media&token=f8a52f51-4def-4802-83e5-76d81100f8db"
            p.nascimento = "1 de Abril"
            p.idade="17 anos"
            p.custo = "??? moedas"
            p.habilidade = "Corrida (Aumentar a velocidade de corrida)"
            p.frase_preferica = "Ao atingir a meta, dobro a meta!"
            p.desc = "Durante o ensino médio, Kelly podia ser encontrada na pista de atletismo ou na academia, sempre treinando. Ela também é conhecida como como Shimada Kiriko. Treinava constantemente para manter o equilíbrio de corpo e mente, ela focava nos objetivos para sempre atingi-los, avançando sempre!"
            personagens.add(p)

            p = Personagem()
            p.nome = "OLIVIA"
            p.urlFoto="https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_olivia.jpg?alt=media&token=d74e1439-79b1-450a-a219-b16871e0a45f"
            p.nascimento = "11 de Outubro"
            p.idade="29 anos"
            p.custo = "??? moedas"
            p.habilidade = "Toque de Cura (Os jogadores revividos pela Olivia recebem HP extra)"
            p.frase_preferica = "Cuidar vai muito além da profissão, tem que amar!"
            p.desc = "Antes de entrar para as forças armadas da Organização Free Fire, Olivia era enfermeira. Cuidar de quem se gosta traz felicidade para ela, não importa quem seja, se amigo ou inimigo, ela sempre dá de tudo para ajudar seus pacientes. Assim como algumas entidades divinas, é comum dizer que o toque de Olivia faz a pessoa ganhar força inexplicável além de confiança na vida."
            personagens.add(p)

            p.nome = "ANDREW"
            p.urlFoto="https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_andrew.jpg?alt=media&token=6e3b33b8-65db-43ca-b827-762728355ffd"
            p.nascimento = "25 de Dezembro"
            p.idade="42 anos"
            p.custo = "??? moedas"
            p.habilidade = "Especialista de Armadura (Diminui a perda da durabilidade de colete)"
            p.frase_preferica = "Procurar a verdade por trás de tudo."
            p.desc = "Ex-policial, Andrew tem um forte desejo de justiça haja visto sua habilidade em perseguir a criminalidade. Devido à sua experiência com as forças policiais, ele se tornou um especialista em sobrevivência e combate armado. Sua camiseta era seu pé de coelho, já não lembrava mais o número de vezes que lutou com ela e sobreviveu para contar a história."
            personagens.add(p)

            p = Personagem()
            p.nome = "MISHA"
            p.urlFoto="https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_misha.jpg?alt=media&token=a3ea1feb-8e53-485a-b212-376b96c73891"
            p.nascimento = "26 de Julho"
            p.idade="19 anos"
            p.custo = "??? moedas"
            p.habilidade = "Condução (Aumenta a performance ao volante)"
            p.frase_preferica = "Não há estradas sinuosas, o caminho para a frente é sempre reto."
            p.desc = "A melhor pilota do Free Fire. Mulher de atitude e de ações, Misha é insanamente habilidosa no volante, especialidade que lhe rendeu o título de Rainha das Corridas pelos velocistas. Ela enfrenta os desafios cara-a-cara e gosta da fama que as competições lhe trazem."
            personagens.add(p)

            p = Personagem()
            p.nome = "NIKITA"
            p.urlFoto = "https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_nikita.jpg?alt=media&token=5539120d-3889-464a-9bd1-387a368e73af"
            p.nascimento = "11 de Novembro"
            p.idade="22 anos"
            p.custo = "??? moedas"
            p.habilidade = "Especialista em arma de fogo (Recarrega a submetralhadora mais rápido)"
            p.frase_preferica = "Se eu quero, eu me levanto e corro atrás!"
            p.desc = "Uma guarda-costas de celebridades, atualmente Nikita tem como principal atribuição cuidar de ninguém mais, ninguém menos que Carolyn, a filha do presidente da Organização Free Fire. Esta profissional cresceu desmontando e remontando armas, no colégio era atiradora de rifle, adquirindo habilidades para afiar os sentidos de modo a ganhar mais agilidade. Para alcançar suas metas, ela virou guarda-costas de Carolyn tendo acesso fácil a Free Fire."
            personagens.add(p)

            p = Personagem()
            p.nome = "FORD"
            p.urlFoto = "https://firebasestorage.googleapis.com/v0/b/oraculo-bd880.appspot.com/o/personagens_lista%2Fperson_list_ford.jpg?alt=media&token=a18eb2e8-3381-4aa3-965c-b72dc00fa30a"
            p.nascimento = "23 de Janeiro"
            p.idade="31 anos"
            p.custo = "??? moedas"
            p.habilidade = "Vontade de Ferro (Diminui o dano do gás quando está fora da zona de segurança)"
            p.frase_preferica = "Quem revela o segredo dos outros é um traidor, quem revela os próprios segredos é apenas um imbecil."
            p.desc = "Ford era homem comum da marinha. Ex-fuzileiro naval, Ford é um homem de segredos. A vida dura no mar aumentou a sua resistência e a sua vontade de sobreviver. Para ele um nome pode até ter importância, mas o que vale mesmo são seus motivos e suas ações. Ford é um homem muito duro. A única pessoa que pode vacilar sua determinação é provavelmente ela…"
            personagens.add(p)


            return personagens
        }
    }
}