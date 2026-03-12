import org.example.task6AT.PasswordChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PasswordTests {


    @ParameterizedTest
    @MethodSource("pwdSources")
    void pwdTest(String pwd, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, PasswordChecker.isPWDOk(pwd));
    }
/**
 * Provides a stream of test cases for password validation.
 * Each test case consists of a password string and a boolean expected result.
 *
 * @return Stream of Arguments containing test cases for password validation
 */

    static Stream<Arguments> pwdSources() {
        return Stream.of(
                // Valid passwords
                Arguments.of("ValidPass1", true),
                Arguments.of("AnotherValid22", true),
                Arguments.of("Test1234", true),

                // Invalid passwords
                Arguments.of(null, false),
                Arguments.of("short1A", false),
                Arguments.of("nouppercase1", false),
                Arguments.of("NOLOWERCASE1", false),
                Arguments.of("NoDigitsHere", false)
        );
    }
}
