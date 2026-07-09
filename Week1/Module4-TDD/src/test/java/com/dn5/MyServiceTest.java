package com.dn5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    ExternalApi mockApi;

    // Exercise 1: Mocking and Stubbing
    @Test
    public void testExternalApi() {
        // Stub the mock to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    // Exercise 2: Verifying Interactions
    @Test
    public void testVerifyInteraction() {
        when(mockApi.getData()).thenReturn("Some Data");

        MyService service = new MyService(mockApi);
        service.fetchData();

        // Verify that getData() was actually called on the mock
        verify(mockApi).getData();
    }
}