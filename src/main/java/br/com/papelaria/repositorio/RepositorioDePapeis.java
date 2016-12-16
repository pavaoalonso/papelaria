package br.com.papelaria.repositorio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import br.com.papelaria.enums.AtributosPapelYho;
import br.com.papelaria.factory.PapelFactory;
import br.com.papelaria.modelo.Papel;

public class RepositorioDePapeis {

	/**
	 * Retorna o {@link Papel} do código passado.
	 * 
	 * @param codigo
	 * @return {@link Papel} 
	 */
	public Papel buscarPapel(String codigo) {

		Map<String, String> atributosValores = new HashMap<String, String>();

		atributosValores.put("codigo", codigo);
		
		
		Document doc = getYahooJSoupDocument(codigo);

		if (doc != null) {
			
			setAtributosValores(atributosValores, doc);
		}

		return PapelFactory.construirPapel(atributosValores);
	}

	public List<Papel> buscarPapeis(String... codigos){
		
		List<Papel> papeis = new ArrayList<>(0);
		
		if(codigos != null){
			
			for (String codigo : codigos) {
				papeis.add( buscarPapel(codigo) );
			}
		}
		
		return papeis;
	}

	private static Document getYahooJSoupDocument(String codAcao) {

		Document document = null;
		String URI_BASE_YAHOO = "http://finance.yahoo.com/quote/";
				
		try {
			setProxy();
			document = Jsoup.connect(URI_BASE_YAHOO + codAcao + ".SA").get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return document;
	}

	private static void setProxy() {
		System.setProperty("java.net.useSystemProxies", "true");
	}

	private String getValor(Document doc, AtributosPapelYho atriPapel) {
		return doc.getElementsByAttributeValue(atriPapel.getChave(), atriPapel.getValor()).text();
	}
	
	private void setAtributosValores(Map<String, String> atributosValores, Document doc) {
		for (AtributosPapelYho atriPapel : AtributosPapelYho.values()) {
			atributosValores.put(atriPapel.getField(), getValor(doc, atriPapel));
		}
	}
}
