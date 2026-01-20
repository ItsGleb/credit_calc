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

    public String getMinLoanAmount() {
        return minLoanAmount;
    }

    public String getMaxLoanTerm() {
        return maxLoanTerm;
    }

    public String getMinLoanTerm() {
        return minLoanTerm;
    }

    public String getOption() {
        return option;
    }

    public String getRate() {
        return rate;
    }
}
