package com.example.eserciziodevelhope.dataset

import com.example.eserciziodevelhope.R
import com.example.eserciziodevelhope.model.Contacts

class DataSource  {

    companion object {

        private val contactList = mutableListOf<Contacts>(
            Contacts(R.drawable.kilye, "Kilye Jenner", "+393248932344"),
            Contacts(R.drawable.mark, "Mark Zuckemberg", "+393382283332"),
            Contacts(R.drawable.elon, "Elon Musk", "+393272393890")
        )

        fun loadData(): List<Contacts> {
            return contactList
        }

    }

}