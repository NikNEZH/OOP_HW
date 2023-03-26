package HW5;

import java.util.List;

public class StudyGroup <T> {

    private int id;
    private String techear;
    private List <T> students;

    
    public StudyGroup() {
    }

    public StudyGroup(String techear, List<T> students, int id) {
        this.techear = techear;
        this.students = students;
        this.id = id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechear() {
        return techear;
    }
    public void setTechear(String techear) {
        this.techear = techear;
    }
    public List<T> getStudents() {
        return students;
    }
    public void setStudents(List<T> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "Номер группы = " + id +
                ", Имя учителя = '" + techear + '\'' +
                ", Список студентов в группе = " + students +
                '}';
    }
    
}
