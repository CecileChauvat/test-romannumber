package hello;

public class Hello {

  public String hello(String who) {
    if (who == null) {
      throw new IllegalArgumentException("who cannot be null");
    }
    return "Guten tag Dobri Dien Hola Konichiwa " + who + "!";
  }
}
