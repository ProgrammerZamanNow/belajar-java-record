package programmerzamannow.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

  @Test
  void generic() {
    var data = new Data<String>("Eko");
    assertEquals("Eko", data.data());

    var data2 = new Data<Integer>(100);
    assertEquals(100, data2.data());
  }
}
