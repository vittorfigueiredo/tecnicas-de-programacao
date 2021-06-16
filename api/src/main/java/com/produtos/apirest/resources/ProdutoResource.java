package com.produtos.apirest.resources;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtos.apirest.repository.ProdutoRepository;


import com.produtos.apirest.models.Produto;;


@Service
public class ProdutoResource {

	
		@Autowired
		private ProdutoRepository produtoRepository;
			
		
		public Optional<Produto> produtoById(Long id){
			return produtoRepository.findById(id);
		}
		
		public List<Produto> produtoListAll(){
			return produtoRepository.findAll();
		}
		
		public Produto saveProduto(Produto produto) {
			return produtoRepository.save(produto);
		}
		
		public Produto updateProduto(Produto produto) {
			return produtoRepository.save(produto);
		}
		
		public void deleteProduto(Long id) {
			produtoRepository.deleteById(id);
		}
		
		
		
}
