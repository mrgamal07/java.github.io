package dsa;

import model.Student;
import java.util.List;

public class StudentSearcher {
    public static Student binarySearchByRoll(List<Student> list, int rollNo) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int currentRoll = list.get(mid).getRollNo();
            if (currentRoll == rollNo) return list.get(mid);
            else if (currentRoll < rollNo) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
