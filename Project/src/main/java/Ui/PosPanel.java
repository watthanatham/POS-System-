/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Ui.ReceiptOrder;
import Ui.Membership.CustomerObserver;
import Ui.ProductPanel.OnBuyProductListener;
import dao.ProductDao;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Order;
import model.Product;
import model.User;

/**
 *
 * @author watan
 */
public class PosPanel extends javax.swing.JPanel implements OnBuyProductListener, CustomerObserver {

    private ArrayList<Product> productList;
    private final ArrayList<Product> selectProduct = new ArrayList();
    private ArrayList<Product> allProduct;
    private double total = 0;
    private double promoDiscount = 0;
    private double cusDiscount = 0;
    private double cash = 0;
    private double sumTotal = 0;
    private double change = 0;

    /**
     * Creates new form PosPanel
     */
    public PosPanel() {
        initComponents();
        ProductDao dao = new ProductDao();
        productList = dao.getCoffee();
        int productSize = productList.size();
        productsPanel.setLayout(new GridLayout(productSize / 3 + productSize % 3, 2));
        for (Product product : productList) {
            ProductPanel p = new ProductPanel(product);
            p.addOnBuyProductListener(this);
            productsPanel.add(p);

        }
        System.out.println(productList);
    }

    public void refresh() {
        if (selectProduct != null) {
            clearList();
        }
        loadTable();
        defaultValue();
        moneySummaryUpdate();
        loadButton();
    }

    private void loadButton() {
        if (selectProduct.size() > 0 && cash - sumTotal >= 0) {
            btnPrint.setEnabled(true);
        } else {
            btnPrint.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtTextTotal = new javax.swing.JLabel();
        txtTextMember = new javax.swing.JLabel();
        txtTextName = new javax.swing.JLabel();
        txtLine = new javax.swing.JLabel();
        txtTextTal = new javax.swing.JLabel();
        txtTextCash = new javax.swing.JLabel();
        txtTextChange = new javax.swing.JLabel();
        txtTTSales = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        txtTotalMoney = new javax.swing.JLabel();
        txtCash = new javax.swing.JLabel();
        txtChange = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        btnMembership = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnReceive = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productsPanel = new javax.swing.JPanel();
        btnCoffee = new javax.swing.JButton();
        btnMT = new javax.swing.JButton();
        btnBakery = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(202, 128, 54));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("List");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Product Name", "Price", "Qty", "Amount"
            }
        ));
        tblProducts.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblProducts.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblProducts);

        jPanel2.setBackground(new java.awt.Color(202, 128, 54));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Money Summary");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTextTotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTextTotal.setText("Total Sales (Exc. Tax):");

        txtTextMember.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTextMember.setText("-----------------------       Member     -------------------------");

        txtTextName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTextName.setText("Name :");

        txtLine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtLine.setText("----------------------------------------------------------");

        txtTextTal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTextTal.setText("Total :");

        txtTextCash.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTextCash.setText("Cash :");

        txtTextChange.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTextChange.setText("Change :");

        txtTTSales.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTTSales.setText("THB 0.00");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtName.setText("NA");

        txtTotalMoney.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalMoney.setText("THB 0.00");

        txtCash.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCash.setText("THB 0.00");

        txtChange.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtChange.setText("THB 0.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTextMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTextTal)
                                    .addComponent(txtTextCash)
                                    .addComponent(txtTextChange)
                                    .addComponent(txtTextName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotalMoney)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtChange)
                                                    .addComponent(txtCash))))
                                        .addGap(26, 26, 26))
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtTextTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTTSales)
                        .addGap(41, 41, 41))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextTotal)
                    .addComponent(txtTTSales))
                .addGap(18, 18, 18)
                .addComponent(txtTextMember)
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextName)
                    .addComponent(txtName))
                .addGap(18, 18, 18)
                .addComponent(txtLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextTal)
                    .addComponent(txtTotalMoney))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextCash)
                    .addComponent(txtCash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextChange)
                    .addComponent(txtChange))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnPrint.setBackground(new java.awt.Color(255, 0, 0));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnMembership.setBackground(new java.awt.Color(255, 153, 0));
        btnMembership.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMembership.setForeground(new java.awt.Color(255, 255, 255));
        btnMembership.setText("Membership");
        btnMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembershipActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(0, 153, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnReceive.setBackground(new java.awt.Color(0, 153, 0));
        btnReceive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReceive.setForeground(new java.awt.Color(255, 255, 255));
        btnReceive.setText("Receive");
        btnReceive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMembership, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReceive, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnMembership, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        productsPanel.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout productsPanelLayout = new javax.swing.GroupLayout(productsPanel);
        productsPanel.setLayout(productsPanelLayout);
        productsPanelLayout.setHorizontalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        productsPanelLayout.setVerticalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(productsPanel);

        btnCoffee.setBackground(new java.awt.Color(204, 102, 0));
        btnCoffee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCoffee.setForeground(new java.awt.Color(255, 255, 255));
        btnCoffee.setText("Inthanin Coffee");
        btnCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoffeeActionPerformed(evt);
            }
        });

        btnMT.setBackground(new java.awt.Color(204, 102, 0));
        btnMT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMT.setForeground(new java.awt.Color(255, 255, 255));
        btnMT.setText("Milk & Tea");
        btnMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTActionPerformed(evt);
            }
        });

        btnBakery.setBackground(new java.awt.Color(204, 102, 0));
        btnBakery.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBakery.setForeground(new java.awt.Color(255, 255, 255));
        btnBakery.setText("Bakery");
        btnBakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBakeryActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Type of Product");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnCoffee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMT, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBakery, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCoffee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBakery, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        Customer customer = new Customer(5,"watt","911");
        User user = new User(4,"admin","Manager","1234");
        Order order  = new Order(1,new Date(),total, user, customer);
        for(Product p : selectProduct) {
            order.addDetailOrder(-1,p);
        }
        ReceiptOrder recp = new ReceiptOrder(order,total,cash,this);
        recp.setVisible(true);
        refresh();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnReceiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiveActionPerformed
        cash = Double.parseDouble(JOptionPane.showInputDialog(this, "Input money receive", null));
        //refresh();
        moneySummaryUpdate();
    }//GEN-LAST:event_btnReceiveActionPerformed

    private void btnMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembershipActionPerformed
        Membership member = new Membership();
        member.addSelect(this);
        member.setVisible(true);
        
    }//GEN-LAST:event_btnMembershipActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        AddMember add = new AddMember();
        add.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMTActionPerformed
        getMT();
    }//GEN-LAST:event_btnMTActionPerformed

    private void getMT() {
        ProductDao dao = new ProductDao();
        productList = dao.getMT();
        productsPanel.removeAll();
        productsPanel.revalidate();
        productsPanel.repaint();
        int productSize = productList.size();
        productsPanel.setLayout(new GridLayout(productSize / 3 + productSize % 3, 2));
        for (Product product : productList) {
            ProductPanel p = new ProductPanel(product);
            p.addOnBuyProductListener(this);
            productsPanel.add(p);

        }
    }

    private void btnCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoffeeActionPerformed
        getCoffee();
    }//GEN-LAST:event_btnCoffeeActionPerformed

    public void getCoffee() {
        ProductDao dao = new ProductDao();
        productList = dao.getCoffee();
        productsPanel.removeAll();
        productsPanel.revalidate();
        productsPanel.repaint();
        int productSize = productList.size();
        productsPanel.setLayout(new GridLayout(productSize / 3 + productSize % 3, 2));
        for (Product product : productList) {
            ProductPanel p = new ProductPanel(product);
            p.addOnBuyProductListener(this);
            productsPanel.add(p);

        }
    }

    private void btnBakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBakeryActionPerformed
        ProductDao dao = new ProductDao();
        productList = dao.getBakery();
        productsPanel.removeAll();
        productsPanel.revalidate();
        productsPanel.repaint();
        int productSize = productList.size();
        productsPanel.setLayout(new GridLayout(productSize / 3 + productSize % 3, 2));
        for (Product product : productList) {
            ProductPanel p = new ProductPanel(product);
            p.addOnBuyProductListener(this);
            productsPanel.add(p);
        }
    }//GEN-LAST:event_btnBakeryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBakery;
    private javax.swing.JButton btnCoffee;
    private javax.swing.JButton btnMT;
    private javax.swing.JButton btnMembership;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReceive;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JTable tblProducts;
    private javax.swing.JLabel txtCash;
    private javax.swing.JLabel txtChange;
    private javax.swing.JLabel txtLine;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtTTSales;
    private javax.swing.JLabel txtTextCash;
    private javax.swing.JLabel txtTextChange;
    private javax.swing.JLabel txtTextMember;
    private javax.swing.JLabel txtTextName;
    private javax.swing.JLabel txtTextTal;
    private javax.swing.JLabel txtTextTotal;
    private javax.swing.JLabel txtTotalMoney;
    // End of variables declaration//GEN-END:variables

    @Override
    public void buy(Product product, int amount) {
        System.out.println(product);
        product.setAmount(amount);
        if (!selectProduct.contains(product)) {
            selectProduct.add(product);
        } else {
            int pList = selectProduct.indexOf(product);
            selectProduct.set(pList, product);
        }
        int index = selectProduct.indexOf(product);
        if (amount == 0) {
            selectProduct.remove(index);
            defaultValue();
        }
        loadTable();
        loadTotal();
    }

    public void loadTotal() {

        for (Product p : selectProduct) {
            total = p.getAmount() * p.getPrice();
        }
        moneySummaryUpdate();

    }


    public void loadTable() {
        ProductTableModel model = new ProductTableModel(selectProduct);
        tblProducts.setModel(model);
        
    }

    @Override
    public void select(Customer customer) {
        System.out.println(customer);
        txtName.setText(customer.getName());
    }

    private class ProductTableModel extends AbstractTableModel {

        private final ArrayList<Product> data;
        String[] columnName = {"ID", "Name", "Price", "Qty", "Amount"};

        public ProductTableModel(ArrayList<Product> data) {
            this.data = data;
        }

        @Override
        public int getRowCount() {
            return this.data.size();
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Product product = this.data.get(rowIndex);
            if (columnIndex == 0) {
                return product.getId();
            }
            if (columnIndex == 1) {
                return product.getName();
            }
            if (columnIndex == 2) {
                return product.getPrice();
            }
            if (columnIndex == 3) {
                return product.getAmount();
            }
            if (columnIndex == 4) {
                return product.getAmount() * product.getPrice();
            }
            return "";
        }

        @Override
        public String getColumnName(int column) {
            return columnName[column];
        }

        private void loadListTableModel() {
            ProductTableModel model = new ProductTableModel(selectProduct);
            tblProducts.setModel(model);
        }
    }

    private void defaultValue() {
        total = 0;
        cusDiscount = 0;
        cash = 0;
        sumTotal = 0;
        change = 0;
        txtName.setText("NA");
    }

    private void moneySummaryUpdate() {
        txtTTSales.setText("THB " + total);
        txtTotalMoney.setText("THB " + total);
        txtCash.setText("THB " + cash);
        txtChange.setText("THB " + (cash - total));

    }

    public void clearList() {
        selectProduct.clear();
    }
}
