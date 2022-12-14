package service;

import model.facility.Villa;

import java.io.IOException;
import java.util.Map;

public interface IVillaIOService {
    Map<Villa,Integer> readFile(String path) throws IOException;

    void writeFile(String path,Map<Villa,Integer> villaList) throws IOException;
}
