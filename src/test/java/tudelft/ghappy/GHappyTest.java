package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({ "xxggxx, true", "xxgxx, false", "xxggyygxx,false", "g,false","gg,true","\"\",true","xyzgggzyx,true","xyzgggxyg,false","xxgggxygg,true","mgm,false","mggm,true","yyygggxyy,true"})
    public void GHappyTestSet(String string, boolean expectedResult) {
        boolean result = new GHappy().gHappy(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
