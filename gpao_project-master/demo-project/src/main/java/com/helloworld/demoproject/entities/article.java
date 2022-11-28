package com.helloworld.demoproject.entities;

import java.io.Serializable;

public class article implements Serializable{
   
	private Long idArticle;

	private String codeArticle;

	private String type_article;
    
    private String composition;

    
    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getType_article() {
        return type_article;
    }

    public void setType_article(String type_article) {
        this.type_article = type_article;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

	

	

	

	
    
}
