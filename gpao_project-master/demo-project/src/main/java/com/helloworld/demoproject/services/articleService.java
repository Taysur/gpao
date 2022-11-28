package com.helloworld.demoproject.services;
import java.util.List;

import com.helloworld.demoproject.entities.article;

public interface articleService {

   

        public article save(article entity);
    
        public article update(article entity);
    
        public List<article> selectAll();
    
        public List<article> selectAll(String sortField, String sort);
    
        public void remove(Long id);
    
        public article getById(Long id);
    
        public article findOne(String paramName, Object paramValue);
    
        public article findOne(String[] paramNames, Object[] paramValues);
    
        public int findCountBy(String paramName, String paramValue);
    
    
}
