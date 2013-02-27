package org.togglz.demo;

import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

/**
 * This class is managed by Spring. So stuff like dependency injection will work. For this demo the bean is manually registered
 * in applicationConfig.xml.
 */
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