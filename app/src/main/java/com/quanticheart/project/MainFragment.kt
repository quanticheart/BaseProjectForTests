package com.quanticheart.project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.quanticheart.project.databinding.MainActivityBinding

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = MainActivityBinding.inflate(layoutInflater)
        binding.txt.text = getString(R.string.label_load)
        binding.include.btn.setOnClickListener { }
        binding.include.btn2.setOnClickListener { }
        return binding.root
    }
}