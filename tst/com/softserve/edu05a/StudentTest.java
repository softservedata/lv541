package com.softserve.edu05a;

import org.junit.Assert;
import org.junit.Test;

import com.softserve.edu05.Student;

public class StudentTest {

    @Test
    public void testEquals() {
        Student expected = new Student("Ivan", 25);
        Student actual = new Student();
        actual.setName("Ivan");
        actual.setAge(25);
        //
        Assert.assertEquals(expected, actual);
    }

}
