package com.example.bottomnavigationbar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.bottomnavigationbar.R
import com.example.bottomnavigationbar.databinding.FragmentTermsAndPrivacyBinding


class TermsAndPrivacy :Fragment() {
    private lateinit var binding: FragmentTermsAndPrivacyBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_terms_and_privacy, container, false)

        return binding.root
    }
}