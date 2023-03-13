public class Treadmill{
    double length;

  public Treadmill(double length) {
    this.length = length;
  }

  public boolean just_Do_It(BasicFunction BasicFunction) {
    return BasicFunction.run(length);
  }
}
