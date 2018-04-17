package aktecnologia.br.com.oraculo.extensions

import android.support.annotation.IdRes
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

fun AppCompatActivity.setupToolbar(@IdRes id: Int, title: String?=null,
                                   upNavidation: Boolean = false) : ActionBar{
    val toolbar = findViewById<Toolbar>(id)
    setSupportActionBar(toolbar)
    supportActionBar?.title = title
    supportActionBar?.setDisplayHomeAsUpEnabled(upNavidation)
    return supportActionBar!!
}