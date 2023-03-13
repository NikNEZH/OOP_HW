public class Program {
    public static void main(String[] args) {

        BasicFunction[] basics = {
            new Human("Юрий", 10000, 3),
            new Cat("Барсик", 1000, 2),
            new Robot("R2-D2", 5000, 4)
        };

        Object[] obstacles = { 
            new Wall(1), new Treadmill(15000), 
            new Wall(2), new Treadmill(5000),
            new Wall(3), new Treadmill(10000) 
        };

        for (BasicFunction basic : basics) {
            boolean success = true;
            for (Object obstacle : obstacles) {
              if (obstacle instanceof Wall) {
                success = ((Wall) obstacle).just_Do_It(basic);
              } else if (obstacle instanceof Treadmill) {
                success = ((Treadmill) obstacle).just_Do_It(basic);
              }
              if (!success) {
                break;
              }
            }
            if (success) {
              System.out.println(basic.name + " прошел все препятствия!");
            } else {
              System.out.println(basic.name + " не прошел все препятствия.");
            }
          }
    }
}
