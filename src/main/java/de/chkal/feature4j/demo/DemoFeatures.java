package de.chkal.feature4j.demo;

import de.chkal.togglz.core.Feature;
import de.chkal.togglz.core.annotation.EnabledByDefault;
import de.chkal.togglz.core.holder.FeatureManagerHolder;

public enum DemoFeatures implements Feature {

    @EnabledByDefault
    FEATURE_ONE,
    
    FEATURE_TWO;
    
    public boolean isEnabled() {
        return FeatureManagerHolder.getFeatureManager().isActive(this, null);
    }
    
}
