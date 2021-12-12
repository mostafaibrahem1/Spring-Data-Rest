package com.main.DataRest;

import com.main.DataRest.Configurations.EventsHandler.StoreEventHandler;
import com.main.DataRest.Models.Store;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
public class StoresEventHandlerUnitTest {

    @Test
    public void whenCreateStoreThenSuccess() {
        Store store = mock(Store.class);
        StoreEventHandler storeEventHandler = new StoreEventHandler();
        storeEventHandler.handleStoreBeforeDelete(store);
        Mockito.verify(store, Mockito.times(1)).getName();

    }

    @Test
    public void whenDeleteStoreThenSuccess() {
        Store store = mock(Store.class);
        StoreEventHandler storeEventHandler = new StoreEventHandler();
        storeEventHandler.handleStoreAfterDelete(store);
        Mockito.verify(store, Mockito.times(1)).getName();


    }
}