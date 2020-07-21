import com.sadman.TDD.Checker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheckState {
    private final Checker checker = new Checker();

    @Test
    public void testCheckState() {
        assertEquals("Children",checker.checkState(1));
        assertEquals("Children",checker.checkState(9));
    }

    @Test
    void groupAssertions() {
        int[] ages = {0, 1, 2, 3, 4};
        assertAll("ages",
                () -> assertEquals(ages[0], 0),
                () -> assertEquals(ages[2], 2),
                () -> assertEquals(ages[4], 4)
        );
    }
}
