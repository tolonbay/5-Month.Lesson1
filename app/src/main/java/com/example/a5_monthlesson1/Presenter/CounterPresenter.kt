package com.example.a5_monthlesson1.Presenter

import com.example.a5_monthlesson1.Model.CounterModel
import com.example.a5_monthlesson1.View.MainActivityView

class CounterPresenter {
    private val counterModel = CounterModel()
    private lateinit var view: MainActivityView
    private val counter = CounterModel()

    fun increment(){
        counterModel.increment()
        view.updateCounterView(counterModel.count)

    }

    fun showToast(){
         if (counterModel.count == 10) {

        }
    }

    fun decrement(){
        counterModel.decrement()
        view.updateCounterView(counterModel.count)

    }
    fun attachView(view: MainActivityView){
        this.view = view
    }

}