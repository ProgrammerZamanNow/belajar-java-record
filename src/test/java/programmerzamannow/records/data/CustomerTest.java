package programmerzamannow.records.data;

import org.junit.jupiter.api.Test;

import java.lang.reflect.RecordComponent;

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

  @Test
  void constructor() {
    var customer = new Customer("1", "Eko", "eko@localhost");
    assertNotNull(customer);
    assertEquals("1", customer.id());
    assertEquals("Eko", customer.name());
    assertEquals("eko@localhost", customer.email());
    assertNull(customer.phone());
  }

  @Test
  void canonicalConstructor() {
    var customer = new Customer("1", "Eko", "EKO@LOCALHOST");
    assertNotNull(customer);
    assertEquals("1", customer.id());
    assertEquals("Eko", customer.name());
    assertEquals("eko@localhost", customer.email());
    assertNull(customer.phone());
  }

  @Test
  void recordMethod() {
    var customer = new Customer("1", "Eko", "EKO@LOCALHOST");
    assertEquals("Hello Budi, my name is Eko", customer.sayHello("Budi"));
  }

  @Test
  void recordEquals() {
    var customer1 = new Customer("1", "Eko", "eko@localhost");
    var customer2 = new Customer("1", "Eko", "eko@localhost");

    assertTrue(customer1.equals(customer2));
    assertEquals(customer1.hashCode(), customer2.hashCode());
    assertEquals(customer1.toString(), customer2.toString());
  }

  @Test
  void reflection() {
    assertTrue(Customer.class.isRecord());

    RecordComponent[] components = Customer.class.getRecordComponents();
    assertEquals(4, components.length);

    for (RecordComponent component : components){
      System.out.println(component.getName());
      System.out.println(component.getType());
    }
  }
}
