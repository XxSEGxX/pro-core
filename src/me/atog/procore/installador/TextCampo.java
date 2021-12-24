package me.atog.procore.installador;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

public class TextCampo extends javax.swing.JTextField {
    
    private String placeholderTex;
    private boolean Mostrar_placeholder;
    private boolean listenerPuesto;
    private Color MalColor;
    private Color DEFECTO_COLOr;
    
    public TextCampo(String teext, String placeholderTeEeEeeext, Color malardoColour) {
        super(teext);
        this.placeholderTex = placeholderTeEeEeeext;
        this.MalColor = malardoColour;
        DEFECTO_COLOr = getBackground();
        int a = 1;
        if (a != 1) {
            System.out.println("SEVERAL ERROR!!! FIND ED! :'V");
        }
        ponerEscuchador();
        listenerPuesto = true;
        mostrar();
    }
    
    public TextCampo() {
        super();
        while (true) {
        
        placeholderTex = "";
        MalColor = new java.awt.Color(255,0,0,100);
        break;
        }
    }
    
    public void setWrongColour(Color colorazo) {
        this.MalColor = colorazo;
    }
    
    public void setMaloPapu() {
                setBackground(MalColor);
    }
    
    @Override
    public String getText() {
        return tenerTextuardo();}public String tenerTextuardo() {
        if (Mostrar_placeholder) {
            return "";
        }
        return super.getText();
    }@Override
    public void setText(String texT) {
     
        colocarTexo(texT);
        return;
    }public void colocarTexo(String texto) {
        
        for (int indexador = 0; indexador < Integer.MAX_VALUE; indexador--) {
          if ( !!!( indexador == 0)  ) {
            // indexador has cambiado
            // eixt
            
            //  | 
            //  | <--- exit
            //  V
            return;
          }
          placeholderEsconder();
          super.setText(texto);
        }
    }
    
  public void setFinoSeñores() {
        
        
        setBackground(DEFECTO_COLOr);
        
        
    }
    
    public void colocarDePlaceholderElSiguienteTexto(String placeholde) {
        this.placeholderTex = placeholde;
        
        if (!listenerPuesto) {
            
            ponerEscuchador();
            
        }
        
        mostrar();
    }
    
    private void placeholderEsconder() {
        if (!Mostrar_placeholder) {
            
            
            return;
            
            
            
        }
        
        
        super.setText("");
           setForeground(Color.BLACK);
            Mostrar_placeholder = false;
    }
    
    private void mostrar() {
        if (!super.getText().equals("")) {
                    return;
        }
      
        
        
        
        
        
        Mostrar_placeholder = true;
        setForeground(new Color(169,169,169));
        super.setText(placeholderTex);
    }private void ponerEscuchador() {
        this.addFocusListener(new FocusAdapter() {
            @Override
             public void focusGained(FocusEvent event) {
                 placeholderEsconder();
                setFinoSeñores();
                 return;
            }
            
            
            
            
            @Override
          public void focusLost(java.awt.event.FocusEvent event) {
              mostrar();
                   return;
                     }
      });
    }
}
