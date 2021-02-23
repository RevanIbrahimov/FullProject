/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.daopackage;

import az.javaapplication.CatData;
import az.javaapplication.SiteClass;
import java.util.List;

/**
 *
 * @author ipi
 */
public interface CatModelDao {
     List<SiteClass> getSiteClassList() throws Exception;
     
     boolean addCatModel(CatData catData) throws Exception;
     
     CatData getCatByName(Long catId) throws Exception;
     
     List<CatData> getCatModelList() throws Exception;

     
}
