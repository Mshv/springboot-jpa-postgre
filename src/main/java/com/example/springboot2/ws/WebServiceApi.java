package com.example.springboot2.ws;

import com.example.springboot2.Controller;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class WebServiceApi implements Controller.IFlightService {

  private List<WebServiceResponse> callService(WebServiceRequest request) {
    throw new RuntimeException();
//    return Arrays.asList(
//        new WebServiceResponse(request.getQuery() + "1"),
//        new WebServiceResponse(request.getQuery() + "2")
//    );
  }

  @Override
  public List<Controller.Response> searchFlights(Controller.Request request) {
//    return null;
    throw new RuntimeException();
  }
}
