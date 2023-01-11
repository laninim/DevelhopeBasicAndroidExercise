package com.example.eserciziodevelhope.fragment

import android.os.Bundle
import android.provider.ContactsContract.Data
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eserciziodevelhope.R
import com.example.eserciziodevelhope.adapter.ContactListAdapter
import com.example.eserciziodevelhope.dataset.DataSource
import com.example.eserciziodevelhope.model.Contacts


class contact_fragment : Fragment() {

    private lateinit var contactListView : RecyclerView
    private lateinit var currentDataset : List<Contacts>
    private lateinit var search_bar : EditText
    private lateinit var searcButton : ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_contact_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        contactListView = view.findViewById(R.id.contactlistview) as RecyclerView
        currentDataset = DataSource.loadData()
        search_bar = view.findViewById(R.id.search_bar)
        searcButton = view.findViewById(R.id.searchbutton)

        Log.d("DATASET" , "Current dataset :  ${currentDataset}")

        val adapter = ContactListAdapter(currentDataset)

        contactListView.adapter = adapter
        contactListView.layoutManager = LinearLayoutManager(view.context)

        search_bar.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                   adapter.apply {
                       dataset = currentDataset.filter { it.contactName.contains(p0.toString()) }
                       notifyDataSetChanged()
                   }
            }

        })

        searcButton.setOnClickListener{
            search_bar.visibility = View.VISIBLE
        }
    }


}