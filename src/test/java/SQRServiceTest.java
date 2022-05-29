import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/SQRTestData.scv")
    public void test(int rangeStart, int rangeEnd, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(rangeStart, rangeEnd);
        //expected = 3;
        Assertions.assertEquals(expected, actual);
    }


}
