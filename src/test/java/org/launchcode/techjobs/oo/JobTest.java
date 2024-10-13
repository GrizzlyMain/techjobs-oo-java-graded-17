package org.launchcode.techjobs.oo;

import org.junit.Test;

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


    }
}
