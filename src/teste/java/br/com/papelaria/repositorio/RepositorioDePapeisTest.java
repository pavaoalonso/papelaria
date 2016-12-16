package br.com.papelaria.repositorio;

import java.util.List;

import br.com.papelaria.modelo.Papel;

public class RepositorioDePapeisTest {
		
	public static void main(String[] args) {
	
		RepositorioDePapeis repositorio = new RepositorioDePapeis();
		
		Papel rumo3 = repositorio.buscarPapel("RUMO3");
		
		List<Papel> papeis = repositorio.buscarPapeis("BBAS3", "HGTX3", "TECN3");
		
		System.out.println(rumo3);
		
		for (Papel papel : papeis) {
			System.out.println(papel);
		}
		
	}
}
