package programmerzamannow.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

  @Test
  void createNewRecord() {
    var customer = new Customer("1", "Eko", "eko@localhost", "082131231");
    assertNotNull(customer);

    System.out.println(customer);
  }

  @Test
  void getProperty() {
    var customer = new Customer("1", "Eko", "eko@localhost", "082131231");
    assertNotNull(customer);
    assertEquals("1", customer.id());
    assertEquals("Eko", customer.name());
    assertEquals("eko@localhost", customer.email());
    assertEquals("082131231", customer.phone());
  }
}
