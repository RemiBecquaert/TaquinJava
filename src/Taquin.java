import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Taquin extends JDialog {
    private JPanel contentPane;
    private JList<JButton> listeDeBoutons;


    public static void main(String[] args) {
        Taquin dialog = new Taquin();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public Taquin() {
        setContentPane(contentPane);
        setModal(true);
        initTableau();


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void initTableau() {
    listeDeBoutons = new JList<>();
    listeDeBoutons.setVisibleRowCount(4);



    }

    private void winCase(){

    }

    private void onRestart() {
        new Taquin();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
