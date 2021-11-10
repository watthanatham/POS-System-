/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEN_Mainstaff_Manager;

import Chang.PosPanel;
import Jeab.UserManagementPanel;
import Noom.CustomerPanel;
import Pae.OrderPanel;
import Ploy.EmployeePanel;
import bank.StockPanel;
import bank.TestStockDialog;
import dao.ProductDao;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;
import model.Product;

/**
 *
 * @author Windows10
 */
public class MainmenuManager extends javax.swing.JPanel {

    /**
     * Creates new form WenPanel
     */
    public MainmenuManager() {
        initComponents();
        scrMain2.setViewportView(new MainMenuManagerPanel());
        File file = new File("image/logo.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblLogo.setIcon(new ImageIcon(image.getScaledInstance(180, 120, 0)));
        } catch (IOException ex) {

        }file = new File("image/home.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblHome.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }
         file = new File("image/pos.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblPos.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }
         file = new File("image/stock.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblStock.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }
         file = new File("image/logout.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblLogout.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }
        file = new File("image/customer.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblCus.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }file = new File("image/order.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblOrder.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }file = new File("image/employee.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblEmployee.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }file = new File("image/user.png");
        try {
            BufferedImage image = ImageIO.read(file);

            lblUser.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }
        file = new File("image/person1.jpg");
        try {
            BufferedImage image = ImageIO.read(file);

            lblicon.setIcon(new ImageIcon(image.getScaledInstance(30, 30, 0)));
        } catch (IOException ex) {

        }
        

    }
    public void refreshbtn(){
        btnPointofsell.setBackground(new Color(240,240,240));
        btnCustomerManagement.setBackground(new Color(240,240,240));
        btnEmployeeManagement.setBackground(new Color(240,240,240));
        btnHome.setBackground(new Color(240,240,240));
        btnLogout.setBackground(new Color(240,240,240));
        btnStockManagement.setBackground(new Color(240,240,240));
        btnUserManagement.setBackground(new Color(240,240,240));
        btnOrderManagement.setBackground(new Color(240,240,240));
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrMain2 = new javax.swing.JScrollPane();
        jPanelTop = new javax.swing.JPanel();
        jLabelMainManager = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnPointofsell = new javax.swing.JButton();
        btnStockManagement = new javax.swing.JButton();
        btnEmployeeManagement = new javax.swing.JButton();
        btnOrderManagement = new javax.swing.JButton();
        btnCustomerManagement = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnUserManagement = new javax.swing.JButton();
        lblHome = new javax.swing.JLabel();
        lblPos = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblCus = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        jPanelTop.setBackground(new java.awt.Color(153, 102, 0));

        jLabelMainManager.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMainManager.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMainManager.setText("Main Menu of Manager");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name : ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Natthawut");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Manager");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMainManager, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMainManager, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelTopLayout.createSequentialGroup()
                                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelTopLayout.createSequentialGroup()
                                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))))
                                .addGap(1, 1, 1))))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelMenu.setBackground(new java.awt.Color(255, 204, 153));

        btnHome.setText("Home");
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnPointofsell.setText("Point of Sell");
        btnPointofsell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointofsellActionPerformed(evt);
            }
        });

        btnStockManagement.setText("Stock Management");
        btnStockManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockManagementActionPerformed(evt);
            }
        });

        btnEmployeeManagement.setText("Employee Management");
        btnEmployeeManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeManagementActionPerformed(evt);
            }
        });

        btnOrderManagement.setText("Order Management");
        btnOrderManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderManagementActionPerformed(evt);
            }
        });

        btnCustomerManagement.setText("Customer Management");
        btnCustomerManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagementActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnUserManagement.setText("User Management");
        btnUserManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPointofsell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStockManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployeeManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomerManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUserManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPointofsell, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStockManagement, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrderManagement)
                    .addComponent(lblOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerManagement))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEmployeeManagement)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUserManagement)
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrMain2))
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrMain2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPointofsellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointofsellActionPerformed
        refreshbtn();
        btnPointofsell.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new PosPanel());
        
    }//GEN-LAST:event_btnPointofsellActionPerformed

    private void btnOrderManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderManagementActionPerformed
        refreshbtn();
        btnOrderManagement.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new OrderPanel());
    }//GEN-LAST:event_btnOrderManagementActionPerformed

    private void btnCustomerManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagementActionPerformed
        refreshbtn();
        btnCustomerManagement.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new CustomerPanel());
    }//GEN-LAST:event_btnCustomerManagementActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        refreshbtn();
        btnHome.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new MainMenuManagerPanel());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnStockManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockManagementActionPerformed
        refreshbtn();
        btnStockManagement.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new StockPanel());
    }//GEN-LAST:event_btnStockManagementActionPerformed

    private void btnEmployeeManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeManagementActionPerformed
        refreshbtn();
        btnEmployeeManagement.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new EmployeePanel());
    }//GEN-LAST:event_btnEmployeeManagementActionPerformed

    private void btnUserManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagementActionPerformed
        refreshbtn();
        btnUserManagement.setBackground(new Color(255,153,102));
        scrMain2.setViewportView(new UserManagementPanel());
    }//GEN-LAST:event_btnUserManagementActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerManagement;
    private javax.swing.JButton btnEmployeeManagement;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrderManagement;
    private javax.swing.JButton btnPointofsell;
    private javax.swing.JButton btnStockManagement;
    private javax.swing.JButton btnUserManagement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelMainManager;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JLabel lblCus;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblPos;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblicon;
    private javax.swing.JScrollPane scrMain2;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
