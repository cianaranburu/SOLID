package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VATAmount;
	public float billDeduction;
	public float billTotal;
	public float VAT;
	public int deductionPercentage;
	
    private IDeduction deduction;
    private IVAT vat;
    
    // Bill klaseak konstruktorea du, non Dependency Injection egiten den
    public Bill(IDeduction deduction, IVAT vat) {
        this.deduction = deduction;
        this.vat = vat;
    }

    // Fakturaren totala kalkulatzen duen metodoa
    public void totalCalc() {
        // Dedukzioa kalkulatu
        billDeduction = deduction.calcBillDeduction(billAmount, deductionPercentage);
        
        // VAT kalkulatzen dugu
        VAT = vat.calcVAT(billAmount);
        
        // Totala kalkulatzen dugu
        billTotal = (billAmount - billDeduction) + VAT;
    }
}
