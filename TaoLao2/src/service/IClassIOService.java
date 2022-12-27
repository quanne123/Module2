package service.impl;

import model.Class;

import java.util.Map;

public interface IClassIOService {
    
    Map<Class,Integer> readFile(String path);
    
    void writeFile(String path,Map<Class,Integer> listClass );
}
