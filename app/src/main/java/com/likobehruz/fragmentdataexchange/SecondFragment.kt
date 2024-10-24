package com.likobehruz.fragmentdataexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.fragmentdataexchange.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondBinding.inflate(layoutInflater)

        binding.tvName.text= arguments?.getString("keyname")

        return binding.root
    }


    }
