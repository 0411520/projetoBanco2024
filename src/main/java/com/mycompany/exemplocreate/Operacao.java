/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocreate;

import static com.mycompany.exemplocreate.TelaInsert.conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.swing.*;

/**
 *
 * @author 0022216
 */
public class Operacao {
    
    public Operacao(){
        
    }
    
    public char[] converteStringToChar(String password){
        char[] senhaBanco = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            System.out.println(senhaBanco[i]);
            senhaBanco[i] = password.charAt(i);
            System.out.println(senhaBanco[i]);
        } 
        return senhaBanco;
    }
    
    public String converteCharToString(char[] pass){
        String senhaConvertida="";
        for (int i = 0; i < pass.length; i++) {
            senhaConvertida=senhaConvertida+pass[i];
        }
        return senhaConvertida;
    }
    
    public void historico(int idUSer,int success){
        Connection c = TelaInsert.conecta();
        PreparedStatement pstmt;
        try {
            LocalDateTime quando = LocalDateTime.now();
            Timestamp timestamp = Timestamp.valueOf (quando) ;
            c = conecta () ;
            String comando = "INSERT INTO history ("
                + "id_user,"
                + "dataHora,"
                + "success) "
                + "VALUES (?,?,?)";
                pstmt = c. prepareStatement(comando) ;
                pstmt.setInt(1, idUSer) ;
                pstmt.setTimestamp(2, timestamp);
                pstmt.setInt(3, success) ;
                pstmt.execute() ;
        }catch (Exception e) {
            System.out.println("Erro "+e.getMessage ()) ;
        }
    }
    
    public void atualizaQuant(int idUSer, int quant){
        Connection c = TelaInsert.conecta();
        PreparedStatement pstmt;
        
        String sqlUp = "UPDATE users set "
            + "quant=? "
            + "WHERE id=?";
        try {
            c = conecta();
            pstmt = c. prepareStatement(sqlUp) ;
            pstmt.setInt(1, quant+1);
            pstmt.setInt(2, idUSer);
            System.out.println("SQL "+sqlUp);
            System.out.println("id "+idUSer);
            System.out.println("quant "+quant);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }
    
    public User buscaUser(String username){
        String password; 
        int quant;
        int id;
        User user = new User(-2);
        Connection c = TelaInsert.conecta();
        String sql = "SELECT * FROM users WHERE username='"+username+"'";
        ResultSet rs;
        try {
            Statement stmt = c.createStatement();
            stmt = c.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                username = rs.getString("username");
                password = rs.getString("password");
                quant = rs.getInt("quant");
                id = rs.getInt("id");
                user = new User(id,quant,username,password);
            }
        } catch (SQLException e) {
            System.out.println("Erro "+e.getMessage());
        }
        return user;
    }
    
    public void envia(String to, String subject, String body) {
        // Configurações do servidor SMTP
        String host = "smtp.gmail.com";
        String from = "joropaca.ar@gmail.com";  // Substitua pelo seu e-mail
        String password = "xxx xxx xxx xxx";        // Substitua pela sua senha de aplicativo, não é com a senha do email.

        // Configurações das propriedades do JavaMail
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Autenticação
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Criando o e-mail
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            // Enviando o e-mail
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso!");
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao enviar o e-mail.");
        }
    
        
    }
}
