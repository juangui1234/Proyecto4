# Sistema de Gestión Escolar para Estudiantes

Este es un proyecto en Java usando Swing, desarrollado en NetBeans, que muestra cómo construir una interfaz gráfica organizada con pestañas, selector de color y ventanas secundarias. Fue realizado por **Juan Guillermo Salazar**.

## 🖥️ Descripción General

La aplicación tiene como propósito simular una interfaz básica de gestión escolar con los siguientes elementos:

- Ventana principal (`JFrame`) con pestañas (`JTabbedPane`).
- Panel de bienvenida con botón para cambiar el color de fondo (`JColorChooser`).
- Pestaña de información con texto explicativo y botón para abrir una ventana secundaria (`JDialog`).
- Diálogo emergente informativo con `JOptionPane`.

## 📌 Estructura de la Interfaz

### 🟦 Pestaña "Bienvenida"
- Contiene un mensaje centrado:  
  **¡Bienvenido al sistema de la Gestión Escolar!**
- Tiene un botón **"Cambiar color de fondo"** que permite al usuario personalizar el fondo del panel.

### 🟩 Pestaña "Información"
- Muestra un área de texto con una descripción del sistema, incluyendo:
  Este sistema permite gestionar datos académicos, cursos y estudiantes.
  Pronto estará disponible la funcionalidad completa.
  Programa realizado por Juan Guillermo Salazar.

markdown
Copiar
Editar
- Botón **"Abrir ventana secundaria"** para mostrar un mensaje emergente informativo.

### 🟨 Ventana Secundaria
- Al hacer clic en el botón, se abre una ventana (`JDialog`) con el siguiente mensaje:
  Este es un mensaje informativo de la ventana secundaria
  para que sepas que debes estudiar más.

markdown
Copiar
Editar
- Título del cuadro de diálogo: **"Información para tu interés"**.

## ⚙️ Clases del Proyecto

| Clase               | Descripción |
|---------------------|-------------|
| `Main`              | Clase principal que lanza la ventana principal. |
| `VentanaPrincipal`  | Contiene la interfaz completa con las pestañas. |
| `VentanaSecundaria` | Ventana emergente (`JDialog`) con mensaje informativo. |

## ▶️ Cómo Ejecutar el Proyecto

1. Abrir el proyecto en **NetBeans**.
2. Establecer la clase `Main` como clase principal (clic derecho > Establecer como principal).
3. Ejecutar con el botón verde ▶️ o presionar **F6**.

## 🎯 Objetivo de Aprendizaje

Este proyecto enseña cómo:

- Construir una GUI en Java Swing con múltiples pestañas.
- Personalizar la interfaz con colores seleccionados por el usuario.
- Abrir ventanas secundarias para mostrar información o alertas.
- Aplicar `JFrame`, `JPanel`, `JTabbedPane`, `JColorChooser`, `JDialog` y `JOptionPane`.

---

✅ Proyecto académico realizado por **Juan Guillermo Salazar** como parte de la práctica para aprender interfaces gráficas en Java con NetBeans.
