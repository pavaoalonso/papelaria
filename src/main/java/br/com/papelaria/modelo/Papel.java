package br.com.papelaria.modelo;

public class Papel {

	private String nomeEmpresa;
	private String cotacaoAtual;
	private String fechamentoAnterior;
	private String valorizacaoAtual;
	private String volumeAtual;
	private String precoAbertura;
	private String codigo;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCotacaoAtual() {
		return cotacaoAtual;
	}

	public void setCotacaoAtual(String cotacaoAtual) {
		this.cotacaoAtual = cotacaoAtual;
	}

	public String getFechamentoAnterior() {
		return fechamentoAnterior;
	}

	public void setFechamentoAnterior(String fechamentoAnterior) {
		this.fechamentoAnterior = fechamentoAnterior;
	}

	public String getValorizacaoAtual() {
		return valorizacaoAtual;
	}

	public void setValorizacaoAtual(String valorizacaoDia) {
		this.valorizacaoAtual = valorizacaoDia;
	}

	public String getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(String volumeAtual) {
		this.volumeAtual = volumeAtual;
	}

	public String getPrecoAbertura() {
		return precoAbertura;
	}

	public void setPrecoAbertura(String precoAbertura) {
		this.precoAbertura = precoAbertura;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Papel [nomeEmpresa=" + nomeEmpresa + ", cotacaoAtual=" + cotacaoAtual + ", fechamentoAnterior="
				+ fechamentoAnterior + ", valorizacaoAtual=" + valorizacaoAtual + ", volumeAtual=" + volumeAtual
				+ ", precoAbertura=" + precoAbertura + ", codigo=" + codigo + "]\n";
	}

}
