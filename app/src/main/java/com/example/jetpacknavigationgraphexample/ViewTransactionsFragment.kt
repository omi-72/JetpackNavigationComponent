package com.example.jetpacknavigationgraphexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigationgraphexample.databinding.FragmentChooseReceiverBinding
import com.example.jetpacknavigationgraphexample.databinding.FragmentSendCashBinding
import com.example.jetpacknavigationgraphexample.databinding.FragmentViewTransactionsBinding

class ViewTransactionsFragment : Fragment(R.layout.fragment_view_transactions)
{
    private lateinit var binding : FragmentViewTransactionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewTransactionsBinding.inflate(inflater)
        return binding.root

    }

}