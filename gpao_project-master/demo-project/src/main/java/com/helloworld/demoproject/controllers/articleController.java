package com.helloworld.demoproject.controllers;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.helloworld.demoproject.entities.article;
import com.helloworld.demoproject.models.Article;
import com.helloworld.demoproject.services.CategoryService;
import com.helloworld.demoproject.services.articleService;






@Controller
@RequestMapping(value = "/article")
public class articleController  {
	
	@Autowired
	private articleService articleService;
	
	@Autowired
	private CategoryService catService;
	
	
	
	
	@RequestMapping(value = "/")
	public String article(Model model) {
		List<article> articles = articleService.selectAll();
		if (articles == null) {
			articles = new ArrayList<article>();
		}
		model.addAttribute("articles", articles);
		return "article/article";
	}
	
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterArticle(Model model) {
		Article article = new Article();
		List<Category> categories = catService.selectAll();
		if (categories == null) {
			categories = new ArrayList<Category>();
		}
		model.addAttribute("article", article);
		model.addAttribute("categories", categories);
		return "article/ajouterArticle";
	}
	
	@RequestMapping(value = "/enregistrer")
	public String enregistrerArticle(Model model, com.helloworld.demoproject.entities.article article, MultipartFile file) {
		String photoUrl = null;
		if (article != null) {
			if (file != null && !file.isEmpty()) {
				InputStream stream = null;
				try {
					stream = file.getInputStream();
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						stream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			if (article.getIdArticle() != null) {
				articleService.update(article);
			} else {
				articleService.save(article);
			}
		}
		return "redirect:/article/";
	}
	
	@RequestMapping(value = "/modifier/{idArticle}")
	public String modifierArticle(Model model, @PathVariable Long idArticle) {
		if (idArticle != null) {
			article article = articleService.getById(idArticle);
			List<Category> categories = catService.selectAll();
			if (categories == null) {
				categories = new ArrayList<Category>();
			}
			model.addAttribute("categories", categories);
			if (article != null) {
				model.addAttribute("article", article);
			}
		}
		return "article/ajouterArticle";
	}
	
	@RequestMapping(value = "/supprimer/{idArticle}")
	public String supprimerArticle(Model model, @PathVariable Long idArticle) {
		if (idArticle != null) {
			article Article = articleService.getById(idArticle);
			if (Article != null) {
				//TODO Verification avant suppression
				articleService.remove(idArticle);
			}
		}
		return "redirect:/article/";
	}
	

}
