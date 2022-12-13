package com.example.eserciziodevelhope.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.eserciziodevelhope.R
import org.w3c.dom.Text
import javax.microedition.khronos.egl.EGL10


class MainFragment : Fragment() {

    private lateinit var screenTextView: TextView
    private lateinit var button1 : Button
    private lateinit var button2 : Button
    private lateinit var button3 : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initComponents(view)
        setListener()
    }


    fun initComponents(view : View){
        screenTextView = view.findViewById<TextView>(R.id.schermo)
        button1 = view.findViewById<Button>(R.id.button1)
        button2 = view.findViewById<Button>(R.id.button2)
        button3 = view.findViewById<Button>(R.id.button3)
    }


    fun setListener(){
        val viewList = listOf<View>(button1,button2,button3)
        for(item in viewList){
            item.setOnClickListener{
                buttonReaction(it)
            }
        }
    }


    fun buttonReaction(it : View){
        screenTextView.visibility = View.VISIBLE
        when(it.id){
            R.id.button1 -> screenTextView.text = "Hai premuto il bottone 1"
            R.id.button2 -> screenTextView.text = "Hai premuto il bottone 2"
            R.id.button3 -> screenTextView.text = "Hai premuto il bottone 3"
        }
    }

}