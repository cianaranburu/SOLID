package srp;

public class Vat {
	public float vatPercentage = (float) 0.16;
	public float returnVAT(float billAmount) {
		return vatPercentage * billAmount;
	}
}
