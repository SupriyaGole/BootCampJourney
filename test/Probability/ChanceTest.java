package Probability;

import ExceptionHandler.InvalidProbabilityException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class ChanceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Chance chance;

    @Before
    public void setUp() throws Exception, InvalidProbabilityException {
        chance = Chance.createChance(0.5);
    }

    @Test
    public void createChance_should_create_chance_with_validation_provided() throws InvalidProbabilityException {
        Chance otherChance = Chance.createChance(0.5);
        assertTrue(chance.equals(otherChance));
    }

    @Test
    public void subtract_should_subtract_chance_value_from_provided_value() throws InvalidProbabilityException {
        Chance otherChance = chance.not(1);
        assertTrue(chance.equals(otherChance));
    }

    @Test
    public void add_should_add_two_chance_object_value_and_return_back_added_chance_object() throws InvalidProbabilityException {
        Chance otherChance = Chance.createChance(0.75);
        Chance addedChance = this.chance.and(otherChance);
        Chance expected = Chance.createChance(0.375);
        assertTrue(expected.equals(addedChance));
    }

    @Test
    public void InvalidProbabilityException_should_be_thrown_when_chance_is_greater_than_1_and_less_than_zero() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Expected chance to lie between 0 to 1 but found 5.0");
        Chance.createChance(5.0);
    }

//    @Test
//    public void probability_should_calculate_chance_of_tail_getting_when_flipping_a_coin() throws InvalidProbabilityException {
//        Chance chanceOfEventOccurring = Chance.createChance(0.5);
//        Chance chance = chanceOfEventOccurring.getChanceOfEventOccurring();
//        Chance otherChance = Chance.createChance(0.5);
//        assertTrue(chance.equals(otherChance));
//    }

//    @Test
//    public void probability_should_calculate_chance_of_not_tail_getting_when_flipping_a_coin() throws InvalidProbabilityException {
//        Chance chanceOfNotEventOccurring = Chance.createChance(0.5);
//        Chance chance = chanceOfNotEventOccurring.getChanceOfNotEventOccurring();
//        Chance otherChance = Chance.createChance(0.5);
//        assertEquals(chance,otherChance);
//    }
//
//    @Test
//    public void probability_should_calculate_chance_of_both_getting_tail_when_flipping_two_coins() throws InvalidProbabilityException {
//        Chance chanceOfEventOccurring = Chance.createChance(0.5);
//        Chance chance = chanceOfEventOccurring.getChanceOfGettingSameEvent();
//        Chance otherChance = Chance.createChance(0.25);
//        assertEquals(otherChance,chance);
//    }
//
//    @Test
//    public void probability_should_calculate_chance_of_getting_atleast_one_tail_when_flipping_two_coins() throws InvalidProbabilityException {
//        Chance chanceOfEventOccurring = Chance.createChance(0.5);
//        Chance chance = chanceOfEventOccurring.getChanceOfGettingAtLeastOneEvent();
//        Chance otherChance = Chance.createChance(0.75);
//        assertEquals(chance,otherChance);
//    }
}