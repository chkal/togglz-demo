package de.chkal.feature4j.demo;

import java.io.File;

import javax.enterprise.context.ApplicationScoped;

import de.chkal.togglz.core.Feature;
import de.chkal.togglz.core.config.FeatureManagerConfiguration;
import de.chkal.togglz.core.repository.FeatureStateRepository;
import de.chkal.togglz.core.repository.file.FileBasedRepository;

@ApplicationScoped
public class DemoConfiguration implements FeatureManagerConfiguration {

    @Override
    public FeatureStateRepository getFeatureStateRepository() {
        return new FileBasedRepository(new File("/home/ck/features.properties"));
    }

    @Override
    public Class<? extends Feature> getFeatureClass() {
        return DemoFeatures.class;
    }

}
