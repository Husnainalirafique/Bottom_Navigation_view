package com.example.bottomnavigationbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bottomnavigationbar.R
import com.example.bottomnavigationbar.databinding.FragmentProfileBinding


class ProfileFragment :Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)

        return binding.root
    }
    companion object{

    }
}