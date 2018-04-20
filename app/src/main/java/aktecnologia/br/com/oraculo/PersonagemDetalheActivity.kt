package aktecnologia.br.com.oraculo

import aktecnologia.br.com.oraculo.extensions.setupToolbar
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_personagem_detalhe.*

class PersonagemDetalheActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personagem_detalhe)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        setupToolbar(R.id.toolbarDetalhe,"Personagem",true)
    }

}
