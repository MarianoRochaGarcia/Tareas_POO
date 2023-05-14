package TablaMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblID;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarollador;
    private JTextField txtID;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<Videojuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);
        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(168, 220, 115));
        lblID = new JLabel("ID:");
        txtID = new JTextField(4);
        panel1.add(lblID);
        panel1.add(txtID);
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        lblGenero = new JLabel("Genero:");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        lblPeso = new JLabel("Peso(GB):");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        lblPlataforma = new JLabel("Plataforma:");
        txtPlataforma = new JTextField(15);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        lblDesarollador = new JLabel("Desarollador:");
        txtDesarollador = new JTextField(25);
        panel1.add(lblDesarollador);
        panel1.add(txtDesarollador);
        btnAgregar = new JButton("Agregar juego");
        panel1.add(btnAgregar);
        this.getContentPane().add(panel1,0);
        //Panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(132, 89, 220));
        info = new ArrayList<>();
        info.add(new Videojuego(1, "League of Legends", "MOBA", 4.5,
                "Windows y MAV", "Riot Games"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);

        this.getContentPane().add(panel2,1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Videojuego nuevo = new Videojuego();
                nuevo.setId(Integer.parseInt(txtID.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoEnGB(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarollador(txtDesarollador.getText());
                //info.add(nuevo);
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });
        this.setVisible(true);
    }
}
