
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shreyash Haritashya
 */
public class AddNewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddNewEmployee
     */
    public AddNewEmployee() {
        initComponents();
        setCurrentLoginDetails();
    }
    
    public void setCurrentLoginDetails(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "select emp_id from logged_in_hotel_id";
            ResultSet rs0 = st.executeQuery(r);
            if(rs0.next()){
                r = "select emp_name, is_admin, emp_id from employee where emp_id = '"+ rs0.getString("emp_id") +"'";
                ResultSet rs1 = st.executeQuery(r);
                if(rs1.next()){
                    if(rs1.getString("is_admin").equals("1")){
                        emp_name_label.setText("Admin Name -");
                    }
                    emp_name_detail.setText(rs1.getString("emp_name"));
                    emp_id_detail.setText(rs1.getString("emp_id"));
                }
            }
        } catch(Exception e){
            System.out.print(e);
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        AppIcon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        BookingButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        RoomsButton = new javax.swing.JButton();
        SubmitButton2 = new javax.swing.JButton();
        SubmitButton5 = new javax.swing.JButton();
        CenterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        role = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        join_date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emp_name_detail = new javax.swing.JLabel();
        emp_name_label = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        emp_id_detail = new javax.swing.JLabel();

        setTitle("Add New Employee");
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1260, 720));

        topPanel.setBackground(new java.awt.Color(89, 95, 239));
        topPanel.setAlignmentX(0.0F);
        topPanel.setAlignmentY(0.0F);

        AppIcon.setBackground(new java.awt.Color(255, 255, 255));
        AppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/AppIcon.jpg"))); // NOI18N
        AppIcon.setText("Image");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("The Hoteliers");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Welcome to, Hotel Sinjara");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(14, 14, 14))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14))
        );

        sidePanel.setBackground(new java.awt.Color(45, 53, 69));
        sidePanel.setAlignmentX(0.0F);
        sidePanel.setAlignmentY(0.0F);

        HomeButton.setBackground(new java.awt.Color(45, 53, 69));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.setBorder(null);
        HomeButton.setContentAreaFilled(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setFocusPainted(false);
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        BookingButton.setBackground(new java.awt.Color(45, 53, 69));
        BookingButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        BookingButton.setForeground(new java.awt.Color(255, 255, 255));
        BookingButton.setText("Bookings");
        BookingButton.setBorder(null);
        BookingButton.setContentAreaFilled(false);
        BookingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookingButton.setFocusPainted(false);
        BookingButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BookingButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingButtonActionPerformed(evt);
            }
        });

        CustomerButton.setBackground(new java.awt.Color(45, 53, 69));
        CustomerButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerButton.setText("Customers");
        CustomerButton.setBorder(null);
        CustomerButton.setContentAreaFilled(false);
        CustomerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CustomerButton.setFocusPainted(false);
        CustomerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CustomerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        PaymentButton.setBackground(new java.awt.Color(45, 53, 69));
        PaymentButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        PaymentButton.setForeground(new java.awt.Color(255, 255, 255));
        PaymentButton.setText("Rooms");
        PaymentButton.setBorder(null);
        PaymentButton.setContentAreaFilled(false);
        PaymentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaymentButton.setFocusPainted(false);
        PaymentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PaymentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        RoomsButton.setBackground(new java.awt.Color(45, 53, 69));
        RoomsButton.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        RoomsButton.setForeground(new java.awt.Color(89, 95, 239));
        RoomsButton.setText("Employees");
        RoomsButton.setBorder(null);
        RoomsButton.setContentAreaFilled(false);
        RoomsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RoomsButton.setFocusPainted(false);
        RoomsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RoomsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsButtonActionPerformed(evt);
            }
        });

        SubmitButton2.setBackground(new java.awt.Color(255, 51, 0));
        SubmitButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton2.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton2.setText("Log Out");
        SubmitButton2.setBorder(null);
        SubmitButton2.setBorderPainted(false);
        SubmitButton2.setContentAreaFilled(false);
        SubmitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton2.setFocusPainted(false);
        SubmitButton2.setOpaque(true);
        SubmitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton2ActionPerformed(evt);
            }
        });

        SubmitButton5.setBackground(new java.awt.Color(89, 95, 239));
        SubmitButton5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton5.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton5.setText("Update Password");
        SubmitButton5.setBorder(null);
        SubmitButton5.setBorderPainted(false);
        SubmitButton5.setContentAreaFilled(false);
        SubmitButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton5.setFocusPainted(false);
        SubmitButton5.setOpaque(true);
        SubmitButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RoomsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(PaymentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BookingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BookingButton)
                .addGap(40, 40, 40)
                .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(PaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(RoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(SubmitButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubmitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        CenterPanel.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 53, 69));
        jLabel1.setText("Add New Employee");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(112, 112, 112));
        jLabel8.setText("Name ");

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(112, 112, 112));
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        salary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salary.setForeground(new java.awt.Color(112, 112, 112));
        salary.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(112, 112, 112));
        jLabel9.setText("Salary");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 112, 112));
        jLabel7.setText("Phone number ");

        phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(112, 112, 112));
        phone.setBorder(null);

        role.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        role.setForeground(new java.awt.Color(112, 112, 112));
        role.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 112, 112));
        jLabel4.setText("Role ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 112, 112));
        jLabel5.setText("Joining Date");

        join_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        join_date.setForeground(new java.awt.Color(112, 112, 112));
        join_date.setBorder(null);
        join_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                join_dateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Enter Date in YYYY-MM-DD format");

        SubmitButton.setBackground(new java.awt.Color(87, 184, 148));
        SubmitButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("ADD");
        SubmitButton.setBorder(null);
        SubmitButton.setBorderPainted(false);
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton.setFocusPainted(false);
        SubmitButton.setOpaque(true);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addGroup(CenterPanelLayout.createSequentialGroup()
                            .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(56, 56, 56)
                            .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(join_date)
                                .addComponent(salary)
                                .addComponent(name)
                                .addComponent(SubmitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(role)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(role, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(join_date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(SubmitButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjHoteliers/Images/AddUser.jpg"))); // NOI18N

        emp_name_detail.setBackground(new java.awt.Color(255, 255, 255));
        emp_name_detail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_name_detail.setForeground(new java.awt.Color(112, 112, 112));
        emp_name_detail.setText("Shayam Singh");

        emp_name_label.setBackground(new java.awt.Color(255, 255, 255));
        emp_name_label.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_name_label.setForeground(new java.awt.Color(112, 112, 112));
        emp_name_label.setText("Employee Name -");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(112, 112, 112));
        jLabel26.setText("ID -");

        emp_id_detail.setBackground(new java.awt.Color(255, 255, 255));
        emp_id_detail.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        emp_id_detail.setForeground(new java.awt.Color(112, 112, 112));
        emp_id_detail.setText("10235");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(emp_name_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emp_name_detail)
                            .addComponent(emp_id_detail))
                        .addGap(14, 14, 14))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_name_label)
                            .addComponent(emp_name_detail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(emp_id_detail))
                        .addGap(12, 12, 12)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CenterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        SubmitButton.setBorderPainted( false );
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
        Statement st = con.createStatement();
        String r = "select id from logged_in_hotel_id";
        ResultSet rs0 = st.executeQuery(r);
        if (rs0.next()) {
           String q = "insert into employee(emp_hotel_id, emp_name, emp_salary, emp_joining_date, emp_role, emp_phone) vlaues "
                   + "('"+ rs0.getString("id") +"', '"+ name.getText() +"', '"+ salary.getText() +"', '"+ join_date.getText() +"', '"+ role.getText() +"', '"+ phone.getText() +"')";
        int rs1 = st.executeUpdate(q);
        JOptionPane.showMessageDialog(null, "Successfully Created Employee");
        AddNewEmployee.this.setVisible(false);
        new Employees().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Some Error Occured! Try Again.");
        }
        
        } catch(Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Connection Failed!");
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void join_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_join_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_join_dateActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        AddNewEmployee.this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void BookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingButtonActionPerformed
        AddNewEmployee.this.setVisible(false);
        new Bookings().setVisible(true);
    }//GEN-LAST:event_BookingButtonActionPerformed

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        AddNewEmployee.this.setVisible(false);
        new Customers().setVisible(true);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        AddNewEmployee.this.setVisible(false);
        new Rooms().setVisible(true);
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void RoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsButtonActionPerformed
        AddNewEmployee.this.setVisible(false);
        new Employees().setVisible(true);
    }//GEN-LAST:event_RoomsButtonActionPerformed

    private void SubmitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton2ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms?autoReconnect=true&useSSL=false", "root", "aman123456");
            Statement st = con.createStatement();
            String r = "delete from logged_in_hotel_id";
            st.executeUpdate(r);
            AddNewEmployee.this.setVisible(false);
            new LogInPage().setVisible(true);
        } catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_SubmitButton2ActionPerformed

    private void SubmitButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton5ActionPerformed
        new UpdatePassword().setVisible(true);
    }//GEN-LAST:event_SubmitButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppIcon;
    private javax.swing.JButton BookingButton;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JButton RoomsButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton2;
    private javax.swing.JButton SubmitButton5;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel emp_id_detail;
    private javax.swing.JLabel emp_name_detail;
    private javax.swing.JLabel emp_name_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField join_date;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField role;
    private javax.swing.JTextField salary;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
