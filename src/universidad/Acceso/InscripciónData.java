
package universidad.acceso;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumnos;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materias;



public class InscripciónData {
    private Connection con=null;
    private MateriaData md=new MateriaData();
    private AlumnoData ad=new AlumnoData();
    
    
    public InscripciónData(){
        this.con=Conexion.getConexion();
    }
    
    public void guardarInscripción(Inscripcion insc){                                                            
        String sql="INSERT INTO inscripcion(idAlumno,idMateria,nota)VALUES(?,?,?)";
        try{
            try (PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                ps.setInt(1, insc.getIdAlumno());                                      
                ps.setInt(2,insc.getIdMateria());
                ps.setDouble(3, insc.getNota());
                ps.executeUpdate();
                ResultSet rs=ps.getGeneratedKeys();
                if(rs.next()){
                    insc.setIdInscripcion(rs.getInt(1));
                    JOptionPane.showMessageDialog(null,"Inscricipón Registrada con exito!");
                }   }
      } catch (SQLException ex) {
        JOptionPane.showConfirmDialog(null, "Error al acceder a la table de inscripción");
      }
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
        String sql= "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int fila=ps.executeUpdate();
            if(fila>0){
                JOptionPane.showConfirmDialog(null, "Nota Actualizada!");
            }
            
                } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error al acceder a la table de inscripción");
                }
    }
    
    public void borrarInscripcion(int idAlumno, int idMateria){
       String sql= "DELETE FROM inscripcion WHERE idAlumno=? and idMateria=?";
       
       try{
           try (PreparedStatement ps = con.prepareStatement(sql)) {
               ps.setInt(1, idAlumno);
               ps.setInt(2, idMateria);
               
               int filas=ps.executeUpdate();
               
               ps.close();
               }     
           } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Error al acceder a la table de inscripción");
            }     
   }

    public List<Inscripcion> obtenerInscripciones(){
    ArrayList<Inscripcion> cursada=new ArrayList<>();
    
    String sql="SELECT * FROM inscripcion";
   try{ 
    PreparedStatement ps=con.prepareStatement(sql);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        Inscripcion insc=new Inscripcion();
        insc.setIdInscripcion(rs.getInt("idInscripto"));
        Alumnos alu=ad.buscarAlumno(rs.getInt("idAlumno"));
        Materias mat=md.buscarMateria(rs.getInt("idMateria"));
        insc.setIdAlumno(alu);
        insc.setIdMateria(mat);
        insc.setNota(rs.getInt("nota"));
        cursada.add(insc);
        }
} catch (SQLException ex){
    JOptionPane.showConfirmDialog(null, "Error al acceder a la table de inscripción");
}
   return cursada;
}

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
    ArrayList<Inscripcion> cursada=new ArrayList<>();
    
    String sql="SELECT * FROM inscripcion WHERE idAlumno = ?";
   try{ 
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1, idAlumno);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        Inscripcion insc=new Inscripcion();
        insc.setIdInscripcion(rs.getInt("idInscripto"));
        Alumnos alu=ad.buscarAlumno(rs.getInt("idAlumno"));
        Materias mat=md.buscarMateria(rs.getInt("idMateria"));
        insc.setIdAlumno(alu);
        insc.setIdMateria(mat);
        insc.setNota(rs.getInt("nota"));
        cursada.add(insc);
        }
} catch (SQLException ex){
    JOptionPane.showConfirmDialog(null, "Error al acceder a la table de inscripción");
}
   return cursada;
}  

    public List<Materias> obtenerMateriasCursadas (int idAlumno){
        ArrayList<Materias> materias=new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, anioMateria FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
        try{
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materias materia=new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripción!");
        }
        return materias;
    }

    public List<Materias> obtenerMateriasNOCursadas (int idAlumno){
        
        ArrayList<Materias> materias=new ArrayList<>();
        
            String sql= "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
            try{
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materias materia=new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anioMateria"));
                materias.add(materia);
            }
            ps.close();
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripción!");
        }
            return materias;
    }

    public List<Alumnos> obtenerAlumnosXMateria(int idMateria){
        
        ArrayList<Alumnos> alumnosMateria=new ArrayList<>();
            String sql= "SELECT *" +
                        "FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno and idMateria = ? AND a.estado = 1";
            
        try {
            PreparedStatement ps=con.prepareCall(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Alumnos alumno = new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFecha(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la table de inscripción!");
        }
            return alumnosMateria;
    }
}