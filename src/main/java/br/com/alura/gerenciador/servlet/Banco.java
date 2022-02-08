package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Bruno Araújo
 * @date 03/12/2021
 * 
 * Classe responsável por simular um banco de dados,
 * Recebendo o objeto por inteiro e adicionando à lista static da classe
 * Detalhe: Estamos armazenando esses dados na classe, não no objeto.
 * 
 */

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	/**
	 * Simluando um banco de dados inicializando a classe com duas empresas cadastradas 
	 * na lista.
	 */
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		empresa.setId(chaveSequencial++);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Microsoft");
		empresa2.setId(chaveSequencial++);
		
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa: lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
