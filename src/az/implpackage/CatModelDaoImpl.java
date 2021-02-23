/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.implpackage;

import az.daopackage.CatModelDao;
import az.daopackage.DbHelper;
import az.javaapplication.CatData;
import az.javaapplication.SiteClass;
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
    public List<SiteClass> getSiteClassList() throws Exception {
    
         List<SiteClass> sClassList = new ArrayList<SiteClass>();
        Connection c = null; //baza ile elaqe yaradir
        PreparedStatement ps = null;//sql i run etmek ucun hazirlayir
        ResultSet rs = null;//sql den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ROWNUM r,ID,NAME FROM SITE\r\n";
        try {
            c = DbHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    SiteClass siteClass = new SiteClass();
                    siteClass.setR(rs.getLong("r"));
                    siteClass.setId(rs.getInt("ID"));
                    siteClass.setName(rs.getString("NAME"));
                    
                    
                    sClassList.add(siteClass);
                }
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utility.close(c, ps, rs);

        }
        return sClassList;
}

    @Override
    public boolean addCatModel(CatData catData) throws Exception {
boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO CATEGORY ( ID,CAT_NAME) \r\n"
                + " VALUES ( CATEGORY_SEQ.NEXTVAL,?)";
        try {
            c = DbHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, catData.getName());
                
                ps.execute();
                result = true;
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            c.commit();
            Utility.close(c, ps, null);
        }
        return result;
    }

    @Override
    public CatData getCatByName(Long catId) throws Exception {
       CatData guests = new CatData();
        Connection c = null; //baza ile elaqe yaradir
        PreparedStatement ps = null;//sql i run etmek ucun hazirlayir
        ResultSet rs = null;//sql den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ID,CAT_NAME FROM CATEGORY\r\n"
                + "WHERE ACTIVE=1 AND CAT_NAME = ?";
        try {
            c = DbHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, catId);
                rs = ps.executeQuery();
                if (rs.next()) {

                    guests.setId(rs.getLong("ID"));
                    guests.setName(rs.getString("CAT_NAME"));

                }
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utility.close(c, ps, rs);

        }
        return guests;
    }

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