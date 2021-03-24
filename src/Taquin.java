import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Taquin extends JDialog {
    //attributs du .form
    private JPanel contentPane;
    private JList listeDeBoutons;
    private JButton recommencerButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private ArrayList<Object> listBtn;

    //attributs privés

    public static void main(String[] args) {
        Taquin dialog = new Taquin();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public Taquin() {
        setContentPane(contentPane);
        setModal(true);
        listeDeBoutons = new JList();
        listeDeBoutons.setVisibleRowCount(4);


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

    private void créerJeu(){
    //creer le tableau et les boutons
    }
    private void initListBtn(){
        listBtn = new ArrayList<>();
        listeBtn.add(button1);
        listeBtn.add(button2);
        listeBtn.add(button3);
        listeBtn.add(button4);

        listeBtn.add(button5);
        listeBtn.add(button6);
        listeBtn.add(button7);
        listeBtn.add(button8);

        listeBtn.add(button9);
        listeBtn.add(button10);
        listeBtn.add(button11);
        listeBtn.add(button12);

        listeBtn.add(button13);
        listeBtn.add(button14);
        listeBtn.add(button15);
        listeBtn.add(button16);

    }

    private void bougerBouton(){
    //permet de bouger le bouton si un voisin = ""
    }

    private void winCase(){
    //verifie si le jeu est gagné avec une boucle
    }

    private void onRestart() {
        new Taquin();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }


}
