#include <stdio.h>

int main() {

 int id;
 float consumo;
 float vt;
  
  printf("ID do cliente: ");
  scanf("%d", &id);
  printf("Consumo do cliente (em KW/h): ");
  scanf("%f", &consumo);

  if(consumo<=199){
    vt = consumo * 1.20;
    printf("\n===Tabela de Consumo===\n");
    printf("ID do cliente: %d\n \n", id);
    printf("Consumo Mensal: %0.1fKW/h\n \n", consumo);
    printf("Valor total: R$: %0.2f\n", vt);
  }
  else{
    if(consumo>=200&&consumo<=399){
      vt = consumo * 1.50;
      printf("\n===Tabela de Consumo===\n");
      printf("ID do cliente: %d\n \n", id);
      printf("Consumo Mensal: %0.1fKW/h\n \n", consumo);
      printf("Valor total: R$: %0.2f\n", vt);
    }
    else{
      if(consumo>=400&&consumo<=599){
      vt = consumo * 1.80;
      printf("\n===Tabela de Consumo===\n");
      printf("ID do cliente: %d\n \n", id);
      printf("Consumo Mensal: %0.1fKW/h\n \n", consumo);
      printf("Valor total: R$: %0.2f\n", vt);
      }
      else{
        if(consumo>=600){
          vt = consumo * 2;
          printf("\n===Tabela de Consumo===\n");
          printf("ID do cliente: %d\n \n", id);
          printf("Consumo Mensal: %0.1fKW/h\n \n", consumo);
          printf("Valor total: R$: %0.2f\n", vt);
        }
      }
    }
  }
  return 0;
}
