package ca.uqam.inf2120;

import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import ca.uqam.inf2120.data.Constants;
import ca.uqam.inf2120.data.Texts;

public class Window extends JFrame {
    private JButton buttonTraduire;
    private JTextArea textAreaCoreen;
    private JTextArea textAreaPrononciation;

    ActionListener actionButtonTraduire = e -> textAreaPrononciation
            .setText(new TexteCoreen(textAreaCoreen.getText()).traduire());

    public Window() {
        super(Texts.TITRE_FENETRE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        textAreaCoreen = new JTextArea(Constants.TEXT_AREA_COREEN_NBR_LIGNES,
                Constants.TEXT_AREA_COREEN_NBR_COLONNES);
        add(textAreaCoreen, Constants.POSITION_TEXT_AREA_COREEN);
        textAreaPrononciation = new JTextArea(Constants.TEXT_AREA_PRONONCIATION_NBR_LIGNES,
            Constants.TEXT_AREA_PRONONCIATION_NBR_COLONNES);
        textAreaPrononciation.setEditable(false);
        add(textAreaPrononciation, Constants.POSITION_TEXT_AREA_PRONONCIATION);

        buttonTraduire = new JButton(Texts.BUTTON_TRADUIRE);
        buttonTraduire.addActionListener(actionButtonTraduire);
        add(buttonTraduire, Constants.POSITION_BUTTON_TRADUIRE);

        pack();
        setVisible(true);
    }
}
