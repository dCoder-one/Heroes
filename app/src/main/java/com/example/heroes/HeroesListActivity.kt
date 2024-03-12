package com.example.heroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.heroes.databinding.ActivityHeroesListBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class HeroesListActivity : AppCompatActivity() {

    companion object {
        val TAG = "HeroesListActivity"
    }
    private lateinit var binding: ActivityHeroesListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroesListBinding.inflate(layoutInflater)
        setContentView(binding.root) // make sure it says binding.root

        val inputStream = resources.openRawResource(R.raw.heroes)
        val jsonString = inputStream.bufferedReader().use {
            it.readText()
        }

        val gson = Gson()
        val qType = object : TypeToken<List<Hero>>() { }.type // TypeToken tells gson what to convert to json
        val heroes = gson.fromJson<List<Hero>>(jsonString, qType)

        Log.d(TAG, "loadHeroes: $heroes")

        // Link the adapter to the recyclerview and give it to the list
        val adapter = HeroAdapter(heroes)
        binding.recyclerViewHeroesListHeroes.adapter = adapter
        binding.recyclerViewHeroesListHeroes.layoutManager = LinearLayoutManager(this)
    }
}