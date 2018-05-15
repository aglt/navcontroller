package cardgame.uxinn.`is`.cardgame.ui.main.fragments

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import cardgame.uxinn.`is`.cardgame.R
import cardgame.uxinn.`is`.cardgame.ui.main.viewmodels.MainViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var viewHolder: ViewHolder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        viewHolder = ViewHolder(view)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.message = "Dare to play?"
        viewModel.buttonText = "Start new game"
        displayView(viewModel)
    }

    private fun displayView(m: MainViewModel) {
        viewHolder.message.text = m.message
        viewHolder.playGameButton.text = m.buttonText

//        viewHolder.playGameButton.setOnClickListener{ view ->
//            view.findNavController().navigate(R.id.viewTransactionsAction)
//        }
        viewHolder.playGameButton.setOnClickListener({ NavHostFragment.findNavController(this).navigate(R.id.nav_action_next) })

//        viewHolder.playGameButton.setOnClickListener { view ->
//            view.findNavController().navigate(R.id.go_to_step_one)
//        }
    }

    private fun startNewGame() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Start new game..")
        Toast.makeText(context, "Opna leik..", Toast.LENGTH_LONG).show()
    }

    private class ViewHolder (view: View) {
        val message: TextView = view.findViewById(R.id.text_view_message)
        val playGameButton: Button = view.findViewById(R.id.start_game_button)
    }
}
