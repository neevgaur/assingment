package com.example.assingment.merchant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assingment.R
import com.example.assingment.databinding.FragmentBusinessBinding
import com.example.assingment.databinding.FragmentMerchantBinding
import com.example.assingment.personal.adapter
import com.example.assingment.personal.personalData

class MerchantFragment : Fragment() {

    private lateinit var binding: FragmentMerchantBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentMerchantBinding.inflate(inflater,container,false)

        val person = listOf(
            merchantData(R.drawable.profile, "24Seven","Noida, within 250-350 m", "Hi community! We have great deals for you. Check us out!! ", "Convenience Store"),
            merchantData(R.drawable.profil, "Battulal Jewellers","Noida, within 500-600 m", "Hi community! We have great deals for you. Check us out!!", "Jewelry Store"),
            merchantData(R.drawable.profi, "Noida Bakery","Noida, within 100-300 m", "Hi community! We have great deals for you. Check us out!!", "Bakery and cake shop"),
            merchantData(R.drawable.prof, "Pallavi Beauty Parlour","Noida, within 400-500 m", "Hi community! We have great deals for you. Check us out!!", "Beauty  Parlour"),
            merchantData(R.drawable.pro, "24 On Fresh","Noida, within 0-100 m", "Hi community! We have great deals for you. Check us out!!", ""),
            merchantData(R.drawable.profi, "Noida Visa Services","Noida, within 250-300 m", "Hi community! We have great deals for you. Check us out!!", "Visa Agent"),
            merchantData(R.drawable.pro, "Azhar Cafe Corner","Noida, within 200-300 m", "Hi community! We have great deals for you. Check us out!!", "Indian Restaurant"),
        )


        val adapter = merchantAdapter(person)
        val recyclerView: RecyclerView = binding.rec
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.adapter = adapter
        return binding.root
    }
}