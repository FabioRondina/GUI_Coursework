/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm2100guicw1707082;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class MainApp extends javax.swing.JFrame {
    
    //main menu list of elements
    Menu mainMenu = new Menu("main menu");
    
    //Array list for Orders
    ArrayList<Order> order ;
    Order currentOrder = new Order("starting order");
    
    // Arraylist for sauce changer
    ArrayList<String> sauces;
    String currentSauce;
    
    // chooser 
    JFileChooser chooser = new JFileChooser(new File(System.getProperty("user.dir")));

    // initialiaze void file reference
    File file = new File("");
    


     /** helper method to Split a Menu Object Arryalist of itme 
     * by type. Create then array of each type
     *MainApp.java, edited/created by Fabio Rondina
     *Coursework Part 1 – due 14 January 2019 
     */
    
    public void menuSplitter(){
        ArrayList <MenuItem> drinks = new ArrayList<>();
        ArrayList <MenuItem> sides = new ArrayList<>();
        ArrayList <MenuItem> sandwiches = new ArrayList<>();
        for(MenuItem m : mainMenu.getItems()){
            
            if(m instanceof Drink){
                drinks.add(m);            
            }else if( m instanceof Side){
                sides.add(m);            
            }else if(m instanceof Sandwich){
                sandwiches.add(m);
            }
        drinkCB.setModel(new DefaultComboBoxModel( drinks.toArray()));
        sideCB.setModel(new DefaultComboBoxModel( sides.toArray()));
        sandwichCB.setModel(new DefaultComboBoxModel( sandwiches.toArray()));
        }
        
    }
    
    /**
     * Helper method to search the image file on the MenuItem array
     * MainApp.java, edited/created by Fabio Rondina
     *Coursework Part 1 – due 14 January 2019 
     * @param  temp
     * @return String
     */
     
    
    public String ImageFinder(String temp){
        String imageIcon ="";
        String[] part = temp.split(":");
        String nameToSearch = part[0];
        //check iput string
//        System.out.println("-"+ nameToSearch + "-");
        
        for ( MenuItem m : this.mainMenu.getItems()){
           if (m.getName().equals(nameToSearch)){
               imageIcon = m.getImageFileName();
           }
        }//end for each loop
        if (imageIcon.equals("")){
            imageIcon = "not_available.png";
        }
        //check result
//        System.out.println(imageIcon);
        return imageIcon;
    }
    
    
    /**
     * method to add path on new Menu Item
     MainApp.java, edited/created by Fabio Rondina
     *Coursework Part 1 – due 14 January 2019 
     * @return String
     */
    
    public String pathAdder(){
           String path ="";
            if ( chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                file = chooser.getSelectedFile();
                path = file.getAbsolutePath();
//                //check path result
//                System.out.println(path);
                //preview of the selected image
                this.showSelectedItemImage.setIcon(new ImageIcon(path));

            }else {
                System.out.println("No image added");
            }//end chooser if
            
         return path;
    }
    
    /**
     * Helper method to check if User enter an Integer as 
     * price for a new Menu Item
     *@param String cost
     *@return boolean 
     */
    
    public boolean isInt(String str){
        try{
            int i = Integer.parseInt(str);
            
        }catch (NumberFormatException | NullPointerException nfe){
            return false;
        }
        return true;
    }
    
    
    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        //initialize components
        this.order = new ArrayList<>();
        this.sauces = new ArrayList<>();
//        sauces.add("test");
        
        //element to test menu
        mainMenu.fillMenuWithSomeItems();
        //update combo BOxes
        menuSplitter();
        
        //lock add Buttons until a new Order is created
        addDrink.setEnabled(false);
        addSide.setEnabled(false);
        addSandwich.setEnabled(false);
        //disable editing to the Text area and field used as a display
        displayTA.setEditable(false);
        lastSelItem.setEditable(false);
        // disable create menu item
        menuitemCB.setEnabled(false);
        newMenuItemB.setEnabled(false);
        
        //initial text field setting
        if(mainMenu.getItems().size() == 0){
            lastSelItem.setText("No Menu loaded, please load one from the File on menu bar");
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

        sortBG = new javax.swing.ButtonGroup();
        displayPanel = new javax.swing.JPanel();
        menuOrderPanel = new javax.swing.JPanel();
        sortMenu = new javax.swing.JLabel();
        drink = new javax.swing.JLabel();
        side = new javax.swing.JLabel();
        sandwich = new javax.swing.JLabel();
        drinkCB = new javax.swing.JComboBox<>();
        sideCB = new javax.swing.JComboBox<>();
        sandwichCB = new javax.swing.JComboBox<>();
        nameSort = new javax.swing.JRadioButton();
        priceSort = new javax.swing.JRadioButton();
        close = new javax.swing.JButton();
        menuAddition = new javax.swing.JLabel();
        newMenuItemB = new javax.swing.JButton();
        menuitemCB = new javax.swing.JComboBox<>();
        displayMenu = new javax.swing.JButton();
        addDrink = new javax.swing.JButton();
        addSide = new javax.swing.JButton();
        addSandwich = new javax.swing.JButton();
        newOrder = new javax.swing.JButton();
        showSelectedItemImage = new javax.swing.JLabel();
        lastSelItem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        Save = new javax.swing.JMenuItem();
        Load = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        ManageMenu = new javax.swing.JMenu();
        EnableNewMenuItem = new javax.swing.JMenuItem();
        LockNewMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sortMenu.setText("Sort Menu by");

        drink.setText("Drink Menu");

        side.setText("Side");

        sandwich.setText("Sandwitch");

        drinkCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        drinkCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkCBActionPerformed(evt);
            }
        });

        sideCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sideCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideCBActionPerformed(evt);
            }
        });

        sandwichCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sandwichCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwichCBActionPerformed(evt);
            }
        });

        sortBG.add(nameSort);
        nameSort.setText("name");
        nameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSortActionPerformed(evt);
            }
        });

        sortBG.add(priceSort);
        priceSort.setText("price");
        priceSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceSortActionPerformed(evt);
            }
        });

        close.setText("X");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        newMenuItemB.setText("Create a new MenuItem");
        newMenuItemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemBActionPerformed(evt);
            }
        });

        menuitemCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drink", "Side", "Sandwich", " " }));
        menuitemCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemCBActionPerformed(evt);
            }
        });

        displayMenu.setText("display actual Menu List");
        displayMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayMenuActionPerformed(evt);
            }
        });

        addDrink.setText("Add");
        addDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinkActionPerformed(evt);
            }
        });

        addSide.setText("Add");
        addSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSideActionPerformed(evt);
            }
        });

        addSandwich.setText("Add");
        addSandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSandwichActionPerformed(evt);
            }
        });

        newOrder.setText("Start a New Order");
        newOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderActionPerformed(evt);
            }
        });

        showSelectedItemImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lastSelItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastSelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastSelItemActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose the Kind of Item to add at the Menu");

        javax.swing.GroupLayout menuOrderPanelLayout = new javax.swing.GroupLayout(menuOrderPanel);
        menuOrderPanel.setLayout(menuOrderPanelLayout);
        menuOrderPanelLayout.setHorizontalGroup(
            menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drink)
                                    .addComponent(side)
                                    .addComponent(sandwich))
                                .addGap(37, 37, 37)
                                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(drinkCB, 0, 192, Short.MAX_VALUE)
                                    .addComponent(sideCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sandwichCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOrderPanelLayout.createSequentialGroup()
                                .addComponent(newOrder)
                                .addGap(36, 36, 36)))
                        .addComponent(sortMenu)
                        .addGap(26, 26, 26)
                        .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                                .addComponent(nameSort)
                                .addGap(18, 18, 18)
                                .addComponent(priceSort)
                                .addGap(37, 37, 37)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addDrink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addSide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addSandwich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lastSelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(showSelectedItemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuOrderPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(menuitemCB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newMenuItemB)
                        .addGap(109, 109, 109)
                        .addComponent(displayMenu))
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addComponent(menuAddition)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        menuOrderPanelLayout.setVerticalGroup(
            menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sortMenu)
                    .addComponent(nameSort)
                    .addComponent(priceSort)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addDrink)
                    .addComponent(drinkCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drink))
                .addGap(13, 13, 13)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(side)
                    .addComponent(sideCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSide))
                .addGap(18, 18, 18)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sandwich)
                    .addComponent(sandwichCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSandwich))
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuAddition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(menuOrderPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lastSelItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showSelectedItemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menuOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayMenu)
                    .addComponent(newMenuItemB)
                    .addComponent(menuitemCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane2.setViewportView(displayTA);

        FileMenu.setText("File");

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save actual Menu on text file");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        FileMenu.add(Save);

        Load.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Load.setText("Load Menu from a text file");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        FileMenu.add(Load);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExitKeyPressed(evt);
            }
        });
        FileMenu.add(Exit);

        jMenuBar1.add(FileMenu);

        ManageMenu.setText("Manage Menu");

        EnableNewMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        EnableNewMenuItem.setText("Enable New Item Button");
        EnableNewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnableNewMenuItemActionPerformed(evt);
            }
        });
        ManageMenu.add(EnableNewMenuItem);

        LockNewMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        LockNewMenuItem.setText("Lock Create new Item Buttons");
        LockNewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LockNewMenuItemActionPerformed(evt);
            }
        });
        ManageMenu.add(LockNewMenuItem);

        jMenuBar1.add(ManageMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(menuOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(menuOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void menuitemCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemCBActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_menuitemCBActionPerformed

    private void newMenuItemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemBActionPerformed
        // TODO add your handling code here:
        try {
            //Menu mainMenu = new Menu("main menu");
            String name = JOptionPane.showInputDialog("Please write the NAME of the Item");
            String costTemp ="";
            do{
                 costTemp = JOptionPane.showInputDialog("Enter the COST of the Item in pence");
            }while(!isInt(costTemp));
            
//            int cost = Integer.parseInt(JOptionPane.showInputDialog("Enter the COST of the Item in pence"));
            int cost = Integer.parseInt(costTemp);
            
//            --------------------------DRINK-------------------------------------------------------------------------------------------
            if (menuitemCB.getSelectedItem().equals("Drink")){
                // jopto pane for drinks object
                boolean alcohol ;
                int alc = JOptionPane.showConfirmDialog(null, "Is it an alcoholic", "alcohol checher", JOptionPane.YES_NO_OPTION);
                if (alc == JOptionPane.YES_OPTION){
                    alcohol = true;
                }else{
                    alcohol = false;
                }
            //generate temporary MenuItem
            Drink tempDrink = new Drink(name,cost,alcohol);
             // ask for image
            String path = pathAdder();
            // add path if any
            if (path.equals("")){
                //menu item without image
                mainMenu.addMenuItem(tempDrink);
               
            }else{
               //menu item with image
               mainMenu.addMenuItem((tempDrink),path);
            }
            
            //add object to Menu List
            // original add without image
//            mainMenu.addMenuItem(new Drink(name,cost,alcohol));

           
//            --------------------------SIDE-------------------------------------------------------------------------------------------
            }else if (menuitemCB.getSelectedItem().equals("Side")){
                // jopto pane for drinks object
                String sauce ;
                int sa = JOptionPane.showConfirmDialog(null, "does it has a sauce ", "sauce controller ", JOptionPane.YES_NO_OPTION);
                //add object to Menu List
                if (sa == JOptionPane.YES_OPTION){
                    sauce = JOptionPane.showInputDialog("which sauce ?");
                }else{
                    sauce = "no sauce";
                }
                //add object to Menu List    
                Side tempSide = new Side ( name,cost,sauce);
            
                String path = pathAdder();
                // add path if any
                if (path.equals("")){
                    //menu item without image
                    mainMenu.addMenuItem(tempSide);
               
                }else{
                    //menu item with image
                    mainMenu.addMenuItem((tempSide),path);
                }
//            --------------------------SANDWICH-------------------------------------------------------------------------------------------            
            }else if (menuitemCB.getSelectedItem().equals("Sandwich")){
                // jopto pane for drinks object
                String filling = JOptionPane.showInputDialog("Which fillings have the Sandwich? (write all of them with \"+\" as separator");
                String[] option  = {"WHITE", "WHOLEMEAL", "BAGEL", "RYE", "PITA"};
                String breadType = (String)JOptionPane.showInputDialog(null,"Which kind of bread?","bread type ",JOptionPane.PLAIN_MESSAGE, null  , option, option[0]);
                Bread bre = Bread.valueOf(breadType);

                //add object to Menu List
                Sandwich tempSand = new Sandwich (name,cost,filling,bre);
            
                //add image path
                String path = pathAdder();
                // add path if any
                if (path.equals("")){
                    //menu item without image
                    mainMenu.addMenuItem(tempSand);
               
                }else{
                    //menu item with image
                    mainMenu.addMenuItem((tempSand),path);
                }    

            }else{
                System.out.println("Error in new menu item selection");
            }
            //update the comboBOXes
            menuSplitter();
            
//      // check result of new MenuItem insertion
//      JOptionPane.showMessageDialog(null," Menu Item selected is " + menuitemCB.getSelectedItem());
//      JOptionPane.showMessageDialog(null," Menu List is \n " + mainMenu.getMenuAsString());

        }catch (Exception e ){
            System.out.println(e.toString());
//            System.exit(1);
        }
    }//GEN-LAST:event_newMenuItemBActionPerformed

    private void displayMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayMenuActionPerformed
        // TODO add your handling code here:
        displayTA.setText(" Menu List is \n" + mainMenu.getMenuAsString());
        //update the comboBOX
        menuSplitter();

        
    }//GEN-LAST:event_displayMenuActionPerformed

    private void addDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinkActionPerformed
        // TODO add your handling code here:
        displayTA.setText("");
        try{
            String testAlc = drinkCB.getSelectedItem().toString();
            boolean alcohol = false;
            if (testAlc.endsWith("[Alcohol]")){
                //check age TASK 12 B
                int sa = JOptionPane.showConfirmDialog(null, "Are you over 18? ", "Alcohol controller ", JOptionPane.YES_NO_OPTION);
                if ( sa == JOptionPane.YES_OPTION){
                    if (testAlc.endsWith("[Alcohol]")){
                    alcohol = true;
                    //remove alcohol from the string
                    testAlc= testAlc.substring(0,testAlc.length()- 10);
                    
                }// end internal if
                    
                String[] temp = testAlc.split(":");
                String name = temp[0];
                //from 1 to the penultimate to get rid of the space at start and "p" at end
    //            String costT = temp[2].substring(1,(temp[2].length()-1));
                // take the cost and reduce of 100p because is alcoholic, to avoid double pricing on the new item
                int costOrder = Integer.parseInt(temp[2].substring(1,(temp[2].length()-1))) - 100;
            
//                //check input on Order
//                System.out.println(name);
//                System.out.println("cost is " + costOrder);
//              System.out.println(temp[3]);
                currentOrder.addMenuItem(new Drink (name , costOrder , alcohol));
                    
                }else{// else of the question
//                    System.out.println("Drink not allowed, not added to the order");
                    JOptionPane.showMessageDialog(null,"Drink not allowed, not added to the order");
                }
            }else{//end first alcol if  
                String[] temp = testAlc.split(":");
                String name = temp[0];
                int costOrder = Integer.parseInt(temp[2].substring(1,(temp[2].length()-1)));
                currentOrder.addMenuItem(new Drink (name , costOrder , alcohol));
                
            }
                  
                // old diplayer
//              displayTA.append(currentOrder.toString() + currentOrder.getOrderTotal() + "\n");
                displayTA.append(currentOrder.formattedString());
            }catch (Exception e ){
                System.out.println(e.toString());
                System.exit(1);
            }
        
        
    }//GEN-LAST:event_addDrinkActionPerformed

    private void nameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSortActionPerformed
        // TODO add your handling code here:
        mainMenu.sortItemsByTitle();
        //update the comboBOX
        menuSplitter();
    }//GEN-LAST:event_nameSortActionPerformed

    private void priceSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceSortActionPerformed
        // TODO add your handling code here:
        mainMenu.sortItemsByPrice();
        //update the comboBOX
        menuSplitter();
    }//GEN-LAST:event_priceSortActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExitKeyPressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitKeyPressed

    private void addSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSideActionPerformed
        // TODO add your handling code here:
        displayTA.setText("");
        String side = sideCB.getSelectedItem().toString();
        String[] part = side.split(":");
        
        String name = part[0];
        String[] sauceSplit = part[2].split("with");
        int price = Integer.parseInt(sauceSplit[0].substring(1, sauceSplit[0].length()-2)); // conside 1 space at start and 2 char not neccesary at the end of the string
        //default sauce from combo box selected
        String sauce = sauceSplit[1].trim();
        //ask user for change or addition
        int sauceCheck = JOptionPane.showConfirmDialog(null, "Would you like to add/change sauce? "
                                                       + "\n( If No is selected no changes will be made)", "sauce managment", JOptionPane.YES_NO_OPTION);
        
        if (sauceCheck == JOptionPane.NO_OPTION){
            // do nothing
        }else if (sauceCheck == JOptionPane.YES_OPTION){
            // JDialog to change/add sauce
            ChangeAddSauce changeSauce = new ChangeAddSauce(this,true,this.sauces);
            changeSauce.setVisible(true);
            
            //set result as current String
            currentSauce = sauces.get(sauces.size()-1);  
//            // check result
//            System.out.println(" current string of result is "+currentSauce);
            // price check if user use the adder with no sauce option on a no sauce product
            if(currentSauce.equals("no sauce") &&  sauce.equals("no sauce")){
                // overwrite actual sauce
                sauce = currentSauce;
                
            }else if (currentSauce.equals("no sauce") && !"no sauce".equals(sauce)){ // price check if user use the adder no sauce option on a product having sauce
//                System.out.println("2 -" + sauce + "-\n2 -" +currentSauce + "-");
                //revise price without sauce
                price -= Side.getSAUCECOST();
                 // overwrite actual sauce
                sauce = currentSauce;
            }else if (sauce.equals("no sauce") && !"no sauce".equals(currentSauce)){ // avoid question add/substistute in the case of addition to a no sauce product
                sauce = currentSauce.substring(0,currentSauce.length()-2); // to remove the ","            
            }else{
                //revise price to avoid double sauce cost
                price -= Side.getSAUCECOST();
                  String[] option  = {"Substitude" ,"Add"};
                  int addSub = JOptionPane.showOptionDialog(null,"What you prefer to with added sauce :\n"
                                                                    + "-add them to the actual \n"
                                                                    + "-change itwith the selected","sauce behavior",0,JOptionPane.PLAIN_MESSAGE, null  , option, option[0]);
                  
                  System.out.println("int is: " + addSub);
                    if ( addSub == 0){
                        //overwrite actual sauce
                      sauce = currentSauce.substring(0,currentSauce.length()-2); // to remove the ","
                    }else{
                        //add to actual string
                      sauce += "," + currentSauce.substring(0,currentSauce.length()-2); // to remove the ","
                    }
                  
            
            }
//            String[] option  = {"substitude" ,"add"};
//            String addSub = (String)JOptionPane.showInputDialog(null,"choose what you prefer to to with added sauce :\n"
//                                                                    + "-add them to the actual \n"
//                                                                    + "-change itwith the selected","sauce behaviuor ",JOptionPane.PLAIN_MESSAGE, null  , option, option[0]);
//            sauce = currentSauce;
        } 
                    
        currentOrder.addMenuItem(new Side (name, price, sauce));
//        displayTA.append(currentOrder.toString() + "\n"+ currentOrder.getOrderTotal() + "\n");
//        formattedString
        displayTA.append(currentOrder.formattedString());
//        displayTA.append( "side is " + name + "\n price is  " + price + "\n sauce is : -" + sauce + "-\n");
//        displayTA.append(sideCB.getSelectedItem().toString() + "\n");
    }//GEN-LAST:event_addSideActionPerformed

    private void addSandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSandwichActionPerformed
        // TODO add your handling code here:
        displayTA.setText("");
        
        String sandw = sandwichCB.getSelectedItem().toString();
        String[] part = sandw.split(":");
        // split last part to extract cost
        String[] secondPart = part[2].split(",");
        
        String name = part[0];
        int cost = Integer.parseInt(secondPart[0].substring(1,secondPart[0].length()-1))-100; // cost -100 p to avoid double price for Breadcost
        // split last part to extract filling and bread
        String[] thirdPart = secondPart[1].split(" on ");
        String filling = thirdPart[0].substring(10 );
        
        /** requirement 16 embedded inside the add button
         * 
         */

        String[] option  = {"WHITE", "WHOLEMEAL", "BAGEL", "RYE", "PITA"};
        String breadType = (String)JOptionPane.showInputDialog(null,"Which kind of bread?","bread type ",JOptionPane.PLAIN_MESSAGE, null  , option, option[0]);
        //check bread value
//        System.out.println(breadType);
        Bread bread = Bread.WHITE;//= Bread.valueOf(breadType);
        if (breadType != null){
            bread = Bread.valueOf(breadType);
        }else{
            //message if User select cancel
            JOptionPane.showMessageDialog(null,"Operation Aborted, Sandwich bread not changed" );
            //set bread as selected item
            bread = Bread.valueOf(thirdPart[1].substring(0, thirdPart[1].length()-6));
        
        }

//        Bread bread = Bread.valueOf(thirdPart[1].substring(0, thirdPart[1].length()-6));
//        
//        System.out.println(thirdPart[1].substring(0, thirdPart[1].length()-6));
//        displayTA.append("name -"+ part[0] + "- \ncost is -"  + cost + "-\n filling -" + filling + "-\n bread" + bread);
//        displayTA.append(sandwichCB.getSelectedItem().toString() + "\n");
        currentOrder.addMenuItem(new Sandwich(name, cost, filling,bread));
        // old diplayer
//        displayTA.append(currentOrder.toString() + "\n"+ currentOrder.getOrderTotal() + "\n"); 
        displayTA.append(currentOrder.formattedString());
    }//GEN-LAST:event_addSandwichActionPerformed

    private void newOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderActionPerformed
        // TODO add your handling code here:

        StartOrder newOrder = new StartOrder ( this,true,this.order);
        newOrder.setVisible(true);
        //check if new order is created
        if ( order.size() > 0){
            addDrink.setEnabled(true);
            addSide.setEnabled(true);
            addSandwich.setEnabled(true);
            currentOrder = order.get(order.size()-1);
        }else{
            //check if order is created
//            System.out.println("no new order created");
        }    
    }//GEN-LAST:event_newOrderActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
//        File file = new File();
        if ( chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION){
                file = new File(chooser.getSelectedFile() + ".txt" );
                JOptionPane.showMessageDialog(null,"Save successuful \nThe File " + file.getName() + " has been created \non path " + file.getAbsolutePath());
//              // check result
//                System.out.println("You clicked Save, Save successuful");
//                System.out.println("\n File absolutge path : " + file.getAbsolutePath());
//                System.out.println("\n File name is " + file.getName());
        }

        mainMenu.saveToFile(file);
    }//GEN-LAST:event_SaveActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        // TODO add your handling code here:
        if ( chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                file = chooser.getSelectedFile();
                JOptionPane.showMessageDialog(null,"Load successuful \nThe File " + file.getName() + " has been selected \nfrom path " + file.getAbsolutePath());
//                // confirmation of the saved file
//                System.out.println("You clicked Load, Menu succesfully loaded");
//                System.out.println("\n File absolute path : " + file.getAbsolutePath());
//                System.out.println("\n File name is " + file.getName());
        }
//        // add it to Main Menu
//        mainMenu.readFromFile(file);
        
        //add to a temp menu
        Menu tempMenu = new Menu("temp");
        tempMenu.readFromFile(file);
        //overwrite the exsisting menu
        mainMenu = tempMenu;
        // update menu list
        menuSplitter();
        // reset display of images
        showSelectedItemImage.setText("");
        lastSelItem.setText("Start a new Order then choose a Item from Menu to see the image, if any");
    }//GEN-LAST:event_LoadActionPerformed

    private void drinkCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkCBActionPerformed
        // TODO add your handling code here:
        // take selected item
        String temp = drinkCB.getSelectedItem().toString();
//        //check path selected
//        System.out.println(ImageFinder(temp));
        
        //update Text field and image
        this.lastSelItem.setText("Actual image of " + drinkCB.getSelectedItem().toString());
        this.showSelectedItemImage.setIcon(new ImageIcon(ImageFinder(temp)));
        
        // show related item image
//        showSelectedItemImage.setIcon(icon);
    }//GEN-LAST:event_drinkCBActionPerformed

    private void sideCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideCBActionPerformed
        // TODO add your handling code here:
         // take selected item
        String tempSI = sideCB.getSelectedItem().toString();
        //check path selected
//        System.out.println(ImageFinder(tempSI));
         //update Text field and image
        this.lastSelItem.setText("Actual image of " + sideCB.getSelectedItem().toString());
        this.showSelectedItemImage.setIcon(new ImageIcon(ImageFinder(tempSI)));
        
    }//GEN-LAST:event_sideCBActionPerformed

    private void sandwichCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwichCBActionPerformed
        // TODO add your handling code here:
        String tempSD = sandwichCB.getSelectedItem().toString();
        //check path selected
//        System.out.println(ImageFinder(tempSD));
        //update Text field and image
        this.lastSelItem.setText("Actual image of " + sandwichCB.getSelectedItem().toString());
        this.showSelectedItemImage.setIcon(new ImageIcon(ImageFinder(tempSD)));
    }//GEN-LAST:event_sandwichCBActionPerformed

    private void lastSelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastSelItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastSelItemActionPerformed

    private void EnableNewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnableNewMenuItemActionPerformed
        // TODO add your handling code here:
        menuitemCB.setEnabled(true);
        newMenuItemB.setEnabled(true);
    }//GEN-LAST:event_EnableNewMenuItemActionPerformed

    private void LockNewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LockNewMenuItemActionPerformed
        // TODO add your handling code here:
        menuitemCB.setEnabled(false);
        newMenuItemB.setEnabled(false);
    }//GEN-LAST:event_LockNewMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EnableNewMenuItem;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem Load;
    private javax.swing.JMenuItem LockNewMenuItem;
    private javax.swing.JMenu ManageMenu;
    private javax.swing.JMenuItem Save;
    private javax.swing.JButton addDrink;
    private javax.swing.JButton addSandwich;
    private javax.swing.JButton addSide;
    private javax.swing.JButton close;
    private javax.swing.JButton displayMenu;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JLabel drink;
    private javax.swing.JComboBox<String> drinkCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastSelItem;
    private javax.swing.JLabel menuAddition;
    private javax.swing.JPanel menuOrderPanel;
    private javax.swing.JComboBox<String> menuitemCB;
    private javax.swing.JRadioButton nameSort;
    private javax.swing.JButton newMenuItemB;
    private javax.swing.JButton newOrder;
    private javax.swing.JRadioButton priceSort;
    private javax.swing.JLabel sandwich;
    private javax.swing.JComboBox<String> sandwichCB;
    private javax.swing.JLabel showSelectedItemImage;
    private javax.swing.JLabel side;
    private javax.swing.JComboBox<String> sideCB;
    private javax.swing.ButtonGroup sortBG;
    private javax.swing.JLabel sortMenu;
    // End of variables declaration//GEN-END:variables
}
