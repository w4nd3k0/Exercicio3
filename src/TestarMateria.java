
public class TestarMateria {
    
    public static void main(String[] args) {
        
        Materia M1 = new Materia();
        M1.Nome = "Banco de Dados";
        M1.Professor = "Emerson";
        M1.Periodo = "4º Período";
        M1.Curso = "Sistemas de Informação";
        
        Materia M2 = new Materia();
        M2.Nome = "Estatística";
        M2.Professor = "Danivalton";
        M2.Periodo = "4º Período";
        M2.Curso = "Sistemas de Informação";
        
        Materia M3 = new Materia();
        M3.Nome = "Direito Virtual";
        M3.Professor = "Adler";
        M3.Periodo = "4º Período";
        M3.Curso = "Sistemas de Informação";
        
        System.out.println("Matéria: " + M1.Nome);
        System.out.println("Professor: " + M1.Professor);
        System.out.println("Período: " + M1.Periodo);
        System.out.println("Curso: " + M1.Curso);
    }
    
}
