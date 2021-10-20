#include <stdio.h>

int main() {
  	int num1, num2, cont, d, cont2;
  
  	printf("Testador de numeros primos\n");
  	printf("Digite o 1° numero: ");
  	scanf("%d", &num1);

  	printf("Digite o 2° numero: ");
  	scanf("%d", &num2);
  

  	printf("\nOs numeros primos sao: ");
  	for(cont = num1; cont<=num2; cont++){
    	cont2=0;
    	for(d=2 ; d<cont ; d++){
      	if(cont%d==0){
        	cont2++;
        	}
		}
    	if(cont2==0){
      		printf("%d; ", cont);
    	}
	}

  	return 0;
}
