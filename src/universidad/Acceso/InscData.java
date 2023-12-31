/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.Acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidad.Entidades.Alumnos;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materias;

/**
 *
 * @author Exon
 */
public class InscData {
      private Connection con=null;
    private MateriaData md=new MateriaData();
    private AlumnoData ad=new AlumnoData();
    
    
    public InscData(){
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
                JOptionPane.showMessageDialog(null, "Nota Actualizada!");
              
            }
            
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripción");
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
        insc.setIdAlumno(alu.getIdAlumno());
        insc.setIdMateria(mat.getIdMateria());
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
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
        try{
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materias materia=new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
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
                materia.setAnio(rs.getInt("año"));
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
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Alumnos alumno = new Alumnos();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setEstado(rs.getBoolean("estado"));
                alumno.setDni(rs.getInt("dni"));
                alumnosMateria.add(alumno);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la table de inscripción!");
        }
            return alumnosMateria;
    }
}

