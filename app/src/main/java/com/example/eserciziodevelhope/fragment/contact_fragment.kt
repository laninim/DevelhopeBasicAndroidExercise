package com.example.eserciziodevelhope.fragment

import android.os.Bundle
import android.provider.ContactsContract.Data
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eserciziodevelhope.R
import com.example.eserciziodevelhope.adapter.ContactListAdapter
import com.example.eserciziodevelhope.dataset.DataSource
import com.example.eserciziodevelhope.model.Contacts


class contact_fragment : Fragment() {

    private lateinit var contactListView : RecyclerView
    private lateinit var currentDataset : List<Contacts>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_contact_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        contactListView = view.findViewById(R.id.contactlistview) as RecyclerView
        currentDataset = DataSource.loadData()

        Log.d("DATASET" , "Current dataset :  ${currentDataset}")

        val adapter = ContactListAdapter(currentDataset)

        contactListView.adapter = adapter
        contactListView.layoutManager = LinearLayoutManager(view.context)


    }


}