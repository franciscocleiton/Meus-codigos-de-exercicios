#include <stdio.h>

int main() {
	int num1, fatorial;
  

  	printf("Digite um numero que deseja saber seu fatorial: ");
  	scanf("%d", &num1);
  
  	fatorial = 1;
  
  	while (num1 > 1){
  	  fatorial = fatorial * num1;
    	num1 = num1 - 1;
  	}
  
	printf ("O fatorial do numero e: %d", fatorial);

  	return 0;
}
