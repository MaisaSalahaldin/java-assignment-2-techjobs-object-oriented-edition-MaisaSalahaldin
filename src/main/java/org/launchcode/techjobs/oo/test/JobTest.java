package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3 instanceof Job);
        assertEquals(job3.getName(), "Product tester");
        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertTrue(job3.getLocation() instanceof Location);
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");


    }

    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobb = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char lett[] = jobb.toString().toCharArray();
        assertEquals('\n', lett[lett.length - 1]);
        assertEquals('\n', lett[0]);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String answer = "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + job.getEmployer().getValue() + "\n" +
                "Location: " + job.getLocation().getValue() + "\n" +
                "Position Type: " + job.getPositionType().getValue() + "\n" +
                "Core Competency: " + job.getCoreCompetency().getValue() + "\n";
        assertEquals(job.toString(), answer);

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String answer = "\n" +"ID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + job.getEmployer().getValue() + "\n" +
                "Location: " + job.getLocation().getValue() + "\n" +
                "Position Type: " + job.getPositionType().getValue() + "\n" +
                "Core Competency: " + job.getCoreCompetency().getValue() + "\n";
        assertEquals(job.toString(), answer);
    }
}