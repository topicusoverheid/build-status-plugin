package nl.topicus.overheid.build.status.impl;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import nl.topicus.overheid.build.status.api.BuildStatusPluginComponent;

import javax.inject.Named;

@ExportAsService({BuildStatusPluginComponent.class})
@Named
public class BuildStatusPluginComponentImpl implements BuildStatusPluginComponent {

    public String getName() {
        return "BuildStatusPluginComponent";
    }
}
