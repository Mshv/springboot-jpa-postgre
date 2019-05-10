package com.example.springboot2;

import com.example.springboot2.ws.WebServiceApi;
import com.example.springboot2.ws.WebServiceRequest;
import com.example.springboot2.ws.WebServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Controller {

  List<IFlightService> providers;

  @Autowired
  public Controller(List<IFlightService> providers) {
    this.providers = providers;
  }

  public List<Response> searchFlights(Request request) {
    List<Response> result= new ArrayList<>();

    for (IFlightService provider : providers) {
      List<Response> responses = provider.searchFlights(request);
      result.addAll(responses);
    }

    // convert req to api1 req
    // call api1
    // convert api1 result list to my result list

    // convert req to api2 req
    // call api2
    // convert api2 result list to my result list

    // sort my result
    result.sort(Comparator.comparing(Response::getLastName));
    return result;

  }

  public static interface IFlightService {
    List<Response> searchFlights(Request request);
  }

  public static class Request {
    String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static class Response {
    String lastName;

    public Response() {
    }

    public Response(String lastName) {
      this.lastName = lastName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
  }
}
