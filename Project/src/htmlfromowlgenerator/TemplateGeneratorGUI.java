/*
 *  Copyright 2012-2013 Ontology Engineering Group, Universidad Politécnica de Madrid, Spain

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

/*
 * TemplateGeneratorGUI.java
 *
 * Created on 11-jul-2013, 12:08:00
 */
package htmlfromowlgenerator;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFileChooser;

/**
 *
 * @author Daniel Garijo
 */
public class TemplateGeneratorGUI extends javax.swing.JFrame {
    boolean savePathEnabled;

    /** Creates new form TemplateGeneratorGUI */
    public TemplateGeneratorGUI() {
        savePathEnabled = false;
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGenerate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        textFieldOntologyURI = new javax.swing.JTextField();
        textFieldSavePath = new javax.swing.JTextField();
        chekUseURI = new javax.swing.JCheckBox();
        buttonBrowse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ontology documentation template creator");
        setResizable(false);

        jLabel1.setText("URI of the ontology");

        jLabel2.setText("Save as ...");

        buttonGenerate.setText("Generate!");
        buttonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerateActionPerformed(evt);
            }
        });

        logTextArea.setColumns(20);
        logTextArea.setEditable(false);
        logTextArea.setRows(5);
        jScrollPane1.setViewportView(logTextArea);

        textFieldOntologyURI.setText("Insert the URI of the ontology to document");
        textFieldOntologyURI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOntologyURIActionPerformed(evt);
            }
        });

        textFieldSavePath.setText("Output file path");
        textFieldSavePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSavePathActionPerformed(evt);
            }
        });

        chekUseURI.setSelected(true);
        chekUseURI.setText("Use ontology URI");
        chekUseURI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekUseURIActionPerformed(evt);
            }
        });

        buttonBrowse.setText("Browse...");
        buttonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldOntologyURI, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chekUseURI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonGenerate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textFieldSavePath, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldOntologyURI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chekUseURI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldSavePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonGenerate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldOntologyURIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOntologyURIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOntologyURIActionPerformed

    private void chekUseURIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekUseURIActionPerformed
        if(chekUseURI.isSelected()){
            textFieldOntologyURI.setEnabled(true);
        }else{
            textFieldOntologyURI.setEnabled(false);
        }
    }//GEN-LAST:event_chekUseURIActionPerformed

    private void textFieldSavePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSavePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSavePathActionPerformed

    private void buttonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();    
        int returnVal = chooser.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           System.out.println("You chose to save this file: " + chooser.getSelectedFile().getName());
           textFieldSavePath.setText(chooser.getSelectedFile().getAbsolutePath());
           savePathEnabled = true;
        }
    }//GEN-LAST:event_buttonBrowseActionPerformed

    private void buttonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerateActionPerformed
        if(savePathEnabled){
            TemplateGenerator a = new TemplateGenerator();
            try{
                if(this.chekUseURI.isSelected()){
                    if(!textFieldOntologyURI.getText().equals("")&&!textFieldOntologyURI.getText().contains("Insert the URI")){
                        logTextArea.append("Generating the template using LODE...\n");
                        a.generateTemplateWithLODE(this.textFieldOntologyURI.getText(), this.textFieldSavePath.getText());
                        logTextArea.append("Done. If you wish to change the author and other metadata, modify config.properties file.\n");
                        logTextArea.append("If the file produced is empty, check that /config/config.properties is copied into the path where this JAR is being executed.\n");
                    }else{
                        logTextArea.append("Please insert a valid URI for the ontology.\n");
                    }
                }else{
                    logTextArea.append("Generating the template without an ontology...\n");
                    a.generateTemplateWithOutLODE(this.textFieldSavePath.getText());
                    logTextArea.append("Done. If you wish to change the author and other metadata, modify config.properties file.\n");
                }
            }catch(Exception e){
                logTextArea.append("Something went wrong: "+e.getMessage());
            }
        }else{
            logTextArea.setText("");
            logTextArea.append("Please select the output path for the template\n");
        }
    }//GEN-LAST:event_buttonGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TemplateGeneratorGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBrowse;
    private javax.swing.JButton buttonGenerate;
    private javax.swing.JCheckBox chekUseURI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JTextField textFieldOntologyURI;
    private javax.swing.JTextField textFieldSavePath;
    // End of variables declaration//GEN-END:variables
}
