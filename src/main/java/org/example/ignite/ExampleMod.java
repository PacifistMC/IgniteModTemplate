package org.example.ignite;

import com.google.inject.Inject;
import org.apache.logging.log4j.Logger;
import space.vectrix.ignite.api.Platform;
import space.vectrix.ignite.api.event.Subscribe;
import space.vectrix.ignite.api.event.platform.PlatformInitializeEvent;

@SuppressWarnings({"ClassCanBeRecord", "FieldCanBeLocal", "unused"})
public class ExampleMod {
    private final Logger logger;
    private final Platform platform;

    @Inject
    public ExampleMod(Logger logger, Platform platform) {
        this.logger = logger;
        this.platform = platform;
    }

    @Subscribe
    public void onInitialize(PlatformInitializeEvent event) {
        this.logger.info("Hello World!");
    }
}
