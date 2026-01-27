package ru.vtb.online.develop.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {
    @SerializedName("formLengthAmountBoundary")
    private String formLengthAmountBoundary;
    @SerializedName("interestRates")
    private List<InterestRates> interestRatesList;
    @SerializedName("optionRates")
    private List<OptionRates> optionRatesList;


    public Body(String formLengthAmountBoundary, List<OptionRates> optionRatesList, List<InterestRates> interestRatesList) {
        this.formLengthAmountBoundary = formLengthAmountBoundary;
        this.optionRatesList = optionRatesList;
        this.interestRatesList = interestRatesList;
    }

    public String getFormLengthAmountBoundary() {
        return formLengthAmountBoundary;
    }

    public void setFormLengthAmountBoundary(String formLengthAmountBoundary) {
        this.formLengthAmountBoundary = formLengthAmountBoundary;
    }

    public List<InterestRates> getInterestRatesList() {
        return interestRatesList;
    }

    public void setInterestRatesList(List<InterestRates> interestRatesList) {
        this.interestRatesList = interestRatesList;
    }

    public List<OptionRates> getOptionRatesList() {
        return optionRatesList;
    }

    public void setOptionRatesList(List<OptionRates> optionRatesList) {
        this.optionRatesList = optionRatesList;
    }
}
