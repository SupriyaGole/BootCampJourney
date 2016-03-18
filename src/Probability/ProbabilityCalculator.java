/*
    Job of class:-
        the job of probability calculator is to calculate chance of particular event occur.
        the events like:-
        get chance of particular event occurring
        get chance of not occurring of particular event
        get chance of same event occurring while flipping two coins
        get chance of at least one event occurring while flipping two coins
 */

package Probability;

import ExceptionHandler.InvalidProbabilityException;
public class ProbabilityCalculator {

    private final int favourable;
    private final int totalOutcome;

    private ProbabilityCalculator(int favourable, int totalOutcome) {
        this.favourable = favourable;
        this.totalOutcome = totalOutcome;
    }

    public static ProbabilityCalculator createProbabilityCalculator(int favourable, int totalOutcome){
        return new ProbabilityCalculator(favourable,totalOutcome);
    }

    public Chance getChanceOfEventOccurring() throws InvalidProbabilityException {
        double chances = (double) favourable / (double) totalOutcome;
        return Chance.createChance(chances);
    }

    public Chance getChanceOfNotEventOccurring() throws InvalidProbabilityException {
        Chance chances = getChanceOfEventOccurring();
        return chances.subtract(1);
    }

    public Chance getChanceOfGettingSameEvent() throws InvalidProbabilityException {
        Chance chanceOfEventOccurring = getChanceOfEventOccurring();
        return chanceOfEventOccurring.multiply(getChanceOfEventOccurring());
    }

    public Chance getChanceOfGettingAtLeastOneEvent() throws InvalidProbabilityException {
        Chance chanceOfGettingSameEvent = getChanceOfGettingSameEvent();
        return chanceOfGettingSameEvent.subtract(1);
    }
}
