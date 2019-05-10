package com.example.springboot2;

import com.example.springboot2.ws.WebServiceApi;
import com.example.springboot2.ws.WebServiceRequest;
import com.example.springboot2.ws.WebServiceResponse;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ControllerTest {

/*  @Test
  public void searchFlights() {
    Controller.IFlightService webServiceApi = mock(Controller.IFlightService.class);
    Controller.IFlightService webServiceApi2 = mock(Controller.IFlightService.class);
    Controller underTest = new Controller(Arrays.asList(webServiceApi, webServiceApi2));
    Controller.Request request = new Controller.Request();
    request.setName("Amir");
    List<Controller.Response> mockedWSResult = Arrays.asList(
        new Controller.Response("Ali"),
        new Controller.Response("Jafar")
    );
    List<Controller.Response> mockedWSResult2 = Arrays.asList(
        new Controller.Response("Amir"),
        new Controller.Response("Mehdi")
    );
    when(webServiceApi.searchFlights(any(Controller.Request.class))).thenReturn(mockedWSResult);
    when(webServiceApi2.searchFlights(any(Controller.Request.class))).thenReturn(mockedWSResult2);

    List<Controller.Response> responseList = underTest.searchFlights(request);
    //responseList.sort(Comparator.comparing(Controller.Response::getLastName));

    assertEquals(4, responseList.size());
    assertEquals("Ali", responseList.get(0).getLastName());
    assertEquals("Amir", responseList.get(1).getLastName());
    assertEquals("Jafar", responseList.get(2).getLastName());
    assertEquals("Mehdi", responseList.get(3).getLastName());
  }*/
}