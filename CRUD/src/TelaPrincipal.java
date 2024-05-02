import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaPrincipal extends JFrame{
    Pessoas p;
    public JPanel painelPrincipal;
    public JPanel inptPainel;
    private JTextField inptNome;
    private JTextField inptAltura;
    private JTextField inptPeso;
    private JPanel btnsPainel;
    private JButton btnCadastro;
    private JButton btnLocalizar;
    private JButton btnEditar;
    private JButton btnViewAll;
    private JButton btnFakes;
    private JButton btnApagar;
    private JTextArea txtTodos;

    ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();

    public TelaPrincipal() {
        btnFakes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pessoas.add(new Pessoas("Andrey Lopes","1.65", "86.65"));
                pessoas.add(new Pessoas("Leticia Schutz","1.65", "86.65"));
                pessoas.add(new Pessoas("Neiva Freitas","1.65", "86.65"));

                for (Pessoas pessoa : pessoas ){
                    System.out.println(pessoa);
                }
            }
        });


    }
}
