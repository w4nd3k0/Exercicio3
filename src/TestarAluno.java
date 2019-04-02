/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanderley
 */
public class TestarAluno {
    
    public static void main(String[] args) {
        
        Aluno A1 = new Aluno();
        A1.Matricula = 1;
        A1.Nome = "Petronio Augusto";
        A1.Materia = "Banco de Dados";
        A1.Nota = 6;
        
        Aluno A2 = new Aluno();
        A2.Matricula = 2;
        A2.Nome = "Samuel de Thais";
        A2.Materia = "Banco de Dados";
        A2.Nota = 8;
        
        Aluno A3 = new Aluno();
        A3.Matricula = 1;
        A3.Nome = "Rafael Nepomuceno";
        A3.Materia = "Banco de Dados";
        A3.Nota = 9;

        
        System.out.println("Nome: "+ A1.Nome);
        System.out.println("Materia: "+ A1.Materia);
        System.out.println("Nota: "+ A1.Nota);
        
    }
    
}
