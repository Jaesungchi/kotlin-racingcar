package racingCar.controller

import racingCar.constants.Message
import racingCar.model.Car
import racingCar.model.RaceResult

/**
 * 레이싱을 시작하고, 계산하는 클래스
 * Created by Jaesungchi on 2022.05.07..
 */
class RacingController {
    private lateinit var carLists: List<Car>
    private val _raceResults: MutableList<RaceResult> = mutableListOf()
    val raceResults: List<RaceResult>
        get() = _raceResults

    fun startGame(numberOfCars: Int, numberOfRaces: Int) {
        if (!checkValidNumber(numberOfCars) || !checkValidNumber(numberOfRaces)) return
        carLists = List(3) { Car() }
        repeat(numberOfRaces) {
            processGame()
            _raceResults.add(RaceResult(carLists))
        }
    }

    private fun checkValidNumber(number: Int): Boolean {
        if (number < CAN_VALID_NUMBER) {
            throw IllegalArgumentException(Message.ExceptionMessage.ENTERED_INVALID_NUMBER)
        }
        return true
    }

    private fun processGame() {
        carLists.forEach { car ->
            if (checkCanRunScore(rollTheDice())) {
                car.advanceOnce()
            }
        }
    }

    private fun rollTheDice(): Int {
        return (MINIMUM_SCORE..MAXIMUM_SCORE).random()
    }

    private fun checkCanRunScore(score: Int): Boolean {
        return score >= SCORE_OF_CAN_GO
    }

    companion object {
        private const val MINIMUM_SCORE = 0
        private const val MAXIMUM_SCORE = 9
        private const val SCORE_OF_CAN_GO = 4
        private const val CAN_VALID_NUMBER = 1
    }
}
