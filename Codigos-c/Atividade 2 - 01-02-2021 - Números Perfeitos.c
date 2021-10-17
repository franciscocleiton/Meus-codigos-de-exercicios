#include <stdio.h>

int main() {
	int num, divisor, num_perfeito;
  
	printf("Digite um numero: ");
	scanf("%d", &num);

  	num_perfeito = 0;
  	for(divisor = 1; divisor < num ; divisor++){
    	if(num % divisor == 0){
      	num_perfeito += divisor;
    	}
  	}

  	if(num == num_perfeito){
    	printf("O numero %d e um Numero Perfeito!\n", num);
  	}
  	else{
    	printf("O numero %d NAO e um Numero Perfeito!\n", num);
  	}
  	return 0;
}
