package JKatrinT_Ryhma.Kissa;

import java.util.Date;

public class Paasylippu {
	private Date paivamaara;
	private int hinta;
	public Paasylippu(int hinta, Date paivamaara) {
		super();
		this.hinta = hinta;
		this.paivamaara = paivamaara;
	}
	public Date getPaivamaara() {
		return paivamaara;
	}
	public void setPaivamaara(Date paivamaara) {
		this.paivamaara = paivamaara;
	}
	public int getHinta() {
		return hinta;
	}
	public void setHinta(int hinta) {
		this.hinta = hinta;
	}
	
	
	

}
