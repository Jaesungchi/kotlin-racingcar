package study

import io.kotest.core.spec.style.StringSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.shouldBe

class PersonKoTest : StringSpec({
    "이름 붙인 인자" {
        val people = listOf(
            Person("최재성", 28, "링크"),
            Person("최재성", age = 28, nickname = "링크"),
            Person(name = "최재성", age = 28, nickname = "링크"),
        )
        people.forAll {
            it.name shouldBe "최재성"
            it.age shouldBe 28
            it.nickname shouldBe "링크"
        }
    }

    "널 타입" {
        val person = Person("최재성", 28, null)
        person.name shouldBe "최재성"
        person.age shouldBe 28
        person.nickname shouldBe null
    }

    "기본 인자" {
        val person = Person("최재성", 28)
        person.name shouldBe "최재성"
        person.age shouldBe 28
        person.nickname shouldBe "최재성"
    }

    "데이터 클래스" {
        val person1 = Person("최재성", 28)
        val person2 = Person("최재성", 28)
        person1 shouldBe person2
    }
})