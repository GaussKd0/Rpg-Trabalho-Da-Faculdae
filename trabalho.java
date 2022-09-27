
import java.util.Random;
import java.util.Scanner;

public class trabalho {
    // eu sei que eu nao sabia que eu poderia usar a variavel publica sem a nescecidade de retornar o valor entao criei varias funcoes desnecessarias, fui burro kkkkkk

    public static String Racas;
    
    public static String TipoMagia;
    
    public static String Nome;
    
    public static String Objetos;
    
    public static int Dinheiro;
    
    public static String Familia;
    
    public static String NpcNomes;
    
    public static String Historia;

    public static int XP;
    
    public static String Receber(String Receber)
    {
        Racas = Receber;
        return Racas;
        
    }
    public static String Receber1(String Receber)
    {
        TipoMagia = Receber;
        return TipoMagia;
        
    }
    public static String Receber3(String Receber)
    {
        Objetos = Receber;
        return Objetos;
        
    }
    public static String Receber2(String Receber)
    {
        Nome = Receber;
        return Nome;
        
    }
     public static String Receber4(String Receber)
    {
        Familia = Receber;
        return Familia;
        
    }
     
    public static int Receber5(int Receber)
    {
        Dinheiro = Receber;
        return Dinheiro;     
       
    }
    
    public static String Receber6(String Receber)
    {
        NpcNomes = Receber;
        return NpcNomes;     
       
    }
    
     public static String Receber7(String Receber)
    {
        Historia = Receber;
        return Historia;     
       
    }
    public static int Receber8(int Receber)
    {
        XP = Receber;
        return XP;     
       
    }
    
   
    public static void atributos(String raca, int vida, int magia, int forca, int velocidade){
        int Carisma[] = {0, 1, 2, 3 ,4 ,5 ,6, 7,8,9,10};
        int CarismaRnd = Carisma[new Random().nextInt(Carisma.length)];
        System.out.println(raca + "\n" + "Magia: " + magia + "\n" + "Vida: " + vida  + "\n" + "Força: " + forca +  "\n" + "Velocidade: " + velocidade + "\n"  +  "Carisma: "  + CarismaRnd); 
        
    }
  
    public static void racas()
    {
        Scanner scan = new Scanner(System.in);
        int racas;
       
               
        String[] Racas = { "Humano", "Gigante", "Elfo", "Anão", "Elfo Negro", "Metamorfo" };
        
       
                  
        System.out.println("Qual Raça Voce Deseja {1} Para Humano {2} Para Gigante {3} Para Elfo {4} Para Anão {5} Para Elfo Negro {6} Para Metamorfo");
        
        racas = scan.nextInt();
        switch (racas)
        {
            
            case 1:
                //humano
                atributos(Racas[0],5,5,4,5);
                Receber(Racas[0]);
               break;
            
            case 2:
                //gigante
                atributos(Racas[1],20,0,10,2);
                Receber(Racas[1]);
                break;
                
            case 3:
                //elfo
                atributos(Racas[2],5,8,3,10);
                Receber(Racas[2]);
                break;
                
            case 4:
                //anao
                atributos(Racas[3],6,4,7,2);
                Receber(Racas[3]);
                break;
                
            case 5:
                //elfo negro
                atributos(Racas[4],7,8,5,8); 
                Receber(Racas[4]);
                break;
                
            case 6:
                //metamorfo
                atributos(Racas[5],5,5,5,5);  
                Receber(Racas[5]);
                break;
                
            default:
                System.out.println("Opção Invalida");
                break;
        }
        
    }
    
    
  
    public static int SeuAtaque()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha Ó Ataque:");
        System.out.println("(1) - Ataque Basico");
        System.out.println("(2) - Ataque Com Magia");
        System.out.println("(3) - Ataque Com Arma");
        System.out.println("(4) - Especial");
        return scan.nextInt();
    }
    static int ataqueBot()
    {
        Random rnd = new Random();
        return rnd.nextInt(4)+1;
    }
    static void printVida(int hp, int hpBot, int quantidade){
        System.out.println("======================");
        System.out.println("- HP " + Nome + ":" + hp);
        System.out.println("======================");
        System.out.println("- HP " + NpcNomes + ":" + hpBot);
        System.out.println("======================");
        System.out.println("- Quantidade Do Especial: " + quantidade);
        
    }
    static void batalha(){
                
         switch(Racas){
            case "Humano":
                batalha2(5, 4, 5, 5,TipoMagia, Objetos);
            break;
            
            case "Gigante":
                
                batalha2(20, 10,0,2,TipoMagia, Objetos);
            break;
            
            case "Elfo":
                batalha2(5, 3,8,10,TipoMagia, Objetos);
            break;
            
            case "Anão":
                batalha2(6, 7,4,2,TipoMagia, Objetos);
            break;
                        
            case "Elfo Negro":
                batalha2(7, 5,8,8,TipoMagia, Objetos);
            break;
            
            case "Metamorfo":
                batalha2(5, 5,5,5,TipoMagia,Objetos);
            break;
        }
                
       
    }
    public static void batalha2 (int hp, int atk, int magia, int velocidade, String tipomagia, String Obj)
    {
        
        int hpBot = 2;
        int quantidadeEspecial = 5;
        int escolherAtk;
                
         while(hp > 0  && hpBot > 0)
        {
            printVida(hp, hpBot, quantidadeEspecial);
            escolherAtk = SeuAtaque();
            
            switch(escolherAtk){
                case 1 -> {
                    System.out.println("Personagem Atacou Com Um Soco");
                    hpBot -= atk;
                    break;
                }
                
                case 2 -> {
                    
                    System.out.println("Personagem Atacou Com Magia " + tipomagia);
                    String EspecialidadeMagia;
                    int escuridao = 5;
                    int eletricidade = 8;
                    int fogo = 10;
                    int terra = 4;
                    int ar = 5;
                    int luz = 7;

                    switch (TipoMagia)
                    {
                                                    
                        case "Escuridão":
                            hpBot -= magia + escuridao;
                            break;
                        case "Eletricidade":
                              hpBot -= magia + eletricidade;
                            break;
                        case "Fogo":
                              hpBot -= magia + fogo;
                        case "Terra":
                              hpBot -= magia + terra;
                            break;
                        case "Ar":
                              hpBot -= magia + ar;
                            break;
                        case "Luz":
                              hpBot -= magia + luz;
                            break;      
                    }
                    
                }
                  case 3 -> {
                    if(Obj == "Nada")
                    {
                        System.out.print("Voce Não Possui Arma, Então Tera Que Usar Um Ataque Basico");
                        hpBot -= atk;
                    }
                    else
                    {
                        System.out.println("Personagem Atacou Com Arma" + Obj);
                        switch(Obj)
                        {
                            case "Espada E Escudo":
                                hpBot -= atk + 5;
                                hp += 3;
                                
                                break;
                            case "Escudo Grande":
                                hpBot -= atk + 2;
                                hp += 10;
                                break;    
                           case "Picareta":
                                hpBot -= atk + 3;
                                break; 
                            case "Martelo":
                                hpBot -= atk + 4;
                                break;
                            case "Faca Afiada":
                                hpBot -= atk + 3;
                            case "Espada Grande":
                                hpBot -= atk + 7;
                                break;
                        }
                    }
                   
                    break;
                }
                default -> System.out.println("Opção Invalida");
            }
            
            if(hpBot > 0){
                escolherAtk = ataqueBot();
                switch(escolherAtk){
                    case 1 -> {
                        System.out.println("Npc Atacou Com Um Soco"+ "Seu Dano: " + atk );
                        hp -= 3;
                    }
                    case 2 -> {
                        System.out.println("Npc Atacou Com Uma Arma");
                        hp -= 5;
                    }
                    case 3 -> {
                        System.out.println("Npc Atacou Com O Especial");
                        hp -= 10;
                    }
                    case 4 -> System.out.println("Npc Errou");
                }
            }
            else if(hp == 0)
            {
                System.out.println("Voce Foi Derrotado");
            }
            else
            {
                XP =+ 10;
                System.out.println("Inimigo Derrotado");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        System.out.println("Bem Vindo Ao Meu Rpg!");
        scan.nextLine();
        System.out.println("Esse É Um Rpg Bem Basico E De Texto, Que Eu Fiz Como Trabalho Da Faculdade");
        System.out.println("Vamos Criar Seu Personagem");
        scan.nextLine();
        NomesNpcs();
        scan.nextLine();
        Nome();
        scan.nextLine();
        inhistoria();
        scan.nextLine();
        racas();
        scan.nextLine();
        familias();
        scan.nextLine();
        objetos();
        scan.nextLine();
        magias();
        while(continuar == 1)
        {
                     
            Historia();
            
            System.out.println("Fim Da Batalha, Deseja Repetir? (1) Para Sim (2) Para Não");
            continuar = scan.nextInt();
        }
    }
    
     public static void magias(){
        
        String[] Magias = { "Escuridão", "Eletricidade", "Fogo", "Terra", "Ar", "Luz" };
        String MagiasRnd = Magias[new Random().nextInt(Magias.length)];
        
        System.out.println("Sua Magia É: " + MagiasRnd);
        Receber1(MagiasRnd);
        
    }
      public static void Nome()
    {
        
        String Nome;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite O Nome Do Personagem");
        Nome = scan.nextLine();
        Receber2(Nome);
        
    }
       public static void objetos(){
        String[] Objetos = { "Espada E Escudo", "Escudo Grande", "Picareta", "Martelo", "Faca Afiada", "Nada", "Espada Grande" };
        String ObjetosRnd = Objetos[new Random().nextInt(Objetos.length)];
        
        System.out.println("Voce Iniciarar Com: " + ObjetosRnd);
        
        Receber3(ObjetosRnd);
         
    }
      public static void familias()
    {
        
        String[] Familias = { "Família Simmons", "Família Grindelwald", "Família Asknes", "Família Black", "Família Hale", "Família Ctulhu", "Família Borgers" };
        String FamiliasRnd = Familias[new Random().nextInt(Familias.length)];
        int din[] = {10, 20 ,30, 50, 60, 100, 200, 300, 500};
        int dinheiro = din[new Random().nextInt(din.length)];
               
        System.out.println("Sua Familia É: " + FamiliasRnd + "\n" + "Dinheiro: " + dinheiro);
        Familia = FamiliasRnd;
        Receber5(dinheiro);
        Receber4(FamiliasRnd);
        
    } 
     public static void NomesNpcs(){
        
        String[] Nomes = { "Armstrong", "Maximilian", "Adônis", "Ícarus", "Hélio", "Zeus" };
        String NomesRnd = Nomes[new Random().nextInt(Nomes.length)];
                
        Receber6(NomesRnd);
        
    }
        public static void inhistoria(){
        String[] historias = { "Historia Feliz", "Historia Miserável"};
        String historiasrnd = historias[new Random().nextInt(historias.length)];
        
        if(historiasrnd == "Historia Feliz"){
            System.out.println(Nome + " Voce Era Um Nobre, Que Sempre Teve Tudo Do Bom E Do Melhor, Mais Cansou De Sempre Ganhar Tudo Na Mão E Partiu Em Uma Aventura");
            System.out.println("\nVoce Inicia Com Uma Armadura Melhor");
            Receber7("Historia Feliz");
        }
        else if (historiasrnd == "Historia Miserável"){
            System.out.println(Nome + " Voce Era Um Miserável, Seus Pais O Abandonaram Quando Era Criança E Voce Vivia De Migalhas E Restos, \n Todos Os Odiavam, Então Voce Entrou Para O Crime, Um Certo Dia Os Seus Companheiros Enganaram \nVoce E O Deixaram Para Morte, Mais Voce Teve Sorte Pela Primeira Vez \nNa Sua Vida E Conseguiu Sobreviver, Logo Em Seguida \nLargou A Vida Do Crime E Foi Em Busca De Alguma Forma De Ganhar Dinheiro ");
            System.out.println("\nVoce Inicia Sem Nada, Apenas Com Sua Sorte Negativa");
            Receber7("Historia Miserável");
        }
        
    }
    public static void Historia()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Um Estranho Aparece E Te Empurra");
        System.out.println("Voce Quer Agredir (1) Ou Ignorar(2)" );
        switch(scan.nextInt())
        {
            case 1:
                batalha();
                break;
            case 2:
                System.out.println("Voce Ignora o Sujeito E Segue Em Frente");
                break;
            default:
                System.out.println("Voce É Um Corno");
                break;
            
        }
       
    }
    public static void xp(){
      if(XP >= 100){
        System.out.println("Voce Upou De Lvl,  Todos Os Seus Atributos Seram Upados");
      }

    }
}

        
        




    
   

 
