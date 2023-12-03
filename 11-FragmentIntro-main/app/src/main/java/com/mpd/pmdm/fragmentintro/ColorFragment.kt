package com.mpd.pmdm.fragmentintro

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.mpd.pmdm.fragmentintro.databinding.FragmentColorBinding
import com.mpd.pmdm.fragmentintro.databinding.FragmentCounterBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ColorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ColorFragment : Fragment() {
    private var _binding: FragmentColorBinding? = null

    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentColorBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val redButton = binding.redButton
        val greenButton = binding.greenButton
        val blueButton = binding.blueButton
        val helloWorldTextView = binding.helloWorld
        redButton.setOnClickListener {
            helloWorldTextView.setTextColor(Color.RED)
        }
        greenButton.setOnClickListener {
            helloWorldTextView.setTextColor(Color.GREEN)
        }
        blueButton.setOnClickListener {
            helloWorldTextView.setTextColor(Color.BLUE)
        }
    }
}