package com.example.eserciziodevelhope.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eserciziodevelhope.R
import com.example.eserciziodevelhope.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private lateinit var _binding : FragmentSettingsBinding
    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingsBinding.inflate(inflater,container,false)
        return binding.root
    }


}