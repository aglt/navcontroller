package cardgame.uxinn.`is`.cardgame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cardgame.uxinn.`is`.cardgame.ui.main.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }
    }

}
