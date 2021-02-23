/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.daopackage;

import az.modelPackage.CatData;
import java.util.List;

/**
 *
 * @author ipi
 */
public interface CatModelDao {
     
     
     List<CatData> getCatModelList() throws Exception;

     
}
