package universidad.Acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidad.Entidades.Materias;



public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        con=Conexion.getConexion();
        
    }
    
    public void guardarMateria (Materias materia){
        String sql="INSERT INTO materia(nombre,año,estado) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,materia.getNombre());
            ps.setInt(2,materia.getAnio());
            ps.setBoolean(3,materia.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Materia guardada");
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
        
    }
    
    public void modificarMateria(Materias materia){
        String sql= "UPDATE materia SET nombre=?, año=? WHERE idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,materia.getNombre());
            ps.setInt(2,materia.getAnio());
            ps.setInt(3,materia.getIdMateria());
            int exito= ps.executeUpdate();
            if (exito == 1){
                JOptionPane.showMessageDialog(null,"Materia modificada correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"La materia no existe");
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
        
    }
    
    public void eliminarMateria(int id){
        String sql="UPDATE materia SET estado=0 WHERE idMateria=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito= ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Materia eliminada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
        
        
    }
    
    public Materias buscarMateria(int id){
        
        String sql= "SELECT nombre,año FROM materia WHERE idMateria=? AND estado=1";
        Materias materia= null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                materia= new Materias();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
            }else {JOptionPane.showMessageDialog(null,"No Existe la materia");
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
        return materia;
    }
    public List<Materias> listarMaterias(){
       String sql="SELECT * FROM materia WHERE estado=1";
       ArrayList<Materias> materias = new ArrayList <>();
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Materias materia= new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(true);
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
       return materias;
    }
    
}
