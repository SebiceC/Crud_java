package com.sebitas.crud.interfaz;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import com.sebitas.crud.logica.CRUD;
import com.sebitas.crud.logica.Ciudad;
import com.sebitas.crud.logica.Genero;
import com.sebitas.crud.logica.Propietario;

public class Controlador implements ActionListener,MouseListener{
    private Map<String,Runnable> accionesBotones = new HashMap<>();
    private Map<String,Genero> mapGenero = new HashMap<>();
    private Principal ventana;
    private CRUD crud = new CRUD();
    public Controlador(Principal ventana){
        ArrayList<Genero> GENEROS = (ArrayList<Genero>) crud.leerGeneros();
        for (Genero genero : GENEROS) {
            mapGenero.put(genero.getGeneroNombre(), genero);
        }
        this.ventana = ventana;
        accionesBotones.put("Agregar", this::Agregar);
        accionesBotones.put("Modificar", this::Modificar);
        accionesBotones.put("Leer", this::Leer);
        accionesBotones.put("Eliminar", this::Eliminar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        Runnable action = accionesBotones.get(comando);
        if (action!=null) {
            action.run();
        }else{
            System.out.println("No existe tal boton");
        }
    }

    private boolean Agregar(){
        Genero gTemp = mapGenero.get(ventana.getTxtGenero().getText());
        if (ventana.getTxtIdCiudad().getText().isBlank() || !ventana.getTxtIdCiudad().getText().matches("\\d*")) {
            JOptionPane.showMessageDialog(ventana, "El id de ciudad no es un numero");
            return false;
        }
        Ciudad gCiu = crud.leerCiudad(Integer.parseInt(ventana.getTxtIdCiudad().getText()));    
        if (gTemp==null || gCiu==null) {
            JOptionPane.showMessageDialog(ventana, "Valores invalidos");
            return false;
        }else{
        boolean b = crud.crearPropietario(new Propietario(
            Integer.parseInt(ventana.getTxtNumId().getText()), 
            ventana.getTxtNombre().getText(), 
            gTemp, 
            gCiu));
            if (b) {
                JOptionPane.showMessageDialog(ventana, "Ingresado con exito");
                return true;
            }else{
                JOptionPane.showMessageDialog(ventana, "El propietario ya existe");
                return false;
            }
        }

    }
    private boolean camposVacios(){
        if (ventana.getTxtGenero().getText().isBlank() ||
        ventana.getTxtIdCiudad().getText().isBlank() ||
        ventana.getTxtNombre().getText().isBlank() ||
        ventana.getTxtNumId().getText().isBlank()) {
            return true;
        }else{
            return false;
        }
    }
    private void Modificar(){
        if (camposVacios()) {
            JOptionPane.showMessageDialog(ventana, "Algun campo vacio");
        }else{
            crud.modificarPropiertario(Integer.parseInt(ventana.getTxtNumId().getText()), 
            ventana.getTxtNombre().getText(), 
            mapGenero.get(ventana.getTxtGenero().getText()).getIdGenero(), 
            Integer.parseInt(ventana.getTxtIdCiudad().getText()));
            JOptionPane.showMessageDialog(ventana, "Propietario modificado");
        }
    }
    private void Leer(){
        ventana.getModel().setRowCount(0);
        ArrayList<Propietario> props =(ArrayList)crud.leerPropiertarios();
        for(int i=0;i<props.size();i++){
            String[] row = new String[4];
            row[0]=String.valueOf(props.get(i).getId());
            row[1]=props.get(i).getNombre();
            row[2]=props.get(i).getGenero().getGeneroNombre();
            row[3]=String.valueOf(props.get(i).getCiudad().getIdCiudad());
            ventana.getModel().addRow(row);
        }    
    }
    private void Eliminar(){
        int seleccionado = ventana.getTablaPropietario().getSelectedRow();
        if (seleccionado >=0) {
            crud.eliminarPropietario(Integer.parseInt(String.valueOf(ventana.getTablaPropietario().getValueAt(seleccionado, 0))));
            JOptionPane.showMessageDialog(ventana, "Eliminado con exito");
        }else{
            JOptionPane.showMessageDialog(ventana, "Ningun propietario seleccionado");
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int seleccionar = ventana.getTablaPropietario().rowAtPoint(me.getPoint());
        ventana.getTxtNumId().setText(String.valueOf(ventana.getTablaPropietario().getValueAt(seleccionar, 0)));
        ventana.getTxtNombre().setText(String.valueOf(ventana.getTablaPropietario().getValueAt(seleccionar, 1)));
        ventana.getTxtGenero().setText(String.valueOf(ventana.getTablaPropietario().getValueAt(seleccionar, 2)));
        ventana.getTxtIdCiudad().setText(String.valueOf(ventana.getTablaPropietario().getValueAt(seleccionar, 3)));
    }
    @Override
    public void mousePressed(MouseEvent e) {
      // TODO document why this method is empty
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      // TODO document why this method is empty
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    
}
