/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import schoolsystem.connection;

public class TeacherD extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public TeacherD() {
        initComponents();
        conn = connection.connecrDb();
        updateLessonTable();
        loadLessonData();
        loadSData();
        updateSTable();
        updateStudentTable();
        loadStudentData();
        updateTTable();
        loadTData();
    }
    
    public void close(){
        WindowEvent winClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
        
    }
    
    private void updateLessonTable(){
        try{
            String sql = "select * from lesson ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_people1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
//    
    private void loadLessonData(){
        try {
            String sql = "select * from lesson";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(table_people1.getRowCount() > 0){
                ((DefaultTableModel)table_people1.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)table_people1.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateLessonTable();
    }
    private void updateTTable(){
        try{
            String sql = "select * from Teacher_Ltable ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            lesson_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    private void loadTData(){
        try {
            String sql = "select * from Teacher_Ltable";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(lesson_table.getRowCount() > 0){
                ((DefaultTableModel)lesson_table.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)lesson_table.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateTTable();
    }
    private void updateSTable(){
        try{
            String sql = "select * from student ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table_people1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    private void loadSData(){
        try {
            String sql = "select * from student";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(table_people1.getRowCount() > 0){
                ((DefaultTableModel)table_people1.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)table_people1.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateSTable();
    }
    
    private void updateStudentTable(){
        try{
            String sql = "select * from Teacher_Stable";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            students_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    private void loadStudentData(){
        try {
            String sql = "select * from Teacher_Stable";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(students_table.getRowCount() > 0){
                ((DefaultTableModel)students_table.getModel()).removeRow(0);
                
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i<=col; i++){
                    rows[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel)students_table.getModel()).insertRow(rs.getRow() -1, rows);
            }
            rs.close();
            pst.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateStudentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search_txt1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        logout1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_people1 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sid_text = new javax.swing.JTextField();
        sname_txt = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        save_botton3 = new javax.swing.JButton();
        del_button3 = new javax.swing.JButton();
        clear_text3 = new javax.swing.JButton();
        students = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        les_text = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lid_text1 = new javax.swing.JTextField();
        lname_txt1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        save_botton4 = new javax.swing.JButton();
        del_button4 = new javax.swing.JButton();
        clear_text4 = new javax.swing.JButton();
        update_text = new javax.swing.JButton();
        lessons1 = new javax.swing.JButton();
        cap_text = new javax.swing.JLabel();
        tech_text1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        students_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        lesson_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        search_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txt1ActionPerformed(evt);
            }
        });
        search_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txt1KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Search");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_minus-remove-delete-minimize_2931142 (2).png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_plus-add-new-create-attach-maximize_2931155 (1).png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_exit-delete-remove-close-x_2931151.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        logout1.setText("Logout");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        table_people1.setBackground(new java.awt.Color(204, 204, 204));
        table_people1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_people1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_people1MouseClicked(evt);
            }
        });
        table_people1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_people1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_people1);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setText("Name");

        jLabel14.setText("ID");

        sid_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sid_textActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        save_botton3.setText("Save");
        save_botton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_botton3ActionPerformed(evt);
            }
        });

        del_button3.setText("Delete");
        del_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_button3ActionPerformed(evt);
            }
        });

        clear_text3.setText("Clear");
        clear_text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_text3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear_text3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del_button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_botton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(save_botton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del_button3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear_text3)
                .addContainerGap())
        );

        students.setText("Students");
        students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMouseClicked(evt);
            }
        });
        students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsActionPerformed(evt);
            }
        });

        jLabel1.setText("Lesson");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sname_txt)
                    .addComponent(sid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(les_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(sid_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(students))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(sname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(les_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setText("Lesson");

        jLabel19.setText("ID");

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        save_botton4.setText("Save");
        save_botton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_botton4ActionPerformed(evt);
            }
        });

        del_button4.setText("Delete");
        del_button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_button4ActionPerformed(evt);
            }
        });

        clear_text4.setText("Clear");
        clear_text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_text4ActionPerformed(evt);
            }
        });

        update_text.setText("Update");
        update_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(del_button4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(save_botton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(update_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(save_botton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(del_button4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_text4)
                .addContainerGap())
        );

        lessons1.setText("Lessons");
        lessons1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessons1MouseClicked(evt);
            }
        });
        lessons1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessons1ActionPerformed(evt);
            }
        });

        cap_text.setText("Capacity");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lessons1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(cap_text))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lname_txt1)
                    .addComponent(lid_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tech_text1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(lid_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lessons1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lname_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cap_text)
                            .addComponent(tech_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        students_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        students_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                students_tableMouseClicked(evt);
            }
        });
        students_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                students_tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(students_table);

        lesson_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        lesson_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lesson_tableMouseClicked(evt);
            }
        });
        lesson_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lesson_tableKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(lesson_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(logout1)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txt1ActionPerformed

    private void search_txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txt1KeyReleased
        try{
            String sql = "select * from student where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                sid_text.setText(add1);
                String add2 = rs.getString("Name");
                sname_txt.setText(add2);
//                String add3 = rs.getString("Lesson");
//                les_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from student where ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                sid_text.setText(add1);
                String add2 = rs.getString("Name");
                sname_txt.setText(add2);
//                String add3 = rs.getString("Lesson");
//                les_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from Teacher_Stable where Lesson = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                sid_text.setText(add1);
                String add2 = rs.getString("Name");
                sname_txt.setText(add2);
                String add3 = rs.getString("Lesson");
                les_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from Teacher_Stable where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                sid_text.setText(add1);
                String add2 = rs.getString("Name");
                sname_txt.setText(add2);
                String add3 = rs.getString("Lesson");
                les_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from lesson where Name = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                lid_text1.setText(add1);
                String add2 = rs.getString("Name");
                lname_txt1.setText(add2);
                String add3 = rs.getString("Capacity");
                cap_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            String sql = "select * from lesson where ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt1.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                String add1 = rs.getString("ID");
                lid_text1.setText(add1);
                String add2 = rs.getString("Name");
                lname_txt1.setText(add2);
                String add3 = rs.getString("Capacity");
                cap_text.setText(add3);
            }
            rs.close();
            pst.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_search_txt1KeyReleased

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setExtendedState(AdminD.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if(this.getExtendedState() != AdminD.MAXIMIZED_BOTH){
            this.setExtendedState(AdminD.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(AdminD.NORMAL);
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        close();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_logout1MouseClicked

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed

    private void table_people1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_people1MouseClicked

        try{
                int row = table_people1.getSelectedRow();
                String click = (table_people1.getModel().getValueAt(row,0).toString());
                String sql = "select * from lesson where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    lid_text1.setText(add1);
                    String add2 = rs.getString("Name");
                    lname_txt1.setText(add2);
                    String add3 = rs.getString("Capacity");
                    cap_text.setText(add3);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        try{
                int row = table_people1.getSelectedRow();
                String click = (table_people1.getModel().getValueAt(row,0).toString());
                String sql = "select * from student where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    sid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    sname_txt.setText(add2);
//                    String add3 = rs.getString("Lesson");
//                    les_text.setText(add3);
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_table_people1MouseClicked

    private void table_people1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_people1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP){

            try{
                int row = table_people1.getSelectedRow();
                String click = (table_people1.getModel().getValueAt(row,0).toString());
                String sql = "select * from lesson where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    lid_text1.setText(add1);
                    String add2 = rs.getString("Name");
                    lname_txt1.setText(add2);
                    String add3 = rs.getString("Capacity");
                    cap_text.setText(add3);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            try{
                int row = table_people1.getSelectedRow();
                String click = (table_people1.getModel().getValueAt(row,0).toString());
                String sql = "select * from student where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    sid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    sname_txt.setText(add2);
//                    String add3 = rs.getString("Lesson");
//                    les_text.setText(add3);
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_table_people1KeyPressed

    private void save_botton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_botton3ActionPerformed
        try{
            String sql ="Insert into Teacher_Stable (ID, Name, Lesson) values (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, sid_text.getText());
            pst.setString(2, sname_txt.getText());
            pst.setString(3, les_text.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateStudentTable();
    }//GEN-LAST:event_save_botton3ActionPerformed

    private void del_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_button3ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p == 0){
            try{
                String sql ="delete from Teacher_Stable where ID = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, sid_text.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            updateStudentTable();
        }
    }//GEN-LAST:event_del_button3ActionPerformed

    private void clear_text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_text3ActionPerformed
        sid_text.setText("");
        sname_txt.setText("");
        les_text.setText("");
    }//GEN-LAST:event_clear_text3ActionPerformed

    private void studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseClicked
        students.setOpaque(true);
        lessons1.setOpaque(false);
        loadSData();
    }//GEN-LAST:event_studentsMouseClicked

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsActionPerformed

    private void save_botton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_botton4ActionPerformed
        try{
            String sql ="Insert into Teacher_Ltable (Lesson_ID, Lesson_Name, Capacity) values (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lid_text1.getText());
            pst.setString(2, lname_txt1.getText());
            pst.setString(3, tech_text1.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        updateTTable();
        loadTData();
    }//GEN-LAST:event_save_botton4ActionPerformed

    private void del_button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_button4ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p == 0){
            try{
                String sql ="delete from Teacher_Ltable where Lesson_ID = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, lid_text1.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            updateTTable();
            loadTData();
        }
    }//GEN-LAST:event_del_button4ActionPerformed

    private void clear_text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_text4ActionPerformed
        lid_text1.setText("");
        lname_txt1.setText("");
        tech_text1.setText("");
    }//GEN-LAST:event_clear_text4ActionPerformed

    private void lessons1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessons1MouseClicked
        lessons1.setOpaque(true);
        students.setOpaque(false);
        loadLessonData();
    }//GEN-LAST:event_lessons1MouseClicked

    private void lessons1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessons1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessons1ActionPerformed

    private void update_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_textActionPerformed

        try{
            String val1 = lid_text1.getText();
            String val2 = lname_txt1.getText();
            String val3 = tech_text1.getText();
            String sql = "update Teacher_Ltable set Lesson_ID = '"+val1+"', Lesson_Name = '"+val2+"' , Capacity = '"+val3+"' where Lesson_ID ='"+val1+"'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        loadTData();
        updateTTable();

    }//GEN-LAST:event_update_textActionPerformed

    private void sid_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sid_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sid_textActionPerformed

    private void students_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students_tableMouseClicked
        
        try{
                int row = students_table.getSelectedRow();
                String click = (students_table.getModel().getValueAt(row,0).toString());
                String sql = "select * from Teacher_Stable where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    sid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    sname_txt.setText(add2);
                    String add3 = rs.getString("Lesson");
                    les_text.setText(add3);
                }
                pst.close();
                rs.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_students_tableMouseClicked

    private void students_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_students_tableKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP){

            try{
                int row = students_table.getSelectedRow();
                String click = (students_table.getModel().getValueAt(row,0).toString());
                String sql = "select * from Teacher_Stable where ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("ID");
                    sid_text.setText(add1);
                    String add2 = rs.getString("Name");
                    sname_txt.setText(add2);
                    String add3 = rs.getString("Lesson");
                    les_text.setText(add3);
                }
                pst.close();
                rs.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_students_tableKeyPressed

    private void lesson_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lesson_tableMouseClicked
        try{
                int row = lesson_table.getSelectedRow();
                String click = (lesson_table.getModel().getValueAt(row,0).toString());
                String sql = "select * from Teacher_Ltable where Lesson_ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("Lesson_ID");
                    lid_text1.setText(add1);
                    String add2 = rs.getString("Lesson_Name");
                    lname_txt1.setText(add2);
                    String add3 = rs.getString("Capacity");
                    tech_text1.setText(add3);
                }
                pst.close();
                rs.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_lesson_tableMouseClicked

    private void lesson_tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lesson_tableKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP){

            try{
                int row = lesson_table.getSelectedRow();
                String click = (lesson_table.getModel().getValueAt(row,0).toString());
                String sql = "select * from Teacher_Ltable where Lesson_ID= '"+click+"'";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                if(rs.next()){
                    String add1 = rs.getString("Lesson_ID");
                    lid_text1.setText(add1);
                    String add2 = rs.getString("Lesson_Name");
                    lname_txt1.setText(add2);
                    String add3 = rs.getString("Capacity");
                    tech_text1.setText(add3);
                }
                pst.close();
                rs.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_lesson_tableKeyPressed

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
            java.util.logging.Logger.getLogger(TeacherD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cap_text;
    private javax.swing.JButton clear_text3;
    private javax.swing.JButton clear_text4;
    private javax.swing.JButton del_button3;
    private javax.swing.JButton del_button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField les_text;
    private javax.swing.JTable lesson_table;
    private javax.swing.JButton lessons1;
    private javax.swing.JTextField lid_text1;
    private javax.swing.JTextField lname_txt1;
    private javax.swing.JButton logout1;
    private javax.swing.JButton save_botton3;
    private javax.swing.JButton save_botton4;
    private javax.swing.JTextField search_txt1;
    private javax.swing.JTextField sid_text;
    private javax.swing.JTextField sname_txt;
    private javax.swing.JButton students;
    private javax.swing.JTable students_table;
    private javax.swing.JTable table_people1;
    private javax.swing.JTextField tech_text1;
    private javax.swing.JButton update_text;
    // End of variables declaration//GEN-END:variables
}
