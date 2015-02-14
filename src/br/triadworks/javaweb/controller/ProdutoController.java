package br.triadworks.javaweb.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.triadworks.javaweb.modelo.Produto;

@Resource
public class ProdutoController {
	@Path("/produto")
	public void index(){}
	
	@Path("produto/cadastrar")
	public void cadastra(Produto produto){}
}
