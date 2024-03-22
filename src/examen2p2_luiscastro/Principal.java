/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen2p2_luiscastro;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
//FILA 3 ASIENTO 4
/**
 *
 * @author lfern
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
         File archivo = new File("./carros");
            if(archivo.exists()){
                AdmCarro adm = new AdmCarro("./carros");
                adm.cargarArchivo();
            }else{
                AdmCarro adm = new AdmCarro("./carros");
                adm.escribirArchivo();
                adm.cargarArchivo();
            }
        AdmCarro adm = new AdmCarro("./carros");
        adm.cargarArchivo();
        DefaultComboBoxModel cb1 = (DefaultComboBoxModel) cb_jug1.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_jug2.getModel();
        cb1.removeAllElements();
        cb2.removeAllElements();
        cb1.addAll(adm.carros);
        cb2.addAll(adm.carros);
        cb_jug1.setModel(cb1);
        cb_jug2.setModel(cb2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear = new javax.swing.JDialog();
        pn_crear = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        sp_velocidad = new javax.swing.JSpinner();
        btn_CrCarro = new javax.swing.JButton();
        jd_carrera = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lb_tiempo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_carro1 = new javax.swing.JLabel();
        lb_carro2 = new javax.swing.JLabel();
        jpb_carro1 = new javax.swing.JProgressBar();
        jpb_carro2 = new javax.swing.JProgressBar();
        btn_INcarrera = new javax.swing.JButton();
        pn_main = new javax.swing.JPanel();
        btn_crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_jug1 = new javax.swing.JComboBox<>();
        cb_jug2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_marcaJug1 = new javax.swing.JLabel();
        lb_marcaJug2 = new javax.swing.JLabel();
        lb_modeloJug1 = new javax.swing.JLabel();
        lb_modeloJug2 = new javax.swing.JLabel();
        lb_velJug1 = new javax.swing.JLabel();
        lb_velJug2 = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();

        jd_crear.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Creacion de Carros");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Velocidad");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Marca");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Modelo");

        sp_velocidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        btn_CrCarro.setText("Crear");
        btn_CrCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CrCarroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_crearLayout = new javax.swing.GroupLayout(pn_crear);
        pn_crear.setLayout(pn_crearLayout);
        pn_crearLayout.setHorizontalGroup(
            pn_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_crearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sp_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
            .addGroup(pn_crearLayout.createSequentialGroup()
                .addGroup(pn_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_crearLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_crearLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(pn_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_crearLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pn_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_marca)
                            .addComponent(tf_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)))
                    .addGroup(pn_crearLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btn_CrCarro)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pn_crearLayout.setVerticalGroup(
            pn_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_crearLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sp_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_CrCarro)
                .addGap(79, 79, 79))
        );

        jd_crear.getContentPane().add(pn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Tiempo");

        lb_tiempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tiempo.setText("-");

        lb_carro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_carro1.setText("Carro 1");

        lb_carro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_carro2.setText("Carro 2");

        jpb_carro1.setMaximum(1000);

        jpb_carro2.setMaximum(1000);

        btn_INcarrera.setText("Iniciar");
        btn_INcarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_INcarreraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpb_carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpb_carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btn_INcarrera))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lb_carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lb_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_tiempo)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lb_carro1)
                .addGap(18, 18, 18)
                .addComponent(jpb_carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lb_carro2)
                .addGap(18, 18, 18)
                .addComponent(jpb_carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_INcarrera)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_carreraLayout = new javax.swing.GroupLayout(jd_carrera.getContentPane());
        jd_carrera.getContentPane().setLayout(jd_carreraLayout);
        jd_carreraLayout.setHorizontalGroup(
            jd_carreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_carreraLayout.setVerticalGroup(
            jd_carreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_crear.setText("Crear Carro");
        btn_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearMouseClicked(evt);
            }
        });
        pn_main.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 17, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Partida");
        pn_main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 130, 27));

        jLabel2.setText("Jugador 2");
        pn_main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, -1));

        jLabel3.setText("Jugador 1");
        pn_main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, -1));

        cb_jug1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_jug1ItemStateChanged(evt);
            }
        });
        pn_main.add(cb_jug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, -1));

        cb_jug2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_jug2ItemStateChanged(evt);
            }
        });
        pn_main.add(cb_jug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modelo");
        pn_main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marca");
        pn_main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Marca");
        pn_main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 100, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Velocidad");
        pn_main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 100, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modelo");
        pn_main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Velocidad");
        pn_main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 40));

        lb_marcaJug1.setText("-");
        pn_main.add(lb_marcaJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, -1));

        lb_marcaJug2.setText("-");
        pn_main.add(lb_marcaJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 110, -1));

        lb_modeloJug1.setText("-");
        pn_main.add(lb_modeloJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, -1));

        lb_modeloJug2.setText("-");
        pn_main.add(lb_modeloJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 110, -1));

        lb_velJug1.setText("-");
        pn_main.add(lb_velJug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, -1));

        lb_velJug2.setText("-");
        pn_main.add(lb_velJug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 120, 20));

        btn_iniciar.setText("Iniciar");
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });
        pn_main.add(btn_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_main, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_main, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CrCarroMouseClicked
        // TODO add your handling code here:
        if(tf_marca.getText().isBlank()||tf_modelo.getText().isBlank()){
            JOptionPane.showMessageDialog(jd_crear, "No ha ingresado los datos o la velocidad es 0. Ingrese de nuevo.");
            tf_marca.setText("");
            tf_modelo.setText("");
        }else{
            String marca = tf_marca.getText();
            String modelo = tf_modelo.getText();
            int velocidad = (int) sp_velocidad.getValue();
            Carro c = new Carro(marca, modelo, velocidad);
            File archivo = new File("./carros");
            if(archivo.exists()){
                AdmCarro adm = new AdmCarro("./carros");
                adm.cargarArchivo();
                adm.carros.add(c);
                adm.escribirArchivo();
            }else{
                AdmCarro adm = new AdmCarro("./carros");
                adm.escribirArchivo();
                adm.carros.add(c);
                adm.escribirArchivo();
            }
            tf_marca.setText("");
            tf_modelo.setText("");
            sp_velocidad.setValue(1);
            JOptionPane.showMessageDialog(jd_crear, "Se ha creado el carro!");
        }
        AdmCarro adm = new AdmCarro("./carros");
        adm.cargarArchivo();
        DefaultComboBoxModel cb1 = (DefaultComboBoxModel) cb_jug1.getModel();
        DefaultComboBoxModel cb2 = (DefaultComboBoxModel) cb_jug2.getModel();
        cb1.removeAllElements();
        cb2.removeAllElements();
        cb1.addAll(adm.carros);
        cb2.addAll(adm.carros);
        cb_jug1.setModel(cb1);
        cb_jug2.setModel(cb2);
        
    }//GEN-LAST:event_btn_CrCarroMouseClicked

    private void btn_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearMouseClicked
        // TODO add your handling code here:
        jd_crear.pack();
        jd_crear.setLocationRelativeTo(this);
        jd_crear.setModal(true);
        jd_crear.setVisible(true);
    }//GEN-LAST:event_btn_crearMouseClicked

    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        // TODO add your handling code here:
        jd_carrera.pack();
        jd_carrera.setLocationRelativeTo(this);
        jd_carrera.setModal(true);
        jd_carrera.setVisible(true);
    }//GEN-LAST:event_btn_iniciarMouseClicked

    private void cb_jug1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_jug1ItemStateChanged
        // TODO add your handling code here:
        if(cb_jug1.getSelectedItem() != null){
            Carro temp = (Carro)cb_jug1.getSelectedItem();
            String marca = temp.getMarca();
            String modelo = temp.getModelo();
            String velocidad = temp.getVelocidad()+"";
            
            lb_marcaJug1.setText(marca);
            lb_modeloJug1.setText(modelo);
            lb_velJug1.setText(velocidad);
            lb_carro1.setText(modelo);
        }else{
            
        }
    }//GEN-LAST:event_cb_jug1ItemStateChanged

    private void cb_jug2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_jug2ItemStateChanged
        // TODO add your handling code here:
        if(cb_jug2.getSelectedItem() != null){
            Carro temp = (Carro)cb_jug2.getSelectedItem();
            String marca = temp.getMarca();
            String modelo = temp.getModelo();
            String velocidad = temp.getVelocidad()+"";
            
            lb_marcaJug2.setText(marca);
            lb_modeloJug2.setText(modelo);
            lb_velJug2.setText(velocidad);
            lb_carro2.setText(modelo);
        }else{
            
        }
    }//GEN-LAST:event_cb_jug2ItemStateChanged

    private void btn_INcarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_INcarreraMouseClicked
        // TODO add your handling code here:
        if(cb_jug1.getSelectedItem() != null && cb_jug2.getSelectedItem() != null){
            Carro c1 = (Carro)cb_jug1.getSelectedItem();
            Carro c2 = (Carro)cb_jug2.getSelectedItem();
            AdmBarra adm = new AdmBarra(jpb_carro1, jpb_carro2, c1, c2,lb_tiempo);
            adm.start();
            
        }else{
            JOptionPane.showMessageDialog(jd_carrera, "No ha seleccionado 2 carros para la carrera.");
        }
        
    }//GEN-LAST:event_btn_INcarreraMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CrCarro;
    private javax.swing.JButton btn_INcarrera;
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JComboBox<String> cb_jug1;
    private javax.swing.JComboBox<String> cb_jug2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDialog jd_carrera;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JProgressBar jpb_carro1;
    private javax.swing.JProgressBar jpb_carro2;
    private javax.swing.JLabel lb_carro1;
    private javax.swing.JLabel lb_carro2;
    private javax.swing.JLabel lb_marcaJug1;
    private javax.swing.JLabel lb_marcaJug2;
    private javax.swing.JLabel lb_modeloJug1;
    private javax.swing.JLabel lb_modeloJug2;
    private javax.swing.JLabel lb_tiempo;
    private javax.swing.JLabel lb_velJug1;
    private javax.swing.JLabel lb_velJug2;
    private javax.swing.JPanel pn_crear;
    private javax.swing.JPanel pn_main;
    private javax.swing.JSpinner sp_velocidad;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    // End of variables declaration//GEN-END:variables

}
//FILA 3 ASIENTO 4