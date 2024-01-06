package programmerzamannow.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

  @Test
  void compactConstructor() {
    var point = new Point(10, 10);
    assertEquals(10, point.x());
    assertEquals(10, point.y());
  }
}
