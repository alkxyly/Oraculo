package aktecnologia.br.com.oraculo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_principal.*
import org.jetbrains.anko.toast

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        menu_personagens.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                toast("Clicou em personagens")
            }
        })
    }
}
