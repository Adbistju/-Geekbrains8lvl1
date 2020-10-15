import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActoinButtonListener implements ActionListener {

    protected JTextField outField;
    protected StringBuilder sb;


    public ActoinButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    public ActoinButtonListener() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String val = sb.append(outField.getText()).append(jButton.getText()).toString();
        outField.setText(val);
        sb.setLength(0);
    }
}