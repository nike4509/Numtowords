package com.example.numtowords;

public class NumModel {
    private String[] firstdigit = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] seconddigit = {" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public NumModel() {
    }

    public NumModel(String[] ones, String[] tens) {
        this.firstdigit = ones;
        this.seconddigit = tens;
    }

    public String[] getFirstdigit() {
        return firstdigit;
    }

    public void setFirstdigit(String[] firstdigit) {
        this.firstdigit = firstdigit;
    }

    public String[] getSeconddigit() {
        return seconddigit;
    }

    public void setSeconddigit(String[] seconddigit) {
        this.seconddigit = seconddigit;
    }
}
