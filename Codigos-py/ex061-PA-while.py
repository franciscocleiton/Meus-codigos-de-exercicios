#Refaça o DESAFIO 051, lendo o primeiro termo e a razão de uma PA, 
# mostrando os 10 primeiros termos da progressão usando a estrutura while.

primeiro = int(input('Digite o primeiro elemento da PA: '))
razao = int(input('Digite a razão da PA: '))
próximo = primeiro
cont = 1
print('PA: {} -> '.format(primeiro), end='')

while cont < 10:
    próximo += razao
    print('{} -> '.format(próximo), end='')
    cont+=1
print('Acabou!')