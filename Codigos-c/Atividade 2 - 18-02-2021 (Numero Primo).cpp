#include <stdio.h>

//Professor resolvi fazer com laço de repetição for!

int main() {
  	int num, d, contador;
  
  	printf("Digite um numero para ser testado: ");
  	scanf("%d", &num);

  	contador = 0;

  	for(d = 2; d < num; d++){
  	  if(num % d == 0){
      	contador++;
    	}

  	}

    if(contador == 0){
      printf("O numero %d e primo!", num);
    }
    else{
      printf("O numero %d nao e primo!", num);
    }

  	return 0;
}
