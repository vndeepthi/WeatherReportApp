import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;

public class HelloTest {

    @Test
    public void testHello(){
        assert ("hello".equalsIgnoreCase("HELLO"));
        assertThat("hello", Matchers.is("HELLO"));
    }

}
