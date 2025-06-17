import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {

    @Test
    void testEquilateral() {
        assertEquals("tam giác đều", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    void testIsosceles() {
        assertEquals("tam giác cân", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    void testScalene() {
        assertEquals("tam giác thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    void testNotTriangle1() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(8, 2, 3));
    }

    @Test
    void testNotTriangle2() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    void testNotTriangle3() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(0, 1, 1));
    }
}
