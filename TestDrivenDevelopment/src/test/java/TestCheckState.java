import com.sadman.TDD.Checker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheckState {
    private final Checker checker = new Checker();
    @Test
    public void testCheckState() {
        assertEquals("Children",checker.checkState(1));
        assertEquals("Children",checker.checkState(9));
    }
}
