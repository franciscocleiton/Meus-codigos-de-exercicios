#include <stdio.h>

int main(void){
  	int fator1,fator2, contador, outrofator, num;

  	printf("Informe quantos termos quer ter em sua sequencia: ");
  	scanf("%d", &num);
  
  	fator1 = 0;
  	fator2 = 1;
  	printf("\nSequencia de Fibonacci\n");
  	for(contador = 1; contador <= num ; contador++){
    	printf("%d; ", fator1);
    	outrofator = fator1 + fator2;
    	fator1 = fator2;
    	fator2 = outrofator;
    }
  	return 0;
}
