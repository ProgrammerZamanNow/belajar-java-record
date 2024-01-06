package programmerzamannow.records.data;

public record Point(int x, int y) {

  public Point{
    System.out.println("Create Point");
  }

  public static final Point ZERO = new Point(0, 0);

  public static Point create(int x, int y){
    return new Point(x, y);
  }

}
