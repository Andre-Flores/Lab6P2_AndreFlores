/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6p2_andreflores_;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author andre
 */
public class JfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JfPrincipal
     */
    public JfPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Equipos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_PaisEquipo = new javax.swing.JTextField();
        tf_NombreEquipo = new javax.swing.JTextField();
        tf_Ciudad = new javax.swing.JTextField();
        tf_Estadio = new javax.swing.JTextField();
        btn_AgregarEquipo = new javax.swing.JButton();
        jd_Jugadores = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cb_Posicion = new javax.swing.JComboBox<>();
        tf_NombreJugador = new javax.swing.JTextField();
        btn_AgregarJugador = new javax.swing.JButton();
        sp_Edad = new javax.swing.JSpinner();
        jd_Transferencias = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaJugadores = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbolEquipos = new javax.swing.JTree();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        MenuPopupEliminar = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        ppMenu_Jugadores = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar_Jugador = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_equipos = new javax.swing.JButton();
        btn_Jugadores = new javax.swing.JButton();
        btn_transferencias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jd_Equipos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Crear Equipos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 15, 180, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estadio");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pais del Equipo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre del Equipo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ciudad");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        jPanel2.add(tf_PaisEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 110, -1));
        jPanel2.add(tf_NombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 110, -1));
        jPanel2.add(tf_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, -1));
        jPanel2.add(tf_Estadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 110, -1));

        btn_AgregarEquipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_AgregarEquipo.setText("Agregar");
        btn_AgregarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarEquipoMouseClicked(evt);
            }
        });
        jPanel2.add(btn_AgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 100, 40));

        jd_Equipos.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 588, 496));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel8.setBackground(new java.awt.Color(153, 255, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Crear Jugadores");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Edad");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Posicion");

        cb_Posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Defensa", "Mediocampista", "Delantero" }));

        btn_AgregarJugador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_AgregarJugador.setText("Agregar");
        btn_AgregarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AgregarJugadorMouseClicked(evt);
            }
        });

        sp_Edad.setModel(new javax.swing.SpinnerNumberModel(15, 15, 45, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_AgregarJugador)
                .addGap(252, 252, 252))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_NombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sp_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn_AgregarJugador)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jd_JugadoresLayout = new javax.swing.GroupLayout(jd_Jugadores.getContentPane());
        jd_Jugadores.getContentPane().setLayout(jd_JugadoresLayout);
        jd_JugadoresLayout.setHorizontalGroup(
            jd_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_JugadoresLayout.setVerticalGroup(
            jd_JugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        listaJugadores.setModel(new DefaultListModel());
        listaJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaJugadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaJugadores);

        jButton1.setText("Transferir ---->");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Equipos");
        arbolEquipos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbolEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolEquiposMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(arbolEquipos);

        jLabel12.setBackground(new java.awt.Color(153, 255, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Transferencias");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Jugadores");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Equipos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(208, 208, 208))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(91, 91, 91))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(251, 251, 251))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(68, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jd_TransferenciasLayout = new javax.swing.GroupLayout(jd_Transferencias.getContentPane());
        jd_Transferencias.getContentPane().setLayout(jd_TransferenciasLayout);
        jd_TransferenciasLayout.setHorizontalGroup(
            jd_TransferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_TransferenciasLayout.setVerticalGroup(
            jd_TransferenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        MenuPopupEliminar.add(Eliminar);

        Modificar.setText("Modificar jugador");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        ppMenu_Jugadores.add(Modificar);

        Eliminar_Jugador.setText("Eliminar jugador");
        Eliminar_Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_JugadorActionPerformed(evt);
            }
        });
        ppMenu_Jugadores.add(Eliminar_Jugador);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 204));
        jToolBar1.setRollover(true);

        btn_equipos.setBackground(new java.awt.Color(255, 255, 204));
        btn_equipos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_equipos.setForeground(new java.awt.Color(0, 0, 0));
        btn_equipos.setText("Crear equipos");
        btn_equipos.setFocusable(false);
        btn_equipos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_equipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_equiposMouseClicked(evt);
            }
        });
        jToolBar1.add(btn_equipos);

        btn_Jugadores.setBackground(new java.awt.Color(255, 255, 204));
        btn_Jugadores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Jugadores.setForeground(new java.awt.Color(0, 0, 0));
        btn_Jugadores.setText("Crear jugadores");
        btn_Jugadores.setFocusable(false);
        btn_Jugadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Jugadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_JugadoresMouseClicked(evt);
            }
        });
        jToolBar1.add(btn_Jugadores);

        btn_transferencias.setBackground(new java.awt.Color(255, 255, 204));
        btn_transferencias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_transferencias.setForeground(new java.awt.Color(0, 0, 0));
        btn_transferencias.setText("Transferencias");
        btn_transferencias.setFocusable(false);
        btn_transferencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_transferencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferenciasActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_transferencias);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\cr.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido a Boroa League of Fantasy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Crear Equipos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Crear Jugadores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Transferencias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_Equipos.pack();
        jd_Equipos.setLocationRelativeTo(this);
        jd_Equipos.setModal(true);
        jd_Equipos.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jd_Transferencias.pack();
        jd_Transferencias.setLocationRelativeTo(this);
        jd_Transferencias.setModal(true);
        jd_Transferencias.setVisible(true);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_Jugadores.pack();
        jd_Jugadores.setLocationRelativeTo(this);
        jd_Jugadores.setModal(true);
        jd_Jugadores.setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_equiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_equiposMouseClicked
        jd_Equipos.pack();
        jd_Equipos.setLocationRelativeTo(this);
        jd_Equipos.setModal(true);
        jd_Equipos.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equiposMouseClicked

    private void btn_JugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_JugadoresMouseClicked
        jd_Jugadores.pack();
        jd_Jugadores.setLocationRelativeTo(this);
        jd_Jugadores.setModal(true);
        jd_Jugadores.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_JugadoresMouseClicked

    private void btn_transferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferenciasActionPerformed
        jd_Transferencias.pack();
        jd_Transferencias.setLocationRelativeTo(this);
        jd_Transferencias.setModal(true);
        jd_Transferencias.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_btn_transferenciasActionPerformed

    private void btn_AgregarEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarEquipoMouseClicked

        equipos.add(new Equipo(tf_PaisEquipo.getText(), tf_NombreEquipo.getText(), tf_Ciudad.getText(), tf_Estadio.getText()));

        DefaultTreeModel m = (DefaultTreeModel) arbolEquipos.getModel();

        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

        Equipo equipo = new Equipo(tf_PaisEquipo.getText(),
                tf_NombreEquipo.getText(), tf_Ciudad.getText(), tf_Estadio.getText());
        DefaultMutableTreeNode nodo_pais;
        nodo_pais = new DefaultMutableTreeNode(equipo.getPaisEquipo());
        DefaultMutableTreeNode nodo_equipo;
        nodo_equipo = new DefaultMutableTreeNode(equipo);
        raiz.add(nodo_pais);
        nodo_pais.add(nodo_equipo);

        tf_PaisEquipo.setText("");

        tf_NombreEquipo.setText("");
        tf_Estadio.setText("");

        tf_Ciudad.setText("");
    }//GEN-LAST:event_btn_AgregarEquipoMouseClicked

    private void btn_AgregarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AgregarJugadorMouseClicked
        DefaultListModel modelo = (DefaultListModel) listaJugadores.getModel();

        modelo.addElement(new Jugador(tf_NombreJugador.getText(), (Integer) sp_Edad.getValue(), (String) cb_Posicion.getSelectedItem()));
        sp_Edad.setValue(15);
        tf_NombreJugador.setText("");
        JOptionPane.showMessageDialog(jd_Jugadores, "Jugador Agregado");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AgregarJugadorMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void arbolEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolEquiposMouseClicked
        if (evt.getButton() == 3) {

            DefaultMutableTreeNode v1 = (DefaultMutableTreeNode) arbolEquipos.getLastSelectedPathComponent();

            if (v1.getUserObject() instanceof Equipo) {
                MenuPopupEliminar.show(evt.getComponent(), evt.getX(), evt.getY());

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_arbolEquiposMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        int response = JOptionPane.showConfirmDialog(
                jd_Transferencias,
                "Seguro de Eliminar?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m
                    = (DefaultTreeModel) arbolEquipos.getModel();
            m.removeNodeFromParent((MutableTreeNode) arbolEquipos.getLastSelectedPathComponent());
            m.reload();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if (listaJugadores.getSelectedIndex() >= 0) {
            DefaultListModel modeloLISTA = (DefaultListModel) listaJugadores.getModel();
            String nombre;
            do {
                nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            } while (!nombre.matches("[a-zA-Z]+"));

            String EdadVString;
            int edad;
            do {
                EdadVString = JOptionPane.showInputDialog("Ingrese su edad:");
            } while (!EdadVString.matches("\\d+"));
            edad = Integer.parseInt(EdadVString);

            ((Jugador) modeloLISTA.get(listaJugadores.getSelectedIndex())).setNombreJugador(nombre);
            ((Jugador) modeloLISTA.get(listaJugadores.getSelectedIndex())).setEdad(edad);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void listaJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaJugadoresMouseClicked
        if (listaJugadores.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                ppMenu_Jugadores.show(evt.getComponent(),
                        evt.getX(), evt.getY());

            }

        }
    }//GEN-LAST:event_listaJugadoresMouseClicked

    private void Eliminar_JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_JugadorActionPerformed
        if (listaJugadores.getSelectedIndex() >= 0) {
            int jugadorseleccionado = listaJugadores.getSelectedIndex();
            DefaultListModel modeloLISTA = (DefaultListModel) listaJugadores.getModel();
            modeloLISTA.remove(jugadorseleccionado);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar_JugadorActionPerformed

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
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Eliminar_Jugador;
    private javax.swing.JPopupMenu MenuPopupEliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JTree arbolEquipos;
    private javax.swing.JButton btn_AgregarEquipo;
    private javax.swing.JButton btn_AgregarJugador;
    private javax.swing.JButton btn_Jugadores;
    private javax.swing.JButton btn_equipos;
    private javax.swing.JButton btn_transferencias;
    private javax.swing.JComboBox<String> cb_Posicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jd_Equipos;
    private javax.swing.JDialog jd_Jugadores;
    private javax.swing.JDialog jd_Transferencias;
    private javax.swing.JList<String> listaJugadores;
    private javax.swing.JPopupMenu ppMenu_Jugadores;
    private javax.swing.JSpinner sp_Edad;
    private javax.swing.JTextField tf_Ciudad;
    private javax.swing.JTextField tf_Estadio;
    private javax.swing.JTextField tf_NombreEquipo;
    private javax.swing.JTextField tf_NombreJugador;
    private javax.swing.JTextField tf_PaisEquipo;
    // End of variables declaration//GEN-END:variables
    ArrayList<Equipo> equipos = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
    Jugador jugador_Seleccionado;
    Equipo equipo_Seleccionado;
}
