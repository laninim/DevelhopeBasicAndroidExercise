package com.example.eserciziodevelhope.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eserciziodevelhope.R
import com.example.eserciziodevelhope.model.Contacts

class ContactListAdapter (var dataset : List<Contacts>) : RecyclerView.Adapter<ContactListAdapter.ContactListViewHolder> () {

    class ContactListViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        val profileImage : ImageView
        val contactName : TextView
        val contactNumber : TextView


        init{
            profileImage = view.findViewById(R.id.profile_image)
            contactName = view.findViewById(R.id.contact_name)
            contactNumber = view.findViewById(R.id.contact_number)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item, parent, false)
        return ContactListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactListViewHolder, position: Int) {
        holder.contactName.text = dataset[position].contactName
        holder.contactNumber.text = dataset[position].contactNumber
        holder.profileImage.setImageResource(dataset[position].drawableId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}

