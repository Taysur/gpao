package com.helloworld.demoproject.services;


import java.util.List;

import com.helloworld.demoproject.entities.ilot;

public interface ilotService {
    

    public ilot save(ilot entity);
    
    public ilot update(ilot entity);

    public List<ilot> selectAll();

    public List<ilot> selectAll(String sortField, String sort);

    public void remove(Long id);

    public ilot getById(Long id);

    public ilot findOne(String paramName, Object paramValue);

    public ilot findOne(String[] paramNames, Object[] paramValues);

    public int findCountBy(String paramName, String paramValue);
}
