import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;

public class MyRightsMain extends JDialog {
    private JPanel contentPane;
    private JTextArea infoAboutCountry;
    private JComboBox comboBox1;
    private JTextArea humanRights;
    private JLabel ImageLabel;
    private JButton buttonOK;

    public MyRightsMain() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                Object obj = itemEvent.getItem();
                String selected = comboBox1.getSelectedItem().toString();
                if (selected == "Russia") {
                    //TODO: set text about Russia
                    infoAboutCountry.setText("Information about country Russia");
                    humanRights.setText("Human Rights in Russia");
                    //TODO: change path to image
                    ImageLabel.setIcon(new ImageIcon("/home/kasia/Pulpit/nauczanie/LearnItGirl/MyRights/images/map1.jpeg"));

                } else if (selected == "Germany") {
                    infoAboutCountry.setText("Information about Germany");
                    //TODO: change path to image; set human rights for Germany
                    ImageLabel.setIcon(new ImageIcon("/home/kasia/Pulpit/nauczanie/LearnItGirl/MyRights/images/map1.jpeg"));
                } else {
                    infoAboutCountry.setText("Information about Bosnia");
                    //TODO: change path to image; set human rights for Bosnia
                    ImageLabel.setIcon(new ImageIcon("/home/kasia/Pulpit/nauczanie/LearnItGirl/MyRights/images/map1.jpeg"));
                }

            }
        });
    }

    public static void main(String[] args) {
        MyRightsMain dialog = new MyRightsMain();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
