package com.example.a5_monthlesson1.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a5_monthlesson1.Presenter.CounterPresenter
import com.example.a5_monthlesson1.R
import com.example.a5_monthlesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),MainActivityView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = CounterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        onClick()

    }

    override fun updateCounterView(model: Int) {
        binding.tvCounter.text = model.toString()
    }

    override fun showToast(model: Int) {
        binding.tvCounter.text = model.toString()
        Toast.makeText(this,"hello", Toast.LENGTH_LONG).show()
    }

    private fun onClick(){
        binding.btnIncrement.setOnClickListener {
            presenter.increment()
        }
        binding.btnDecrement.setOnClickListener {
            presenter.decrement()
        }

    }
}