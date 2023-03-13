public class BasicFunction {
    String name; 
    double maxJump;
    double maxRun;

    public BasicFunction(String name,double maxJump,double maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public boolean run (double distance){
        if(maxRun > distance){
            System.out.println(name + " успешно пробежал " + distance + " метров");
            return true;
        } else{
            System.out.println(name + " не смог пробежать " + distance + " метров");
        } return false;
    }

    public boolean jump (double height){
        if(maxJump > height){
            System.out.println(name + " успешно прыгнул " + height + " метров");
            return true;
        } else{
            System.out.println(name + " не смог прыгнуть " + height + " метров");
        } return false;
    }
}
