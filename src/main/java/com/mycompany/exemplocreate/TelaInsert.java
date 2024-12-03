/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.exemplocreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 0022216
 */
public class TelaInsert extends javax.swing.JFrame {

    public static Connection conecta(){
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "feevale";
            c = DriverManager.getConnection(url, user, password);   
            //c.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return c;
    }
    
    public static int buscaPelaDescricao(String desc){
        String comando = "SELECT id FROM marcas WHERE descricao=?";
        int id = 0;
        try {
            Connection c = conecta();
            PreparedStatement stmt = c.prepareStatement(comando);
            stmt.setString(1, desc);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                System.out.println("..."+id);
            }
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
        return id;
    }
    
    /**
     * Creates new form NewJFrame
     */
    public TelaInsert() {
        initComponents();
        
        //alimentar jComboBox
        System.out.println("AQUI");
        String sql = "SELECT * FROM marcas";
        Connection c = conecta();
        int total = 0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                total++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        } 
        
        
        String[] marcas = new String[total];
        
     
        sql = "SELECT * FROM marcas";
        c = TelaInsert.conecta();
        int cont=0;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                marcas[cont]=rs.getString("descricao");
                cont++;
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        DefaultComboBoxModel df;
        df = new DefaultComboBoxModel(marcas);
        jComboBox1.setModel(df);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtQuilometragem = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAno1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQuilometragem1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGravar1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Conecta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(55, 36, 235, 23);

        jButton2.setText("Cria tabela Marca");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 90, 235, 23);

        jButton3.setText("Inserir Veículo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(55, 145, 235, 23);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar);
        btnGravar.setBounds(220, 430, 72, 23);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Modelo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(46, 225, 100, 16);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ano");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(26, 265, 120, 16);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Quilometragem");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 305, 140, 16);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(36, 345, 110, 16);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Marca");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(46, 385, 100, 16);
        getContentPane().add(txtModelo);
        txtModelo.setBounds(164, 222, 190, 22);
        getContentPane().add(txtAno);
        txtAno.setBounds(164, 262, 58, 22);
        getContentPane().add(txtQuilometragem);
        txtQuilometragem.setBounds(164, 302, 100, 22);
        getContentPane().add(txtValor);
        txtValor.setBounds(164, 342, 140, 22);
        getContentPane().add(txtMarca);
        txtMarca.setBounds(164, 382, 140, 22);

        jButton4.setText("Inserir 3 veículos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(152, 180, 140, 23);

        jButton5.setText("Cria tabela");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(55, 94, 235, 23);

        jButton6.setText("Inserir 2 Marcas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(430, 180, 130, 23);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Modelo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 220, 100, 16);
        getContentPane().add(txtModelo1);
        txtModelo1.setBounds(560, 220, 190, 22);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Ano");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 260, 120, 16);
        getContentPane().add(txtAno1);
        txtAno1.setBounds(560, 260, 58, 22);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Quilometragem");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 300, 140, 16);
        getContentPane().add(txtQuilometragem1);
        txtQuilometragem1.setBounds(560, 300, 100, 22);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Valor");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 340, 110, 16);
        getContentPane().add(txtValor1);
        txtValor1.setBounds(560, 340, 140, 22);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Marca");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 380, 100, 16);

        btnGravar1.setText("Gravar");
        btnGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar1);
        btnGravar1.setBounds(570, 430, 72, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(560, 380, 140, 22);

        setBounds(0, 0, 857, 494);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Olá");
        try {
            Class.forName("org.postgresql.Driver");
            Connection c;
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String user = "postgres";
            String password = "feevale";
            c = DriverManager.getConnection(url, user, password);
            System.out.println("Deu certo");
            JOptionPane.showMessageDialog(
                    null,
                    "Deu certo");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection c;
            c = conecta();
            JOptionPane.showMessageDialog(
                    null,
                    "Tabela criada");
            String comando;
            comando = "CREATE TABLE if not exists marcas (\r\n"
                + "id serial PRIMARY KEY,\r\n"
                + "descricao varchar(30) NOT NULL,\r\n"
                + "ativo integer)";
            
            Statement stmt = c.createStatement();
            stmt.execute(comando);
            c.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = conecta();
            String comando;
            comando="INSERT INTO veiculos (modelo,"
                    + "ano_fabricacao,"
                    + "quilometragem) VALUES (?,?,?) ";
            PreparedStatement stmt;
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Cyber Truck");
            stmt.setInt(2,2024);
            stmt.setInt(3,1);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = conecta();
            String modelo = txtModelo.getText();
            Integer ano = Integer.valueOf(txtAno.getText());
            Integer quilometragem = Integer.valueOf(txtQuilometragem.getText());
            Float valor = Float.parseFloat(txtValor.getText());
            Integer marca = Integer.parseInt(txtMarca.getText());
            
            String comando;
            comando="INSERT INTO veiculos (modelo,"
                    + "ano_fabricacao,"
                    + "quilometragem,"
                    + "valor,"
                    + "marca_id) VALUES (?,?,?,?,?) ";
            PreparedStatement stmt;
            stmt = c.prepareStatement(comando);
            stmt.setString(1,modelo);
            stmt.setInt(2,ano);
            stmt.setInt(3,quilometragem);
            stmt.setFloat(4,valor);
            stmt.setInt(5,marca);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(
                    null,
                    "Gravado com Sucesso");
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = conecta();
            String comando;
            comando="INSERT INTO veiculos (modelo,"
                    + "ano_fabricacao,"
                    + "quilometragem, valor) VALUES (?,?,?,?) ";
            PreparedStatement stmt;
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Cyber Truck");
            stmt.setInt(2,2024);
            stmt.setInt(3,1);
            stmt.setDouble(4,100000.00);
            stmt.executeUpdate();
            
            comando="INSERT INTO veiculos (modelo,"
                    + "ano_fabricacao,"
                    + "quilometragem) VALUES (?,?,?,?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Camaro");
            stmt.setInt(2,2020);
            stmt.setInt(3,2);
            stmt.executeUpdate();
            
            comando="INSERT INTO veiculos (modelo,"
                    + "ano_fabricacao,"
                    + "quilometragem) VALUES (?,?,?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Ferrari");
            stmt.setInt(2,2000);
            stmt.setInt(3,3);
            stmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try {
            Connection c;
            c = conecta();
            JOptionPane.showMessageDialog(
                    null,
                    "Tabela criada");
            String comando;
            comando = "CREATE TABLE if not exists veiculos (\r\n"
                + "id serial PRIMARY KEY,\r\n"
                + "modelo varchar(30) NOT NULL,\r\n"
                + "ano_fabricacao integer,\r\n"
                + "quilometragem integer,\r\n"
                + "valor decimal(12,2),\r\n"
                + "marca_id integer\r\n,"
                + "ativo integer)";
            
            Statement stmt = c.createStatement();
            stmt.execute(comando);
            c.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try {
            Connection c = conecta();
            String comando;
            comando="INSERT INTO marcas (descricao) VALUES (?) ";
            PreparedStatement stmt;
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"GM");
            stmt.executeUpdate();
           
            
            comando="INSERT INTO marcas (descricao) VALUES (?) ";
            stmt = c.prepareStatement(comando);
            stmt.setString(1,"Fiat");
            stmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravar1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection c = conecta();
            String modelo = txtModelo1.getText();
            Integer ano = Integer.valueOf(txtAno1.getText());
            Integer quilometragem = Integer.valueOf(txtQuilometragem1.getText());
            Float valor = Float.parseFloat(txtValor1.getText());
            
            int idMarca = buscaPelaDescricao((String)jComboBox1.getSelectedItem());
            System.out.println("Marca = "+idMarca);
            String comando;
            comando="INSERT INTO veiculos (modelo,"
                    + "ano_fabricacao,"
                    + "quilometragem,"
                    + "valor,"
                    + "marca_id) VALUES (?,?,?,?,?) ";
            PreparedStatement stmt;
            stmt = c.prepareStatement(comando);
            stmt.setString(1,modelo);
            stmt.setInt(2,ano);
            stmt.setInt(3,quilometragem);
            stmt.setFloat(4,valor);
            stmt.setInt(5,idMarca);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(
                    null,
                    "Gravado com Sucesso");
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro");
        }
    }//GEN-LAST:event_btnGravar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnGravar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtAno1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtQuilometragem;
    private javax.swing.JTextField txtQuilometragem1;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}