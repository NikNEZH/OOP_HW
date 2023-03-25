package HW5;

import java.util.List;

public interface DataServer <T> {

    StudyGroup createGroup (String techear, List<T> students, int id);
    
}
