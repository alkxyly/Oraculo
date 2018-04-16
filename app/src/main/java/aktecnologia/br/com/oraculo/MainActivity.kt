package aktecnologia.br.com.oraculo

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.personagens -> {
                message.setText(R.string.personagens)
                return@OnNavigationItemSelectedListener true
            }
            R.id.armas -> {
                message.setText(R.string.armas)
                return@OnNavigationItemSelectedListener true
            }
            R.id.dicas -> {
                message.setText(R.string.dicas)
                return@OnNavigationItemSelectedListener true
            }
            R.id.acessorios -> {
                message.setText(R.string.acessorios)
                return@OnNavigationItemSelectedListener true
            }
            R.id.veiculos -> {
                message.setText(R.string.veiculos)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
