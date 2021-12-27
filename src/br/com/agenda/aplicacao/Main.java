package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("João Gabriel");
		contato.setIdade(68);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar contato
		Contato c1 = new Contato();
		c1.setNome("João Gabriel Orlando");
		c1.setIdade(70);
		c1.setDataCadastro(new Date());
		c1.setId(4); // é o numero q esta no db
		
		//contatoDao.update(c1);
		
		//remover contato pelo ID do db
		
		contatoDao.deleteByID(1);
		
		//visualizar no db
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: "+c.getNome());
		}
	}

}
