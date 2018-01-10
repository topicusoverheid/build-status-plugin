package ut.nl.topicus.overheid.build.status;

import nl.topicus.overheid.build.status.api.BuildStatusPluginComponent;
import nl.topicus.overheid.build.status.impl.BuildStatusPluginComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildStatusComponentUnitTest {
    @Test
    public void testMyName() {
        BuildStatusPluginComponent component = new BuildStatusPluginComponentImpl();
        assertEquals("names do not match!", "BuildStatusPluginComponent", component.getName());
    }
}
