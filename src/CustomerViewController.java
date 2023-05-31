import com.google.gson.Gson;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerViewController {
    private JTextField customerIDTF;
    private JTextField customerNameTF;
    private JTextField phoneNumberTF;
    private JButton loadCustomerButton;
    private JButton saveCustomerButton;
    private JPanel mainPanel;

    private Client client;

    public CustomerViewController(Client client) {
        this.client = client;

        loadCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String customerID = customerIDTF.getText();
                Message message = new Message(Message.LOAD_CUSTOMER, customerID);
                client.sendMessage(message);
            }
        });

        saveCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = new Customer();

                customer.setCustomerID(String.valueOf(Integer.parseInt(customerIDTF.getText())));
                customer.setName(customerNameTF.getText());
                customer.setPhoneNumber(String.valueOf(phoneNumberTF.getText()));

                Gson gson = new Gson();

                String customerString = gson.toJson(customer);

                Message message = new Message(Message.SAVE_CUSTOMER, customerString);
                client.sendMessage(message);
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void updateCustomerInfo(Customer customer) {
        customerIDTF.setText(customer.getCustomerID());
        customerNameTF.setText(customer.getName());
        phoneNumberTF.setText(String.valueOf(customer.getPhoneNumber()));

    }

    /*private void createUIComponents() {
        // TODO: place custom component creation code here
    }*/
}
