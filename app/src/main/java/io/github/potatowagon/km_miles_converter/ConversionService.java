package io.github.potatowagon.km_miles_converter;

public class ConversionService {

    public static double kmToMiles(double km) {
        return km * Constant.MILE_PER_KM;
    }

    public static double milesToKm(double miles) {
        return miles / Constant.MILE_PER_KM;
    }
}
