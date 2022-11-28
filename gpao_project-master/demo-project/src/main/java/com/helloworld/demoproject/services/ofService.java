package com.helloworld.demoproject.services;

import java.util.List;

import com.helloworld.demoproject.entities.of;

public interface ofService {
   
    public of save(of entity);
    
    public of update(of entity);

    public List<of> selectAll();

    public List<of> selectAll(String sortField, String sort);

    public void remove(Long id);

    public of getById(Long id);

    public of findOne(String paramName, Object paramValue);

    public of findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
    

}
