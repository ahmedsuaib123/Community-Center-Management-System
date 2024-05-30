import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.*;
import java.time.format.*;


public class BookingPage extends JFrame {

    private Container c;
    private JLabel text, lblusername, selcpacklbl, lblperson, lblid, labeemail, lblphone, lbltotal, lbltimeDate, phoneLabel;
    private Font font1, font2, font3;
    private Choice chpack, personch, communityCenterch,updateSwingChoice;
    private JTextField tfusername, tfid, tfemail, tfphone, tfprice, phoneTextField;
	private Cursor cursor;
    private JButton btnBook, btnBack;
    private JComboBox<String> dayComboBox, monthComboBox, yearComboBox, timeComboBox;

    BookingPage() {
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(350, 200, 700, 500);
		this.setResizable(false);
        this.setTitle("Community Center Management System");

        c = this.getContentPane();
        c.setLayout(null);
        // c.setBackground(Color.WHITE);

        font1 = new Font("Tahoma", Font.BOLD, 20);
        font2 = new Font("Tahoma", Font.PLAIN, 16);
        font3 = new Font("Tahoma", Font.PLAIN, 12);

        text = new JLabel("     Community Center");
        text.setBounds(150, 10, 400, 30);
        text.setFont(font1);
        c.add(text);

        lblusername = new JLabel("Name");
        lblusername.setBounds(40, 70, 400, 20);
        lblusername.setFont(font2);
        c.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(250, 70, 200, 20);
        tfusername.setFont(font2);
        c.add(tfusername);
		
		phoneLabel = new JLabel("Phone Number");
        phoneLabel.setBounds(40, 80, 200, 20);
        phoneLabel.setFont(font2);
        //c.add(phoneLabel);

        phoneTextField = new JTextField();
        phoneTextField.setBounds(250, 80, 200, 20);
        phoneTextField.setFont(font2);
        //c.add(phoneTextField);

        selcpacklbl = new JLabel("District Name");
        selcpacklbl.setBounds(40, 110, 150, 20);
        selcpacklbl.setFont(font2);
        c.add(selcpacklbl);

        chpack = new Choice();
        chpack.add("Rangpur");
        chpack.add("Dhaka");
		chpack.add("Panchagarh");
		chpack.add("Dinajpur");
		chpack.add("Lalmonirhat");
		chpack.add("Nilphamari");
		chpack.add("Gaibandha");
		chpack.add("Thakurgaon");
		chpack.add("Kurigram");
		chpack.add("Rajshahi");
		chpack.add("Natore");
		chpack.add("Joypurhat");
		chpack.add("Chapainawabganj");
		chpack.add("Naogaon");
		chpack.add("Sirajganj");
		chpack.add("Pabna");
		chpack.add("Bogra");
		chpack.add("Jaipurhat");
		chpack.add("Kushtia");
		chpack.add("Meherpur");
		chpack.add("Chuadanga");
		chpack.add("Bagerhat");
		chpack.add("Satkhira");
		chpack.add("Jessore");
		chpack.add("Narail");
		chpack.add("Magura");
		chpack.add("Khulna");
		chpack.add("Jhenaidah");
		chpack.add("Barisal");
		chpack.add("Bhola");
		chpack.add("Jhalokati");
		chpack.add("Patuakhali");
		chpack.add("Pirojpur");
		chpack.add("Barguna");
		chpack.add("Madaripur");
		chpack.add("Gopalganj");
		chpack.add("Rajbari");
		chpack.add("Munshiganj");
		chpack.add("Shariatpur");
		chpack.add("Tangail");
		chpack.add("Netrokona");
		chpack.add("Sherpur");
		chpack.add("Mymensingh");
		chpack.add("Jamalpur");
		chpack.add("Gazipur");
		chpack.add("Kishoreganj");
		chpack.add("Narayanganj");
		chpack.add("Manikganj");
		chpack.add("Faridpur");
		chpack.add("Chandpur");
		chpack.add("Lakshmipur");
		chpack.add("Comilla");
		chpack.add("Brahmanbaria");
		chpack.add("Narsingdi");
		chpack.add("Sylhet");
		chpack.add("Moulvibazar");
		chpack.add("Habiganj");
		chpack.add("Sunamganj");
		chpack.add("Chottogram");
		chpack.add("Rangamati");
		chpack.add("Bandorban");
		chpack.add("Khagrachari");
		chpack.add("Cox's Bazar");
		chpack.add("Feni");
		
        chpack.setBounds(250, 110, 200, 20);
        c.add(chpack);
		
		communityCenterch = new Choice();
        communityCenterch.add("Zilla Parishad Community Center");
        communityCenterch.add("Police Hall Rangpur");
        communityCenterch.add("Shimulbag Community Center");
        communityCenterch.setBounds(250, 150, 200, 25);
        c.add(communityCenterch);

        lblperson = new JLabel("Community Center Name");
        lblperson.setBounds(40, 150, 350, 25);
        lblperson.setFont(font2);
        c.add(lblperson);

        

        lblid = new JLabel("Total Person");
        lblid.setBounds(40, 190, 150, 20);
        lblid.setFont(font2);
        c.add(lblid);
		
		personch = new Choice();
        personch.add("150");
        personch.add("200");
        personch.add("250");
		personch.add("300");
		personch.add("350");
		personch.add("400");
		personch.add("450");
		personch.add("500");
		personch.add("600");
		personch.add("700");
		personch.add("800");
		personch.add("1000");		
		
        personch.setBounds(250, 190, 200, 20);
        c.add(personch);

        

        labeemail = new JLabel("Email");
        labeemail.setBounds(40, 230, 150, 20);
        labeemail.setFont(font2);
        c.add(labeemail);

        tfemail = new JTextField();
        tfemail.setBounds(250, 230, 200, 20);
        tfemail.setFont(font2);
        c.add(tfemail);

        lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 270, 150, 20);
        lblphone.setFont(font2);
        c.add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(250, 270, 200, 20);
        tfphone.setFont(font2);
        c.add(tfphone);

        lbltimeDate = new JLabel("Select Time and Date");
        lbltimeDate.setBounds(40, 310, 200, 25);
        lbltimeDate.setFont(font2);
        c.add(lbltimeDate);

        String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        String[] years = { "2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032"};

        dayComboBox = new JComboBox<>(days);
        dayComboBox.setBounds(250, 310, 60, 25);
        c.add(dayComboBox);

        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(320, 310, 100, 25);
        c.add(monthComboBox);

        yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(430, 310, 70, 25);
        c.add(yearComboBox);

        String[] times = { "10:00 AM - 04:00 PM", "05:00 PM - 11:00 PM" };
        timeComboBox = new JComboBox<>(times);
        timeComboBox.setBounds(510, 310, 150, 25);
        c.add(timeComboBox);

        lbltotal = new JLabel("Total Price");
        lbltotal.setBounds(40, 350, 150, 25);
        lbltotal.setFont(font2);
        c.add(lbltotal);
        
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		 
		 
        tfprice = new JTextField();
        tfprice.setBounds(250, 350, 200, 25);
        tfprice.setFont(font3);
        tfprice.setForeground(Color.RED);
        tfprice.setEditable(false); 
        c.add(tfprice);
		
		chpack.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        String selectedDistrict = chpack.getSelectedItem();
        updateCommunityCenters(selectedDistrict);
		updateTotalPrice();
    }
	});


        /*chpack.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateTotalPrice();
            }
        });*/
		
		communityCenterch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateTotalPrice();
            }
        });

        personch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateTotalPrice();
            }
        });

        updateTotalPrice();

        btnBook = new JButton("BACK");
        btnBook.setBounds(40, 400, 100, 30);
        btnBook.setFont(font2);
		btnBook.setCursor(cursor);
        //c.add(btnBook);

        /*btnBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isAnyFieldEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields.");
                } else {
                    JOptionPane.showMessageDialog(null, "Package booked successfully! Please go to the payment option to confirm your package.");
                }
            }
        });*/

        btnBack = new JButton("BOOK");
        btnBack.setBounds(300, 400, 100, 30);
        btnBack.setFont(font2);
		btnBack.setCursor(cursor);
        c.add(btnBack);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Assuming Dashboard is another JFrame
                //Dashboard dashboard = new Dashboard();
                //dashboard.setVisible(true);
                //dispose(); 
				//saveBookingDetailsToFile();
				//clearFields();
				if (validateFields()) {
                saveBookingDetailsToFile();
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
			clearFields();
			//saveBookingDetailsToFileByPerson();
            }
        });
		
		
    btnBook.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        }
    });
    }

    private void updateTotalPrice() {
        String selectedItem = communityCenterch.getSelectedItem();
        int numPersons = Integer.parseInt(personch.getSelectedItem());
		
		int totalPrice;
		if (selectedItem.equals("Zilla Parishad Community Center")) {
         tfprice.setText("Total: " + (250 * numPersons) + " TK");
         } else if (selectedItem.equals("Police Hall Rangpur")) {
             tfprice.setText("Total: " + (200 * numPersons) + " TK");
         } else if (selectedItem.equals("Shimulbag Community Center")) {
             tfprice.setText("Total: " + (150 * numPersons) + " TK");
         } else if (selectedItem.equals("Bashundhara Convention Hall")) {
             tfprice.setText("Total: " + (300 * numPersons) + " TK");
         }     else if (selectedItem.equals("Zamzam Convention Hall")) {
             tfprice.setText("Total: " + (350 * numPersons) + " TK");
         } else if (selectedItem.equals("BF Convention Hall")) {
             tfprice.setText("Total: " + (400 * numPersons) + " TK");
         } else if (selectedItem.equals("Bangabandhu International Conference Center")) {
             tfprice.setText("Total: " + (450 * numPersons) + " TK");
         } else if (selectedItem.equals("Eagle Hall")) {
             tfprice.setText("Total: " + (500 * numPersons) + " TK");
         } else if (selectedItem.equals("Setara Convention Hall")) {
             tfprice.setText("Total: " + (350 * numPersons) + " TK");
         } else if (selectedItem.equals("Police Convention Hall")) {
             tfprice.setText("Total: " + (300 * numPersons) + " TK");
         } else if (selectedItem.equals("TSC Convention Hall")) {
             tfprice.setText("Total: " + (400 * numPersons) + " TK");
         } else if (selectedItem.equals("Victoria Convention Hall")) {
             tfprice.setText("Total: " + (450 * numPersons) + " TK");
         } else if (selectedItem.equals("White Palace Convention Hall")) {
             tfprice.setText("Total: " + (350 * numPersons) + " TK");
         } else if (selectedItem.equals("Sagorika Multi-purpose Hall")) {
             tfprice.setText("Total: " + (300 * numPersons) + " TK");
         } else if     (selectedItem.equals("Six Season Banquet Hall")) {
             tfprice.setText("Total: " + (400 * numPersons) + " TK");
         } else if (selectedItem.equals("The Atrium Hall")) {
             tfprice.setText("Total: " + (450 * numPersons) + " TK");
         } else if (selectedItem.equals("Shera Malancha Hall")) {
             tfprice.setText("Total: " + (350 * numPersons) + " TK");
         } else if (selectedItem.equals("Baridhara DOHS Hall")) {
             tfprice.setText("Total: " + (300 * numPersons) + " TK");
         } else if (selectedItem.equals("GEM HOUSE(ANANDA NANDAN)")) {
             tfprice.setText("Total: " + (200 * numPersons) + " TK");
         } else if (selectedItem.equals("Prime Convention Center")) {
             tfprice.setText("Total: " + (300 * numPersons) + " TK");
         } else if (selectedItem.equals("GRP Community Center")) {
             tfprice.setText("Total: " + (200 * numPersons) + " TK");
         } else if (selectedItem.equals("City Centre")) {
             tfprice.setText("Total: " + (250 * numPersons) + " TK");
         } else if (selectedItem.equals("Ar- Rahman Community Center")) {
             tfprice.setText("Total: " + (150 * numPersons) + " TK");
         } else if (selectedItem.equals("M.N Convention Hall")) {
             tfprice.setText("Total: " + (350 * numPersons) + " TK");
         } else if (selectedItem.equals("Syed Community Centre")) {
             tfprice.setText("Total: " + (400 * numPersons) + " TK");
         } else if (selectedItem.equals("Hawlader Community Center")) {
             tfprice.setText("Total: " + (300 * numPersons) + " TK");
         } else if (selectedItem.equals("Auditorium Cam Community Center(BD Hall)")) {
             tfprice.setText("Total: " + (350 * numPersons) + " TK");
         } else if (selectedItem.equals("J R Community Centre")) {
        tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Almas Community Center")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Pani Community Center")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Razia Community Center")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Anurag Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("New Uttara Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Young King Chinese Restaurant & Community Center")) {
            tfprice.setText("Total: " + (450 * numPersons) + " TK");
        } else if (selectedItem.equals("Nanking Darbar Hall Rajshahi")) {
            tfprice.setText("Total: " + (500 * numPersons) + " TK");
        } else if (selectedItem.equals("New Party Palace")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Green Community Centre")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Seba Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Shopno Chaya Community Centre")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Joypurhat Community Centre")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Ullash Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Thikana Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Razia Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Sony Community Center")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Evan Community Centre")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Doael Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Nur Jahan Convention Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Plaza Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Jogonnatpur Red Crescent CIC")) {
            tfprice.setText("Total: " + (450 * numPersons) + " TK");
        } else if (selectedItem.equals("Bondhon Community Center")) {
            tfprice.setText("Total: " + (500 * numPersons) + " TK");
        } else if (selectedItem.equals("Community Centre")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Tonmoy Community Center")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Crown Community Center")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Shahnawaz Kids Garden & Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Mouchak Plaza Community Centre")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Shopno Chaya Community Centre")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Joypurhat Community Centre")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Ullash Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Alo Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Chinese Restaurant")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Raj Community Center")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Makhaldanga Community Centre")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Darsana Auditorium & Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Eva Restaurent and Biriany House and Community Centre")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Bagerhat Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Sonar Tori Community Center")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Haque Community Center")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Bondhon Community Center")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Mahidul Haque Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Faridpur Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Digital Center")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Ambika Memorial Hall")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Ishika Community Center")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Jibangachhara (Babupara) Community Centre")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Rangasri Community Centre")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Atithi Community Center")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Shere Bangla Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Parkview Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Sunrise Community Centre")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("The Agra Community Centre")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Pallabi Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("United Community Centre")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Maloncho Community Centre")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Fuly Community Center")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Nirjhor Community Center")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Star Community Center")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Humaira Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Sara Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Priyangon Community Centre"))     {
	    tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Green Community Centre")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Seba Community Center")) {
            tfprice.setText("Total: " + (400 * numPersons) + " TK");
        } else if (selectedItem.equals("Shopno Chaya Community Centre")) {
            tfprice.setText("Total: " + (250 * numPersons) + " TK");
        } else if (selectedItem.equals("Joypurhat Community Centre")) {
            tfprice.setText("Total: " + (200 * numPersons) + " TK");
        } else if (selectedItem.equals("Ullash Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Thikana Community Center")) {
            tfprice.setText("Total: " + (350 * numPersons) + " TK");
        } else if (selectedItem.equals("Anamica Community Center")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Palki Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Sanai Community Center"    )) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Pouro Community Centre")) {
            tfprice.setText("Total: " + (300 * numPersons) + " TK");
        } else if (selectedItem.equals("Rumel Community Center"    )){
	        tfprice.setText("Total: " + (300 * numPersons) + " TK    ")    ;    
        }
	}

    private boolean isAnyFieldEmpty() {
        return tfusername.getText().trim().isEmpty() ||
               tfid.getText().trim().isEmpty() ||
               tfemail.getText().trim().isEmpty() ||
               tfphone.getText().trim().isEmpty();
    }
	
	private void updateCommunityCenters(String selectedDistrict) {
    communityCenterch.removeAll();
	
	
    if (selectedDistrict.equals("Rangpur")) {
        communityCenterch.add("Zilla Parishad Community Center");
		communityCenterch.add("Police Hall Rangpur");
		communityCenterch.add("Shimulbag Community Center");
	
        
    } else if (selectedDistrict.equals("Dhaka")) {
        communityCenterch.add("Bashundhara Convention Hall");
        communityCenterch.add("Zamzam Convention Hall");
		communityCenterch.add("BF Convention Hall");
        communityCenterch.add("Bangabandhu International Conference Center");
		communityCenterch.add("Eagle Hall");
        communityCenterch.add("Setara Convention Hall");
		communityCenterch.add("Police Convention Hall");
        communityCenterch.add("TSC Convention Hall");
		communityCenterch.add("Victoria Convention Hall");
        communityCenterch.add("White Palace Convention Hall");
		communityCenterch.add("Sagorika Multi-purpose Hall");
        communityCenterch.add("Bangabandhu International Conference Center");
		communityCenterch.add("Six Season Banquet Hall");
        communityCenterch.add("The Atrium Hall");
		communityCenterch.add("Shera Malancha Hall");
        communityCenterch.add("Baridhara DOHS Hall");
		
    } else if (selectedDistrict.equals("Panchagarh")) {
		communityCenterch.add("GEM HOUSE(ANANDA NANDAN)");
    } else if (selectedDistrict.equals("Dinajpur")) {
		communityCenterch.add("Prime Convention Center");
    } else if (selectedDistrict.equals("Lalmonirhat")) {

    } else if (selectedDistrict.equals("Nilphamari")) {
		communityCenterch.add("GRP Community Center");
		communityCenterch.add("City Centre");
    } else if (selectedDistrict.equals("Gaibandha")) {
		communityCenterch.add("Ar- Rahman Community Center");
		communityCenterch.add("M.N Convention Hall");
		communityCenterch.add("Syed Community Centre");
    } else if (selectedDistrict.equals("Thakurgaon")) {
		communityCenterch.add("Hawlader Community Center");
		communityCenterch.add("Auditorium Cam Community Center(BD Hall)");
		communityCenterch.add("J R Community Centre");
    } else if (selectedDistrict.equals("Kurigram")) {
		communityCenterch.add("Almas Community Center");
		communityCenterch.add("Pani Community Center");
    } else if (selectedDistrict.equals("Gaibandha")) {
		communityCenterch.add("Ar- Rahman Community Center");
    } else if (selectedDistrict.equals("Rajshahi")) {
		communityCenterch.add("Razia Community Center");
		communityCenterch.add("Anurag Community Center");
		communityCenterch.add("New Uttara Community Center");
        communityCenterch.add("Young King Chinese Restaurant & Community Center");
		communityCenterch.add("Nanking Darbar Hall Rajshahi");
    } else if (selectedDistrict.equals("Natore")) {
		communityCenterch.add("New Party Palace");
		communityCenterch.add("Green Community Centre");
		communityCenterch.add("Seba Community Center");
    } else if (selectedDistrict.equals("Joypurhat")) {
		communityCenterch.add("Shopno Chaya Community Centre");
		communityCenterch.add("Joypurhat Community Centre");
		communityCenterch.add("Ullash Community Centre");
    } else if (selectedDistrict.equals("Chapainawabganj")) {

    } else if (selectedDistrict.equals("Naogaon")) {
		communityCenterch.add("Thikana Community Center");
		communityCenterch.add("Razia Community Center");
    } else if (selectedDistrict.equals("Sirajganj")) {
		communityCenterch.add("Sony Community Center");
		communityCenterch.add("Evan Community Centre");
    } else if (selectedDistrict.equals("Pabna")){
		communityCenterch.add("Doael Centre");
		communityCenterch.add("Nur Jahan Convention Center");
		communityCenterch.add("Plaza Community Center");
        communityCenterch.add("Jogonnatpur Red Crescent CIC");
		communityCenterch.add("Bondhon Community Center");
    } else if (selectedDistrict.equals("Bogra")) {
		communityCenterch.add("Community Centre");
		communityCenterch.add("Tonmoy Community Center");
		communityCenterch.add("Crown Community Center");
        communityCenterch.add("Shahnawaz Kids Garden & Community Center");
		communityCenterch.add("Mouchak Plaza Community Centre");
    } else if (selectedDistrict.equals("Jaipurhat") ){
		communityCenterch.add("Shopno Chaya Community Centre");
		communityCenterch.add("Joypurhat Community Centre");
		communityCenterch.add("Ullash Community Centre");
    } else if (selectedDistrict.equals("Kushtia")) {
		communityCenterch.add("Alo Community Center");
    } else if (selectedDistrict.equals("Meherpur")) {
		communityCenterch.add("Chinese Restaurant");
    } else if (selectedDistrict.equals("Chuadanga")) {
		communityCenterch.add("Raj Community Center");
		communityCenterch.add("Makhaldanga Community Centre");
		communityCenterch.add("Darsana Auditorium & Community Centre");
        communityCenterch.add("Eva Restaurent and Biriany House and Community Centre");
    } else if (selectedDistrict.equals("Bagerhat")) {
		communityCenterch.add("Bagerhat Community Center");
    } else if (selectedDistrict.equals("Satkhira")) {

    } else if (selectedDistrict.equals("Jessore")) {
		communityCenterch.add("Powro Community Center");
		communityCenterch.add("Badhua Community Center");
		communityCenterch.add("Malancha Community Center");
        communityCenterch.add("Jessore Community Eye Hospital");
		communityCenterch.add("Chai Pai Chinese Restaurant & City Community Center");
    } else if (selectedDistrict.equals("Narail")) {

    } else if (selectedDistrict.equals("Magura")) {
		communityCenterch.add("Malancha Community Center");
	} else if (selectedDistrict.equals("Khulna")) {
		communityCenterch.add("Hill Flavours Restaurant & Community Centre");
		communityCenterch.add("Aurunima Community Center");
		communityCenterch.add("City Convention Hall");
	} else if (selectedDistrict.equals("Jhenaidah")) {
		communityCenterch.add("Kutum Community Center");
    } else if (selectedDistrict.equals("Barisal")) {
		communityCenterch.add("Farjana Community Center");
		communityCenterch.add("Rangon Community Center");
		communityCenterch.add("Barishal Ladies Club And Community Centre");
        communityCenterch.add("Rajanigondha Community Center");

    } else if (selectedDistrict.equals("Khagrachari")){
		communityCenterch.add("Hill Flavours Restaurant & Community Centre");
		communityCenterch.add("Aurunima Community Center");
		communityCenterch.add("City Convention Hall");
	} else if (selectedDistrict.equals("Rangamati")){
		communityCenterch.add("Jibangachhara (Babupara) Community Centre");
	    communityCenterch.add("Rangasri Community Centre");
	} else if (selectedDistrict.equals("Jhalokati")){
		communityCenterch.add("Atithi Community Center");
	    communityCenterch.add("Sanai Community Center");
	} else if (selectedDistrict.equals("Patuakhali")){
		communityCenterch.add("Shere Bangla Community Center");
	} else if (selectedDistrict.equals("Brahmanbaria")) {
		communityCenterch.add("Parkview Community Center");
		communityCenterch.add("Party Palace");
		communityCenterch.add("New Bondhon Community Center");
        communityCenterch.add("Sopnil Community Center");

    } else if (selectedDistrict.equals("Sylhet")) {
		communityCenterch.add("Sunrise Community Centre");
		communityCenterch.add("The Agra Community Centre");
		communityCenterch.add("Pallabi Community Centre");
        communityCenterch.add("United Community Centre");
		communityCenterch.add("Maloncho Community Centre");
    } else if (selectedDistrict.equals("Habiganj")){
		communityCenterch.add("Anamica Community Center");
		communityCenterch.add("Palki Community Centre");
		communityCenterch.add("Sanai Community Center");
	} else if (selectedDistrict.equals("Moulvibazar")){
		communityCenterch.add("Pouro Community Centre");
		communityCenterch.add("Rumel Community Centre");
		communityCenterch.add("Bonoful Community Center");
	} else if (selectedDistrict.equals("Sunamganj")) {
		communityCenterch.add("Latifa Community Center");
		communityCenterch.add("Priyangon Community Center");
		communityCenterch.add("Pobon Community Centre");
        communityCenterch.add("Maa Community Center");
		communityCenterch.add("Rowshan Community Center");
    }  else if (selectedDistrict.equals("Gazipur")) {
		communityCenterch.add("Sonar Tori Community Center");
		communityCenterch.add("Haque Community Center");
		communityCenterch.add("Bondhon Community Center");
        communityCenterch.add("Mahidul Haque Community Center");
    } else if (selectedDistrict.equals("Faridpur")){
		communityCenterch.add("Faridpur Community Center");
		communityCenterch.add("Digital Center");
		communityCenterch.add("Ambika Memorial Hall");
	} else if (selectedDistrict.equals("Gopalganj")){
		communityCenterch.add("Ishika Community Center");
	} else if (selectedDistrict.equals("Kishoreganj")) {
		communityCenterch.add("Otithi Community Center");
		communityCenterch.add("Utshob Community Center");
		communityCenterch.add("Press Club");
        communityCenterch.add("Park View Community Center");
		communityCenterch.add("Utshob Community Center Office");
    } else if (selectedDistrict.equals("Madaripur")){
		communityCenterch.add("Bhuiyan Community Center");
	} else if (selectedDistrict.equals("Manikganj")){
		communityCenterch.add("Asha Community Center");
		communityCenterch.add("Diamond Convention Center");
		communityCenterch.add("Ullash Community Center & Catering");
	} else if (selectedDistrict.equals("Narayanganj")){
		communityCenterch.add("Community Center in Narayanganj(1)");
		communityCenterch.add("Community Center in Narayanganj(2)");
		communityCenterch.add("Community Center in Fatullah");
	} else if (selectedDistrict.equals("Narsingdi")) {
		communityCenterch.add("Narsingdi Community Center");
		communityCenterch.add("Bodhua Community Center");
		communityCenterch.add("Chiengrai Community Center");
        communityCenterch.add("Raj Rani Community Center");
		communityCenterch.add("Badhon Community Center");
    } else if (selectedDistrict.equals("Rajbari")){
		communityCenterch.add("Ratna Community Center");
	} else if (selectedDistrict.equals("Shariatpur")){
		//communityCenterch.add("Ratna Community Center");
	} else if (selectedDistrict.equals("Tangail")){
		communityCenterch.add("Fuly Community Center");
	} else if (selectedDistrict.equals("Sherpur")){
		communityCenterch.add("Nirjhor Community Center");
	} else if (selectedDistrict.equals("Jamalpur")) {
		communityCenterch.add("Star Community Center");
		communityCenterch.add("Humaira Community Center");
		communityCenterch.add("Sara Community Center");
        communityCenterch.add("Nipun Community Center");
    } else if (selectedDistrict.equals("Mymensingh")) {
		communityCenterch.add("Priyangon Community Centre");
		communityCenterch.add("Tulip Community Center & Decorator");
		communityCenterch.add("BAU Community Center");
    } else if (selectedDistrict.equals("Netrokona")){
		communityCenterch.add("Sara Community Centre & Hotel Sara International");
	    communityCenterch.add("Ayesha Community Center");
	} 
	}
	
	public void saveBookingDetailsToFile() {
        String name = tfusername.getText();
        String district = chpack.getSelectedItem();
        String communityCenter = communityCenterch.getSelectedItem();
        String totalPerson = personch.getSelectedItem();
        String email = tfemail.getText();
        String phone = tfphone.getText();
        String date = yearComboBox.getSelectedItem() + "-" + (monthComboBox.getSelectedIndex() + 1) + "-" + dayComboBox.getSelectedItem();
        String time = timeComboBox.getSelectedItem().toString();
        String totalPrice = tfprice.getText();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("booking_details.txt", true))) {
            writer.write("Name: " + name + "\n");
            writer.write("District: " + district + "\n");
            writer.write("Community Center: " + communityCenter + "\n");
            writer.write("Total Person: " + totalPerson + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Phone: " + phone + "\n");
            writer.write("Date: " + date + "\n");
            writer.write("Time: " + time + "\n");
            writer.write(  totalPrice + "\n");
            writer.write("------------------------\n");
            JOptionPane.showMessageDialog(null, "Booking details saved successfully.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving booking details: " + ex.getMessage());
        }
    }
	public void clearFields() {
        tfusername.setText("");
		
        tfemail.setText("");
        tfphone.setText("");
        
		dayComboBox.setSelectedIndex(0);
        monthComboBox.setSelectedIndex(0);
        yearComboBox.setSelectedIndex(0);
		
		chpack.select(0);
        communityCenterch.select(0);
        personch.select(0);
    }
	
	public boolean validateFields() {
    if (tfusername.getText().isEmpty() ||
        tfemail.getText().isEmpty() ||
        tfphone.getText().isEmpty() ||
        tfprice.getText().isEmpty() ||
        dayComboBox.getSelectedIndex() == 0 ||
        monthComboBox.getSelectedIndex() == 0 ||
        yearComboBox.getSelectedIndex() == 0) {
        return false;
    }
    return true;
    }
	
    public static void main(String[] args) {
        BookingPage frame = new BookingPage();
        frame.setVisible(true);
    }
}
