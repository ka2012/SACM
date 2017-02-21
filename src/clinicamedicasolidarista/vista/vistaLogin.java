package clinicamedicasolidarista.vista;

import clinicamedicasolidarista.ClinicaMedicaSolidarista;
import clinicamedicasolidarista.controlador.Controlador;
import clinicamedicasolidarista.modelo.usuario.RegistroUsuarios;
import clinicamedicasolidarista.modelo.usuario.Usuario;
import java.awt.Color;
import static java.awt.SystemColor.control;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import org.apache.commons.codec.digest.DigestUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angelica
 */
public class vistaLogin extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form vistaLogin
     */
    public vistaLogin(Controlador control) {
        initComponents();
        this.control=control;
        control.registrarObservador(this);
        //control.registrarObservador(ClinicaMedicaSolidarista.ADMINISTRADOR);
        //ClinicaMedicaSolidarista.ADMINISTRADOR.setControl(control);
    }

    vistaLogin() {
        initComponents();
        //areglar esto para la tarea de usabilidad del logout
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etqFondo = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        etqUsuario = new javax.swing.JLabel();
        etqContraseña = new javax.swing.JLabel();
        textRegistroUsuario = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        etqPrincipalUsuario = new javax.swing.JLabel();
        iconAsetaca = new javax.swing.JLabel();
        etqOlvidasteTuContraeña = new javax.swing.JLabel();
        textContraseña = new javax.swing.JPasswordField();
        panelPrincipal1 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane9 = new javax.swing.JDesktopPane();
        jDesktopPane10 = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane11 = new javax.swing.JDesktopPane();
        jDesktopPane12 = new javax.swing.JDesktopPane();
        jLabel11 = new javax.swing.JLabel();
        jDesktopPane23 = new javax.swing.JDesktopPane();
        jDesktopPane24 = new javax.swing.JDesktopPane();
        jLabel17 = new javax.swing.JLabel();
        jDesktopPane25 = new javax.swing.JDesktopPane();
        jDesktopPane26 = new javax.swing.JDesktopPane();
        jLabel18 = new javax.swing.JLabel();
        jDesktopPane27 = new javax.swing.JDesktopPane();
        jDesktopPane28 = new javax.swing.JDesktopPane();
        jLabel19 = new javax.swing.JLabel();
        jDesktopPane29 = new javax.swing.JDesktopPane();
        jDesktopPane30 = new javax.swing.JDesktopPane();
        jLabel20 = new javax.swing.JLabel();
        jDesktopPane31 = new javax.swing.JDesktopPane();
        jDesktopPane32 = new javax.swing.JDesktopPane();
        jLabel21 = new javax.swing.JLabel();

        etqFondo.setBackground(new java.awt.Color(255, 255, 255));
        etqFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/fondoBlanco.jpg"))); // NOI18N
        etqFondo.setText("jLabel1");

        jDesktopPane1.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane2.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane1.add(jDesktopPane2);
        jDesktopPane2.setBounds(0, 510, 960, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/E2.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(930, 0, 20, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SISTEMA DE ADMINISTRACION DE CITAS MEDICAS - MENU PRINCIPAL");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(10, 0, 480, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(379, 542));
        setMinimumSize(new java.awt.Dimension(379, 542));
        setPreferredSize(new java.awt.Dimension(379, 542));
        setResizable(false);

        panelPrincipal.setMaximumSize(new java.awt.Dimension(370, 535));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(370, 535));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(370, 535));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/user.png"))); // NOI18N
        panelPrincipal.add(etqUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 80));

        etqContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/key (1).png"))); // NOI18N
        panelPrincipal.add(etqContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, 70));

        textRegistroUsuario.setForeground(new java.awt.Color(153, 153, 153));
        textRegistroUsuario.setText("USUARIO");
        textRegistroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textRegistroUsuarioMousePressed(evt);
            }
        });
        textRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegistroUsuarioActionPerformed(evt);
            }
        });
        textRegistroUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textRegistroUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRegistroUsuarioKeyTyped(evt);
            }
        });
        panelPrincipal.add(textRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 210, 30));

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/boton_inicio_1.png"))); // NOI18N
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        btnRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });
        panelPrincipal.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 270, 50));

        etqPrincipalUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/figura-de-usuario (1).png"))); // NOI18N
        panelPrincipal.add(etqPrincipalUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));

        iconAsetaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/asetacaMediano.png"))); // NOI18N
        panelPrincipal.add(iconAsetaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, 40));

        etqOlvidasteTuContraeña.setText("¿Olvidaste tu Contraseña?");
        etqOlvidasteTuContraeña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etqOlvidasteTuContraeñaMouseClicked(evt);
            }
        });
        panelPrincipal.add(etqOlvidasteTuContraeña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 20));

        textContraseña.setText("CONTRASEÑA");
        textContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContraseñaActionPerformed(evt);
            }
        });
        textContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textContraseñaKeyTyped(evt);
            }
        });
        panelPrincipal.add(textContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 210, 30));

        panelPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinicamedicasolidarista/imagenes/fondoBlanco.jpg"))); // NOI18N
        panelPrincipal1.setText("jLabel4");
        panelPrincipal.add(panelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 370, 480));

        jDesktopPane3.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane4.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane3.add(jDesktopPane4);
        jDesktopPane4.setBounds(0, 510, 960, 20);

        jDesktopPane5.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane6.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane5.add(jDesktopPane6);
        jDesktopPane6.setBounds(0, 510, 960, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BIENVENIDO @USUARIO");
        jDesktopPane5.add(jLabel8);
        jLabel8.setBounds(410, 20, 160, 20);

        jDesktopPane3.add(jDesktopPane5);
        jDesktopPane5.setBounds(0, 500, 960, 40);

        jDesktopPane7.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane8.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane7.add(jDesktopPane8);
        jDesktopPane8.setBounds(0, 510, 960, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BIENVENIDO @USUARIO");
        jDesktopPane7.add(jLabel9);
        jLabel9.setBounds(410, 20, 160, 20);

        jDesktopPane9.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane10.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane9.add(jDesktopPane10);
        jDesktopPane10.setBounds(0, 510, 960, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BIENVENIDO @USUARIO");
        jDesktopPane9.add(jLabel10);
        jLabel10.setBounds(410, 20, 160, 20);

        jDesktopPane7.add(jDesktopPane9);
        jDesktopPane9.setBounds(0, 500, 960, 40);

        jDesktopPane3.add(jDesktopPane7);
        jDesktopPane7.setBounds(0, 500, 960, 40);

        jDesktopPane11.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane12.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane11.add(jDesktopPane12);
        jDesktopPane12.setBounds(0, 510, 960, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BIENVENIDO @USUARIO");
        jDesktopPane11.add(jLabel11);
        jLabel11.setBounds(410, 20, 160, 20);

        jDesktopPane3.add(jDesktopPane11);
        jDesktopPane11.setBounds(0, 520, 960, 20);

        panelPrincipal.add(jDesktopPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 30));

        jDesktopPane23.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane24.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane23.add(jDesktopPane24);
        jDesktopPane24.setBounds(0, 510, 960, 20);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("BIENVENIDO @USUARIO");
        jDesktopPane23.add(jLabel17);
        jLabel17.setBounds(410, 20, 160, 20);

        jDesktopPane25.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane26.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane25.add(jDesktopPane26);
        jDesktopPane26.setBounds(0, 510, 960, 20);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("BIENVENIDO @USUARIO");
        jDesktopPane25.add(jLabel18);
        jLabel18.setBounds(410, 20, 160, 20);

        jDesktopPane23.add(jDesktopPane25);
        jDesktopPane25.setBounds(0, 500, 960, 40);

        jDesktopPane27.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane28.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane27.add(jDesktopPane28);
        jDesktopPane28.setBounds(0, 510, 960, 20);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BIENVENIDO @USUARIO");
        jDesktopPane27.add(jLabel19);
        jLabel19.setBounds(410, 20, 160, 20);

        jDesktopPane29.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane30.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane29.add(jDesktopPane30);
        jDesktopPane30.setBounds(0, 510, 960, 20);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("BIENVENIDO @USUARIO");
        jDesktopPane29.add(jLabel20);
        jLabel20.setBounds(410, 20, 160, 20);

        jDesktopPane27.add(jDesktopPane29);
        jDesktopPane29.setBounds(0, 500, 960, 40);

        jDesktopPane23.add(jDesktopPane27);
        jDesktopPane27.setBounds(0, 500, 960, 40);

        jDesktopPane31.setBackground(new java.awt.Color(5, 47, 154));

        jDesktopPane32.setBackground(new java.awt.Color(5, 47, 154));
        jDesktopPane31.add(jDesktopPane32);
        jDesktopPane32.setBounds(0, 510, 960, 20);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("BIENVENIDO @USUARIO");
        jDesktopPane31.add(jLabel21);
        jLabel21.setBounds(410, 20, 160, 20);

        jDesktopPane23.add(jDesktopPane31);
        jDesktopPane31.setBounds(0, 520, 960, 20);

        panelPrincipal.add(jDesktopPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 467, 378, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        Usuario u=comprobado();
        control.logueado(u);
       
       
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void etqOlvidasteTuContraeñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etqOlvidasteTuContraeñaMouseClicked
        CambiarPass VCP=new CambiarPass(control);
        //this.setVisible(false);
        VCP.setVisible(true);
    }//GEN-LAST:event_etqOlvidasteTuContraeñaMouseClicked

    private void textContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textContraseñaActionPerformed

    private void textRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegistroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRegistroUsuarioActionPerformed

    private void enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter
      
  if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
   JOptionPane.showMessageDialog(this,"Debe ingresar los datos correctamente", "Mensaje de Error", //Título
     JOptionPane.ERROR_MESSAGE); 
     }
 
    }//GEN-LAST:event_enter

    private void textRegistroUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRegistroUsuarioKeyTyped
      char cPress=evt.getKeyChar();
      if(cPress==KeyEvent.VK_ENTER){
          btnRegistro.doClick();
      }
        
    }//GEN-LAST:event_textRegistroUsuarioKeyTyped

    private void textContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseñaKeyTyped
       char cPress=evt.getKeyChar();
      if(cPress==KeyEvent.VK_ENTER){
          btnRegistro.doClick();
      }
    }//GEN-LAST:event_textContraseñaKeyTyped

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ClinicaMedicaSolidarista.LOGIN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void textRegistroUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistroUsuarioMousePressed
        clearVar();
    }//GEN-LAST:event_textRegistroUsuarioMousePressed

    private void textRegistroUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRegistroUsuarioKeyPressed
        
    }//GEN-LAST:event_textRegistroUsuarioKeyPressed
    public Usuario comprobado(){
    return control.getAutenticar(textRegistroUsuario.getText(), DigestUtils.shaHex(textContraseña.getText()));
    }
    public void clearVar(){
        textRegistroUsuario.setText("");
        textContraseña.setText("");
    }
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
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaLogin().setVisible(true);
            }
        });*/
    }
     @Override
    public void update(Observable modelo, Object o1) {
        if(o1.toString().equals("LOGIN")){
        RegistroUsuarios model=((RegistroUsuarios)modelo);
        if(model.getLogin()!=null){
            
           // System.out.println(model.getLogin().getClass().getName());
           
            if(model.getLogin().getClass().getName().equals("clinicamedicasolidarista.modelo.usuario.Gestor"))
            {
                    
            ClinicaMedicaSolidarista.MENU.setVisible(true);
             this.setVisible(false);
            }
            if(model.getLogin().getClass().getName().equals("clinicamedicasolidarista.modelo.usuario.Administrador")){
           
            ClinicaMedicaSolidarista.MENU.setVisible(true);
            this.setVisible(false);
            }
            
        } 
                
     
        if((textContraseña.getText().equals(""))  || (textRegistroUsuario.getText().equals(""))){
            textRegistroUsuario.setBorder(BORDER_ERROR);
            textRegistroUsuario.setToolTipText("Digite el nombre de Usuario");
            textContraseña.setBorder(BORDER_ERROR);
            textContraseña.setToolTipText("Digite su contraseña");
        }
        
        else{
            textRegistroUsuario.setBorder(BORDER_RIGHT);
            textRegistroUsuario.setToolTipText("");
        textContraseña.setBorder(BORDER_RIGHT);
        textContraseña.setToolTipText("");}
       
        if(textRegistroUsuario.getText().equals("")){
        textRegistroUsuario.setBorder(BORDER_ERROR);
        textRegistroUsuario.setToolTipText("Digite el nombre de Usuario");
        }
        else{
        textRegistroUsuario.setBorder(BORDER_RIGHT);
        textRegistroUsuario.setToolTipText("");}
        
        if(textContraseña.getText().equals("")){
            textContraseña.setBorder(BORDER_ERROR);
            textContraseña.setToolTipText("Digite su contraseña");
        }
        else{
            textContraseña.setBorder(BORDER_RIGHT);
            textContraseña.setToolTipText("");}
        clearVar();
    if(model.getLogin()==null){
    JOptionPane.showMessageDialog(this,"Debe ingresar los datos correctamente", "Mensaje de Error", //Título
    JOptionPane.ERROR_MESSAGE); 
        }
        }
    }

    public JPasswordField getTextContraseña() {
        return textContraseña;
    }

    public void setTextContraseña(JPasswordField textContraseña) {
        this.textContraseña = textContraseña;
    }

    public JTextField getTextRegistroUsuario() {
        return textRegistroUsuario;
    }

    public void setTextRegistroUsuario(JTextField textRegistroUsuario) {
        this.textRegistroUsuario = textRegistroUsuario;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel etqContraseña;
    private javax.swing.JLabel etqFondo;
    private javax.swing.JLabel etqOlvidasteTuContraeña;
    private javax.swing.JLabel etqPrincipalUsuario;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JLabel iconAsetaca;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane10;
    private javax.swing.JDesktopPane jDesktopPane11;
    private javax.swing.JDesktopPane jDesktopPane12;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane23;
    private javax.swing.JDesktopPane jDesktopPane24;
    private javax.swing.JDesktopPane jDesktopPane25;
    private javax.swing.JDesktopPane jDesktopPane26;
    private javax.swing.JDesktopPane jDesktopPane27;
    private javax.swing.JDesktopPane jDesktopPane28;
    private javax.swing.JDesktopPane jDesktopPane29;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane30;
    private javax.swing.JDesktopPane jDesktopPane31;
    private javax.swing.JDesktopPane jDesktopPane32;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JDesktopPane jDesktopPane9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel panelPrincipal1;
    private javax.swing.JPasswordField textContraseña;
    private javax.swing.JTextField textRegistroUsuario;
    // End of variables declaration//GEN-END:variables
    private Controlador control; 
    public static Border BORDER_ERROR = BorderFactory.createLineBorder(Color.red);
    public static Border BORDER_NOBORDER = BorderFactory.createLineBorder(Color.red);
   
    public static Border BORDER_RIGHT = BorderFactory.createLineBorder(Color.BLACK);
    public static Border BORDER_BORDERRIGHT = BorderFactory.createLineBorder(Color.BLACK);
}