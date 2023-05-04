package com.example.bottomnavigationbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.bottomnavigationbar.R
import com.example.bottomnavigationbar.databinding.FragmentNotificationBinding


class NotificationFragment :Fragment() {
    private lateinit var binding: FragmentNotificationBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_notification, container, false)

        return binding.root
    }
}