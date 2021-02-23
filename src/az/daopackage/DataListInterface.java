/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.daopackage;

import az.javaapplication.AdvancedSearch1;
import az.javaapplication.DataList;
import java.util.List;

/**
 *
 * @author ipi
 */
public interface DataListInterface {
    
     List<DataList> getDataList() throws Exception;
    boolean addDataList(DataList data) throws Exception;
    
    
    
    DataList getDataListById(int selectedRow) throws Exception;

    public List<DataList> searchDataListData(AdvancedSearch1 advancedSearch1) throws Exception;
}
