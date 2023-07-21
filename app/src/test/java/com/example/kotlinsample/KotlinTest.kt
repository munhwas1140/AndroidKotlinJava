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
}