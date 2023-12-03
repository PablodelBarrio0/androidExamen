package com.mpd.pmdm.fragmentintro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mpd.pmdm.fragmentintro.databinding.FragmentCounterBinding

/**
 * A simple [Fragment] subclass.
 */
class CounterFragment : Fragment() {
    private var _binding: FragmentCounterBinding? = null

    //Declaro una propiedad y su getter. Será una versión no nula de la anterior
    //Para actualizar (set) usaremos _binding. Para leer (get), usaremos binding
    private val binding
        get() = _binding!!
    var counter = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCounterBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.plus.setOnClickListener {
            counter++
            binding.counterValue.text = counter.toString()
        }
        binding.minus.setOnClickListener {
            if (counter > 0) {
                counter--
                binding.counterValue.text = counter.toString()
            }
        }
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding=null
    }
}