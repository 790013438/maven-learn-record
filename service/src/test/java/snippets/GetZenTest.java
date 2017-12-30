package snippets;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GetZenTest {

    @Test
    public void testGet() throws IOException {
        Assert.assertNotNull(GetZen.get());
    }
}
