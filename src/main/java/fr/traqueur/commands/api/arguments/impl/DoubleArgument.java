package fr.traqueur.commands.api.arguments.impl;


import fr.traqueur.commands.api.arguments.ArgumentConverter;

/**
 * Convert a string to a double
 */
public class DoubleArgument implements ArgumentConverter<Double> {

    /**
     * Convert a string to a double
     * @param input the string to convert
     * @return the double or null if the string is not a double
     */
    @Override
    public Double apply(String input) {
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException e){
            return null;
        }
    }
}
