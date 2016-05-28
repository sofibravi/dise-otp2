package Conexion;

import Datos.Empresa;
import Datos.Impuestos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Controlador {
    
    private static Connection conexion = Conexion.getConnection();
    
    
    public static ArrayList<Impuestos> buscarImpuestos() {
        ArrayList<Impuestos> impuesto = new ArrayList<>();
        String sql = "Select * from TipoImpuesto where vigente != 0";
        try (
                Statement stmt= conexion.createStatement();
                ResultSet rs= stmt.executeQuery(sql);
                ){
            while (rs.next()){
                Impuestos imp=new Impuestos();
                
                imp.setIdImpuestos(rs.getInt("idTipoImpuesto"));
                imp.setNombreImpuesto(rs.getString("nombreTipoImpuesto"));
                imp.setVigente(rs.getBoolean("vigente"));
                
                impuesto.add(imp);
                
            }
            
        } catch (SQLException e){
            System.out.println(e.getSQLState());
        }
        return impuesto;
        
            
    }
    public static ArrayList<Empresa> buscarEmpresa(int numImpuesto) {
        ArrayList<Empresa> emp = new ArrayList<>();
        String sql = "Select Empresa.* from Empresa where Empresa.vigente != 0 and idTipoImpuesto = "+numImpuesto;
        try (
                Statement stmt= conexion.createStatement();
                ResultSet rs= stmt.executeQuery(sql);
                ){
            while (rs.next()){
                Empresa empresa=new Empresa();
                
                empresa.setNombreEmpresa(rs.getString("nombreEmpresa"));
                empresa.setId(rs.getInt("idEmpresa"));
                empresa.setVigente(rs.getBoolean("vigente"));
                
                
                emp.add(empresa);
                
            }
            
        } catch (SQLException e){
            System.out.println(e.getSQLState());
        }
        return emp;
        
    }
    
    
}
