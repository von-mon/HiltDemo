package com.example.hiltdemo

import com.example.hiltdemo.engine.Engine
import com.example.hiltdemo.module.BindElectricEngine
import com.example.hiltdemo.module.BindGasEngine
import javax.inject.Inject

class Truck @Inject constructor(val driver: Driver) {

    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    fun deliver(){
        gasEngine.start()
        electricEngine.start()
        println("Truck is delivering cargo. Driven by $driver")
        gasEngine.shutdown()
        electricEngine.shutdown()
    }
}