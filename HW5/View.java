package HW5;

public class View {

    public void listGroupView(StudyGroup studentsGroup) {
        System.out.println("Учебная Группа:");
        for (StudyGroup category : new StudyGroup[] {studentsGroup}) {
            System.out.println("номер группы: " + category.getId() + ";" + " Ф.И.О преподователя(куратора): " + category.getTechear() + "; " +
            "список учащихся: " + category.getStudents());
        }
    }
}
