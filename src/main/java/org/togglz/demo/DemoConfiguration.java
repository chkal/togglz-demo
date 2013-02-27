package org.togglz.demo;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

@Component
public class DemoConfiguration implements TogglzConfig {

    public Class<? extends Feature> getFeatureClass() {
        return DemoFeatures.class;
    }

    public StateRepository getStateRepository() {
        return new InMemoryStateRepository();
    }

    public UserProvider getUserProvider() {
        return new UserProvider() {
            @Override
            public FeatureUser getCurrentUser() {
                return new SimpleFeatureUser("john", true);
            }
        };
    }

}