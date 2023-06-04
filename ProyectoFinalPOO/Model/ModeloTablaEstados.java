package ProyectoFinalPOO.Model;

import ProyectoFinalPOO.Persistencia.EstadoDeMexicoDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaEstados implements TableModel {

    public static final int COLUMNS = 6;
    private ArrayList<EstadoDeMexico> datos;
    private EstadoDeMexicoDAO estDAO;

    public ModeloTablaEstados() {
        estDAO = new EstadoDeMexicoDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaEstados(ArrayList<EstadoDeMexico> datos) {
        this.datos = datos;
        estDAO = new EstadoDeMexicoDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Url";
            case 3:
                return "Comida Tipica";
            case 4:
                return "Millones habitantes";
            case 5:
                return "Numero municipios";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return Double.class;
            case 5:
                return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EstadoDeMexico edm = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return edm.getId();
            case 1:
                return edm.getNombre();
            case 2:
                return edm.getUrl();
            case 3:
                return edm.getComidaTipica();
            case 4:
                return edm.getMillonesHabitantes();
            case 5:
                return edm.getNumMunicipios();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //datos.get(rowIndex).getId();
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setComidaTipica((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setMillonesHabitantes((Double) aValue);
                break;
            case 5:
                datos.get(rowIndex).setNumMunicipios((Integer) aValue);
                break;
            default:
                System.out.println("No se modifica nada");

        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try{
            ArrayList<EstadoDeMexico> tirar = estDAO.obtenerTodo();
            System.out.println(tirar);
            datos = estDAO.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public EstadoDeMexico getEstadoAtIndex(int idx){
        return datos.get(idx);
    }

    public boolean agregarEstado(EstadoDeMexico est){
        boolean resultado = false;
        try{
            if(estDAO.insertar(est)){
                datos.add(est);
                resultado = true;
            }else {
                resultado = false;
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}
