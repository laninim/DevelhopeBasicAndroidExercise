package com.example.eserciziodevelhope.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eserciziodevelhope.R
import com.example.eserciziodevelhope.databinding.FragmentMainBinding


class MainFragment : Fragment() {



    private lateinit var _binding : FragmentMainBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        setListener()
    }





    private fun setListener(){
        val viewList = listOf<View>(binding.button1,binding.button2,binding.button3)
        for(item in viewList){
            item.setOnClickListener{
                buttonReaction(it)
            }
        }
    }



    private fun buttonReaction(it : View){
        binding.schermo.visibility = View.VISIBLE
        when(it.id){
            R.id.button1 -> binding.schermo.text = getString(R.string.button_text1)
            R.id.button2 -> binding.schermo.text = getString(R.string.button_text2)
            R.id.button3 -> binding.schermo.text = getString(R.string.button_text3)
        }
    }

}