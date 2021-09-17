package com.csc415.helloconstraint

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
	private var count: Int = 0
	private lateinit var showCount: TextView

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		showCount = findViewById(R.id.show_count)

		setColor(findViewById(R.id.button_count), if (count % 2 == 0) Color.YELLOW else Color.CYAN)
	}

	fun showToast(view: View)
	{
		Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
	}

	fun countUp(view: View)
	{
		showCount.text = (++count).toString()

		setColor(view, if (count % 2 == 0) Color.YELLOW else Color.CYAN)
		setColor(findViewById(R.id.button_zero), Color.GREEN)
	}

	fun zeroCount(view: View)
	{
		count = 0
		showCount.text = "0"

		setColor(view, Color.parseColor("#ffaaaaaa"))
		setColor(findViewById(R.id.button_count), Color.YELLOW)
	}

	private fun setColor(view: View, color: Int)
	{
		view.background.setTint(color)
	}
}