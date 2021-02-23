/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.implpackage;

import az.daopackage.CatModelDao;
import az.daopackage.DbHelper;
import az.modelPackage.CatData;
import az.util.Utility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ipi
 */
public class CatModelDaoImpl implements CatModelDao {

    @Override
    public List<CatData> getCatModelList() throws Exception {
 List<CatData> jModelList = new ArrayList<CatData>();
        Connection c = null; //baza ile elaqe yaradir
        PreparedStatement ps = null;//sql i run etmek ucun hazirlayir
        ResultSet rs = null;//sql den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ID,CAT_NAME FROM CATEGORY\r\n"
        +"WHERE ACTIVE=1";
        try {
            c = DbHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    CatData javaModel = new CatData();
                    
                    
                    javaModel.setId(rs.getLong("ID"));
                    javaModel.setName(rs.getString("CAT_NAME"));
                    
                    jModelList.add(javaModel);
                }
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utility.close(c, ps, rs);

        }
        return jModelList;    }
}