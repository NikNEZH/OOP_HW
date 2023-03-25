package HW5;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args) {
        TrainingGroupService us = new TrainingGroupService();

        List<String> students = new ArrayList<>();
        var lol = us.createGroup( "Бабаев Алексей Георгевичь", students,  1);
        View v = new View();
        v.listGroupView(lol);
        // System.out.println(lol);
    }
    
    
    
}
