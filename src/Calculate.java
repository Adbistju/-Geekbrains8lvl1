import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate {
    private JFrame mainFrame;
    Main d= new Main();
    ActoinButtonListener j=new ActoinButtonListener();

    public Calculate(){
        mainFrame = new JFrame();
        mainFrame.setTitle("Calculator");
        mainFrame.setBounds(100, 100, 300, 500);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 5));

        mainFrame.add(top, BorderLayout.NORTH);
        mainFrame.add(bottom, BorderLayout.CENTER);

        JTextField outField = new JTextField();
        outField.setEditable(false);
        top.add(outField, BorderLayout.CENTER);
        ActoinButtonListener abListener = new ActoinButtonListener(outField);

        for (int i = 0; i < 3; i++) {
            JButton digitBtn = new JButton(String.valueOf(i+7));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }
        JButton cancelBtn = new JButton("C");
        bottom.add(cancelBtn);
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // JButton jButton= (JButton) e.getSource();
                outField.setText(null);
            }
        });
        for (int i = 0; i < 3; i++) {
            JButton digitBtn = new JButton(String.valueOf(i+4));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }
        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(abListener);
        bottom.add(plusBtn);
        for (int i = 0; i < 3; i++) {
            JButton digitBtn = new JButton(String.valueOf(i+1));
            bottom.add(digitBtn);
            digitBtn.addActionListener(abListener);
        }
        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(abListener);
        bottom.add(minusBtn);

        JButton submitBtn = new JButton("Submit");
        bottom.add(submitBtn);
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Boolen.str=outField.getText();

                try {

                    JButton jButton= (JButton) e.getSource();
                    System.out.println(d.sum());
                    outField.setText(null);
                    outField.setText(String.valueOf(Boolen.getStr()));

                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
        });
        JButton digitBtn = new JButton(String.valueOf(0));
        bottom.add(digitBtn);
        digitBtn.addActionListener(abListener);

        JButton mnoBtn = new JButton("*");
        mnoBtn.addActionListener(abListener);
        bottom.add(mnoBtn);
        JButton delBtn = new JButton("/");
        delBtn.addActionListener(abListener);
        bottom.add(delBtn);

        JButton dotBtn = new JButton(".");
        dotBtn.addActionListener(abListener);
        bottom.add(dotBtn);
        JButton scobBtn = new JButton("(");
        scobBtn.addActionListener(abListener);
        bottom.add(scobBtn);
        JButton scob2Btn = new JButton(")");
        scob2Btn.addActionListener(abListener);
        bottom.add(scob2Btn);

        mainFrame.setVisible(true);
    }
}