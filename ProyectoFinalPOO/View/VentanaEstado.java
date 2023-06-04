package ProyectoFinalPOO.View;

import javax.swing.*;
import java.awt.*;

public class VentanaEstado extends JFrame {

    private JLabel lblID;
    private JLabel lblNombre;
    private JLabel lblURL;
    private JLabel lblComidaTipica;
    private JLabel lblMillonesHab;
    private JLabel lblNumMunicipios;

    private JTextField txtID;
    private JTextField txtNombre;
    private JTextField txtURL;
    private JTextField txtComidaTipica;
    private JTextField txtMillonesHab;
    private JTextField txtNumMunicipios;

    private JButton btnAgregar;
    private JButton btnCargar;
    private JTable tblEstados;
    private JScrollPane scrollPane;
    private GridLayout layout;

    private JPanel panel1; //Formulario
    private JPanel panel2;//Tabla
    private JPanel panel3;
    private JPanel panel4;

    private JLabel imagen;

    public VentanaEstado(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //PANEL1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(210, 150, 150));
        lblID = new JLabel("Id:");
        lblNombre = new JLabel("Nombre:");
        lblURL = new JLabel("URL:");
        lblComidaTipica = new JLabel("Comida tipica:");
        lblMillonesHab = new JLabel("Millones de Habitantes:");
        lblNumMunicipios = new JLabel("Numero de estados:");
        txtID = new JTextField(3);
        txtID.setText("0");
        txtID.setEnabled(false);
        txtNombre = new JTextField(25);
        txtURL = new JTextField(30);
        txtComidaTipica = new JTextField(25);
        txtMillonesHab = new JTextField(15);
        txtNumMunicipios = new JTextField(6);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblID);
        panel1.add(txtID);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblURL);
        panel1.add(txtURL);
        panel1.add(lblComidaTipica);
        panel1.add(txtComidaTipica);
        panel1.add(lblMillonesHab);
        panel1.add(txtMillonesHab);
        panel1.add(lblNumMunicipios);
        panel1.add(txtNumMunicipios);
        panel1.add(btnAgregar);
        //PANEL2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(172, 210, 150));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblEstados = new JTable();
        scrollPane = new JScrollPane(tblEstados);
        panel2.add(scrollPane);
        //PANEL3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(150, 158, 210));

        imagen = new JLabel("...");
        panel3.add(imagen);
        //PANEL4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(225, 216, 157));

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblURL() {
        return lblURL;
    }

    public void setLblURL(JLabel lblURL) {
        this.lblURL = lblURL;
    }

    public JLabel getLblComidaTipica() {
        return lblComidaTipica;
    }

    public void setLblComidaTipica(JLabel lblComidaTipica) {
        this.lblComidaTipica = lblComidaTipica;
    }

    public JLabel getLblMillonesHab() {
        return lblMillonesHab;
    }

    public void setLblMillonesHab(JLabel lblMillonesHab) {
        this.lblMillonesHab = lblMillonesHab;
    }

    public JLabel getLblNumMunicipios() {
        return lblNumMunicipios;
    }

    public void setLblNumMunicipios(JLabel lblNumMunicipios) {
        this.lblNumMunicipios = lblNumMunicipios;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtURL() {
        return txtURL;
    }

    public void setTxtURL(JTextField txtURL) {
        this.txtURL = txtURL;
    }

    public JTextField getTxtComidaTipica() {
        return txtComidaTipica;
    }

    public void setTxtComidaTipica(JTextField txtComidaTipica) {
        this.txtComidaTipica = txtComidaTipica;
    }

    public JTextField getTxtMillonesHab() {
        return txtMillonesHab;
    }

    public void setTxtMillonesHab(JTextField txtMillonesHab) {
        this.txtMillonesHab = txtMillonesHab;
    }

    public JTextField getTxtNumMunicipios() {
        return txtNumMunicipios;
    }

    public void setTxtNumMunicipios(JTextField txtNumMunicipios) {
        this.txtNumMunicipios = txtNumMunicipios;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblEstados() {
        return tblEstados;
    }

    public void setTblEstados(JTable tblEstados) {
        this.tblEstados = tblEstados;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtURL.setText("");
        txtComidaTipica.setText("");
        txtMillonesHab.setText("");
        txtNumMunicipios.setText("");
    }
}
