package com.asanagaev.composition.domain.usecases

import com.asanagaev.composition.domain.entity.GameSettings
import com.asanagaev.composition.domain.entity.Level
import com.asanagaev.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}