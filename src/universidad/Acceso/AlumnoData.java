
package universidad.Acceso;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import universidad.Entidades.Alumnos;


public class AlumnoData {
    
    private Connection con=null;
            
    public AlumnoData (){
        
        con=Conexion.getConexion();
    }
    
    
   public void guardarAlumno(Alumnos alumno){
        String sql="INSERT INTO alumno(dni, apellido, nombre, fechaNac, estado)"
                + "VALUES(?,?,?,?,?,)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFecha()));
            ps.setBoolean(5,alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Alumno guardado exitosamente");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno"); 
        }
    }
  
    public void modificarAlumno(Alumnos alumno){
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNac = ? WHERE idAlumno = ?";
        PreparedStatement ps = null;
          try {
               ps = con.prepareStatement(sql);
               ps.setInt(1, alumno.getDni());
               ps.setString(2, alumno.getApellido());
               ps.setString(3, alumno.getNombre());
               ps.setDate(4, Date.valueOf(alumno.getFecha()));
               ps.setInt(5, alumno.getIdAlumno());
               int exito = ps.executeUpdate();
               if (exito == 1) {
                   JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
               }
               else {
                   JOptionPane.showMessageDialog(null, "El alumno no existe");
               }
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
               }
    }
  
    public void eliminarAlumno(int id) {
        
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate();
            
            if(fila==1){
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
            }
            ps.close();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }
    public Alumnos buscarAlumno(int id) {
        Alumnos alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNac FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,id );
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                alumno=new Alumnos();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
                    }
            return alumno;
        
    }
    public Alumnos buscarAlumnoPorDni(int dni) {
        Alumnos alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE dni=? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni );
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                alumno=new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            } ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return alumno;
    }
    public List<Alumnos> listarAlumnos() {
        List<Alumnos> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumnos alumno = new Alumnos();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return alumnos;
    }
    
}
