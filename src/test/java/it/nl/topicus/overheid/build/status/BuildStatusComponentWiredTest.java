package it.nl.topicus.overheid.build.status;

import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import nl.topicus.overheid.build.status.api.BuildStatusPluginComponent;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class BuildStatusComponentWiredTest {
    private final BuildStatusPluginComponent buildStatusPluginComponent;

    public BuildStatusComponentWiredTest(BuildStatusPluginComponent buildStatusPluginComponent) {
        this.buildStatusPluginComponent = buildStatusPluginComponent;
    }

    @Test
    public void testMyName() {
        assertEquals("names do not match!", "BuildStatusPluginComponent", buildStatusPluginComponent.getName());
    }
}
