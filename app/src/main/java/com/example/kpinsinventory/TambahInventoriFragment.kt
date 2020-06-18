package com.example.kpinsinventory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

class TambahInventoriFragment : Fragment() {

    companion object {
        fun newInstance() = TambahInventoriFragment()
    }

    private lateinit var viewModel: TambahInventoriViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tambah_inventori_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TambahInventoriViewModel::class.java)
        // TODO: Use the ViewModel
    }

}