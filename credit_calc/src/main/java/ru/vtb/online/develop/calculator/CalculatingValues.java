package ru.vtb.online.develop.calculator;

import java.math.BigDecimal;

public interface CalculatingValues {

    static double calculateMonthlyPayment(String enterAmount, double minRateFromTheBucket, String enterTerm) {
        double amount = Double.parseDouble(enterAmount.replaceAll("[^0-9.]", ""));
        int term = Integer.parseInt(enterTerm.replaceAll("[^0-9]", ""));

        double i = (minRateFromTheBucket / 100) / 12;
        double powI = Math.pow((((minRateFromTheBucket / 100) / 12) + 1), term);
        double monthlyPayment = amount * (i + i / (powI - 1));

        return new BigDecimal(monthlyPayment)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

    static double calculateMonthlyPaymentWithOption(String enterAmount, double minRateWithOptionFromTheBucket,
                                                    String enterTerm, double rateFromOptionRate) {
        double amount = Double.parseDouble(enterAmount.replaceAll("[^0-9.]", ""));
        int term = Integer.parseInt(enterTerm.replaceAll("[^0-9]", ""));

        double i = (minRateWithOptionFromTheBucket / 100) / 12;
        double powI = Math.pow((((minRateWithOptionFromTheBucket / 100) / 12) + 1), term);

        double costOfTheOption = calculateCostOfTheOption(enterAmount,enterTerm,rateFromOptionRate);
        double monthlyPaymentWithOption = (amount + costOfTheOption) * (i + i / (powI - 1));

        return new BigDecimal(monthlyPaymentWithOption)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

    static double calculateCostOfTheOption(String enterAmount, String enterTerm, double rateFromOptionRate) {
        double amount = Double.parseDouble(enterAmount.replaceAll("[^0-9.]", ""));
        int term = Integer.parseInt(enterTerm.replaceAll("[^0-9]", ""));
        double costOfTheOption = (amount * term * rateFromOptionRate * 0.01) /
                (1 - rateFromOptionRate * 0.01 * term);
        return new BigDecimal(costOfTheOption)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
    }

}
