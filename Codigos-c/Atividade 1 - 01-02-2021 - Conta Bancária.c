#include <stdio.h>
#include <stdlib.h>

int main() {
  float saldo = 0, deposito, saque;
  int opcao;

  do{
	system("cls");
    printf("\nMenu do Banco\n");
    printf("1 - Consultar Saldo\n");
    printf("2 - Fazer Deposito na Conta\n");
    printf("3 - Fazer um saque da Conta\n");
    printf("0 - Sair do Programa\n");
    printf("Digite a opcao desejada: ");
    scanf("%d", &opcao);
	system("cls");
    
  
   	switch(opcao){
    	case 1:
    		printf("Seu saldo: R$%.2f\n", saldo);
     		system("pause");
     		break;

    	case 2:
     		printf("Deseja depositar quanto em sua conta? R$");
     		scanf("%f", &deposito);
     		saldo += deposito;
     		printf("Deposito realizado com sucesso!\n");
     		system("pause");
     		break;
	
    	case 3:
    		if(saldo == 0){ //Esse if é para caso o cliente mão possuir saldo
       			printf("Você nao possui saldo para saque!\n");
       		}
     		else{
     			printf("Quanto deseja sacar? R$");
     			scanf("%f", &saque);

     			if(saque>saldo){ //Esse if é para caso o cliente tentar sacar mais do que possui em seu saldo
       			printf("Você nao possui esse saldo\n"); 
     			}
     			else{
     			saldo -= saque;
     			printf("Saque realizado com sucesso!\n");
     			}
		
    		}
    		system("pause");
    		
    		break;

    	case 0:
    		printf("Fim do Programa!\n");
    		system("pause");
    		break;

    	default:
    		printf("Opção indisponível, tente novamente!\n");
    		system("pause");
     		break;
  		}
	}while(opcao==1 || opcao==2 || opcao ==3 || opcao>3 || opcao<0);
 
	system("pause");
  return 0;
}
