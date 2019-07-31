
package Clases;

import java.util.ArrayList;
import java.util.Collections;


public class InterfazPrincipal extends javax.swing.JFrame {

    InterfazAgregar ventanaAgregar = new InterfazAgregar(this);
    InterfazVerDatos ventanaDatos = new InterfazVerDatos(this);
    ArrayList<Carro> Lista = new ArrayList();
    public InterfazPrincipal() {
        initComponents();
    }

     public void agregarAuto (float costoCarro, int antiguedad, double depreciacion, float valorActual, String Marca){
        Carro automovil = new Carro(costoCarro, antiguedad,  depreciacion, valorActual, Marca);
        Lista.add(automovil);
        
    }
    public void imprimirEnTextArea(){
        
        for (int i=0;i<3;i++) {
            ventanaDatos.jTextArea1.append("Precio Inicial: " + Lista.get(i).getCostoCarro() + "\n");
            ventanaDatos.jTextArea1.append("Antiguedad: " + Lista.get(i).getAntiguedad() + "\n");
            ventanaDatos.jTextArea1.append("Depreciacion: " + Lista.get(i).getDepreciacion() + "\n");
            ventanaDatos.jTextArea1.append("Precio Actual : " + Lista.get(i).getValorActual() + "\n");
            ventanaDatos.jTextArea1.append("Marca del vehiculo: " + Lista.get(i).getMarca() + "\n" + "\n");
        }
     
    }
    public void Ordenar(){
        
        for (int i=0 ; i<Lista.size();i++){
            for (int j=0; j<Lista.size()-1;j++){
                if(Lista.get(j).getValorActual()<Lista.get(j+1).getValorActual()){
                    Carro tmp = new Carro();
                    tmp.setCostoCarro(Lista.get(j).getCostoCarro());
                    tmp.setAntiguedad(Lista.get(j).getAntiguedad());
                    tmp.setDepreciacion(Lista.get(j).getDepreciacion());
                    tmp.setValorActual(Lista.get(j).getValorActual());
                    tmp.setMarca(Lista.get(j).getMarca());
                    
                    Lista.get(j).setCostoCarro(Lista.get(j+1).getCostoCarro());
                    Lista.get(j).setAntiguedad(Lista.get(j+1).getAntiguedad());
                    Lista.get(j).setDepreciacion(Lista.get(j+1).getDepreciacion());
                    Lista.get(j).setValorActual(Lista.get(j+1).getValorActual());
                    Lista.get(j).setMarca(Lista.get(j+1).getMarca());
                    
                    Lista.get(j+1).setCostoCarro(tmp.getCostoCarro());
                    Lista.get(j+1).setAntiguedad(tmp.getAntiguedad());
                    Lista.get(j+1).setDepreciacion(tmp.getDepreciacion());
                    Lista.get(j+1).setValorActual(tmp.getValorActual());
                    Lista.get(j+1).setMarca(tmp.getMarca());
                }
            }
        }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ver Datos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InterfazPrincipal.escritorio.add(ventanaAgregar);
        ventanaAgregar.toFront();
        ventanaAgregar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        InterfazPrincipal.escritorio.add(ventanaDatos);
        ventanaDatos.toFront();
        ventanaDatos.setVisible(true);
        Ordenar();
        this.imprimirEnTextArea();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
