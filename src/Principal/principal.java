
package Principal;

import Analizador_CSS.ScanerCSS;
import Analizador_CSS.analisis_sintacticoCSS;
import Analizador_HTML.ScanerHTML;
import Analizador_HTML.analisis_sintacticoHTML;
import Analizador_UFE.ScanerUFE;
import Analizador_UFE.analisis_sintactico_UFE_GuardarVariables;
//import Analizador_UFE.analisis_sintactico_UFE_AsignacionVariables;
//import Analizador_UFE.analisis_sintactico_UFE_AsignacionVariables2;
import Analizador_UFE.analisis_sintactico_UFE_AsignacionVariables3;
//import Analizador_UFE.analisis_sintactico_UFE_AsignacionVariables4;
import Analizador_UFE.analisis_sintactico_UFE_ImportComponent;
import Analizador_UFE.analisis_sintactico_UFE_ComponentPrincipal;
import Analizador_UFE.analisis_sintactico_UFE_Render;
import Analizador_UFE.analisis_sintactico_UFE_Imprimir;
import Analizador_UFE.analisis_sintactico_UFE_Repetir;
//import Analizador_UFE.analisis_sintacticoUFE;
import java.awt.Color;
import java.io.BufferedWriter;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.StringReader;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.io.PrintWriter;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author GUDIEL
 */
public class principal extends javax.swing.JFrame {

    HashMap<String,JTextArea> hmjtextArea; //jtextArea y nombre con extension
    ArrayList<Object> misPanel = new ArrayList<Object>();
    
    HashMap<String,Object[]> prueba=new HashMap<String,Object[]>();
    ArrayList<Object> prueba2 = new ArrayList<Object>();
    
    public Object [] encabezado={"","",""};
    public DefaultTableModel tablaErrSemanticos=new DefaultTableModel(encabezado,0);
    
    String nomProyecto="";
    JTextArea html; //proyecto inicial
    JTextArea css; //proyecto inicial
    JTextArea ufe; //proyecto inicial
    JTextArea jtxaCrearArchivo;
    JTextArea jtxaparaGuardar;
        
    public principal() {
        hmjtextArea=new HashMap<>();
        
        initComponents();
        jpContenedorInterfaz.setVisible(false);
        lblNombreApp.setVisible(false);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtp = new javax.swing.JTabbedPane();
        jpConsola = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaErrores = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaConsola = new javax.swing.JTextArea();
        jpContenedorInterfaz = new javax.swing.JPanel();
        bttPruebas = new javax.swing.JButton();
        bttInterfaz = new javax.swing.JButton();
        bttPrincipal = new javax.swing.JButton();
        lblNombreApp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmCrearProyecto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCrearCSS = new javax.swing.JMenuItem();
        jmCrearUFE = new javax.swing.JMenuItem();
        jmGuardarArchivo = new javax.swing.JMenuItem();
        jmGuardarComo = new javax.swing.JMenuItem();
        jmCerrarArchivo = new javax.swing.JMenuItem();
        jmCerrarProyecto = new javax.swing.JMenuItem();
        jmCompilar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtp.setBackground(new java.awt.Color(204, 255, 153));
        getContentPane().add(jtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1540, 460));

        txtaErrores.setColumns(20);
        txtaErrores.setRows(5);
        jScrollPane2.setViewportView(txtaErrores);

        jpConsola.addTab("ERRORES", jScrollPane2);

        txtaConsola.setColumns(20);
        txtaConsola.setRows(5);
        jScrollPane1.setViewportView(txtaConsola);

        jpConsola.addTab("CONSOLA", jScrollPane1);

        getContentPane().add(jpConsola, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 1530, 260));

        jpContenedorInterfaz.setBackground(new java.awt.Color(255, 255, 255));
        jpContenedorInterfaz.setLayout(null);
        getContentPane().add(jpContenedorInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1600, 760));

        bttPruebas.setText("PRUEBAS");
        bttPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPruebasActionPerformed(evt);
            }
        });
        getContentPane().add(bttPruebas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 30));

        bttInterfaz.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bttInterfaz.setText("INTERFAZ");
        bttInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInterfazActionPerformed(evt);
            }
        });
        getContentPane().add(bttInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        bttPrincipal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bttPrincipal.setText("PRINCIPAL");
        bttPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(bttPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblNombreApp.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreApp.setText("Mi App");
        getContentPane().add(lblNombreApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 1150, 40));

        jMenu1.setText("ARCHIVO");

        jmCrearProyecto.setText("CREAR PROYECTO");
        jmCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCrearProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCrearProyecto);

        jMenu2.setText("CREAR ARCHIVO");

        jmCrearCSS.setText("ARCHIVO CSS");
        jmCrearCSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCrearCSSActionPerformed(evt);
            }
        });
        jMenu2.add(jmCrearCSS);

        jmCrearUFE.setText("ARCHIVO UFE");
        jmCrearUFE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCrearUFEActionPerformed(evt);
            }
        });
        jMenu2.add(jmCrearUFE);

        jMenu1.add(jMenu2);

        jmGuardarArchivo.setText("GUARDAR ARCHIVO");
        jmGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(jmGuardarArchivo);

        jmGuardarComo.setText("GUARDAR COMO");
        jmGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(jmGuardarComo);

        jmCerrarArchivo.setLabel("CERRAR ARCHIVO");
        jmCerrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCerrarArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCerrarArchivo);

        jmCerrarProyecto.setLabel("CERRAR PROYECTO");
        jmCerrarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCerrarProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCerrarProyecto);

        jmCompilar.setLabel("COMPILAR PROYECTO");
        jmCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCompilarActionPerformed(evt);
            }
        });
        jMenu1.add(jmCompilar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCrearProyectoActionPerformed
        html=new JTextArea("html");
        css=new JTextArea("css");
        ufe=new JTextArea("ufe");
        
        nomProyecto = JOptionPane.showInputDialog("NOMBRE DE PROYECTO");
        
        //creando directorios
        File directorio=new File(nomProyecto); 
        directorio.mkdirs(); 
        
        File directoriopublic=new File(nomProyecto+"/public"); 
        directoriopublic.mkdirs(); 
        
        File directorisrc=new File(nomProyecto+"/src"); 
        directorisrc.mkdirs(); 
        
        //scroll para los jtextarea
        JScrollPane pane = new JScrollPane (html);
        pane.getViewport ().setView (html);  
        
        JScrollPane pane2 = new JScrollPane (css);
        pane2.getViewport ().setView (css); 
        
        JScrollPane pane3 = new JScrollPane (ufe);
        pane3.getViewport ().setView (ufe); 
        
        hmjtextArea.put("index.html", html);
        hmjtextArea.put("app.css", css);
        hmjtextArea.put("app.ufe", ufe);
        
        //se agregan al contenedor para crear nueva pestania
        jtp.add("index.html",pane);
        jtp.add("app.css",pane2);
        jtp.add("app.ufe",pane3);
        
        //guardar archivos iniciales automaticamente
        String ruta=nomProyecto+"/public/index.html";
        guardarArchivo(html, ruta);
        
        String ruta2=nomProyecto+"/src/app.css";
        guardarArchivo(css, ruta2);
        
        String ruta3=nomProyecto+"/src/app.ufe";
        guardarArchivo(ufe, ruta3);
        
        jmCrearProyecto.setEnabled(false);//inhabilita para crear nuevo proyecto
    }//GEN-LAST:event_jmCrearProyectoActionPerformed

    private void jmCrearCSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCrearCSSActionPerformed
        String archicss = JOptionPane.showInputDialog("NOMBRE DE ARCHIVO .CSS");
        jtxaCrearArchivo=new JTextArea("");
        JScrollPane pane = new JScrollPane (jtxaCrearArchivo);
        pane.getViewport ().setView (jtxaCrearArchivo); 
        jtp.add(archicss+".css",pane); //lo agrega al contenedor
        hmjtextArea.put(archicss+".css", jtxaCrearArchivo);
        
        //guardar archivo
        jtxaparaGuardar=hmjtextArea.get(archicss+".css"); //obtengo el contenido de ese archivo para guardarlo en la carpeta src del proyecto
        String ruta=nomProyecto+"/src/"+archicss+".css";
        guardarArchivo(jtxaparaGuardar, ruta);
    }//GEN-LAST:event_jmCrearCSSActionPerformed

    private void jmCrearUFEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCrearUFEActionPerformed
        String archiufe = JOptionPane.showInputDialog("NOMBRE DE ARCHIVO .UFE");
        jtxaCrearArchivo=new JTextArea("");
        JScrollPane pane = new JScrollPane (jtxaCrearArchivo);
        pane.getViewport ().setView (jtxaCrearArchivo); 
        jtp.add(archiufe+".ufe",pane); //lo agrega al contenedor
        hmjtextArea.put(archiufe+".ufe", jtxaCrearArchivo);
        
        //guardar archivo
        jtxaparaGuardar=hmjtextArea.get(archiufe+".ufe"); //obtengo el contenido de ese archivo para guardarlo en la carpeta src del proyecto
        String ruta=nomProyecto+"/src/"+archiufe+".ufe";
        guardarArchivo(jtxaparaGuardar, ruta);
    }//GEN-LAST:event_jmCrearUFEActionPerformed

    private void jmGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarArchivoActionPerformed
        //para saber si es .css o .ufe
        int select=jtp.getSelectedIndex(); 
        String nompest=jtp.getTitleAt(select);
        int tamanio=nompest.length();
        if (nompest.substring(tamanio-4, tamanio).equals(".css")) {
            jtxaparaGuardar=hmjtextArea.get(nompest); //obtengo el contenido de ese archivo para guardarlo en la carpeta src del proyecto
            String ruta=nomProyecto+"/src/"+nompest;
            guardarArchivo(jtxaparaGuardar, ruta);
        }
        else if(nompest.substring(tamanio-4, tamanio).equals(".ufe")){
            jtxaparaGuardar=hmjtextArea.get(nompest); //obtengo el contenido de ese archivo para guardarlo en la carpeta src del proyecto
            String ruta=nomProyecto+"/src/"+nompest;
            guardarArchivo(jtxaparaGuardar, ruta);
        }else{
            jtxaparaGuardar=hmjtextArea.get(nompest); //obtengo el contenido de ese archivo para guardarlo en la carpeta public del proyecto
            String ruta=nomProyecto+"/public/"+nompest;
            guardarArchivo(jtxaparaGuardar, ruta);
        }
    }//GEN-LAST:event_jmGuardarArchivoActionPerformed

    private void jmGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarComoActionPerformed
        //para saber si es .css o .ufe
        int select=jtp.getSelectedIndex(); 
        String nompest=jtp.getTitleAt(select);
        int tamanio=nompest.length();
        if (nompest.substring(tamanio-4, tamanio).equals(".css")) {
            jtxaparaGuardar=hmjtextArea.get(nompest); //obtengo el contenido de ese archivo para guardarlo en la carpeta src del proyecto
            String extension=".css";
            guardarArchivoComo(jtxaparaGuardar, extension);
        }
        else if(nompest.substring(tamanio-4, tamanio).equals(".ufe")){
            jtxaparaGuardar=hmjtextArea.get(nompest); //obtengo el contenido de ese archivo para guardarlo en la carpeta src del proyecto
            String extension=".ufe";
            guardarArchivoComo(jtxaparaGuardar, extension);
        }else{
            jtxaparaGuardar=hmjtextArea.get(nompest); //obtengo el contenido de ese archivo para guardarlo en la carpeta public del proyecto
            String extension=".html";
            guardarArchivoComo(jtxaparaGuardar, extension);
        }
    }//GEN-LAST:event_jmGuardarComoActionPerformed

    private void jmCerrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCerrarArchivoActionPerformed
        
        int select=jtp.getSelectedIndex();
        jtp.removeTabAt(select);
        
    }//GEN-LAST:event_jmCerrarArchivoActionPerformed

    private void jmCerrarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCerrarProyectoActionPerformed
        int tam=jtp.getTabCount();
        System.out.println(tam);
        for (int i = 0; i < tam; i++) 
        {
            jtp.removeTabAt(0);
        }
        jmCrearProyecto.setEnabled(true);//habilita para crear nuevo proyecto
    }//GEN-LAST:event_jmCerrarProyectoActionPerformed

    private void jmCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCompilarActionPerformed
        
        //System.out.println(b);
        //System.out.println(c);
        //AnalizadorHTML();
        //AnalizadorCSS();
        //AnalizadorUFE();
        analizadorGeneral();
        
        //jtp.add("compilado",nuevo);
        
        
    }//GEN-LAST:event_jmCompilarActionPerformed

    private void bttPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPruebasActionPerformed
//        JPanel nuevo=new JPanel();
//        Color as=Color.decode("#000000");
//        nuevo.setBackground(as);
//        nuevo.setBounds(10, 10, 600, 400);
//        nuevo.setLayout(null);
//                
//        JLabel mitext=new JLabel("mitext");
//        mitext.setBounds(150, 200, 150, 50);
//        mitext.setBackground(Color.orange);
//        mitext.setOpaque(true);
//        mitext.setForeground(Color.white);
//        Border borderr = BorderFactory.createLineBorder(Color.BLUE, 5); 
//        mitext.setBorder(borderr);
//        mitext.setHorizontalAlignment(mitext.CENTER);
//        Font font = new Font("Agency FB", Font.PLAIN, 20);
//        mitext.setForeground(Color.blue);
//        mitext.setSize(200,60);
//        mitext.setFont(font);
//        
//        nuevo.add(mitext);
//        
//        JTextField caj=new JTextField();
//        caj.setBounds(100, 300, 100, 100);
//        caj.setBackground(Color.orange);
//        caj.setOpaque(true);       
//        nuevo.add(caj);
//        
//        JButton miBoton = new JButton("Clic aqui");
//        miBoton.setBounds(100, 5, 100, 100);
//        //miBoton.setBackground(Color.yellow);
//        //miBoton.setOpaque(true);
//        //Border borderb = BorderFactory.createLineBorder(Color.BLUE, 5);         
//        //miBoton.setBorder(borderb);
//        
//        miBoton.addActionListener(new ActionListener() { @Override
//            public void actionPerformed(java.awt.event.ActionEvent e) { System.out.println("aja"); }});
//        miBoton.setForeground(Color.blue);
//        nuevo.add(miBoton);
//        
//        JComboBox milist=new JComboBox();
//        milist.setBounds(5, 25, 50, 50);
//        milist.addItem("aja");
//        milist.addItem("aja2");
//        milist.addItem("aj3");
//        milist.setSelectedIndex(1);
//        milist.setBackground(Color.yellow);
//        milist.setOpaque(true);
//        
//        nuevo.add(milist);
//        
//        SpinnerModel sm = new SpinnerNumberModel(1, 0, 9, 1);        
//        JSpinner spi=new JSpinner(sm);
//        spi.setBounds(200, 5, 100, 100);   
//        Border borderr2 = BorderFactory.createLineBorder(Color.BLUE, 5); 
//        spi.setBorder(borderr2);
//        nuevo.add(spi);
//        
//        JLabel jlimg=new JLabel("");        
//        jlimg.setBounds(5, 200, 100, 100); 
//        String a="C:\\Users\\GUDIEL\\Desktop\\imgmar.jpg";
//        ImageIcon imgi=new ImageIcon(a);
//        Icon icono=new ImageIcon(imgi.getImage().getScaledInstance(jlimg.getWidth(), jlimg.getHeight(), 0));
//        jlimg.setIcon(icono);
//        
//        nuevo.add(jlimg);
//        
//        //img.setIcon(new ImageIcon("C:\\Users\\GUDIEL\\Desktop\\imgmar.jpg"));
//        //nuevo.add(img);
//
//        misPanel.add(nuevo);
//        
//        
//        for (int i = 0; i < misPanel.size(); i++) {
//            try{
//            JButton nuevoo=(JButton)misPanel.get(i);
//            jpContenedorInterfaz.add(nuevoo);
//            }catch(Exception e){ System.out.println("error"+e);  }
//            try{
//            JPanel nuevoo=(JPanel)misPanel.get(i);
//            jpContenedorInterfaz.add(nuevoo);
//            }catch(Exception e){ System.out.println("error"+e);  }
//            //jpContenedorInterfaz.add(misPanel.get(i));
//            
//        }
//        jpContenedorInterfaz.revalidate();
//        jpContenedorInterfaz.repaint();
//        
//        String asss="arr2";
//        if (asss.substring(0,3).equals("arr")) {
//            System.out.println("yes");
//            String asss2=asss.substring(3,asss.length());
//            //System.out.println(asss2);
//        }
//        
//        Object datos[]=new Object[3];
//        datos[0]="a";
//        datos[1]=4;
//        prueba.put("si", datos);
//        
//        Object datos2[]=prueba.get("si");
//        datos2[2]="b";
//        prueba.put("si",datos2);
//        //System.out.println(datos2[1]);
//        
//        //System.out.println(prueba);
//        
//        prueba2.add("a");
//        prueba2.add("b");
//        prueba2.add("c");
//        prueba2.add("d");
//        System.out.println(prueba2);
//        prueba2.remove(1);
//        prueba2.add(1,"f");
//        System.out.println(prueba2);              
        
        String cadenaHTML="";
        cadenaHTML+=
        "<html><!--ARCHIVO DE PRUEBA -->\n" +
        "     <head>\n" +
        "          <title>APP DE PRUEBA </title>\n" +
        "     </head>\n" +
        "     <body>\n" +
        "          <noufe>Error, no se ha podido encontrar componentes</noufe>\n" +
        "          <div id=\"componentPrincipal\"></div>\n" +
        "     </body>\n" +
        "</html>";
        
        String cadenaCSS="";
        cadenaCSS+=
        "panelNombre\n" +
        "{\n" +
        "	border : true;\n" +
        "	border-color: black;\n" +
        "	border-width: 4;\n" +
        "}\n" +
        "\n" +
        "panelCarnet\n" +
        "{\n" +
        "	border : true;\n" +
        "	border-color: black;\n" +
        "	border-width: 4;\n" +
        "}\n" +
        "\n" +
        "textNom\n" +
        "{ \n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 4;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 45;\n" +
        "	font-color: blue;\n" +
        "	hight: 50;\n" +
        "	width: 250; \n" +
        "}\n" +
        "\n" +
        "miButton\n" +
        "{\n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 4;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 25;\n" +
        "	font-color: yellow;\n" +
        "	hight: 70;\n" +
        "	width: 250;\n" +
        "\n" +
        "}\n" +
        "\n" +
        "miList\n" +
        "{\n" +
        "	background : yellow;\n" +
        "	border : true;\n" +
        "	border-color: black;\n" +
        "	border-width: 4;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 25;\n" +
        "	font-color: blue;\n" +
        "	hight: 70;\n" +
        "	width: 250;\n" +
        "}\n" +
        "\n" +
        "textCarrera\n" +
        "{\n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 4;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 25;\n" +
        "	font-color: red;\n" +
        "	hight: 50;\n" +
        "	width: 700;\n" +
        "}\n" +
        "\n" +
        "textCar1\n" +
        "{\n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 2;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 55;\n" +
        "	font-color: red;\n" +
        "	hight: 55;\n" +
        "	width: 70;\n" +
        "}\n" +
        "\n" +
        "textCar2\n" +
        "{\n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 2;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 55;\n" +
        "	font-color: red;\n" +
        "	hight: 55;\n" +
        "	width: 100;\n" +
        "}\n" +
        "\n" +
        "textCar3\n" +
        "{\n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 2;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 55;\n" +
        "	font-color: red;\n" +
        "	hight: 55;\n" +
        "	width: 70;\n" +
        "}\n" +
        "\n" +
        "textCar4\n" +
        "{\n" +
        "	background : black;\n" +
        "	border : true;\n" +
        "	border-color: yellow;\n" +
        "	border-width: 2;\n" +
        "	align: center;\n" +
        "	font: 'calibri';\n" +
        "	font-size: 55;\n" +
        "	font-color: red;\n" +
        "	hight: 55;\n" +
        "	width: 70;\n" +
        "}";
        
        String cadenaUFE="";
        cadenaUFE+=
        "import \"C:\\\\Users\\\\GUDIEL\\\\Desktop\\\\Entrada\\\\App.css\";\n" +
        "\n" +
        "render (<miComponent/> , componentPrincipal);\n" +
        "\n" +
        "/*Area de variables*/\n" +
        "var index1 = 0;\n" +
        "var index2 = 1;\n" +
        "var index3 = 2;\n" +
        "var index4 = 3;\n" +
        "\n" +
        "var listaCarnet = \n" +
        "{ /*         0         ,          1   ,       2    ,     3        */\n" +
        "\n" +
        "     	    \"20\", 		\"140\", 	     \"42\",     \"78\"\n" +
        "};\n" +
        "\n" +
        "var listaNombreCompleto[4];\n" +
        "listaNombreCompleto[3] = \"Gudiel\";\n" +
        "listaNombreCompleto[2] = \"Acajabon\";\n" +
        "listaNombreCompleto[1] = \"Alexander\";\n" +
        "listaNombreCompleto[0] = \"Christopher\";\n" +
        "var textButton=\"PRESIONAME\";\n" +
        "var miNombre=\"Christopher Alexander Acajabon Gudiel\";\n" +
        "var carrera=\"Ingenieria En Ciencias y Sistemas\";\n" +
        "\n" +
        "Component miComponent()\n" +
        "{\n" +
        "     return\n" +
        "     (\n" +
        "          <panel id= principal x = 10 y = 10 height = 735 width = 1575 color = \"yellow\">          \n" +
        "               </ ComponenteNombre>\n" +
        "               </ComponenteCarnet>         \n" +
        "          </panel>          \n" +
        "     );\n" +
        "}\n" +
        "\n" +
        "component ComponenteNombre()\n" +
        "{\n" +
        "     return\n" +
        "     (\n" +
        "          <panel id= paneltitulo x = 10 y = 10 height = 400 width = 1550 color=\"blue\" className=\"panelNombre\">   \n" +
        "               <text x = 20 y = 50 height = 28 width = 100 className =\"textNom\">\n" +
        "                    { listaNombreCompleto[index1] }\n" +
        "               </text>\n" +
        "               <text x = 420 y = 50 height = 28 width = 100 className =\"textNom\">\n" +
        "                    {listaNombreCompleto[index2]}\n" +
        "               </text>                         \n" +
        "               <text x = 820 y = 50 height = 28 width = 100 className =\"textNom\">\n" +
        "                    {listaNombreCompleto[index3]}\n" +
        "               </text>\n" +
        "               <text x = 1220 y = 50 height = 28 width = 100 className =\"textNom\">\n" +
        "                    {listaNombreCompleto[index4]}\n" +
        "               </text>\n" +
        "               <button x = 250 y = 280 height = 40 width = 100 onclick = {miNombre} className = \"miButton\">\n" +
        "                    {textButton}\n" +
        "               </button>  \n" +
        "                <list x = 1050 y = 280 height = 40 width = 150 className = \"miList\">\n" +
        "                    <elements>\n" +
        "                         <item>Christopher</item>\n" +
        "                         <item>Alexander</item>\n" +
        "                         <item>Acajabon</item>\n" +
        "                         <item>Gudiel</item>\n" +
        "                    </elements>\n" +
        "                    <default> 3 </default>\n" +
        "               </list>                                       \n" +
        "          </panel>               \n" +
        "     );\n" +
        "}\n" +
        "\n" +
        "component ComponenteCarnet()\n" +
        "{ \n" +
        "     return\n" +
        "     (          \n" +
        "          <panel x =10 y = 420 height = 300 width = 1550 color=\"red\" className=\"panelCarnet\">   \n" +
        "               <text x = 630 y = 30 height = 28 width = 100 className =\"textCar1\">\n" +
        "                    { listaCarnet[index1] }\n" +
        "               </text>\n" +
        "               <text x = 690 y = 30 height = 28 width = 100 className =\"textCar2\">\n" +
        "                    { listaCarnet[index2] }\n" +
        "               </text>                         \n" +
        "               <text x = 785 y = 30 height = 28 width = 100 className =\"textCar3\">\n" +
        "                    { listaCarnet[index3] }\n" +
        "               </text>\n" +
        "                <text x = 850 y = 30 height = 28 width = 100 className =\"textCar4\">\n" +
        "                    { listaCarnet[index4] }\n" +
        "               </text>\n" +
        "               <text x = 430 y = 210 height = 40 width = 700 className =\"textCarrera\">\n" +
        "                    { carrera }\n" +
        "               </text>                                          \n" +
        "          </panel>               \n" +
        "     );\n" +
        "}\n" +
        "\n" +
        "//import idComponent from \"Rutaa_Absoluta_De_Tu_Archivo_UFE\";";
        
        html.setText(cadenaHTML);
        css.setText(cadenaCSS);
        ufe.setText(cadenaUFE);
        
       /* try {
            ScanerUFE scanUFE=new ScanerUFE(new BufferedReader(new StringReader(html.getText())));
            analisis_sintactico_UFE_Repetir parserUFE=new analisis_sintactico_UFE_Repetir(scanUFE);
            parserUFE.parse();
           
            analisis_sintactico_UFE_Imprimir parserImprimir=new analisis_sintactico_UFE_Imprimir();
            //parserImprimir.lista_imprimirConsola.clear();
            String impriConsol="";
            for (int i = 0; i < parserImprimir.lista_imprimirConsola.size(); i++) 
            {
                String impc=parserImprimir.lista_imprimirConsola.get(i);
                impriConsol+=impc+"\n";
            }  
            txtaConsola.setText(impriConsol);
            //System.out.println(parserUFE.lista_imprimirConsola);
         
            
        } catch (Exception e) {
        }*/
     

    }//GEN-LAST:event_bttPruebasActionPerformed

    private void bttPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPrincipalActionPerformed
        jpContenedorInterfaz.setVisible(false);
        jtp.setVisible(true);
        jpConsola.setVisible(true);
        lblNombreApp.setVisible(false);
    }//GEN-LAST:event_bttPrincipalActionPerformed

    private void bttInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInterfazActionPerformed
        jpContenedorInterfaz.setVisible(true);
        jtp.setVisible(false);
        jpConsola.setVisible(false);
        lblNombreApp.setVisible(true);
    }//GEN-LAST:event_bttInterfazActionPerformed

    public void AnalizadorHTML()
    {
        try {
            ScanerHTML scanHtml=new ScanerHTML(new BufferedReader(new StringReader(html.getText())));
            analisis_sintacticoHTML parserHTML=new analisis_sintacticoHTML(scanHtml);
            parserHTML.parse();
            
            txtaConsola.setText(scanHtml.lexemas);
            System.out.println(parserHTML.noufe);
            lblNombreApp.setText(parserHTML.titulo);
            System.out.println(parserHTML.misIDShtml);
            
        } catch (Exception e) {
        }
        
    }
    
    public void AnalizadorCSS()
    {
        try {
            ScanerCSS scanCss=new ScanerCSS(new BufferedReader(new StringReader(html.getText())));
            analisis_sintacticoCSS parserCSS=new analisis_sintacticoCSS(scanCss);
            parserCSS.parse();
            
            txtaConsola.setText(scanCss.lexemas);
            
        } catch (Exception e) {
        }
               //agrego los paneles en interfaz
//            for (int i = 0; i < parserUFE.misPaneles.size(); i++) 
//            {
//            jpContenedorInterfaz.add(parserUFE.misPaneles.get(i));            
//            }
    }
    
    public void AnalizadorUFE()
    {
        try {
            
            //limpio panel
            jpContenedorInterfaz.removeAll();
            jpContenedorInterfaz.repaint();                       
            
            //lexico .ufe
            ScanerUFE scanUFE=new ScanerUFE(new BufferedReader(new StringReader(html.getText())));
            
            //para importcomponent
            analisis_sintactico_UFE_ImportComponent parserUFE=new analisis_sintactico_UFE_ImportComponent(scanUFE);
            parserUFE.textoEntradaParaCSS=html.getText();
            //parserUFE.misPaneles.clear();
            
            //para componentPrincipal
            analisis_sintactico_UFE_ComponentPrincipal parserPrincipal=new analisis_sintactico_UFE_ComponentPrincipal(scanUFE);
            //parserPrincipal.misPaneles.clear();
            parserPrincipal.textoEntradaParaCSS=html.getText();

            //para Render
            analisis_sintactico_UFE_Render parserRender=new analisis_sintactico_UFE_Render(scanUFE);
            //parserRender.llamadaPrincipal(html.getText());
            
            parserRender.parse();
            
            txtaConsola.setText(scanUFE.lexemas);
            
            System.out.println(parserRender.hmGuardarVariables);
            System.out.println(parserRender.hmArreglos);
            System.out.println(parserRender.hmComponentes);
            System.out.println(parserRender.misIDSrender);
          
            
            for (String key : parserRender.hmComponentes.keySet()) {
                //System.out.println("Key = " + key);
                if (key.equals("pagina")) {
                    JPanel nuevo=(JPanel)parserRender.hmComponentes.get("pagina");
                    jpContenedorInterfaz.add(nuevo);
                }
            }
          
            jpContenedorInterfaz.revalidate();
            jpContenedorInterfaz.repaint();
            
            
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        
    }
    
    void analizadorGeneral()
    {        
        try {
            //para limpiar tabla de errores semanticos
            for (int i = tablaErrSemanticos.getRowCount()-1; i >= 0; i--) 
            {
                tablaErrSemanticos.removeRow(i);
            }
            // ------------------------ PARA HTML ------------------------ //
            
            ScanerHTML scanHtml=new ScanerHTML(new BufferedReader(new StringReader(html.getText())));
            analisis_sintacticoHTML parserHTML=new analisis_sintacticoHTML(scanHtml);
            parserHTML.misIDShtml.clear();
            //para limpiar tabla errores lexicos
            for (int i = scanHtml.tablaerroresLexHTML.getRowCount()-1; i >= 0; i--) 
            {
                scanHtml.tablaerroresLexHTML.removeRow(i);
            }
            //para limpiar tabla errores sintacticos
            for (int i = parserHTML.tablaerroresSintacticosHTML.getRowCount()-1; i >= 0; i--) 
            {
                parserHTML.tablaerroresSintacticosHTML.removeRow(i);
            }
            parserHTML.parse();
            
            lblNombreApp.setText(parserHTML.titulo);
            
            // ------------------------ PARA CSS ------------------------ //
            ScanerCSS scanCSS=new ScanerCSS(null);
            analisis_sintacticoCSS parserCSS=new analisis_sintacticoCSS();
            //para limpiar tabla errores lexicos
            for (int i = scanCSS.tablaerroresLexCSS.getRowCount()-1; i >= 0; i--) 
            {
                scanCSS.tablaerroresLexCSS.removeRow(i);
            }
            //para limpiar tabla errores sintacticos
            for (int i = parserCSS.tablaerroresSintacticosCSS.getRowCount()-1; i >= 0; i--) 
            {
                parserCSS.tablaerroresSintacticosCSS.removeRow(i);
            }
            
            // ------------------------ PARA UFE ------------------------ //
            
            //limpio panel
            jpContenedorInterfaz.removeAll();
            jpContenedorInterfaz.repaint();                       
            
            //lexico .ufe
            ScanerUFE scanUFE=new ScanerUFE(new BufferedReader(new StringReader(ufe.getText())));
            //para limpiar tabla errores lexicos
            for (int i = scanUFE.tablaerroresLexUFE.getRowCount()-1; i >= 0; i--) 
            {
                scanUFE.tablaerroresLexUFE.removeRow(i);
            }
            
            //guardarVariables
            analisis_sintactico_UFE_GuardarVariables parserGuardarVariables=new analisis_sintactico_UFE_GuardarVariables(scanUFE);
            parserGuardarVariables.hmGuardarVariables.clear();
            parserGuardarVariables.hmArreglos.clear();
            parserGuardarVariables.listErroresSemanticos.clear();
            //para limpiar tabla errores sintacticos
            for (int i = parserGuardarVariables.tablaerroresSintacticosUFE.getRowCount()-1; i >= 0; i--) 
            {
                parserGuardarVariables.tablaerroresSintacticosUFE.removeRow(i);
            }
            
            //para importcomponent
            analisis_sintactico_UFE_ImportComponent parserImportComponent=new analisis_sintactico_UFE_ImportComponent(scanUFE);
            parserImportComponent.textoEntradaParaCSS=ufe.getText();
            parserImportComponent.hmComponentes.clear();            
                       
            //para componentPrincipal
            analisis_sintactico_UFE_ComponentPrincipal parserPrincipal=new analisis_sintactico_UFE_ComponentPrincipal(scanUFE);
            //parserPrincipal.misPaneles.clear();
            parserPrincipal.textoEntradaParaCSS=ufe.getText();

            //para Render
            analisis_sintactico_UFE_Render parserRender=new analisis_sintactico_UFE_Render(scanUFE);
            parserRender.misIDSrender.clear();
                      
            analisis_sintactico_UFE_Imprimir parserImprimir=new analisis_sintactico_UFE_Imprimir(scanUFE);
            parserImprimir.lista_imprimirConsola.clear();
            parserImprimir.llamadaPrincipal(ufe.getText());
            parserImprimir.parse();
            
            //para la interfaz grafica
            boolean banderaExis=false;
            for (int i = 0; i < parserHTML.misIDShtml.size(); i++) {
                String idDiv=parserHTML.misIDShtml.get(i);
                if (parserRender.misIDSrender.containsKey(idDiv)) 
                {
                    String idRender=parserRender.misIDSrender.get(idDiv);
                    if (parserRender.hmComponentes.containsKey(idRender)) {
                        JPanel nuevo=(JPanel)parserRender.hmComponentes.get(idRender);
                        jpContenedorInterfaz.add(nuevo);
                        banderaExis=true;
                    }                    
                }
            }
            
            if (banderaExis==false) {
                panelError(parserHTML.noufe);
            }
            
            // ------------------------ PARA IMPRIMIR EN CONSOLA ------------------------ //
            String impriConsol="";
            for (int i = 0; i < parserImprimir.lista_imprimirConsola.size(); i++) 
            {
                String impc=parserImprimir.lista_imprimirConsola.get(i);
                impriConsol+=impc+"\n";
            }  
            txtaConsola.setText(impriConsol);
                      
            jpContenedorInterfaz.revalidate();
            jpContenedorInterfaz.repaint();
            
            // ------------------------ PARA ERRORES LEX, SINT, SEMANT ------------------------ //
            //lexico HTML
            String impriErrLexHTML="";
            for (int i = 0; i < scanHtml.tablaerroresLexHTML.getRowCount(); i++) 
            {
                impriErrLexHTML+= "Error Lexico HTML: Lexema: " + scanHtml.tablaerroresLexHTML.getValueAt(i, 0).toString() + " Linea: " + scanHtml.tablaerroresLexHTML.getValueAt(i, 1).toString() + " Columna: " + scanHtml.tablaerroresLexHTML.getValueAt(i, 2).toString() + "\n";
            }
            txtaErrores.setText(impriErrLexHTML);
            
            //lexico CSS
            String impriErrLexCSS=txtaErrores.getText();
            for (int i = 0; i < scanCSS.tablaerroresLexCSS.getRowCount()/10; i++) 
            {
                impriErrLexCSS+= "Error Lexico CSS: Lexema: " + scanCSS.tablaerroresLexCSS.getValueAt(i, 0).toString() + " Linea: " + scanCSS.tablaerroresLexCSS.getValueAt(i, 1).toString() + " Columna: " + scanCSS.tablaerroresLexCSS.getValueAt(i, 2).toString() + "\n";
            }
            txtaErrores.setText(impriErrLexCSS);
            
            //lexico UFE
            String impriErrLexUFE=txtaErrores.getText();
            for (int i = 0; i < scanUFE.tablaerroresLexUFE.getRowCount()/19; i++) 
            {
                impriErrLexUFE+= "Error Lexico UFE: Lexema: " + scanUFE.tablaerroresLexUFE.getValueAt(i, 0).toString() + " Linea: " + scanUFE.tablaerroresLexUFE.getValueAt(i, 1).toString() + " Columna: " + scanUFE.tablaerroresLexUFE.getValueAt(i, 2).toString() + "\n";
            }
            txtaErrores.setText(impriErrLexUFE);
            
            //sintactico HTML
            String impriErrSintHTML=txtaErrores.getText();
            for (int i = 0; i < parserHTML.tablaerroresSintacticosHTML.getRowCount(); i++) 
            {
                impriErrSintHTML+= "Error Sintactico HTML: Lexema: " + parserHTML.tablaerroresSintacticosHTML.getValueAt(i, 0).toString() + " Linea: " + parserHTML.tablaerroresSintacticosHTML.getValueAt(i, 1).toString() + " Columna: " + parserHTML.tablaerroresSintacticosHTML.getValueAt(i, 2).toString() + "\n";
            }
            txtaErrores.setText(impriErrSintHTML);
            
            //sintactico CSS
            String impriErrSintCSS=txtaErrores.getText();
            for (int i = 0; i < parserCSS.tablaerroresSintacticosCSS.getRowCount(); i++) 
            {
                impriErrSintCSS+= "Error Sintactico CSS: Lexema: " + parserCSS.tablaerroresSintacticosCSS.getValueAt(i, 0).toString() + " Linea: " + parserCSS.tablaerroresSintacticosCSS.getValueAt(i, 1).toString() + " Columna: " + parserCSS.tablaerroresSintacticosCSS.getValueAt(i, 2).toString() + "\n";
            }
            txtaErrores.setText(impriErrSintCSS);
            
            //sintactico UFE
            String impriErrSintUFE=txtaErrores.getText();
            for (int i = 0; i < parserGuardarVariables.tablaerroresSintacticosUFE.getRowCount(); i++) 
            {
                impriErrSintUFE+= "Error Sintactico UFE: Lexema: " + parserGuardarVariables.tablaerroresSintacticosUFE.getValueAt(i, 0).toString() + " Linea: " + parserGuardarVariables.tablaerroresSintacticosUFE .getValueAt(i, 1).toString() + " Columna: " + parserGuardarVariables.tablaerroresSintacticosUFE.getValueAt(i, 2).toString() + "\n";
            }
            txtaErrores.setText(impriErrSintUFE);
            
            //semanticos
            String impriErrSemant=txtaErrores.getText();
            for (int i = 0; i < parserImprimir.listErroresSemanticos.size(); i++) 
            {
                String impe=parserImprimir.listErroresSemanticos.get(i);
                impriErrSemant+=impe+"\n";
                Object[] er = {impe, "Desconocida", "Desconocida"};
                tablaErrSemanticos.addRow(er);
                
            }
            txtaErrores.setText(impriErrSemant);
            
            // ------------------------ PARA REPORTE HTML ------------------------ //
            html(scanHtml.tablaerroresLexHTML, scanCSS.tablaerroresLexCSS, scanUFE.tablaerroresLexUFE, parserHTML.tablaerroresSintacticosHTML, parserCSS.tablaerroresSintacticosCSS, parserGuardarVariables.tablaerroresSintacticosUFE , tablaErrSemanticos );
            
        } catch (Exception e) {
        }
    }
    
    void panelError(String text){
        
        jpContenedorInterfaz.removeAll();
        jpContenedorInterfaz.repaint();
            
        JPanel panelError=new JPanel();
        panelError.setBackground(Color.GRAY);
        panelError.setBounds(10, 10, 1575, 735);
        panelError.setLayout(null);
        
        JLabel mitext=new JLabel(text);
        mitext.setBounds(30, 290, 1515, 100);
        mitext.setBackground(Color.gray);
        mitext.setOpaque(true);
        mitext.setForeground(Color.white);
        Border borderr = BorderFactory.createLineBorder(Color.BLUE, 5); 
        mitext.setBorder(borderr);
        mitext.setHorizontalAlignment(mitext.CENTER);
        Font font = new Font("Agency FB", Font.PLAIN, 40);
        mitext.setFont(font);
        
        panelError.add(mitext);
        
        JLabel mitext2=new JLabel(":(");
        mitext2.setBounds(760, 410, 150, 150);
        mitext2.setBackground(Color.gray);
        mitext2.setOpaque(true);
        mitext2.setForeground(Color.white);
        Font font2 = new Font("Agency FB", Font.PLAIN, 90);
        mitext2.setFont(font2);
        
        panelError.add(mitext2);    
                
        jpContenedorInterfaz.add(panelError);
        
        lblNombreApp.setText("ERROR");
        
        jpContenedorInterfaz.revalidate();
        jpContenedorInterfaz.repaint();
        
    }
    
    void guardarArchivo(JTextArea contenido, String ruta)
    {
        try 
            {
                File archivo = new File(ruta); // este es el archivo que insertaras caracteres
                FileOutputStream  escribir = new FileOutputStream (archivo);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(escribir));
                String texto = contenido.getText();
                for(int i=0; i<texto.length();i++){                
                    char character = texto.charAt(i);    
                    int ascii = (int) character;

                    if (ascii==10) {
                        bw.newLine();
                    }
                bw.write(texto.charAt(i));

                }
                bw.close();
            } catch (Exception e) 
            {
            }
    }
    
    void guardarArchivoComo(JTextArea areatexto, String extension) 
     {
        try
        {
            JFileChooser file=new JFileChooser();
            file.showSaveDialog(this);
            File guarda =file.getSelectedFile();

            if(guarda !=null)
            {
              FileWriter  save=new FileWriter(guarda+extension);
              save.write(areatexto.getText());
              save.close();
              JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
              }
        }
         catch(IOException ex)
         {
          JOptionPane.showMessageDialog(null,"Su archivo no se ha guardado","Advertencia",JOptionPane.WARNING_MESSAGE);
         }
    }
    
    void html(DefaultTableModel tbErrLexHTML, DefaultTableModel tbErrLexCSS, DefaultTableModel tbErrLexUFE, DefaultTableModel tbErrSintacHTML, DefaultTableModel tbErrSintacCSS, DefaultTableModel tbErrSintacUFE, DefaultTableModel tbErrSemant)
    {
        
        FileWriter filewriter = null;
        PrintWriter printw = null;
        
        try{
            filewriter = new FileWriter("reporte_errores.html");//declarar el archivo
            printw = new PrintWriter(filewriter);//declarar un impresor

            printw.println("<html>");
            printw.println("<head><title>REPORTE DE ERRORES</title></head>");     
            printw.println("<body bgcolor=white>");

            //----> TABLA1
            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"LEXEMA"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            printw.println("<h2><center>ERRORES LEXICOS</center></h2>");
            for (int i = 0; i < (tbErrLexHTML.getRowCount()); i++) 
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrLexHTML.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrLexHTML.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrLexHTML.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }
            
            for (int i = 0; i < (tbErrLexCSS.getRowCount()/10); i++) 
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrLexCSS.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrLexCSS.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrLexCSS.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            } 
            
            for (int i = 0; i < (tbErrLexUFE.getRowCount()/19); i++) //dividido 19 porque son 9 veces que me agrega cada error
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrLexUFE.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrLexUFE.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrLexUFE.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }
                        
            printw.println("</table></center>");
                        
            //----> TABLA3
            printw.println("<h2><center>ERRORES SINTACTICOS</center></h2>");

            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"LEXEMA"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            for (int i = 0; i < tbErrSintacHTML.getRowCount(); i++) 
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrSintacHTML.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrSintacHTML.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrSintacHTML.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            } 
            
            for (int i = 0; i < tbErrSintacCSS.getRowCount(); i++) 
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrSintacCSS.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrSintacCSS.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrSintacCSS.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }
            
            for (int i = 0; i < tbErrSintacUFE.getRowCount(); i++) 
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrSintacUFE.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrSintacUFE.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrSintacUFE.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }
                        
            printw.println("</table></center>");    
            
            //----> TABLA3
            printw.println("<h2><center>ERRORES SEMANTICOS</center></h2>");

            printw.println("<center><table class=\"egt\" border=\"10\">");
            
            printw.println("<tr bgcolor=\"#00FFFF\">");
            printw.println("<th>"+"DESCRIPCION"+"</th>");
            printw.println("<th>"+"LINEA"+"</th>");
            printw.println("<th>"+"COLUMNA"+"</th>");
            printw.println("</tr>");            
            
            for (int i = 0; i < tbErrSemant.getRowCount(); i++) 
            {
                printw.println("<tr>");
                printw.println("<td>"+tbErrSemant.getValueAt(i, 0).toString()+"</td>");
                printw.println("<td>"+tbErrSemant.getValueAt(i, 1).toString()+"</td>");
                printw.println("<td>"+tbErrSemant.getValueAt(i, 2).toString()+"</td>");
                printw.println("</tr>");                
            }           
                        
            printw.println("</table></center>");
            
            
            printw.println("</body>");
            printw.println("</html>");

            //no devemos olvidar cerrar el archivo para que su lectura sea correcta
            printw.close();//cerramos el archivo
           }catch(Exception e){
            System.out.println(e.getMessage());
           }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttInterfaz;
    private javax.swing.JButton bttPrincipal;
    private javax.swing.JButton bttPruebas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jmCerrarArchivo;
    private javax.swing.JMenuItem jmCerrarProyecto;
    private javax.swing.JMenuItem jmCompilar;
    private javax.swing.JMenuItem jmCrearCSS;
    private javax.swing.JMenuItem jmCrearProyecto;
    private javax.swing.JMenuItem jmCrearUFE;
    private javax.swing.JMenuItem jmGuardarArchivo;
    private javax.swing.JMenuItem jmGuardarComo;
    private javax.swing.JTabbedPane jpConsola;
    private javax.swing.JPanel jpContenedorInterfaz;
    private javax.swing.JTabbedPane jtp;
    private javax.swing.JLabel lblNombreApp;
    private javax.swing.JTextArea txtaConsola;
    private javax.swing.JTextArea txtaErrores;
    // End of variables declaration//GEN-END:variables
}
