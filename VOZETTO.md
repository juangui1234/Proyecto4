+---------------------------------------------------------------+
|                 Sistema de Gestión Escolar                   |
+------------------------------+--------------------------------+
|      [ Bienvenida ]         |       [ Información ]          |
+------------------------------+--------------------------------+

>>> Pestaña: Bienvenida

+---------------------------------------------------------------+
|                                                               |
|         ¡Bienvenido al sistema de la Gestión Escolar!         |
|                       (centrado en pantalla)                 |
|                                                               |
|                                                               |
|                                                               |
|             [ Cambiar color de fondo ] (abajo)               |
|                                                               |
+---------------------------------------------------------------+

>>> Pestaña: Información

+---------------------------------------------------------------+
|                                                               |
|   Este sistema permite gestionar datos académicos, cursos     |
|   y estudiantes.                                              |
|   Pronto estará disponible la funcionalidad completa.         |
|   Programa realizado por Juan Guillermo Salazar.             |
|                                                               |
|  (Texto dentro de un área desplazable - JTextArea con scroll)|
|                                                               |
|              [ Abrir ventana secundaria ] (abajo)            |
+---------------------------------------------------------------+

>>> Ventana Secundaria (al hacer clic en el botón)

+----------------------------------------------+
|        Información para tu interés           |
+----------------------------------------------+
|                                              |
| Este es un mensaje informativo de la ventana |
| secundaria para que sepas que debes estudiar |
| más.                                         |
|                                              |
|              [ Aceptar / OK ]                |
+----------------------------------------------+

Elemento	Descripción
JTabbedPane	Panel con 2 pestañas: "Bienvenida" e "Información"
JLabel (mensaje)	Mensaje de bienvenida centrado
JButton	Botones de "Cambiar color" y "Abrir ventana secundaria"
JTextArea	Área de texto informativo con scroll
JDialog + JOptionPane	Ventana secundaria emergente con un mensaje motivador