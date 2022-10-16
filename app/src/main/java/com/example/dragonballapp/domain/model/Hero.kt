package com.example.dragonballapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dragonballapp.util.Constant.DRAGONBALL_HERO_TABLE

@Entity(tableName = DRAGONBALL_HERO_TABLE)
data class Hero(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureType: List<String>
)