import javax.swing.*;

public class Pesos_a_bolivares {

    public static void main(String[] args) {

        int pesos= Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de pesos a transformar"));
        double bolivares = pesos*0.0014;
        JOptionPane.showMessageDialog(null, "El total de bolivares es de " +bolivares);
    }
}
