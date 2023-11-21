package com.example.assingment.business

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assingment.R
import com.example.assingment.databinding.FragmentBusinessBinding
import com.example.assingment.personal.adapter

class businessFragment : Fragment() {

    private lateinit var binding: FragmentBusinessBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBusinessBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        val person = listOf(
            businessData(R.drawable.pro, "MEHUL YADAV","Mathura | Student", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            businessData(R.drawable.prof, "Nishit Parasher","Aligarh | Student", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            businessData(R.drawable.profi, "Devesh Kumar Singh","Aligarh | Electrical Engineer", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            businessData(R.drawable.profil, "Sana Fatima","Noida | Student", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            businessData(R.drawable.pro, "Ranjan Kumar Singh","Aligarh | Electrical Engineer", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            businessData(R.drawable.prof, "Aman Singh","Aligarh | Electrical Engineer", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            businessData(R.drawable.profile, "Anik Saxena","Rampur | Student", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
        )

        val adapter = businessadapter(person)
        val recyclerView: RecyclerView = binding.rec
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.adapter = adapter
        return binding.root
    }
}