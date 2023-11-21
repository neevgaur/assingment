package com.example.assingment

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import com.example.assingment.databinding.ActivityRefineScreenBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class refineScreen : AppCompatActivity() {

    private lateinit var binding: ActivityRefineScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRefineScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.gioActionbar.btnRefine.visibility = View.INVISIBLE
        binding.gioActionbar.btnSideBar.visibility = View.INVISIBLE
        binding.gioActionbar.btnback.visibility = View.VISIBLE
        binding.gioActionbar.titleTv.text = "Refine"

        binding.gioActionbar.btnback.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        binding.btnOption.setOnClickListener {
            val popup = PopupMenu(this,binding.btnOption)
            popup.inflate(R.menu.menu)
            popup.setOnMenuItemClickListener {
                binding.tvOpt.text = it.title.toString()
                true
            }
            popup.show()
        }

        binding.btnSave.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        val chipGroup: ChipGroup = findViewById(R.id.chipGroup)

        val tags = listOf("Coffee", "Business", "Hobbies", "Friendship", "Movies", "Dinning", "Dating", "Matrimony")
        val textSizeInSp = 20f
        val checkedColor = getColor(R.color.lightBlue)

        for (tag in tags) {
            val chip = createTagChip(tag, textSizeInSp, checkedColor)
            chipGroup.addView(chip)
        }
    }

    private fun createTagChip(tag: String, textSize: Float, checkedColor: Int): Chip {
        val chip = Chip(this)
        chip.text = tag
        chip.textSize = textSize
        chip.isClickable = true
        chip.isCheckable = true
        chip.setOnCheckedChangeListener { buttonView, isChecked ->
            val colorStateList = ColorStateList.valueOf(checkedColor)
            chip.setChipBackgroundColor(colorStateList)
        }
        chip.setOnClickListener { onTagClicked(tag) }
        return chip
    }

    private fun onTagClicked(tag: String) {
         Toast.makeText(this, "Clicked on $tag", Toast.LENGTH_SHORT).show()
    }
}