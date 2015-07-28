/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.neuroph.netbeans.lpr;

import java.io.File;
import java.io.PrintWriter;
import org.netbeans.api.settings.ConvertAsProperties;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.netbeans.lpr.Bundle;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.neuroph.netbeans.wizards.project.templates//GeneratedCode//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "GeneratedCodeTopComponent",
        iconBase = "org/neuroph/netbeans/wizards/project/templates/ikonica-crop.png",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = false)
@ActionID(category = "Window", id = "org.neuroph.netbeans.wizards.project.templates.GeneratedCodeTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_GeneratedCodeAction",
        preferredID = "GeneratedCodeTopComponent"
)
@Messages({
    "CTL_GeneratedCodeAction=GeneratedCode",
    "CTL_GeneratedCodeTopComponent=Generated Java Code ",
    "HINT_GeneratedCodeTopComponent=This is a Generated Code window"
})
public final class GeneratedCodeTopComponent extends TopComponent {

    public GeneratedCodeTopComponent() {
        initComponents();
        setName(Bundle.CTL_GeneratedCodeTopComponent());
        setToolTipText(Bundle.HINT_GeneratedCodeTopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorCode = new javax.swing.JEditorPane();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(GeneratedCodeTopComponent.class, "GeneratedCodeTopComponent.jLabel1.text")); // NOI18N

        jScrollPane1.setViewportView(editorCode);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(341, 341, 341))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane editorCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    public void writeCode(NeuralNetwork neuralNetwork) {
        editorCode.setText(" List<BufferedImage> listOfLetters = new ArrayList<BufferedImage>();\n"
                + "for (int i = 0; i <= 7; i++) {\n"
                + "File f = new File(\"data / char_\" + i + \".png\");\n"
                + "BufferedImage bi = ImageIO.read(f);\n"
                + "lista.add(bi);\n"
                + "});\n"
                + " NeuralNetwork nnet = NeuralNetwork.createFromFile(\"" + neuralNetwork + ".nnet\");\n"
                + "nnet.addPlugin(new OcrPlugin(new Dimension(10, 10), ColorMode.BLACK_AND_WHITE));\n"
                + "   OcrPlugin ocrPlugin = (OcrPlugin) nnet.getPlugin(OcrPlugin.class);\n"
                + "for (int i = 0; i < lista.size(); i++) {\n"
                + "recognizedCharacters+=ocrPlugin.recognizeCharacter(new ImageJ2SE(lista.get(i))) + \" \";\n"
                + "System.out.print(ocrPlugin.recognizeCharacter(new ImageJ2SE(lista.get(i))) + \" \");");

    }
}