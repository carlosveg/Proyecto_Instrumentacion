package com.mycompany.sensor;

import com.panamahitek.liveinterfaces.PanamaHitek_ThermometerChart;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.plot.ThermometerPlot;

public class Termometro extends javax.swing.JFrame {

    public Termometro() {
        try {
            while (true) {
                initComponents();

                //Se crea la instancia de la clase para la gestion de graficos
                PanamaHitek_ThermometerChart chart = new PanamaHitek_ThermometerChart("Proyecto sensor LM35\nCarlos Vega - 3CV4");
                //Se establece como unidades los celsius
                chart.setThermometerUnit(ThermometerPlot.UNITS_CELCIUS);
                //limites del termometro
                chart.setChartLimitValues(0, 100);
                //Distribucion porcentual de los colores
                chart.setColorDistribuition(40, 40, 20);
                //Se inserta el grafico en el panel
                chart.insertToPanel(jPanel2);
                /*
        Se crea una conexion con el puerto COM2 a 9600 baudios Arduino
        solamente se debe mandar la informacion de la temperatura.
                 */
                chart.createArduinoFollowUp("COM2", 9600);
            }
        } catch (Exception ex) {
            Logger.getLogger(Termometro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Termometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
