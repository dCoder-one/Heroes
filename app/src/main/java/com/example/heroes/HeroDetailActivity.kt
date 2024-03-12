package com.example.heroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.heroes.databinding.ActivityHeroDetailBinding

class HeroDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHeroDetailBinding

    companion object {
        val EXTRA_NAME = "name"
        val EXTRA_DESCRIPTION = "description"
        val EXTRA_SUPERPOWER = "superpower"
        val EXTRA_RANKING = "ranking"
        val EXTRA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewHeroDetailName.setText(intent.getStringExtra(EXTRA_NAME))
        binding.textViewHeroDetailDescription.setText(intent.getStringExtra(EXTRA_DESCRIPTION))
        binding.textViewHeroDetailSuperpower.setText(intent.getStringExtra(EXTRA_SUPERPOWER))
        binding.textViewHeroDetailRanking.setText(intent.getStringExtra(EXTRA_RANKING))
//        binding.imageViewHeroDetailImage
    }
}