package br.com.formatura.chamapolicia

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUp.setOnClickListener {
            signUp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            signUp.setTextColor(resources.getColor(R.color.textColor, null))
            logIn.background = null
            signUpLayout.visibility = View.VISIBLE
            loginLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.colorPrimary, null))
        }
        logIn.setOnClickListener {
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.colorPrimary, null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks, null)
            signUpLayout.visibility = View.GONE
            loginLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.textColor, null))
        }
        btnSignIn.setOnClickListener {
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
        }
    }
}