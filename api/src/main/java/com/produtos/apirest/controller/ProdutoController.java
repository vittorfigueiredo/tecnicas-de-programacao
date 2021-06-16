package com.produtos.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.produtos.apirest.models.Produto;
import com.produtos.apirest.resources.ProdutoResource;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	

		@Autowired
		private ProdutoResource produtoResource;
		
		@GetMapping()
		public ResponseEntity<List<Produto>>produtoAll(){
			return ResponseEntity.ok().body(produtoResource.produtoListAll());
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Optional<Produto>> produtoById(@PathVariable Long id){
			return ResponseEntity.ok().body(produtoResource.produtoById(id));
		}
		
		@PostMapping()
		public ResponseEntity<Produto> saveProduto(@RequestBody Produto produto){
			return ResponseEntity.ok().body(produtoResource.saveProduto(produto));
		}
		

		@PutMapping("/{id}")
		public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto){
			return ResponseEntity.ok().body(produtoResource.updateProduto(produto));
		}

		@DeleteMapping("/{id}")
		public void deleteProduto(@PathVariable Long id){
			produtoResource.deleteProduto(id);
		}
	}
	

