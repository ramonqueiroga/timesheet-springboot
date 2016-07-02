package br.com.timesheet.recursos;

import java.util.List;

import br.com.timesheet.model.Produto;
import br.com.timesheet.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;

	@RequestMapping(value="/api/produtos", method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> lista() {
		List<Produto> produtos = produtoService.findAll();

		if(produtos == null || produtos.size() == 0) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    return new ResponseEntity<>(produtos, HttpStatus.OK);
	}

	@RequestMapping(value="/api/produtos/{id}", method = RequestMethod.GET)
	public ResponseEntity<Produto> findOne(@PathVariable("id") String id) {
		Integer produtoId = Integer.valueOf(id);
		Produto produto = produtoService.findOne(produtoId);
		if(produto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}

	@RequestMapping(value="/api/produtos/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<Produto> saveOne(@PathVariable("id") Integer id, @RequestBody Produto produtoData) {

		Produto produto = this.produtoService.findOne(id);

		if(produto == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		produto.setDescricao(produtoData.getDescricao());
		produto.setPaginas(produtoData.getPaginas());
		produto.setTitulo(produtoData.getTitulo());

		Produto produtoAtualizado = this.produtoService.save(produto);

		return new ResponseEntity<>(produtoAtualizado, HttpStatus.OK);
	}


}
