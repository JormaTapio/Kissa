package JKatrinT_Ryhma.Kissa;

public class Lipunmyynti {
	double hinta;
	Profiili profiili;
	Paasylippu paasylippu;
	
	public Lipunmyynti(Profiili profiili, Paasylippu paasylippu) {
		this.profiili = profiili;
		this.paasylippu = paasylippu; 
	}

	public Paasylippu getPaasylippu() {
		return paasylippu;
	}

	public void setPaasylippu(Paasylippu paasylippu) {
		this.paasylippu = paasylippu;
	}
 
	public double laskeHinta() {
		this.hinta  = paasylippu.getHinta();
		hinta = hinta-(hinta * profiili.getKerroin());
		return hinta;
	}
}
