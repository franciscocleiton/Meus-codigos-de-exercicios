// Será considerado que será realizado apenas um voo por dia dia em cada aviao 

// Será usado uma matriz onde teremos os dias do ano e as vagas

// Será baseado no calendário de 2022

import java.util.Scanner;

public class FranciscoCleiton_Testes {
    static FranciscoCleiton_Subclasse1 passageiroexecutivo[][][];
    
    static FranciscoCleiton_Subclasse2 passageiro185av1[][][];
    static FranciscoCleiton_Subclasse2 passageiro185av2[][][];

    static FranciscoCleiton_Subclasse2 passageiro195av1[][][];
    static FranciscoCleiton_Subclasse2 passageiro195av2[][][];

    static int dia = 30; // será considerado que todos os meses terão 30 dias para não complicar tanto o programa!
    static int vagasvooexec = 1;
    static int vagasvoo185 = 132;
    static int vagasvoo195 = 146;
    static int mes = 12;
    static int v185av1[][] , v185av2[][], v195av1[][], v195av2[][];

    public static void main(String[] args) {
        int escolha;
        Scanner entrada = new Scanner(System.in);
       
        int mes1, dia1;
        int t, k;
        int tipoav;
        String cpf, empresa;

        v185av1 = new int[mes][dia];
        v185av2 = new int[mes][dia];
        v195av1 = new int[mes][dia];
        v195av2 = new int[mes][dia];

        for (int i = 0; i < mes; i++) {
            for(int d = 0; d < dia; d++){
                v185av1[i][d] = 0;
                v185av2[i][d] = 0;
                v195av1[i][d] = 0;
                v195av2[i][d] = 0;
            }
        }
        
        FranciscoCleiton_Subclasse1 teste = new FranciscoCleiton_Subclasse1();
        FranciscoCleiton_Subclasse2 teste1 = new FranciscoCleiton_Subclasse2();

        passageiroexecutivo = new FranciscoCleiton_Subclasse1[mes][dia][vagasvooexec];
        for (int i = 0; i < mes; i++) {
            for(int d = 0; d < dia; d++){
                for (int j = 0; j < vagasvooexec; j++){
                    passageiroexecutivo[i][d][j] = new FranciscoCleiton_Subclasse1();
                    passageiroexecutivo[i][d][j].setStatus(0);
                }
            }
        }
        
        passageiro185av1 = new FranciscoCleiton_Subclasse2[mes][dia][vagasvoo185];
        for (int i = 0; i < mes; i++) {
           for (int d = 0; d < dia; d++) {
               for (int j = 0; j < vagasvoo185; j++) {
                   passageiro185av1[i][d][j] = new FranciscoCleiton_Subclasse2();
                   passageiro185av1[i][d][j].setStatus(0);
               }
           }
        }

        passageiro185av2 = new FranciscoCleiton_Subclasse2[mes][dia][vagasvoo185];
        for (int i = 0; i < mes; i++) {
           for (int d = 0; d < dia; d++) {
               for (int j = 0; j < vagasvoo185; j++) {
                   passageiro185av2[i][d][j] = new FranciscoCleiton_Subclasse2();
                   passageiro185av2[i][d][j].setStatus(0);
               }
           }
        }

        passageiro195av1 = new FranciscoCleiton_Subclasse2[mes][dia][vagasvoo195];
        for (int i = 0; i < mes; i++) {
           for (int d = 0; d < dia; d++) {
               for (int j = 0; j < vagasvoo195; j++) {
                   passageiro195av1[i][d][j] = new FranciscoCleiton_Subclasse2();
                   passageiro195av1[i][d][j].setStatus(0);
               }
           }
        }

        passageiro195av2 = new FranciscoCleiton_Subclasse2[mes][dia][vagasvoo195];
        for (int i = 0; i < mes; i++) {
           for (int d = 0; d < dia; d++) {
               for (int j = 0; j < vagasvoo195; j++) {
                   passageiro195av2[i][d][j] = new FranciscoCleiton_Subclasse2();
                   passageiro195av2[i][d][j].setStatus(0);
               }
           }
        }

        do {
            
            System.out.println("\nSistema de Aviação Francisco Cleiton");
            System.out.println("1 - Comprar passagem para voo");
            System.out.println("2 - Remarcar (Caso REMARQUE seu voo atual será cancelado e um novo agendando)");
            System.out.println("3 - Cancelar voo");
            System.out.println("0 - SAIR");
            System.out.print("Escolha: ");
            escolha = entrada.nextInt();

            switch(escolha) {
                case 1:

                    int tipo;
                    System.out.println("\nTipo de voo:");
                    System.out.println("1 - Voo Executivo: R$ 10000");
                    System.out.println("2 - Voo EB-185 Avião1: São Paulo R$1000");
                    System.out.println("3 - Voo EB-185 Avião2: Rio Grande do Sul R$1200");
                    System.out.println("4 - Voo EB-195 Avião1: Rio de Janeiro R$800");
                    System.out.println("5 - Voo EB-195 Avião2: Santa Catarina R$1000");
                    System.out.print("Escolha:");
                    tipo = entrada.nextInt();

                    switch(tipo){
                        case 1:
                            // Para simplificar, nos voos executivos só poderá ser alugado por uma empresa em um dia!
                            System.out.print("Digite o mes para voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia para voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;
                
                            teste.testvaga(dia1, mes1, 0, 0);
                            System.out.println(FranciscoCleiton_Subclasse1.v);
                            if (FranciscoCleiton_Subclasse1.v == 1) {
                                System.out.println("Vaga Indisponível");
                            }
                            else{
                                clearBuffer(entrada);// limpar buffer
                                System.out.print("Digite seu empresa: ");
                                passageiroexecutivo[t][k][0].setEmpresa(entrada.nextLine());

                                System.out.print("Digite o destino que os executivos irão: ");
                                passageiroexecutivo[t][k][0].setDestino(entrada.nextLine());

                                teste.vooexecutivo(dia1, mes1, 0); 
                                teste.comprovante(dia1, mes1, 0, 0);
                            }
                            break;
                    
                        case 2:
                            tipoav = 0;
                            System.out.print("Digite o mes para voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia para voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;
                
                            teste1.testvaga(dia1, mes1, v185av1[t][k], tipoav);
                            if (FranciscoCleiton_Subclasse2.s == 1) {
                                System.out.println("Vaga Indisponível");
                            }
                            else{
                                clearBuffer(entrada);// limpar buffer
                                System.out.print("Digite seu nome: ");
                                passageiro185av1[t][k][v185av1[t][k]].setNome(entrada.nextLine());

                                System.out.print("Digite seu CPF: ");
                                passageiro185av1[t][k][v185av1[t][k]].setCpf(entrada.nextLine());

                                System.out.print("Digite seu nacionalidade: ");
                                passageiro185av1[t][k][v185av1[t][k]].setNacionalidade(entrada.nextLine());

                                teste1.vooeb185(dia1, mes1, v185av1[t][k], tipoav); 
                                teste1.comprovante(dia1, mes1, v185av1[t][k], tipoav);
                                v185av1[t][k]++;
                            }
                            break;

                        case 3:
                            tipoav = 1;
                            System.out.print("Digite o mes para voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia para voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;
            
                            teste1.testvaga(dia1, mes1, v185av2[t][k], tipoav);
                            if (FranciscoCleiton_Subclasse2.s == 1) {
                                System.out.println("Vaga Indisponível");
                            }
                            else{
                                clearBuffer(entrada);// limpar buffer
                                System.out.print("Digite seu nome: ");
                                passageiro185av2[t][k][v185av2[t][k]].setNome(entrada.nextLine());

                                System.out.print("Digite seu CPF: ");
                                passageiro185av2[t][k][v185av2[t][k]].setCpf(entrada.nextLine());

                                System.out.print("Digite seu nacionalidade: ");
                                passageiro185av2[t][k][v185av2[t][k]].setNacionalidade(entrada.nextLine());

                                teste1.vooeb185(dia1, mes1, v185av2[t][k], tipoav); 
                                teste1.comprovante(dia1, mes1, v185av2[t][k], tipoav);
                                v185av2[t][k]++;
                            }
                            break;

                        case 4:
                            tipoav = 2;
                            System.out.print("Digite o mes para voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia para voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;
        
                            teste1.testvaga(dia1, mes1, v195av1[t][k], tipoav);
                            if (FranciscoCleiton_Subclasse2.s == 1) {
                                System.out.println("Vaga Indisponível");
                            }
                            else{
                                clearBuffer(entrada);// limpar buffer
                                System.out.print("Digite seu nome: ");
                                passageiro195av1[t][k][v195av1[t][k]].setNome(entrada.nextLine());

                                System.out.print("Digite seu CPF: ");
                                passageiro195av1[t][k][v195av1[t][k]].setCpf(entrada.nextLine());

                                System.out.print("Digite seu nacionalidade: ");
                                passageiro195av1[t][k][v195av1[t][k]].setNacionalidade(entrada.nextLine());

                                teste1.vooeb185(dia1, mes1, v195av1[t][k], tipoav); 
                                teste1.comprovante(dia1, mes1, v195av1[t][k], tipoav);
                                v195av1[t][k]++;
                            }
                            break;

                        case 5:
                            tipoav = 3;
                            System.out.print("Digite o mes para voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia para voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;
        
                            teste1.testvaga(dia1, mes1, v195av2[t][k], tipoav);
                            if (FranciscoCleiton_Subclasse2.s == 1) {
                                System.out.println("Vaga Indisponível");
                            }
                            else{
                                clearBuffer(entrada);// limpar buffer
                                System.out.print("Digite seu nome: ");
                                passageiro195av2[t][k][v195av2[t][k]].setNome(entrada.nextLine());

                                System.out.print("Digite seu CPF: ");
                                passageiro195av2[t][k][v195av2[t][k]].setCpf(entrada.nextLine());

                                System.out.print("Digite seu nacionalidade: ");
                                passageiro195av2[t][k][v195av2[t][k]].setNacionalidade(entrada.nextLine());

                                teste1.vooeb185(dia1, mes1, v195av2[t][k], tipoav); 
                                teste1.comprovante(dia1, mes1, v195av2[t][k], tipoav);
                                v195av2[t][k]++;
                            }
                            break;

                        

                        default:
                            System.out.println("Voo Indisponível");
                            break; 
                        }
                    break;
                
                case 2:
                    int remarque;
                    System.out.println("Primeiramente me informe qual voo deseja REMARCAR");
                    System.out.println("1 - Voo Executivo: R$ 10000");
                    System.out.println("2 - Voo EB-185 Avião1: São Paulo R$1000");
                    System.out.println("3 - Voo EB-185 Avião2: Rio Grande do Sul R$1200");
                    System.out.println("4 - Voo EB-195 Avião1: Rio de Janeiro R$800");
                    System.out.println("5 - Voo EB-195 Avião2: Santa Catarina R$1000");
                    System.out.print("Escolha:");
                    remarque = entrada.nextInt();

                    switch (remarque) {
                        case 1:
                            clearBuffer(entrada);// limpar buffer
                            System.out.print("Digite o nome da empresa: ");
                            empresa = entrada.nextLine();
                            
                            System.out.print("Digite o mes do voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste.cancelar(dia1, mes1, empresa, 0);
                            
                            System.out.print("Digite o mes do novo voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do novo voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste.testvaga(dia1, mes1, 0, 0);
                            System.out.println(FranciscoCleiton_Subclasse1.v);
                            if (FranciscoCleiton_Subclasse1.v == 1) {
                                System.out.println("Vaga Indisponível");
                            }
                            else{
                                clearBuffer(entrada);// limpar buffer
                                System.out.print("Digite seu empresa: ");
                                passageiroexecutivo[t][k][0].setEmpresa(entrada.nextLine());

                                System.out.print("Digite o destino que os executivos irão: ");
                                passageiroexecutivo[t][k][0].setDestino(entrada.nextLine());

                                teste.vooexecutivo(dia1, mes1, 0);
                                passageiro185av1[t][k][k].setStatus(2); 
                                teste.comprovante(dia1, mes1, 0, 0);
                            }
                            break;

                        case 2:
                            
                        case 3:

                        case 4:

                        case 5:

                        default:
                            System.out.println("Voo Indisponível");
                            break;
                    }
                    break;

                case 3:
                    int cancelvoo;
                    System.out.println("Primeiramente me informe qual voo deseja CANCELAR");
                    System.out.println("1 - Voo Executivo: R$ 10000");
                    System.out.println("2 - Voo EB-185 Avião1: São Paulo R$1000");
                    System.out.println("3 - Voo EB-185 Avião2: Rio Grande do Sul R$1200");
                    System.out.println("4 - Voo EB-195 Avião1: Rio de Janeiro R$800");
                    System.out.println("5 - Voo EB-195 Avião2: Santa Catarina R$1000");
                    System.out.print("Escolha:");
                    cancelvoo = entrada.nextInt();

                    switch(cancelvoo) {
                        case 1:
                            clearBuffer(entrada);// limpar buffer
                            System.out.print("Digite o nome da empresa: ");
                            empresa = entrada.nextLine();
                            
                            System.out.print("Digite o mes do voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste.cancelar(dia1, mes1, empresa, 0);
                            teste.comprovante(dia1, mes1, 0, 0);
                            break;

                        case 2:
                            tipoav = 0;
                            
                            clearBuffer(entrada);// limpar buffer
                            System.out.print("Digite seu CPF: ");
                            cpf = entrada.nextLine();
                            
                            System.out.print("Digite o mes do voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste1.cancelar(dia1, mes1, cpf, tipoav);
                            teste1.comprovante(dia1, mes1, FranciscoCleiton_Subclasse2.o, tipoav);
                            break;

                        case 3:
                            tipoav = 1;
                            
                            clearBuffer(entrada);// limpar buffer
                            System.out.print("Digite seu CPF: ");
                            cpf = entrada.nextLine();
                        
                            System.out.print("Digite o mes do voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste1.cancelar(dia1, mes1, cpf, tipoav);
                            teste1.comprovante(dia1, mes1, FranciscoCleiton_Subclasse2.o, tipoav);
                            break;

                        case 4:
                            tipoav = 2;
                            
                            clearBuffer(entrada);// limpar buffer
                            System.out.print("Digite seu CPF: ");
                            cpf = entrada.nextLine();
                            
                            System.out.print("Digite o mes do voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste1.cancelar(dia1, mes1, cpf, tipoav);
                            teste1.comprovante(dia1, mes1, FranciscoCleiton_Subclasse2.o, tipoav);
                            break;

                        case 5:
                            tipoav = 0;
                            
                            clearBuffer(entrada);// limpar buffer
                            System.out.print("Digite seu CPF: ");
                            cpf = entrada.nextLine();
                            
                            System.out.print("Digite o mes do voo:");
                            mes1 = entrada.nextInt();
                            t = mes1-1;

                            System.out.print("Digite o dia do voo:");
                            dia1 = entrada.nextInt();
                            k = dia1-1;

                            teste1.cancelar(dia1, mes1, cpf, tipoav);
                            teste1.comprovante(dia1, mes1, FranciscoCleiton_Subclasse2.o, tipoav);
                            break;

                        default:
                            System.out.println("Voo Indisponível");
                            break;
                    }
                    break;
                /*System.out.print("Digite seu nome: ");
                            passageiroexecutivo[mes1][dia1][vagasvooexec].setNome(entrada.nextLine());

                            System.out.print("Digite seu CPF: ");
                            passageiroexecutivo[mes1][dia1][vagasvooexec].setCpf(entrada.nextLine());

                            System.out.print("Digite seu nacionalidade: ");
                            passageiroexecutivo[mes1][dia1][vagasvooexec].setNacionalidade(entrada.nextLine());

                            System.out.print("Digite seu nome: ");
                            passageiroexecutivo[mes1][dia1][vagasvooexec].setNome(entrada.nextLine());

                            System.out.print("Digite seu nome: ");
                            passageiroexecutivo[mes1][dia1][vagasvooexec].setNome(entrada.nextLine());

                            teste.vooexecutivo(mes1, dia1);

                

                System.out.print("");

                System.out.print("");

                System.out.print("");*/

            }

    

        } while(escolha != 0);
    }

    private static void clearBuffer(Scanner entrada) {
        if (entrada.hasNextLine()) {
            entrada.nextLine();
        }
    }
}