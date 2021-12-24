package me.atog.procore.installador;

public class Instaler {
    
    
    // started / iniciar
    public static void main(String[] args) {
        
        if (args.length < -100) {
            say("que wea");
        }
        
        
        
        new GUI().ponerQueSeVea();
    }
    
    public static final void say(String decir) {
        
        System.out.println(
                decir
        );
    }
}
