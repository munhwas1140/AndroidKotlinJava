package com.example.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1() {
        Assert.assertEquals(4, 2 + 2)
    }

    @Test
    fun testGetterSetter() {
        val person = Person("john")
        person.age = 20;

        Assert.assertEquals(20, person.age)
        Assert.assertEquals("john", person.name)
    }

    @Test
    fun tesSetNickname() {
        val person = Person("john")
        person.nickname = "Banana"

        Assert.assertEquals("banana", person.nickname)
    }

    @Test
    fun testUser() {
        val user = User()

        user.nickname = "death Note"

        Assert.assertEquals("DEATH NOTE", user.nickname)
    }

    @Test
    fun testUserLazy() {
        val user = User()

        println("not init")
        Assert.assertNotNull(user.httpText)
    }

    @Test
    fun testUserNameObservable() {
        val user = User()
        user.name = "john"
        user.name = "james"
    }

    @Test
    fun testAnimalByMap() {
        val animal = Animal(mutableMapOf(
            "name" to "cat",
            "age" to 20)
        )

        // 속성이 map 객체에 정상적으로 위임되었는지 확인
        Assert.assertEquals("cat", animal.name)
        Assert.assertEquals(20, animal.age)

        // 프로퍼티의 값을 변경한다.
        animal.age = 21
        animal.name = "dog"

        // map의 값들이 바꼈는지 확인
        Assert.assertEquals("dog", animal.map["name"])
        Assert.assertEquals(21, animal.map["age"])
    }

    @Test
    fun testFruit() {
        // 객체의 속성이 같도록 Fruit 객체 2개 생성
        var fruit1 = Fruit("바나나", "바나나 길어")
        var fruit2 = Fruit("바나나", "바나나 길어")

        println(fruit1)
        println(fruit2)

        Assert.assertEquals(fruit1, fruit2)

        Assert.assertEquals(fruit1.hashCode(), fruit2.hashCode())
    }

    @Test
    fun testLambda1() {
        // 함수의 파라미터로 람다식 전달
        println(sum(1, 2))
        // 람다식 반환값으로 비교
        Assert.assertEquals(4, sum(1, 3))

        // 함수에 람다 표현식을 바로 전달
        Assert.assertEquals(4,{x: Int, y: Int -> x * y}(2, 2))

        val exp = {x: Int, y: Int ->
            {z: Int -> (x + y) * z}
        }

        // exp2 --> {z: Int -> (3 + 2) * z)}
        // x, y 에 각각 3, 2를 대입하고 나온 exp2도 함수이다.
        val exp2 = exp(3, 2)
        // result --> (3 + 2) * 4
        val result = exp2(4)
        //결과 확인

        Assert.assertEquals(20, result)
    }
}