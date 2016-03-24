///*
//    Job of Class:-
//    Compare two measurements
//    add two measurements
//    equate two measurements
// */
//package Measurements;
//import ExceptionHandler.InvalidMeasurementException;
//
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Set;
//
//public class Measurement {
//    private final Unit unitOfLength;
//    private final double value;
//
//    private Measurement(Unit unitOfLength, double value) {
//        this.unitOfLength = unitOfLength;
//        this.value = value;
//    }
//
//    public static Measurement create(Unit unitOfLength, double value) throws InvalidMeasurementException {
//        if (value < 0) throw new InvalidMeasurementException(value);
//        return new Measurement(unitOfLength, value);
//    }
//
//    public boolean compare(Measurement measurement) throws Exception {
//        if (isOfSameMeasurement(measurement))
//            return this.unitOfLength.convertToBaseMeasurement(value) == measurement.unitOfLength.convertToBaseMeasurement(measurement.value);
//        throw new Exception("No operation can be applied on two different SI units");
//    }
//
//    private boolean isOfSameMeasurement(Measurement measurement) {
//        HashMap<String, ArrayList<Unit>> unitMeasurements = mappingToMeasurements();
//        boolean result = false;
//        Set<String> keysOfMap = unitMeasurements.keySet();
//        for (String key : keysOfMap) {
//            ArrayList<Unit> unitOfLengths = unitMeasurements.get(key);
//            if (unitOfLengths.contains(measurement.unitOfLength) && unitOfLengths.contains(this.unitOfLength))
//                result = true;
//        }
//        return result;
//    }
//
//    private HashMap<String, ArrayList<Unit>> mappingToMeasurements() {
//        HashMap<String, ArrayList<Unit>> unitMeasurements = new HashMap<>();
//        String[] lengthUnits = {"INCHES", "CENTIMETER", "FEET", "MILLIMETER"};
//        String[] volumeUnits = {"LITER", "GALLON"};
//        ArrayList<Unit> unitOfLengthOfLength = new ArrayList<>();
//        ArrayList<Unit> unitOfLengthOfVolume = new ArrayList<>();
//        for (String lengthUnit : lengthUnits) {
//            unitOfLengthOfLength.add(Unit.valueOf(lengthUnit));
//        }
//        for (String volumeUnit : volumeUnits) {
//            unitOfLengthOfVolume.add(Unit.valueOf(volumeUnit));
//        }
//        unitMeasurements.put("unitOfLengthOfLength", unitOfLengthOfLength);
//        unitMeasurements.put("unitOfLengthOfVolume", unitOfLengthOfVolume);
//        return unitMeasurements;
//    }
//
//    public Measurement add(Measurement otherMeasurement, Unit unitOfLength) throws InvalidMeasurementException, Exception {
//        double sum;
//        if (!(isOfSameMeasurement(otherMeasurement))) throw new Exception("my teacher is an idiot");
////        if (this.unitOfLength.name().equals(otherMeasurement.unitOfLength.name()))
////            sum = this.value + otherMeasurement.value;
//        else {
//            double sumInBaseMeasurement = addDifferentUnitValues(otherMeasurement);
//            DecimalFormat decimalFormat = new DecimalFormat("##.00");
//            String format = decimalFormat.format(sumInBaseMeasurement);
////            sum = unitOfLength.convertIntoGivenUnit(Double.parseDouble(format), unitOfLength);
//        }
//        return Measurement.create(unitOfLength, sum);
//    }
//
////    private double addDifferentUnitValues(Measurement otherMeasurement) {
////        return this.unitOfLength.convertIntoBaseMeasurement(value) + otherMeasurement.unitOfLength.convertIntoBaseMeasurement(otherMeasurement.value);
////    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Measurement that = (Measurement) o;
//        return Double.compare(that.value, value) == 0 && unitOfLength == that.unitOfLength;
//    }
//}
