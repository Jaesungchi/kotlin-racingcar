package racingCar.view

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingCar.constants.Message
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

/**
 * input에 대한 테스트
 * Created by Jaesungchi on 2022.05.07..
 */
class InputViewTest {
    @Test
    fun `글자가 입력되었을 때 에러발생`() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException::class.java).isThrownBy {
            InputView.changeStringToInt("글자")
        }.withMessageMatching(Message.ExceptionMessage.IS_NOT_INTEGER)
    }

    @Test
    fun `null이 입력되었을 때 에러발생`() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException::class.java).isThrownBy {
            InputView.changeStringToInt(null)
        }.withMessageMatching(Message.ExceptionMessage.IS_NULL_OR_BLANK)
    }

    @Test
    fun `빈칸이 입력되었을 때 에러발생`() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException::class.java).isThrownBy {
            InputView.changeStringToInt(" ")
        }.withMessageMatching(Message.ExceptionMessage.IS_NULL_OR_BLANK)
    }
}
