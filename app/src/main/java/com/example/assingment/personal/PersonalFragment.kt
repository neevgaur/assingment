package com.example.assingment.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assingment.R
import com.example.assingment.databinding.FragmentPersonalBinding

class personalFragment : Fragment() {

    private lateinit var binding: FragmentPersonalBinding

    private lateinit var Data: personalData
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPersonalBinding.inflate(inflater, container, false)

        val person = listOf(
            personalData(R.drawable.pro, "MEHUL YADAV","Mathura | Student", "Within: 20.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            personalData(R.drawable.prof, "Nishit Parasher","Aligarh | Student", "Within: 40.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            personalData(R.drawable.profi, "Devesh Kumar Singh","Aligarh | Electrical Engineer", "Within: 40.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            personalData(R.drawable.profil, "Sana Fatima","Noida | Student", "Within: 113.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            personalData(R.drawable.pro, "Ranjan Kumar Singh","Aligarh | Electrical Engineer", "Within: 40.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            personalData(R.drawable.prof, "Aman Singh","Aligarh | Electrical Engineer", "Within: 40.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
            personalData(R.drawable.profile, "Anik Saxena","Rampur | Student", "Within: 13.2 Km", "Coffee | Business | Friendship", "Hi community! I am open to new connections. "),
        )


        val adapter = adapter(person)
        val recyclerView: RecyclerView = binding.rec
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.adapter = adapter
        return binding.root
    }
}