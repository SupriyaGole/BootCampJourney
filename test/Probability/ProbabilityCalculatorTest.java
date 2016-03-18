package Probability;

import ExceptionHandler.InvalidProbabilityException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProbabilityCalculatorTest {
    @Test
    public void probability_should_calculate_chance_of_tail_getting_when_flipping_a_coin() throws InvalidProbabilityException {
        ProbabilityCalculator probabilityCalculator = ProbabilityCalculator.createProbabiltyCalculator(1,2);
        Chance chanceOfEventOccurring = probabilityCalculator.getChanceOfEventOccurring();
        Chance chance = Chance.createChance(0.5);
        assertTrue(chanceOfEventOccurring.equals(chance));
    }

    @Test
    public void probability_should_calculate_chance_of_not_tail_getting_when_flipping_a_coin() throws InvalidProbabilityException {
        ProbabilityCalculator probabilityCalculator = ProbabilityCalculator.createProbabiltyCalculator(1,2);
        Chance chanceOfNotEventOccurring = probabilityCalculator.getChanceOfNotEventOccurring();
        Chance chance = Chance.createChance(0.5);
        assertTrue(chanceOfNotEventOccurring.equals(chance));
    }

    @Test
    public void probability_should_calculate_chance_of_both_getting_tail_when_flipping_two_coins() throws InvalidProbabilityException {
        ProbabilityCalculator probabilityCalculator = ProbabilityCalculator.createProbabiltyCalculator(2,4);
        Chance chanceOfEventOccurring = probabilityCalculator.getChanceOfGettingSameEvent();
        Chance chance = Chance.createChance(0.25);
        assertTrue(chanceOfEventOccurring.equals(chance));
    }

    @Test
    public void probability_should_calculate_chance_of_getting_atleast_one_tail_when_flipping_two_coins() throws InvalidProbabilityException {
        ProbabilityCalculator probabilityCalculator = ProbabilityCalculator.createProbabiltyCalculator(2,4);
        Chance chanceOfEventOccurring = probabilityCalculator.getChanceOfGettingAtLeastOneEvent();
        Chance chance = Chance.createChance(0.75);
        assertTrue(chanceOfEventOccurring.equals(chance));
    }
}