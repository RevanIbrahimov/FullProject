/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.implpackage;

import az.daopackage.DataListInterface;
import az.daopackage.DbHelper;
import az.javaapplication.AdvancedSearch1;
import az.javaapplication.CatData;
import az.javaapplication.DataList;

import az.util.Utility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ipi
 */
public class DataListClass implements DataListInterface {

    @Override
    public List<DataList> getDataList() throws Exception {
        List<DataList> dataLists = new ArrayList<DataList>();

        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql= "SELECT *\n" +
"  FROM (SELECT P.ID,\n" +
"               C.CAT_NAME,\n" +
"               P.PRODUCT_NAME,\n" +
"               P.PRODUCT_NUMBER,\n" +
"               P.PRODUCT_LINK,\n" +
"               P.INSERT_DATE,\n" +               
"               P.ACTIVE,\n" +
"               P.PRICE,\n" +
"               P.SITE_ID\n" +
"          FROM DATA_LIST P\n" +
"               INNER JOIN CATEGORY C\n" +
"                  ON P.CAT_ID = C.ID\n";
        
                String sql1 = ") PIVOT (SUM (PRICE)\n" +
"                                      FOR SITE_ID\n" +
"                                      IN  (1 AS \"AMAZON\",\n" +
"                                          2 AS \"MICRO\",\n" +
"                                          3 AS \"MYGSM\"))\n" +
" WHERE ACTIVE = 1 ";
                
        try {
            c = DbHelper.getConnection();
            if (c != null) {
                
                String sql2 = sql.concat(sql1);
                ps = c.prepareStatement(sql2);
                rs = ps.executeQuery();
                while (rs.next()) {
                    DataList dataList = new DataList();
                    CatData catData = new CatData();
                    catData.setName(rs.getString("CAT_NAME"));
                    
                    dataList.setId(rs.getInt("ID"));
                    dataList.setName(rs.getString("PRODUCT_NAME"));
                    dataList.setNumber(rs.getString("PRODUCT_NUMBER"));
                    dataList.setLink(rs.getString("PRODUCT_LINK"));
                    dataList.setHesabDate(rs.getDate("INSERT_DATE"));
                    dataList.setPrice(rs.getFloat("AMAZON"));
                    dataList.setPrice2(rs.getFloat("MICRO"));
                    dataList.setPrice3(rs.getFloat("MYGSM"));
                    dataList.setCat_Data(catData);
                    dataLists.add(dataList);
                    
                }

            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utility.close(c, ps, rs);
        }

        return dataLists;

    }

    @Override
    public boolean addDataList(DataList data) throws Exception {
        boolean result = false;
        Connection c = null;

        PreparedStatement ps = null;
        String sql = "INSERT INTO DATA_LIST(ID,SITE_ID,PRODUCT_NAME,PRODUCT_NUMBER,PRICE,PRODUCT_LINK,CAT_ID)\n"
                + "VALUES(DATA_LIST_SEQ.NEXTVAL,?,?,?,?,?,?) ";
        try {
            
            c = DbHelper.getConnection();

            if (c != null) {
                ps = c.prepareStatement(sql);
                
                ps.setInt(1 ,data.getSite_Id().getId());
                ps.setString(2,data.getName());
                ps.setString(3,data.getNumber());
                ps.setFloat(4, data.getPrice());
                ps.setString(5, data.getLink());
                ps.setLong(6, Long.valueOf(data.getCat_Data().getId()));
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
    public DataList getDataListById(int dataId) throws Exception{
          DataList payment = new DataList();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT *\r\n" 
                + "  FROM DATA_LIST PIVOT (SUM (PRICE)\r\n" 
                + "                 FOR SITE_ID\r\n" 
                + "                 IN (1 AS \"amazone\", 2 AS \"uae.microless\", 3 AS \"mygsm\")) \r\n"
                + "   WHERE ACTIVE =1 AND ID = ?";
        try {
            c = DbHelper.getConnection();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setInt(1, dataId);
                rs = ps.executeQuery();
                if (rs.next()) {
                    payment.setId(rs.getInt("ID"));
                    payment.setName(rs.getString("PRODUCT_NAME"));
                    payment.setNumber(rs.getString("PRODUCT_NUMBER"));
                    payment.setLink(rs.getString("PRODUCT_LINK"));
                    payment.setHesabDate(rs.getDate("INSERT_DATE"));
                    payment.setPrice(rs.getFloat("amazone"));
                    payment.setPrice2(rs.getFloat("uae.microless"));
                    payment.setPrice3(rs.getFloat("mygsm"));
                 }else{
                    payment=null;
                }
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utility.close(c, ps, rs);
        }
        return payment;
    }



    @Override
    public List<DataList> searchDataListData(AdvancedSearch1 advancedSearch1) throws Exception{
               List<DataList> dataList = new ArrayList<DataList>();
               DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT *\n" +
"  FROM (SELECT P.ID,\n" +
"               C.CAT_NAME,\n" +
"               P.PRODUCT_NAME,\n" +
"               P.PRODUCT_NUMBER,\n" +
"               P.PRODUCT_LINK,\n" +
"               P.INSERT_DATE,\n" +               
"               P.ACTIVE,\n" +
"               P.PRICE,\n" +
"               P.SITE_ID\n" +
"          FROM DATA_LIST P\n" +
"               INNER JOIN CATEGORY C\n" +
"                  ON P.CAT_ID = C.ID WHERE \n";
        
        String sql1 = " ) PIVOT (SUM (PRICE)\n" +
"                                      FOR SITE_ID\n" +
"                                      IN  (1 AS \"AMAZON\",\n" +
"                                          2 AS \"MICRO\",\n" +
"                                          3 AS \"MYGSM\"))\n" +
        "      WHERE ACTIVE =1 AND (LOWER(PRODUCT_NAME) LIKE LOWER(?) OR LOWER(PRODUCT_NUMBER) LIKE LOWER(?)\n" +
                " OR LOWER(PRODUCT_LINK) LIKE LOWER(?)) \r\n";
        try {
        c = DbHelper.getConnection();
            if (c != null) {
                
                if(advancedSearch1.getMinAmount() !=null && !advancedSearch1.getMinAmount().isEmpty()){
                    sql+=" PRICE >= "+ Float.parseFloat(advancedSearch1.getMinAmount());
                }
                if(advancedSearch1.getMaxAmount() !=null && !advancedSearch1.getMaxAmount().isEmpty()){
                    sql+=" AND PRICE <= "+ Float.parseFloat(advancedSearch1.getMaxAmount());
                }

                if(advancedSearch1.getBeginDate() !=null){
                    sql1+=" AND INSERT_DATE >= TO_DATE('"+new java.sql.Date(advancedSearch1.getBeginDate().getTime())+"','YYYY-MM-DD')";
                }
                if(advancedSearch1.getEndDate() !=null){
                    sql1+=" AND INSERT_DATE <= TO_DATE('"+new java.sql.Date(advancedSearch1.getEndDate().getTime())+"','YYYY-MM-DD')";
                }
                String sql2 = sql.concat(sql1);
                ps = c.prepareStatement(sql2);
                
                ps.setString(1, "%" + advancedSearch1.getAkeyword() + "%");
                ps.setString(2, "%" + advancedSearch1.getAkeyword() + "%");
                ps.setString(3, "%" + advancedSearch1.getAkeyword() + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    DataList dataLis = new DataList();
                    CatData catData = new CatData();
                    catData.setName(rs.getString("CAT_NAME"));
                    dataLis.setId(rs.getInt("ID"));
                    dataLis.setName(rs.getString("PRODUCT_NAME"));
                    dataLis.setNumber(rs.getString("PRODUCT_NUMBER"));
                    dataLis.setLink(rs.getString("PRODUCT_LINK"));
                    dataLis.setHesabDate(rs.getDate("INSERT_DATE"));
                    dataLis.setPrice(rs.getFloat("AMAZON"));
                    dataLis.setPrice2(rs.getFloat("MICRO"));
                    dataLis.setPrice3(rs.getFloat("MYGSM"));
                    dataLis.setCat_Data(catData);
                    dataList.add(dataLis);
                }
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Utility.close(c, ps, rs);
        }
        return dataList;
    }

}
