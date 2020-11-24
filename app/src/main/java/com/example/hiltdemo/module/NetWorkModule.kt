package com.example.hiltdemo.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class NetWorkModule {

    @Provides
    fun provideOkHttpClient():String{
        return String()
    }

}