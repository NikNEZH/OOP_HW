package HW5;

/**
 * Этот метод позволяет добавлять новых членов группы 
 */
public class Person {
    public void lol  (String person,StudyGroup studentsGroup, int id){
            for (StudyGroup o : new StudyGroup[] {studentsGroup}) {
                if (o.getId()==id){
                    o.getStudents().add(person);
                }  
            }
    }
}

