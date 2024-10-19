package org.launchcode.techjobs.oo;

import org.junit.Test;



import javax.naming.Name;

import java.lang.reflect.Method;

import static java.lang.System.lineSeparator;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job test_job = new Job();
        Job second_test_job = new Job();
        assertNotEquals(test_job.getId(), second_test_job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields (){
        Job test_constructor = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("ACME", test_constructor.getEmployer().getValue());
        assertEquals("Product tester", test_constructor.getName());
        assertEquals("Desert", test_constructor.getLocation().getValue());
        assertEquals("Quality control", test_constructor.getPositionType().getValue());
        assertEquals("Persistence", test_constructor.getCoreCompetency().getValue());

        assertTrue(test_constructor instanceof Job);
        assertTrue(test_constructor.getEmployer() instanceof Employer);
        assertTrue(test_constructor.getLocation() instanceof Location);
        assertTrue(test_constructor.getPositionType() instanceof PositionType);
        assertTrue(test_constructor.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(test_constructor.getEmployer() instanceof Employer);
        
    }

    @Test
    public void testJobsForEquality(){
        Job test_equals = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_equals_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_equals.equals(test_equals_two));

    }
//Resources: https://www.geeksforgeeks.org/how-to-get-the-last-character-of-a-string-in-javascript/ and https://www.w3schools.com/java/ref_string_getchars.asp and
    //https://www.w3schools.com/java/ref_string_charat.asp
    @Test
    public void  testToStringStartsAndEndsWithNewLine() {
        Job job_string = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals('\n', job_string.toString().charAt(0));
        assertEquals(job_string.toString().length() - 1, job_string.toString().lastIndexOf('\n'));
    }

}
