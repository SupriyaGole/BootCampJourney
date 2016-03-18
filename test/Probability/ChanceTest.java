package Probability;

import ExceptionHandler.InvalidProbabilityException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChanceTest {

    private Chance chance;

    @Before
    public void setUp() throws Exception, InvalidProbabilityException {
        chance = Chance.createChance(0.5);
    }

    @Test
    public void createChance_should_craete_chance_with_validation_provided() throws InvalidProbabilityException {
        Chance otherChance = Chance.createChance(0.5);
        assertTrue(chance.equals(otherChance));
    }

    @Test
    public void subtract_should_subtract_chance_value_from_provided_value() throws InvalidProbabilityException {
        Chance otherChance = chance.subtract(1);
        assertTrue(chance.equals(otherChance));
    }

    @Test
    public void add_should_add_two_chance_object_value_and_return_back_added_chance_objcet() throws InvalidProbabilityException {
        Chance otherChance = Chance.createChance(0.75);
        Chance addedChance = this.chance.add(otherChance);
        Chance expected = Chance.createChance(0.375);
        assertTrue(expected.equals(addedChance));
    }
}