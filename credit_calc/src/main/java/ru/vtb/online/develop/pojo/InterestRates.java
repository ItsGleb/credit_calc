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
    private String minRateWithOption;
    private String maxRateWithOption;
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

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(String maxRate) {
        this.maxRate = maxRate;
    }

    public String getMinRate() {
        return minRate;
    }

    public void setMinRate(String minRate) {
        this.minRate = minRate;
    }

    public String getMaxTerm() {
        return maxTerm;
    }

    public void setMaxTerm(String maxTerm) {
        this.maxTerm = maxTerm;
    }

    public String getMinTerm() {
        return minTerm;
    }

    public void setMinTerm(String minTerm) {
        this.minTerm = minTerm;
    }

    public String getMaxTotalCost() {
        return maxTotalCost;
    }

    public void setMaxTotalCost(String maxTotalCost) {
        this.maxTotalCost = maxTotalCost;
    }

    public String getMinTotalCost() {
        return minTotalCost;
    }

    public void setMinTotalCost(String minTotalCost) {
        this.minTotalCost = minTotalCost;
    }

    public String getMaxTotalCostWithOption() {
        return maxTotalCostWithOption;
    }

    public void setMaxTotalCostWithOption(String maxTotalCostWithOption) {
        this.maxTotalCostWithOption = maxTotalCostWithOption;
    }

    public String getMinTotalCostWithOption() {
        return minTotalCostWithOption;
    }

    public void setMinTotalCostWithOption(String minTotalCostWithOption) {
        this.minTotalCostWithOption = minTotalCostWithOption;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getMinRateWithOption() {
        return minRateWithOption;
    }

    public void setMinRateWithOption(String minRateWithOption) {
        this.minRateWithOption = minRateWithOption;
    }

    public String getMaxRateWithOption() {
        return maxRateWithOption;
    }

    public void setMaxRateWithOption(String maxRateWithOption) {
        this.maxRateWithOption = maxRateWithOption;
    }
}
