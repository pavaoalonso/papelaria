package br.com.papelaria.factory;

import java.util.Map;

import static br.com.papelaria.enums.AtributosPapelYho.*;
import br.com.papelaria.modelo.Papel;

public class PapelFactory {

	public static Papel construirPapel(Map<String, String> atributosValores) {

		Papel papel = new Papel();

		papel.setVolumeAtual(atributosValores.get(VOLUME_ATUAL.getField()));
		papel.setCotacaoAtual(atributosValores.get(COTACAO_ATUAL.getField()));
		papel.setFechamentoAnterior(atributosValores.get(FECHAMENTO_ANTERIOR.getField()));
		papel.setValorizacaoAtual(atributosValores.get(VALORIZACAO_ATUAL.getField()));
		papel.setNomeEmpresa(atributosValores.get(NOME_EMPRESA.getField()));
		papel.setPrecoAbertura(atributosValores.get(PRECO_ABERTURA.getField()));
		papel.setCodigo(atributosValores.get("codigo"));
		
		return papel;
	}

}
