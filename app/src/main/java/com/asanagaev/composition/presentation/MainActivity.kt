package com.asanagaev.composition.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.asanagaev.composition.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Включаем режим "от края до края" (Edge-to-Edge)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Скрываем системные панели (статус-бар и навигацию)
        hideSystemBars()
    }

    private fun hideSystemBars() {
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)

        // Настраиваем поведение: свайп должен временно показывать панели
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        // Скрываем и статус-бар (верх), и панель навигации (низ)
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }

    // Опционально: возвращаем панели при потере фокуса, чтобы не мешали
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemBars()
        }
    }
}