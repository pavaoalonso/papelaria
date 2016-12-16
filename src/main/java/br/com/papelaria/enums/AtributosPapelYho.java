package br.com.papelaria.enums;

public enum AtributosPapelYho {

	VOLUME_ATUAL("data-test", "TD_VOLUME-value", "volumeAtual"),
	COTACAO_ATUAL("class", "Fw(b) Fz(36px) Mb(-4px)", "cotacaoAtual"),
	FECHAMENTO_ANTERIOR("data-test", "PREV_CLOSE-value", "fechamentoAnterior"),
	VALORIZACAO_ATUAL("class", "Fw(500) Pstart(10px) Fz(24px) C($dataGreen)", "valorizacaoAtual"),
	NOME_EMPRESA("class", "D(ib) Fz(18px)", "nomeEmpresa"),
	PRECO_ABERTURA("data-test", "OPEN-value", "precoAbertura");

	private final String chave;
	private final String valor;
	private final String field;

	private AtributosPapelYho(String chave, String valor, String label) {
		this.chave = chave;
		this.valor = valor;
		this.field = label;
	}

	public String getChave() {
		return chave;
	}
	
	public String getValor() {
		return valor;
	}
	
	public String getField() {
		return field;
	}
	
}
