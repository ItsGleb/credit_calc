package ru.vtb.online.develop.pojo;

public class OptionRates {

    private String maxLoanAmount;
    private String minLoanAmount;
    private String maxLoanTerm;
    private String minLoanTerm;
    private String option;
    private String rate;

    public OptionRates(String maxLoanAmount, String minLoanAmount, String maxLoanTerm, String minLoanTerm,
                       String option, String rate) {
        this.maxLoanAmount = maxLoanAmount;
        this.minLoanAmount = minLoanAmount;
        this.maxLoanTerm = maxLoanTerm;
        this.minLoanTerm = minLoanTerm;
        this.option = option;
        this.rate = rate;

    }

    public String getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(String maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public String getMinLoanAmount() {
        return minLoanAmount;
    }

    public void setMinLoanAmount(String minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    public String getMaxLoanTerm() {
        return maxLoanTerm;
    }

    public void setMaxLoanTerm(String maxLoanTerm) {
        this.maxLoanTerm = maxLoanTerm;
    }

    public String getMinLoanTerm() {
        return minLoanTerm;
    }

    public void setMinLoanTerm(String minLoanTerm) {
        this.minLoanTerm = minLoanTerm;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
