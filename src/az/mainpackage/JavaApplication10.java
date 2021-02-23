/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.mainpackage;


import az.daopackage.CatModelDao;
import az.daopackage.DataListInterface;

import az.guiPackage.ListJFrame;

import az.implpackage.CatModelDaoImpl;
import az.implpackage.DataListClass;



import java.io.IOException;


/**
 *
 * @author ipi
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            

            CatModelDao catModelDao = new CatModelDaoImpl();
            DataListInterface dataListface = new DataListClass();
           
        ListJFrame listJFrame = new ListJFrame(catModelDao,dataListface);
        listJFrame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
    
    
}

