package com.asanagaev.composition.domain.repository

import com.asanagaev.composition.domain.entity.GameSettings
import com.asanagaev.composition.domain.entity.Level
import com.asanagaev.composition.domain.entity.Question
import com.asanagaev.composition.domain.usecases.GenerateQuestionUseCase

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}