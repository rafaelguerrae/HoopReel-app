package com.guicarneirodev.hoopreel.feature.splash.di

import com.guicarneirodev.hoopreel.feature.splash.presentation.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    viewModel { SplashViewModel(get()) }
}