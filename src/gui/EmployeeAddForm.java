package gui;

import controller.Controller;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import controller.Controller;
import model.Employee;

public class EmployeeAddForm extends Container {
    private JPanel employeeAddPanel;
    private JTextField nameTextField;
    private JTextField departamentTextField;
    private JTextField ageTextField;
    private JTextField phoneTextField;
    private JLabel nameLabel;
    private JLabel depLabel;
    private JLabel ageLabel;
    private JLabel phoneLabel;
    private JLabel positionLabel;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    //private JButton ADDButton;
    private JComboBox positionComboBox;
    private ButtonGroup genderGroup;
    private Controller controller;

    public EmployeeAddForm() {
        controller = new Controller();
       /* $$$setupUI$$$();
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String message = "Message text";
                //JOptionPane.showMessageDialog(new JFrame(), message, "Windows title", JOptionPane.ERROR_MESSAGE);
                boolean validInput = true;
                String errMessage = "Incorrect values in input fields: \n";
                String nameText = nameTextField.getText();
                if (nameText.isEmpty()) {
                    errMessage = errMessage + "\"Name\" field is empty \n";
                    validInput = false;
                }
                String departamentText = departamentTextField.getText();
                if (nameText.isEmpty()) {
                    errMessage = errMessage + "\"Departament\" field is empty \n";
                    validInput = false;
                }
                int age = 0;
                try {
                    age = Integer.parseInt(ageTextField.getText());
                } catch (NumberFormatException ne) {
                    errMessage = errMessage + "\"Age\" field has incorrect value\n";
                    validInput = false;
                }
                String phone = phoneTextField.getText();
                if (phone.isEmpty()) {
                    errMessage = errMessage + "\"Phone\" field is empty \n";
                    validInput = false;
                }
                String position = (String) positionComboBox.getSelectedItem();
                String gender = "Other";
                if (maleRadioButton.isSelected() == true) {
                    gender = "Male";
                }
                else if (femaleRadioButton.isSelected() == true) {
                    gender = "Female";
                }
                else if (otherRadioButton.isSelected() == true) {
                    gender = "Other";
                }
                //errMessage = errMessage + "Gender: " + gender;
                if (!validInput) {
                    JOptionPane.showMessageDialog(new JFrame(), errMessage, "Input information error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Employee employee = new Employee(nameText, departamentText, age, phone, position, gender);
                Controller controller = new Controller();
                controller.addEmployee(employee);
                JOptionPane.showMessageDialog(new JFrame(), employee.toString(), "Input Information OK", JOptionPane.INFORMATION_MESSAGE);
            }
        });*/
    }

    public void addDataToDB() {
        boolean validInput = true;
        String errMessage = "Incorrect values in input fields: \n";
        String nameText = nameTextField.getText();
        if (nameText.isEmpty()) {
            errMessage = errMessage + "\"Name\" field is empty \n";
            validInput = false;
        }
        String departamentText = departamentTextField.getText();
        if (nameText.isEmpty()) {
            errMessage = errMessage + "\"Departament\" field is empty \n";
            validInput = false;
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageTextField.getText());
        } catch (NumberFormatException ne) {
            errMessage = errMessage + "\"Age\" field has incorrect value\n";
            validInput = false;
        }
        String phone = phoneTextField.getText();
        if (phone.isEmpty()) {
            errMessage = errMessage + "\"Phone\" field is empty \n";
            validInput = false;
        }
        String position = (String) positionComboBox.getSelectedItem();
        String gender = "Other";
        if (maleRadioButton.isSelected() == true) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected() == true) {
            gender = "Female";
        } else if (otherRadioButton.isSelected() == true) {
            gender = "Other";
        }
        //errMessage = errMessage + "Gender: " + gender;
        if (!validInput) {
            JOptionPane.showMessageDialog(new JFrame(), errMessage, "Input information error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Employee employee = new Employee(nameText, departamentText, age, phone, position, gender);
        Controller controller = new Controller();
        controller.addEmployee(employee);
        JOptionPane.showMessageDialog(new JFrame(), employee.toString(), "Input Information OK", JOptionPane.INFORMATION_MESSAGE);

    }

    public JPanel getEmploeeAddPanel() {
        return employeeAddPanel;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        employeeAddPanel = new JPanel();
        employeeAddPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 2, new Insets(0, 0, 0, 0), -1, -1));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        employeeAddPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("Name");
        employeeAddPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nameTextField = new JTextField();
        employeeAddPanel.add(nameTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Departament");
        employeeAddPanel.add(label2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Age");
        employeeAddPanel.add(label3, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Phone");
        employeeAddPanel.add(label4, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Position");
        employeeAddPanel.add(label5, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Gender");
        employeeAddPanel.add(label6, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        departamentTextField = new JTextField();
        employeeAddPanel.add(departamentTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        employeeAddPanel.add(ageTextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        employeeAddPanel.add(phoneTextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        maleRadioButton = new JRadioButton();
        maleRadioButton.setEnabled(true);
        maleRadioButton.setSelected(true);
        maleRadioButton.setText("Male");
        employeeAddPanel.add(maleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        femaleRadioButton = new JRadioButton();
        femaleRadioButton.setSelected(false);
        femaleRadioButton.setText("Female");
        employeeAddPanel.add(femaleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        otherRadioButton = new JRadioButton();
        otherRadioButton.setSelected(false);
        otherRadioButton.setText("Other");
        employeeAddPanel.add(otherRadioButton, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        positionComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Trainee");
        defaultComboBoxModel1.addElement("Junior");
        defaultComboBoxModel1.addElement("Middle");
        defaultComboBoxModel1.addElement("Senior");
        defaultComboBoxModel1.addElement("Lead");
        defaultComboBoxModel1.addElement("Head");
        defaultComboBoxModel1.addElement("PM");
        positionComboBox.setModel(defaultComboBoxModel1);
        employeeAddPanel.add(positionComboBox, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderGroup.add(otherRadioButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return employeeAddPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);
        nf.setMaximumIntegerDigits(10);
        ageTextField = new JFormattedTextField(nf);
        MaskFormatter phoneMask = null;
        try {
            phoneMask = new MaskFormatter("+7 (###) ###-####");
            phoneMask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        phoneTextField = new JFormattedTextField(phoneMask);

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        otherRadioButton = new JRadioButton("Other");
        maleRadioButton.setActionCommand("Male");
        femaleRadioButton.setActionCommand("Female");
        otherRadioButton.setActionCommand("Other");
    }
}
