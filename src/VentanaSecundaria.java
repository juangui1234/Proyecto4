import javax.swing.*;
import java.awt.*;

    public class VentanaSecundaria extends JDialog {

        public VentanaSecundaria(JFrame padre) {
            super(padre, "Ventana Secundaria", true);
            setSize(600, 300);
            setLocationRelativeTo(padre);

            // Mostrar mensaje al crear la ventana
            JOptionPane.showMessageDialog(
                    this,
                    "Este es un mensaje informativo de la ventana secundaria para que sepas que debes estudiar mas",
                    "Información para tu interes",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

