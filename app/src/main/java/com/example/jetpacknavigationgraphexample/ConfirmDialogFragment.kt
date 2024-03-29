package com.example.jetpacknavigationgraphexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.jetpacknavigationgraphexample.databinding.FragmentConfirmDialogBinding
import com.example.jetpacknavigationgraphexample.databinding.FragmentSendCashBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ConfirmDialogFragment : BottomSheetDialogFragment(){
    private lateinit var binding : FragmentConfirmDialogBinding
    private val args : ConfirmDialogFragmentArgs by navArgs()

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return inflater.inflate(R.layout.fragment_confirm_dialog,container,false)
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfirmDialogBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receiverName = args.receiverName
        val amount = args.amount

        binding.tvMessage.text = "Do you want to send Rs$amount to $receiverName?"

        binding.btnYes.setOnClickListener {
            Toast.makeText(requireContext(), "$amount has been sent to $receiverName", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        binding.btnNo.setOnClickListener {
            dismiss()
        }
    }
}