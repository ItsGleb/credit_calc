package ru.vtb.online.develop.search;

import ru.vtb.online.develop.pojo.InterestRates;
import ru.vtb.online.develop.pojo.OptionRates;

import java.util.List;

public interface ValuesSearch {

    static InterestRates findInterestRatesBucket(String enterAmount, String enterTerm, List<InterestRates> interestRates) {
        // Удаляем все символы кроме цифр и точки
        double amount = Double.parseDouble(enterAmount.replaceAll("[^0-9.]", ""));
        int term = Integer.parseInt(enterTerm.replaceAll("[^0-9.]", ""));
        InterestRates bucket = null;
        double minDifference = Double.MAX_VALUE;
        for (InterestRates interestRate : interestRates) {
            // Преобразуем граничные значения
            double minAmount = Double.parseDouble(interestRate.getMinAmount().replaceAll("[^0-9.]", ""));
            double maxAmount = Double.parseDouble(interestRate.getMaxAmount().replaceAll("[^0-9.]", ""));
            int minTerm = Integer.parseInt(interestRate.getMinTerm().replaceAll("[^0-9]", ""));
            int maxTerm = Integer.parseInt(interestRate.getMaxTerm().replaceAll("[^0-9]", ""));
            if (amount >= minAmount && amount <= maxAmount) {
                if (term >= minTerm && term <= maxTerm) {
                    // Вычисляем разницу между введенной суммой и maxAmount. Модуль числа
                    double difference = Math.abs(amount - maxAmount);
                    // Обновляем лучший вариант
                    if (difference < minDifference) {
                        minDifference = difference;
                        bucket = interestRate;
                    }
                }
            }
        }
        return bucket;
    }

    static OptionRates findOptionRatesBucket(String enterAmount, String enterTerm, List<OptionRates> optionRates) {
        double amount = Double.parseDouble(enterAmount.replaceAll("[^0-9.]", ""));
        int term = Integer.parseInt(enterTerm.replaceAll("[^0-9.]", ""));
        OptionRates optionBucket = null;
        double minDifference = Double.MAX_VALUE;
        for (OptionRates optionRate : optionRates) {
            // Преобразуем граничные значения
            double minLoanAmount = Double.parseDouble(optionRate.getMinLoanAmount().replaceAll("[^0-9.]", ""));
            double maxLoanAmount = Double.parseDouble(optionRate.getMaxLoanAmount().replaceAll("[^0-9.]", ""));
            int minLoanTerm = Integer.parseInt(optionRate.getMinLoanTerm().replaceAll("[^0-9.]", ""));
            int maxLoanTerm = Integer.parseInt(optionRate.getMaxLoanTerm().replaceAll("[^0-9.]", ""));
            if (amount >= minLoanAmount && amount <= maxLoanAmount) {
                if (term >= minLoanTerm && term <= maxLoanTerm) {
                    // Вычисляем разницу между введенной суммой и maxAmount. Модуль числа
                    double difference = Math.abs(amount - maxLoanAmount);
                    // Обновляем лучший вариант
                    if (difference < minDifference) {
                        minDifference = difference;
                        optionBucket = optionRate;
                    }
                }
            }
        }
        return optionBucket;
    }
}
