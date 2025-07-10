import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    // Componentes globales
    private JTabbedPane pestanas;
    private JPanel panelBienvenida;
    private JPanel panelInfo;

    public VentanaPrincipal() {
        setTitle("Sistema de Gestión Escolar para estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar

        initComponents(); // Modularización de la interfaz
    }

    private void initComponents() {
        pestanas = new JTabbedPane();

        panelBienvenida = new JPanel();
        panelBienvenida.setLayout(new BorderLayout());

        JLabel mensaje = new JLabel("¡Bienvenido al sistema de la Gestión Escolar!", SwingConstants.CENTER);
        mensaje.setFont(new Font("Times New Roman", Font.BOLD, 16));
        panelBienvenida.add(mensaje, BorderLayout.CENTER);

        JButton btnCambiarColor = new JButton("Cambiar color de fondo");
        btnCambiarColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Selecciona el colo que prefieras", panelBienvenida.getBackground());
            if (color != null) {
                panelBienvenida.setBackground(color);
            }
        });
        panelBienvenida.add(btnCambiarColor, BorderLayout.SOUTH);

        pestanas.addTab("Bienvenida", panelBienvenida);

        // 🟩 Pestaña 2: Información
        panelInfo = new JPanel(new BorderLayout());

        JTextArea texto = new JTextArea(
                "Este sistema permite gestionar datos académicos, cursos y estudiantes.\nPronto estará disponible la funcionalidad completa programa programa realizado por Juan Guillermo Salazar."
        );
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(texto);
        panelInfo.add(scroll, BorderLayout.CENTER);

        JButton btnVentanaSecundaria = new JButton("Abrir ventana secundaria");
        btnVentanaSecundaria.addActionListener(e -> {
            new VentanaSecundaria(this).setVisible(true);
        });
        panelInfo.add(btnVentanaSecundaria, BorderLayout.SOUTH);

        pestanas.addTab("Información", panelInfo);

        add(pestanas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}