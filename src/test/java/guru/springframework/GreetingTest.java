package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
    Greeting greeting;

    @BeforeAll
    static void beforeClass() {
        System.out.println("In Before All... - I am called only once!!!");
    }

    @BeforeEach
    void setup() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }
    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Benji"));
    }

    @AfterEach
    void tearDownEach() {
        System.out.println("In After Each...");
        greeting = null;
    }
    @AfterAll
    static void afterClass() {
        System.out.println("In After All... - I am called only once!!!");
    }
}