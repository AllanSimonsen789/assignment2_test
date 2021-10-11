package as.test.assignment2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestStringUtility {


    //TEST REVERSE STRING METHOD
    @Test
    public void reverseString_GivenString_abc_returnsStringReserved(){
        //Arrange
        String actualResult = "";
        String expectedResult = "cba";

        //Act
        actualResult = MyStringUtilityTool.reverseString("abc");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void reverseString_GivenString_jhahsd1234asdfsad_returnsStringReserved(){
        //Arrange
        String actualResult = "";
        String expectedResult = "dasfdsa4321dshahj";

        //Act
        actualResult = MyStringUtilityTool.reverseString("jhahsd1234asdfsad");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void reverseString_GivenEmptyString_returnsEmptyString(){
        //Arrange
        String actualResult = "";
        String expectedResult = "";

        //Act
        actualResult = MyStringUtilityTool.reverseString("");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void reverseString_GivenString_123456789_returnsStringReserved(){
        //Arrange
        String actualResult = "";
        String expectedResult = "987654321";

        //Act
        actualResult = MyStringUtilityTool.reverseString("123456789");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void reverseString_GivenStringWithSymbols_returnsStringReserved(){
        //Arrange
        String actualResult = "";
        String expectedResult = "£@{{[[€]£@]}|£@}}=)(/&%¤#!";

        //Act
        actualResult = MyStringUtilityTool.reverseString("!#¤%&/()=}}@£|}]@£]€[[{{@£");

        //Assert
        assertEquals(expectedResult, actualResult);

    }


    //TEST CAPITALIZE LETTERS
    @Test
    public void capitalizeString_GivenStringWithLetters_returnsStringCapitalized(){
        //Arrange
        String actualResult = "";
        String expectedResult = "ABC";

        //Act
        actualResult = MyStringUtilityTool.capitalizeString("abc");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void capitalizeString_GivenStringWithSomeLettersAlreadyCapitalized_returnsStringCompletelyCapitalized(){
        //Arrange
        String actualResult = "";
        String expectedResult = "ABCASDCCAAD";

        //Act
        actualResult = MyStringUtilityTool.capitalizeString("abcAsDcCaAD");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void capitalizeString_GivenStringWithAllLettersAlreadyCapitalized_returnsStringCompletelyCapitalized(){
        //Arrange
        String actualResult = "";
        String expectedResult = "ADJCIKADIELDA";

        //Act
        actualResult = MyStringUtilityTool.capitalizeString("ADJCIKADIELDA");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void capitalizeString_GivenEmptyString_returnsEmptyString(){
        //Arrange
        String actualResult = "";
        String expectedResult = "";

        //Act
        actualResult = MyStringUtilityTool.capitalizeString("");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void capitalizeString_GivenStringWithNumbersAndLetters_returnsStringCompletelyCapitalized(){
        //Arrange
        String actualResult = "";
        String expectedResult = "ASDASD2342ASD23D2D31QDS2DA";

        //Act
        actualResult = MyStringUtilityTool.capitalizeString("asdasd2342asd23d2d31qds2da");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    //TEST LOWERCASE STRING
    @Test
    public void lowercaseString_GivenStringWithLetters_returnsStringCompletelyLowercase(){
        //Arrange
        String actualResult = "";
        String expectedResult = "abs";

        //Act
        actualResult = MyStringUtilityTool.lowercaseString("ABS");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void lowercaseString_GivenStringWithLettersAlreadyLowercase_returnsStringCompletelyLowercase(){
        //Arrange
        String actualResult = "";
        String expectedResult = "absasdasdcasdcasda";

        //Act
        actualResult = MyStringUtilityTool.lowercaseString("ABSasdASdcASDcasda");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void lowercaseString_GivenStringWithAllLettersAlreadyLowercase_returnsStringCompletelyLowercase(){
        //Arrange
        String actualResult = "";
        String expectedResult = "indsaiuisahdiu";

        //Act
        actualResult = MyStringUtilityTool.lowercaseString("indsaiuisahdiu");

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void lowercaseString_GivenEmptyString_ReturnEmptyString(){
        //Arrange
        String actualResult = "";
        String expectedResult = "";

        //Act
        actualResult = MyStringUtilityTool.lowercaseString("");

        //Assert
        assertEquals(expectedResult, actualResult);

    }


}


