package csc372Module6Option2CT;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Class to perform merge sort on an ArrayList of Student objects.
 */
public class MergeSortStudents {

    /**
     * Comparator to sort students by roll number.
     */
    static class SortByRollno implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.rollno - s2.rollno;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(5, "Angelina", "Address1"));
        students.add(new Student(2, "Bob", "Address2"));
        students.add(new Student(9, "Mindi", "Address3"));
        students.add(new Student(1, "Kevin", "Address4"));
        students.add(new Student(6, "Brayleigh", "Address5"));
        students.add(new Student(4, "Bradley", "Address6"));
        students.add(new Student(7, "Molly", "Address7"));
        students.add(new Student(3, "Luna", "Address8"));
        students.add(new Student(8, "Smoky", "Address9"));
        students.add(new Student(10, "Brocklee", "Address10"));

        mergeSort(students, 0, students.size() - 1, new SortByRollno());

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void mergeSort(ArrayList<Student> list, int left, int right, Comparator<Student> comp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid, comp);
            mergeSort(list, mid + 1, right, comp);
            merge(list, left, mid, right, comp);
        }
    }

    public static void merge(ArrayList<Student> list, int left, int mid, int right, Comparator<Student> comp) {
        ArrayList<Student> temp = new ArrayList<>();

        int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (comp.compare(list.get(i), list.get(j)) <= 0) {
                temp.add(list.get(i));
                i++;
            } else {
                temp.add(list.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(list.get(i));
            i++;
        }

        while (j <= right) {
            temp.add(list.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
    }
}
