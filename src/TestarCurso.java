
public class TestarCurso {
    
    public static void main(String[] args) {
        
        Curso C1 = new Curso();
        C1.Nome = "Administração";
        C1.Ano = "01/2018";
        C1.Periodos = 8;
        
        Curso C2 = new Curso();
        C2.Nome = "Engenharia";
        C2.Ano = "01/2018";
        C2.Periodos = 10;
        
        Curso C3 = new Curso();
        C3.Nome = "Sistemas de Informação";
        C3.Ano = "01/2018";
        C3.Periodos = 8;
        
        System.out.println("Curso: "+C3.Nome);
        System.out.println("Inicio: "+C3.Ano);
        System.out.println("Períodos: "+C3.Periodos);
    }
    
}
