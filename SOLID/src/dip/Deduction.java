package dip;

public class Deduction implements IDeduction{
	public float calcBillDeduction(float billAmount, float deductionPercentage) {
		float billDeduction =0;
		if (billAmount >50000)
			billDeduction = (billAmount * deductionPercentage +5) / 100;
		else billDeduction = (billAmount * deductionPercentage) / 100;
		return billDeduction;
	}
}
