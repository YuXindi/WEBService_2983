package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {

  @WebMethod
  public double addOpt(double a, double b) {
    return a + b;
  }

  @WebMethod
  public double minusOpt(double a, double b) {
    return a - b;
  }
}
