package racingCar.etc

/**
 * 출력만 되는 메세지들을 모아둔 Object class
 * Created by Jaesungchi on 2022.05.07..
 */
object Message {
    // 사용자에게 일반적으로 출력되는 메세지
    object PrintingMessage {
        const val HOW_MANY_CAR = "자동차 대수는 몇 대인가요?"
        const val HOW_MANY_TIMES_RACE = "시도할 횟수는 몇 회인가요?"
        const val EXECUTION_RESULT = "실행 결과"
    }

    // 사용자에게 보여지는 에러 메세지
    object ErrorMessage {
        const val NO_RACING_CARS = "레이싱카가 없습니다."
        const val ATTEMPTS_IS_ZERO = "시도할 횟수가 0회입니다."
    }

    // 예외 메세지
    object ExceptionMessage {
        const val IS_NULL_OR_BLANK = "입력된 숫자가 null이거나 비어있습니다."
        const val IS_NOT_INTEGER = "정수로 바꿀수 없는 숫자가 입력되었습니다."
    }
}
