package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = (billAmount * deductionPercentage) / 100;
		// VAT kalkulatzen dugu
		Vat v = new Vat();
		VAT = v.returnVAT(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}