import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TelaConta extends JFrame {
    Conta c = new Conta(1, "Andrey", 1000.0f);
    float saldo = c.getSaldo();

    public JPanel painelPrincipal;

    private JButton btnDepositar;
    public JPanel painelBtns;
    private JButton btnSacar;
    public JLabel lblSaldo;





    public TelaConta() {

        lblSaldo.setText(Float.toString(c.getSaldo()));

        btnDepositar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do deposito?: "));
                c.deposito(valor);
                lblSaldo.setText(Float.toString(c.getSaldo()));
            }
        });
        btnSacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do saque?: "));
                c.sacar(valor);
                lblSaldo.setText(Float.toString(c.getSaldo()));
            }
        });


    }


}
