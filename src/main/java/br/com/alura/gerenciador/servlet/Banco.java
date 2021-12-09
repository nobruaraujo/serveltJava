package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruno
 * @date 03/12/2021
 * 
 * Classe responsável por simular um banco de dados,
 * Recebendo o objeto por inteiro e adicionando à lista static da classe
 * Detalhe: Estamos armazenando esses dados na classe, não no objeto.
 * 
 */

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	/**
	 * Simluando um banco de dados inicializando a classe com duas empresas cadastradas 
	 * na lista.
	 */
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Microsoft");
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
