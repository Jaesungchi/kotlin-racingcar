package racingcar

import racingcar.controller.RacingController
import racingcar.view.InputView
import racingcar.view.ResultView

fun main() {
    val carNames = InputView.getCarNames()
    val numberOfRaces = InputView.getNumberOfRaces()

    val racingController = RacingController()
    racingController.startGame(carNames = carNames, numberOfRaces = numberOfRaces)

    ResultView.printResult(racingController.raceResults)
}