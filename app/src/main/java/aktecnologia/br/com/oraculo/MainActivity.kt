package aktecnologia.br.com.oraculo

import aktecnologia.br.com.oraculo.extensions.setupToolbar
import aktecnologia.br.com.oraculo.fragment.*
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.toolbar.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation.selectedItemId = R.id.dicas

        setupToolbar(R.id.toolbar,"Dicas")
    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId) {
            R.id.personagens -> {
                toolbar.title = "Personagens"
                val personagensFragment = PersonagensFragment.newInstance()
                openFragment(personagensFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.armas -> {
                toolbar.title = "Armas"
                val armasFragment = ArmasFragment.newInstance()
                openFragment(armasFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.dicas -> {
                toolbar.title = "Dicas"
                val dicasFragment = DicasFragment.newInstance()
                openFragment(dicasFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.outros -> {
                toolbar.title = "Outros"
                val outrosFragment = OutrosFragment.newInstance()
                openFragment(outrosFragment)
              //  message.setText(R.string.outros)
                return@OnNavigationItemSelectedListener true
            }
            R.id.veiculos -> {
                toolbar.title = "Veículos"
                val veiculosFragment  = VeiculosFragment.newInstance()
                openFragment(veiculosFragment)
            //    message.setText(R.string.veiculos)
                return@OnNavigationItemSelectedListener true
            }

        }
          false
    }
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.content_frame, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
