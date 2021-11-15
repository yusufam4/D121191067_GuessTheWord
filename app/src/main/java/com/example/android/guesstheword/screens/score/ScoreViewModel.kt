package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int, finalWord: String) : ViewModel() {
    //The final score
    var score = finalScore
    var word = finalWord
    init{
        Log.i("ScoreViewModel", "Final score is $finalScore, Final word is $finalWord")
    }
}