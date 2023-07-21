package com.example.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {

    @Test
    public void test1() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testGetterSetter() {
        PersonJava personJava = new PersonJava("john");
        personJava.setAge(20);

        Assert.assertEquals(20, personJava.getAge());
        Assert.assertEquals("john", personJava.getName());

        Person person = new Person("john");
        person.setAge(20);

        Assert.assertEquals(20, person.getAge());
        Assert.assertEquals("john", person.getName());
    }

    @Test
    public void testSetNickname() {
        PersonJava personJava = new PersonJava("john");
        personJava.setNickname("Apple");

        Assert.assertEquals("apple", personJava.getNickname());

        Person person = new Person("john");
        person.setNickname("Apple");

        Assert.assertEquals("apple", person.getNickname());
    }

    @Test
    public void testSingletonJava() {
        // 생성자를 private로 감췄기 때문에 new로 생성 불가
        // SingletonJava singletonJava = new SingletonJava(); -> error

        SingletonJava singletonJava = SingletonJava.getInstance();

        singletonJava.log("hi singleton");
    }

    @Test
    public void testFuitEquals() {
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다";
        fruitJava2.description = "바나나는 길다";

        Assert.assertEquals(fruitJava1, fruitJava2);
    }

    @Test
    public void testFuitHashCode() {
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();

        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";

        fruitJava1.description = "바나나는 길다";
        fruitJava2.description = "바나나는 길다";

        Assert.assertEquals(fruitJava1.hashCode(), fruitJava2.hashCode());
    }

}