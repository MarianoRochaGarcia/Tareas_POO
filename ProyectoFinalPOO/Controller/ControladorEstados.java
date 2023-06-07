package ProyectoFinalPOO.Controller;

import ProyectoFinalPOO.Model.EstadoDeMexico;
import ProyectoFinalPOO.Model.ModeloTablaEstados;
import ProyectoFinalPOO.View.VentanaEstado;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

public class ControladorEstados extends MouseAdapter {

    private VentanaEstado view;
    private ModeloTablaEstados modelo;

    public ControladorEstados(VentanaEstado view) {
        this.view = view;
        modelo = new ModeloTablaEstados();
        this.view.getTblEstados().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblEstados().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblEstados().setModel(modelo);
            this.view.getTblEstados().updateUI();
        }

        if (e.getSource() == view.getTblEstados()){
            System.out.println("Evento sobre tabla");
            int index = this.view.getTblEstados().getSelectedRow();
            EstadoDeMexico est = modelo.getEstadoAtIndex(index);

            try{
                this.view.getImagen().setIcon(est.getImagen());
                this.view.getImagen().setText("");

            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }
        }
        if (e.getSource() == this.view.getBtnAgregar()){
            System.out.println("Evento sobre boton agregar");
            EstadoDeMexico estadoDeMexico = new EstadoDeMexico();
            estadoDeMexico.setId(0);
            estadoDeMexico.setNombre(this.view.getTxtNombre().getText());
            estadoDeMexico.setUrl(this.view.getTxtURL().getText());
            estadoDeMexico.setComidaTipica(this.view.getTxtComidaTipica().getText());
            estadoDeMexico.setMillonesHabitantes(Double.parseDouble(this.view.getTxtMillonesHab().getText()));
            estadoDeMexico.setNumMunicipios(Integer.parseInt(this.view.getTxtNumMunicipios().getText()));
            if(modelo.agregarEstado(estadoDeMexico)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblEstados().updateUI();
            }else{
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise su conexion",
                "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
        if(e.getSource() == this.view.getBtnModificar()){

            int index = this.view.getTblEstados().getSelectedRow();
            EstadoDeMexico estadoDeMexico = modelo.getEstados(index);
            EstadoDeMexico est = new EstadoDeMexico();

            estadoDeMexico.setNombre(this.view.getTxtNombre().getText());
            estadoDeMexico.setUrl(this.view.getTxtURL().getText());
            estadoDeMexico.setComidaTipica(this.view.getTxtComidaTipica().getText());
            estadoDeMexico.setMillonesHabitantes(Double.parseDouble(this.view.getTxtMillonesHab().getText()));
            estadoDeMexico.setNumMunicipios(Integer.parseInt(this.view.getTxtNumMunicipios().getText()));
            estadoDeMexico.setId(estadoDeMexico.getId());

            if (modelo.modificarEstado(est)){

                System.out.println("Se cargo de forma correcta");
                modelo.cargarDatos();
                this.view.getTblEstados().setModel(modelo);
                this.view.getTblEstados().updateUI();
            }else {
                System.out.println("Error, no se modifico nada");
            }
            this.view.getTblEstados().updateUI();
            this.view.limpiar();
        }

        if (e.getSource() == this.view.getBtnEliminar()){
            System.out.println("Evento sobre boton eliminar");
            ModeloTablaEstados tme = new ModeloTablaEstados();
            int index = this.view.getTblEstados().getSelectedRow();
            EstadoDeMexico est = modelo.getEstadoAtIndex(index);
            if(tme.eliminarEstado(Integer.toString(est.getId()))){
                System.out.println("Se elimino de forma correcta");
                modelo.cargarDatos();
                this.view.getTblEstados().updateUI();
                this.view.limpiar();
            }else {
                System.out.println("No se pudo eliminar");
            }
        }

    }

}
