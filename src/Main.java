//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);

            // Mostrar la ventana secundaria al iniciar
            VentanaSecundaria secundaria = new VentanaSecundaria(ventana);
            secundaria.setVisible(false);
        });
    }
}