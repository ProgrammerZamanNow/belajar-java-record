package programmerzamannow.records.data;

public record Point(int x, int y) {

  public Point{
    System.out.println("Create Point");
  }

}
