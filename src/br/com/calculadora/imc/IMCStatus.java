package br.com.calculadora.imc;

public class IMCStatus {
	double imc;
	String classificacao;

	public IMCStatus(double imc, String classificacao) {
		this.imc = imc;
		this.classificacao = classificacao;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	
}
