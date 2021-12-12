package com.main.DataRest.Configurations.EventsHandler;

import com.main.DataRest.Models.Store;
import org.springframework.data.rest.core.annotation.*;

import java.util.logging.Logger;

@RepositoryEventHandler
public class StoreEventHandler {
    Logger logger = Logger.getLogger("Class StoreEventHandler");

    public StoreEventHandler() {
        super();
    }

    @HandleBeforeCreate
    public void handleStoreBeforeCreate(Store store) {
        logger.info("Inside  Store Before Create....");
        String name = store.getName();
    }

    @HandleAfterCreate
    public void handleStoreAfterCreate(Store store) {
        logger.info("Inside  Store After Create ....");
        String name = store.getName();
    }

    @HandleBeforeDelete
    public void handleStoreBeforeDelete(Store store) {
        logger.info("Inside  Store Before Delete ....");
        String name = store.getName();
    }

    @HandleAfterDelete
    public void handleStoreAfterDelete(Store store) {
        logger.info("Inside  Store After Delete ....");
        String name = store.getName();
    }

}