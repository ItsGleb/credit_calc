package ru.vtb.online.develop.pojo;

public class InterestRates {

    private String maxAmount;
    private String minAmount;
    private String maxRate;
    private String minRate;
    private String maxTerm;
    private String minTerm;
    private String maxTotalCost;
    private String minTotalCost;
    private String maxTotalCostWithOption;
    private String minTotalCostWithOption;
    private String option;

    public InterestRates(String maxAmount, String minAmount, String maxRate, String minRate, String maxTerm,
                         String minTerm, String maxTotalCost, String minTotalCost, String maxTotalCostWithOption, String minTotalCostWithOption,
                         String option) {
        this.maxAmount = maxAmount;
        this.minAmount = minAmount;
        this.maxRate = maxRate;
        this.minRate = minRate;
        this.maxTerm = maxTerm;
        this.minTerm = minTerm;
        this.maxTotalCost = maxTotalCost;
        this.minTotalCost = minTotalCost;
        this.maxTotalCostWithOption = maxTotalCostWithOption;
        this.minTotalCostWithOption = minTotalCostWithOption;
        this.option = option;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public String getMaxRate() {
        return maxRate;
    }

    public String getMinRate() {
        return minRate;
    }

    public String getMaxTerm() {
        return maxTerm;
    }

    public String getMinTerm() {
        return minTerm;
    }

    public String getOption() {
        return option;
    }
}
