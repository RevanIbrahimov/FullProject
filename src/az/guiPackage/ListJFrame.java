/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.guiPackage;

import az.daopackage.CatModelDao;
import az.daopackage.DataListInterface;
import java.awt.Cursor;
import java.awt.Desktop;

import java.net.URI;

import java.util.List;

import az.javaapplication.AdvancedSearch1;
import az.javaapplication.CatData;
import az.javaapplication.DataList;
import az.javaapplication.Item;

import az.javaapplication.SiteClass;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author ipi
 */
public class ListJFrame extends javax.swing.JFrame {

    private CatModelDao catModelDao;
    private DataListInterface dataListface;

    public ListJFrame() {
        initComponents();
    }

    public ListJFrame(CatModelDao catModelDao, DataListInterface dataListface) {
        initComponents();

        this.catModelDao = catModelDao;
        this.dataListface = dataListface;
        
        try {
            List<DataList> hesab = dataListface.getDataList();
            showDataHesabat(hesab);
            showSiteCombo();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
        );

        jButton1.setText("Search in Site");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Search in Project");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("MİN price");

        jLabel3.setText("MAX price");

        jLabel4.setText("BEGIN date");

        jLabel5.setText("END date");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("____");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Item categoryItem = (Item) jComboBox1.getSelectedItem();
            String text = jTextField1.getText();
            DataList javaMod = new DataList();
            SiteClass clas = new SiteClass();

            CatData catData = new CatData();
            String surl = "";

            surl = "https://www.amazon.ae/";
            System.out.println("Fetching ..." + surl);
            Document doc = Jsoup.connect(surl)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                    .referrer("http://www.google.com")
                    .ignoreHttpErrors(true)
                    .get();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                String urlResponse = link.attr("abs:href");
                System.out.println("-------------------------" + urlResponse);
                Document page = Jsoup.connect(urlResponse)
                        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                        .referrer("http://www.google.com")
                        .ignoreHttpErrors(true)
                        .get();
                String nameSelector = ".a-link-normal";
                Elements nameElements = page.select(nameSelector);

                for (Element name : nameElements) {
                    if (name.text().matches("(.*)" + text + "(.*)")) {
                        String linkResponse = name.attr("href");
                        String aLink = "";
                        if (linkResponse.matches("https://www.amazon.ae(.*)")) {
                            aLink = linkResponse;
                        } else {
                            aLink = ("https://www.amazon.ae" + linkResponse);
                        }
                        String linkName = name.text();

                        System.out.println(name.text());
                        Document pag = Jsoup.connect(aLink)
                                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                                .referrer("http://www.google.com")
                                .ignoreHttpErrors(true)
                                .get();
                        String nameSelecto = "#price_inside_buybox";
                        Elements nameElement = pag.select(nameSelecto);
                        for (Element nam : nameElement) {

                            String linkRespons = nam.text();

                            String[] ard = linkRespons.split(" ");
                            String sr = ard[1];
                            System.out.println(sr);
                            if (sr.matches("(.*),(.*)")) {
                                String[] sed = sr.split(",");
                                String dev = sed[0].concat(sed[1]);
                                javaMod.setPrice(Float.valueOf(dev));
                            } else {
                                javaMod.setPrice(Float.valueOf(sr));
                            }
                            String nameSelect = ".a-size-base.prodDetAttrValue";
                            String nameSeleco = ".a-color-secondary.a-size-base.prodDetSectionEntry";
                            Elements nameElemeno = pag.select(nameSelect);
                            Elements nameElemento = pag.select(nameSeleco);
                            for (int i = 0; i < nameElemeno.size(); i++) {

                                String names = nameElemento.get(i).text();
                                if (names.matches("Item model number")) {
                                    String sefr = nameElemeno.get(i).text();
                                    javaMod.setNumber(sefr);
                                    System.out.println(sefr);
                                }
                            }
                            javaMod.setName(linkName);
                            javaMod.setLink(aLink);
                            catData.setId(categoryItem.getId());
                            javaMod.setCat_Data(catData);
                            clas.setId(1);
                            javaMod.setSite_Id(clas);

                            dataListface.addDataList(javaMod);

                        }
                    }
                }
            }

            surl = "https://uae.microless.com/";

            System.out.println("Fetching ..." + surl);
            Document doci = Jsoup.connect(surl)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                    .referrer("http://www.google.com")
                    .ignoreHttpErrors(true)
                    .get();
            Elements linksi = doci.select("a[href]");
            for (Element link : linksi) {
                String urlResponse = link.attr("abs:href");
                System.out.println("-------------------------" + urlResponse);
                if (urlResponse.matches("https(.*)")) {

                    Document page = Jsoup.connect(urlResponse)
                            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                            .referrer("http://www.google.com")
                            .ignoreHttpErrors(true)
                            .get();
                    String nameSelector = ".product-title > a";
                    Elements nameElements = page.select(nameSelector);

                    for (Element name : nameElements) {
                        if (name.text().matches("(.*)" + text + "(.*)")) {
                            String linkResponse = name.attr("href");
                            String aLink = "";
                            if (linkResponse.matches("https(.*)")) {
                                aLink = linkResponse;
                            } else if (linkResponse.matches("/(.*)")) {
                                aLink = ("https://uae.microless.com" + linkResponse);
                            }
                            String linkName = name.text();
                            System.out.println(linkName);
                            System.out.println(aLink + "----------");

                            Document pag = Jsoup.connect(aLink)
                                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                                    .referrer("http://www.google.com")
                                    .ignoreHttpErrors(true)
                                    .get();
                            String nameSelecto = ".product-price-wrapper";
                            Elements nameElement = pag.select(nameSelecto);
                            for (Element nam : nameElement) {

                                String linkRespons = nam.text();
                                String[] arsin = linkRespons.split(" ");
                                String si = arsin[0];
                                if (si.matches("(.*),(.*)")) {
                                    String[] sem = si.split(",");
                                    String devo = sem[0].concat(sem[1]);
                                    javaMod.setPrice(Float.valueOf(devo));
                                    System.out.println(devo);
                                } else {
                                    javaMod.setPrice(Float.valueOf(si));
                                    System.out.println(si);
                                }

                                javaMod.setName(linkName);
                                javaMod.setLink(aLink);
//                            this site not model number
                                javaMod.setNumber(" ");
                                catData.setId(categoryItem.getId());
                                javaMod.setCat_Data(catData);
                                clas.setId(2);
                                javaMod.setSite_Id(clas);
                                dataListface.addDataList(javaMod);
                            }

                        }
                    }
                }
            }

            surl = "https://www.mygsm.me/";

            System.out.println("Fetching ..." + surl);
            Document doce = Jsoup.connect(surl)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                    .referrer("http://www.google.com")
                    .ignoreHttpErrors(true)
                    .get();
            Elements linkse = doce.select("a[href]");
            for (Element link : linkse) {
                String urlResponse = link.attr("abs:href");
                System.out.println("-------------------------" + urlResponse);
                if (urlResponse.matches("https(.*)")) {

                    Document page = Jsoup.connect(urlResponse)
                            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                            .referrer("http://www.google.com")
                            .ignoreHttpErrors(true)
                            .get();
                    String nameSelector = ".product-item-link";

                    Elements nameElements = page.select(nameSelector);

                    for (Element name : nameElements) {
                        if (name.text().matches("(.*)" + text + "(.*)")) {
                            String linkResponse = name.attr("href");
                            String aLink = "";
                            if (linkResponse.matches("https://www.mygsm.me(.*)")) {
                                aLink = linkResponse;
                            } else {
                                aLink = ("https://www.mygsm.me" + linkResponse);
                            }
                            String linkName = name.text();
                            System.out.println(linkName);
                            System.out.println(aLink + "------------");
                            Document pag = Jsoup.connect(aLink)
                                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")
                                    .referrer("http://www.google.com")
                                    .ignoreHttpErrors(true)
                                    .get();
                            String nameSelecto = ".price-wrapper";
                            Element nameElement = pag.select(nameSelecto).first();

                            String linkRespons = nameElement.text();

                            String[] ars = linkRespons.split("AED");
                            String se = ars[1];

                            if (se.matches("(.*),(.*)")) {
                                String[] serp = se.split(",");
                                String vevo = serp[0].concat(serp[1]);
                                javaMod.setPrice(Float.valueOf(vevo));
                                System.out.println(vevo);
                            } else {
                                javaMod.setPrice(Float.valueOf(se));
                                System.out.println(se);
                            }

                            javaMod.setName(linkName);
                            javaMod.setLink(aLink);
//                            this site not model number
                            javaMod.setNumber(" ");
                            catData.setId(categoryItem.getId());
                            javaMod.setCat_Data(catData);
                            clas.setId(3);
                            javaMod.setSite_Id(clas);
                            dataListface.addDataList(javaMod);

                        }
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {

            int columnIndex = jTable1.getSelectedColumn();
            int rowIndex = jTable1.getSelectedRow();
            int selectedRow = (int) jTable1.getValueAt(rowIndex, 0);

            DataList hesabData = dataListface.getDataListById(selectedRow);

            if (columnIndex == 5) {
                float vop = (float) jTable1.getValueAt(rowIndex, columnIndex);
                if (vop != 0) {
                    String texta = hesabData.getLink();
                    Desktop.getDesktop().browse(new URI(texta));
                }

            } else if (columnIndex == 6) {
                float vop = (float) jTable1.getValueAt(rowIndex, columnIndex);
                if (vop != 0) {
                    String texta = hesabData.getLink();
                    Desktop.getDesktop().browse(new URI(texta));
                }
            } else if (columnIndex == 7) {
                float vop = (float) jTable1.getValueAt(rowIndex, columnIndex);
                if (vop != 0) {
                    String texta = hesabData.getLink();
                    Desktop.getDesktop().browse(new URI(texta));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Choose,Price column !");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            AdvancedSearch1 advancedSearch1 = new AdvancedSearch1();
            String text = jTextField1.getText();
            String text2 = jTextField2.getText();
            String text3 = jTextField3.getText();
            Date dob1 = jDateChooser1.getDate();
            Date dob2 = jDateChooser2.getDate();
            advancedSearch1.setAkeyword(text);
            advancedSearch1.setMinAmount(text2);
            advancedSearch1.setMaxAmount(text3);
            advancedSearch1.setBeginDate(dob1);
            advancedSearch1.setEndDate(dob2);
            List<DataList> searchList = dataListface.searchDataListData(advancedSearch1);
            showDataHesabat(searchList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void showSiteCombo() {
        try {
            List<CatData> catList = catModelDao.getCatModelList();
            DefaultComboBoxModel guestsCombo = (DefaultComboBoxModel) jComboBox1.getModel();
            for (CatData catData : catList) {
                guestsCombo.addElement(new Item(Long.valueOf(catData.getId()),catData.getName()));
                       
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void showDataHesabat(List<DataList> hesabDatas) {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("ID");
            model.addColumn("ADLAR");
            model.addColumn("MODEL NUMBER");
            model.addColumn("CATEGORY");
            model.addColumn("DATE");
            model.addColumn("amazone");
            model.addColumn("uae.microless");
            model.addColumn("mygsm");

            jTable1.setCursor(new Cursor(Cursor.HAND_CURSOR));

            for (DataList javamodel : hesabDatas) {
                Object[] dataName = new Object[]{
                    javamodel.getId(), javamodel.getName(), javamodel.getNumber(), javamodel.getCat_Data().getName(),
                    javamodel.getHesabDate(), javamodel.getPrice(),
                    javamodel.getPrice2(), javamodel.getPrice3()
                };

                model.addRow(dataName);

            }
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(0).setWidth(0);

            model.fireTableDataChanged();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
