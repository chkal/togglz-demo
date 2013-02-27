package org.togglz.demo;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum DemoFeatures implements Feature {

    @EnabledByDefault
    @Label("First Feature")
    FEATURE_ONE,

    @Label("Second Feature")
    FEATURE_TWO;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}
