package dip;

public class VAT implements IVAT {
	public float vatPercentage = (float) 0.16;
	public float calcVAT(float billAmount) {
		return vatPercentage * billAmount;
	}
}
