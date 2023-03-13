public class Wall {
    double height;

  public Wall(double height) {
    this.height = height;
  }

  public boolean just_Do_It(BasicFunction BasicFunction) {
    return BasicFunction.run(height);
  }
}
