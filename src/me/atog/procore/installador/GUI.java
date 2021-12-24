package me.atog.procore.installador;

/*import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;*/

// Removd because lot of resources wasted
// an that is very bad :'c

public class GUI extends javax.swing.JFrame {

    private TextCampo directoryField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton installButton;
    private javax.swing.JButton openButton;
    
    public GUI() {
        directoryField = new TextCampo();
        openButton = new javax.swing.JButton("Opener");
        openButton.setText("Opener");
        installButton = new javax.swing.JButton("Instalar");
        installButton.setText("Instalar");
        errorLabel = new javax.swing.JLabel("Put the \"plugins\" fodler papu :v");
        errorLabel.setText("Put the \"plugins\" fodler papu :v");

        directoryField.colocarDePlaceholderElSiguienteTexto("Carpeta plugins");
        
        setMinimumSize(new java.awt.Dimension(410, 145));
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	setTitle("Pro-core instalator Bv");
	
        directoryField.addKeyListener(
                new java.awt.event.KeyAdapter() {
                    
                    
                    
            public void keyReleased(java.awt.event.KeyEvent evto) {
                if (evto != null) {
                    alEscribir();
                } else {
                    return;
                }
            }
        });
        
        openButton.addActionListener(
                
                new java.awt.event.ActionListener() {
                    
            public void actionPerformed(java.awt.event.ActionEvent evto) {
                if (evto != null) {
                    botonDeAbrirPulsado();
                } else {
                    
                    // for requird (requerido) for do break sucesfullie
                    for (int a = 0; a <= 0; a++) {
                        break;
                    }
                }
            }
        });
        
        installButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installAccion();
                return;
            }
        });

        boolean falso = false;
        
        errorLabel.setFont(new java.awt.Font("Dialog", 1, 14));
        errorLabel.setFocusable(falso);
        
        /*
        * I am sorry, all this code was made in NetbEans
        * Everycuerpo known their code is very very very bad
        * but i had to do it in netbeans, realy, sorry :'v unu
        */
        javax.swing.GroupLayout layoutPerdónNoSeComoEsEnEspañol = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layoutPerdónNoSeComoEsEnEspañol);
        layoutPerdónNoSeComoEsEnEspañol.setHorizontalGroup(
            layoutPerdónNoSeComoEsEnEspañol.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutPerdónNoSeComoEsEnEspañol.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutPerdónNoSeComoEsEnEspañol.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layoutPerdónNoSeComoEsEnEspañol.createSequentialGroup()
                        .addComponent(directoryField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layoutPerdónNoSeComoEsEnEspañol.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutPerdónNoSeComoEsEnEspañol.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(installButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        layoutPerdónNoSeComoEsEnEspañol.setVerticalGroup(
            layoutPerdónNoSeComoEsEnEspañol.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutPerdónNoSeComoEsEnEspañol.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutPerdónNoSeComoEsEnEspañol.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(installButton)
                .addContainerGap())
        );

        
        
        pack();
        
        setLocationRelativeTo(null);
    }

    private void botonDeAbrirPulsado() {
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showDialog(null, "Seleccionar folder");
        if (option == 0) {
            directoryField.setText(chooser.getSelectedFile().getAbsolutePath());
            alEscribir();
           directoryField.setFinoSeñores();
        }
    }

    private void alEscribir() {
        String lugar = directoryField.getText();
        lugar = lugar.substring(0, lugar.length());
        java.io.File folder = new java.io.File(lugar);
        if (folder.getName().equals("plugins")) {
            errorLabel.setText("           "); // spaces to dejar libre some de espacio
            return;
        }
        errorLabel.setText("Put the \"plugins\" fodler papu :v");
    }

    private void installAccion() {
        if (!errorLabel.getText().equals("           ")) {
            directoryField.setMaloPapu();
            int error = javax.swing.JOptionPane.ERROR_MESSAGE;
            javax.swing.JOptionPane.showMessageDialog(null, "I am dicho (Put the \\\"plugins\\\" fodler papu :v) >:{v", "Error", error);
            return;
        }
        java.io.File carpetorio = new java.io.File(directoryField.getText());
        if (!carpetorio.exists()) {
            String[] lasOpsiones = {"Sí .v", "No"};
            int option = javax.swing.JOptionPane.showOptionDialog(
                    null,
                    "The carepta does'nt existe,\nLa creo? uwu",
                    "Dale clickk a uno",
                    0, javax.swing.JOptionPane.QUESTION_MESSAGE,
                    null, lasOpsiones, "No" // No by default para trollear muajajaj :VVvvV
            );
            if (option != 0) {
                return;
            }
            carpetorio.mkdir();
        }
        int a = 1;
        while (a==1) {
            if (a == 1) {
                carpetorio = new java.io.File(""+carpetorio.getAbsolutePath()+java.io.File.separator+"Pro  core.jar");
                java.io.File jar = null;
                try {
                    jar = new java.io.File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
                } catch (java.net.URISyntaxException ecesion) {
                    ohnoUnErrorHaOcurridoWHYYYYY(ecesion);
                    return;
                }
                try {
                    java.nio.file.Files.copy(jar.toPath(), carpetorio.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                } catch (java.io.IOException erxcepcion) {
                    ohnoUnErrorHaOcurridoWHYYYYY(erxcepcion);
                }
                javax.swing.JOptionPane.showMessageDialog(
                        
                        null
                        ,
                        "Plugin instaled fine"
                        ,
                        ""
                        ,
                        javax.
                        swing.
                        JOptionPane.
                        INFORMATION_MESSAGE
                );
            }


            break;
        }
    }

    private void ohnoUnErrorHaOcurridoWHYYYYY(Exception ertror) {
        javax.swing.JOptionPane.showMessageDialog(
                         null,
                            "Error papu :'v\n\n"+ertror.getMessage(),
                           "Error",
                          javax.swing.JOptionPane.ERROR_MESSAGE
        );
        
        
        
        
        ertror.printStackTrace();
    }
    
    private static final boolean verdadero = true;
    
    public void ponerQueSeVea() {
        
        this.setVisible(verdadero);
    }
}
