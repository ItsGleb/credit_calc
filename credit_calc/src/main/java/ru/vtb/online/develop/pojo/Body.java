package ru.vtb.online.develop.pojo;

import java.util.List;

public class Body {
    private String formLengthAmountBoundary;
    private List<InterestRates> interestRatesList;
    private List<OptionRates> optionRatesList;

    public Body(String formLengthAmountBoundary, List<OptionRates> optionRatesList, List<InterestRates> interestRatesList) {
        this.formLengthAmountBoundary = formLengthAmountBoundary;
        this.optionRatesList = optionRatesList;
        this.interestRatesList = interestRatesList;
    }

    public List<InterestRates> getInterestRatesList() {
        return interestRatesList;
    }

    public List<OptionRates> getOptionRatesList() {
        return optionRatesList;
    }
}
