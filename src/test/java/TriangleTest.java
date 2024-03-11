import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {
    @ParameterizedTest
    @CsvFileSource(resources = "testData.csv")
    public void testGetMaxSide(int side1, int side2, int side3, int expectedResultMax, double expectedResultSquare) {
        Triangle triangle = new Triangle(side1, side2, side3);
        int actual = triangle.getMaxSide();
        assertEquals(expectedResultMax, actual, "У треугольника со сторонами " + side1 + ", " + side2 + ", " + side3 + " максимальная сторона должна быть " + expectedResultMax + ", а получилось " + actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "testData.csv")
    public void testGetSquare(int side1, int side2, int side3, int expectedResultMax, double expectedResultSquare) {
        Triangle triangle = new Triangle(side1, side2, side3);
        double actual = triangle.getSquare();
        assertEquals(expectedResultSquare, actual, "У треугольника со сторонами " + side1 + ", " + side2 + ", " + side3 + " площадь должна равняться " + expectedResultSquare + ", а получилось " + actual);

    }

}