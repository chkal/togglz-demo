package org.togglz.demo;

import java.io.File;

import javax.enterprise.context.ApplicationScoped;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

@ApplicationScoped
@Component
public class DemoConfiguration implements TogglzConfig {

    public Class<? extends Feature> getFeatureClass() {
        return DemoFeatures.class;
    }

    public StateRepository getStateRepository() {
        return new FileBasedStateRepository(new File("features.properties"));
    }

    public UserProvider getUserProvider() {
        return new ServletUserProvider("admin");
    }

}