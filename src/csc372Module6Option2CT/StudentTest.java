package csc372Module6Option2CT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void validStudentCreation() {
        Student s = new Student(1, "Mindi", "21 Ida Street");
        assertEquals(1, s.rollno);
        assertEquals("Mindi", s.name);
        assertEquals("21 Ida Street", s.address);
    }

    @Test
    void negativeRollNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student(-1, "Bobby", "69 Lia Street");
        });
    }

    @Test
    void nullNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student(2, null, "69 Lia Street");
        });
    }

    @Test
    void emptyNameThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student(3, "   ", "69 Lia Street");
        });
    }

    @Test
    void nullAddressThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student(4, "Mindi", null);
        });
    }

    @Test
    void emptyAddressThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student(5, "Bobby", "  ");
        });
    }
}
