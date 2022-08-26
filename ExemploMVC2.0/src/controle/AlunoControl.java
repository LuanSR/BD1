/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    
    private ArrayList<Aluno> ListaAl;

    public AlunoControl(){
        ListaAl = new ArrayList<>();
    }
    public void cadastrarAluno (int ra,String nome) throws SQLException{
       Aluno al = new Aluno (ra,nome);
        
        
        AlunoDAO gil = new AlunoDAO();
        gil.inserirAluno(al);
        
    }
    public ArrayList<Aluno> buscarTodos(){
        return ListaAl;
        
    }
    public void excluir(String nome, int RA) throws SQLException{
        AlunoDAO dao = new AlunoDAO();
        dao.excluir(RA);
       }
       
    
}
