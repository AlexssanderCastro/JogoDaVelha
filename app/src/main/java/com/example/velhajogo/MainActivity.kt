package com.example.velhajogo

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var buttons: Array<Button>
    private lateinit var tvStatus: TextView
    private lateinit var tvScore: TextView

    private var currentPlayer = "X"
    private var board = Array(9) { "" }
    private var gameActive = true

    // placar
    private var scoreX = 0
    private var scoreO = 0
    private var draws = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        tvStatus = findViewById(R.id.tvStatus)
        tvScore = findViewById(R.id.tvScore)

        buttons = arrayOf(
            findViewById(R.id.b0),
            findViewById(R.id.b1),
            findViewById(R.id.b2),
            findViewById(R.id.b3),
            findViewById(R.id.b4),
            findViewById(R.id.b5),
            findViewById(R.id.b6),
            findViewById(R.id.b7),
            findViewById(R.id.b8)
        )

        buttons.forEachIndexed { index, button ->
            button.setOnClickListener { playMove(index) }
        }

        findViewById<Button>(R.id.btnReset).setOnClickListener {
            resetGame()
        }


    }

    private fun playMove(index: Int) {
        if (board[index] != "" || !gameActive) return

        board[index] = currentPlayer
        buttons[index].text = currentPlayer

        // cor
        if (currentPlayer == "X") {
            buttons[index].setTextColor(Color.MAGENTA)
        } else {
            buttons[index].setTextColor(Color.RED)
        }

        val winner = checkWinner()

        if (winner != null) {
            tvStatus.text = "Jogador $winner venceu!"
            gameActive = false

            if (winner == "X") scoreX++ else scoreO++
            updateScore()
            return
        }

        if (!board.contains("")) {
            tvStatus.text = "Deu Velha!"
            draws++
            updateScore()
            gameActive = false
            return
        }

        currentPlayer = if (currentPlayer == "X") "O" else "X"
        tvStatus.text = "Vez do jogador $currentPlayer"
    }

    private fun checkWinner(): String? {
        val winPositions = arrayOf(
            intArrayOf(0,1,2),
            intArrayOf(3,4,5),
            intArrayOf(6,7,8),
            intArrayOf(0,3,6),
            intArrayOf(1,4,7),
            intArrayOf(2,5,8),
            intArrayOf(0,4,8),
            intArrayOf(2,4,6)
        )

        for (pos in winPositions) {
            val (a,b,c) = pos
            if (board[a] != "" &&
                board[a] == board[b] &&
                board[b] == board[c]) {

                highlightWinner(a,b,c)
                return board[a]
            }
        }
        return null
    }

    private fun highlightWinner(a:Int,b:Int,c:Int){
        buttons[a].setBackgroundResource(R.drawable.winner_cell)
        buttons[b].setBackgroundResource(R.drawable.winner_cell)
        buttons[c].setBackgroundResource(R.drawable.winner_cell)
    }

    private fun updateScore() {
        tvScore.text = "X: $scoreX | O: $scoreO | Velhas: $draws"
    }

    private fun resetGame() {
        board = Array(9) { "" }
        currentPlayer = "X"
        gameActive = true

        tvStatus.text = "Vez do jogador X"

        buttons.forEach {
            it.text = ""
            it.setBackgroundResource(R.drawable.cell_background)        }
    }
}