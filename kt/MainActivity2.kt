package com.example.picGame

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {

    private val images = listOf(
        R.drawable.sword to "sword",
        R.drawable.mace to "mace",
        R.drawable.bow to "bow",
        R.drawable.dagger to "dagger",
        R.drawable.axe to "axe",
        R.drawable.cub to "cub",
        R.drawable.spear to "spear",
    )

    private lateinit var imageView: ImageView
    private lateinit var guessInput: EditText
    private lateinit var feedbackView: ImageView
    private lateinit var submitBtn: Button
    private lateinit var backBtn: Button
    private lateinit var scoreText: TextView
    private lateinit var roundText: TextView

    private var currentAnswer = ""
    private var score = 0
    private var round = 1

    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Bind UI elements
        scoreText = findViewById(R.id.scoreText)
        roundText = findViewById(R.id.roundText)
        imageView = findViewById(R.id.imageView)
        guessInput = findViewById(R.id.guessInput)
        feedbackView = findViewById(R.id.feedbackView)
        submitBtn = findViewById(R.id.submitBtn)
        backBtn = findViewById(R.id.backBtn)

        // Start the game
        loadRandomImage()

        submitBtn.setOnClickListener { checkGuess() }
        backBtn.setOnClickListener { finish() }
    }

    private fun loadRandomImage() {
        val (resId, name) = images[Random.nextInt(images.size)]
        imageView.setImageResource(resId)
        currentAnswer = name
        guessInput.text.clear()

        // Clear feedback image
        feedbackView.setImageDrawable(null)

        // Update score & round display
        scoreText.text = "Score: $score"
        roundText.text = "Round: $round"
    }

    private fun checkGuess() {
        val userGuess = guessInput.text.toString().trim().lowercase()

        if (userGuess.isEmpty()) {
            Toast.makeText(this, "Please enter a guess!", Toast.LENGTH_SHORT).show()
            return
        }

        if (userGuess == currentAnswer) {
            feedbackView.setImageResource(R.drawable.correct)
            score++
        } else {
            feedbackView.setImageResource(R.drawable.wrong)
        }

        // Increase round count
        round++

        // Delay before showing next image
        handler.postDelayed({
            loadRandomImage()
        }, 1200)
    }
}
