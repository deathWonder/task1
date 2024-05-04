import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.programm.tasks.Task1;

import java.util.stream.Stream;


public class Task1Test {

    Task1 task1 = new Task1();

    @ParameterizedTest
    @MethodSource("sourceFizzBuzzTestInterview")
    public void testFizzBuzzTestInterview(String expected, int value) throws IllegalArgumentException{
        Assertions.assertEquals(expected, task1.getComputers(value));
    }

    public static Stream<Arguments> sourceFizzBuzzTestInterview(){
        return Stream.of(
                Arguments.of("11 компьютеров", 11),
                Arguments.of("1011 компьютеров", 1011),
                Arguments.of("21 компьютер", 21),
                Arguments.of("0 компьютеров", 0),
                Arguments.of("1 компьютер", 1),
                Arguments.of("1021 компьютер", 1021)
        );
    }
}
