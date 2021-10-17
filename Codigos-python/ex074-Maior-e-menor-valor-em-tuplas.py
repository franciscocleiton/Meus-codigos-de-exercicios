# Crie um programa em que vai gerar cinco números aleatórios e colocar em uma tupla
# Depois disso, mostre a listagem de números gerados e também indique o menor e o maior valor que estão na tupla
from random import randint
tupla = (randint(1, 10), randint(1, 10), randint(1, 10), randint(1, 10), randint(1, 10))

for c in range(0, 5):
    if c == 0:
        maior = tupla[c]
        menor = tupla[c]
    else:
        if tupla[c] > maior:
            maior = tupla[c]
        if tupla[c] < menor:
            menor = tupla[c]

print(f'Os valores sorteados foram: {tupla}')
print(f'O maior valor sorteado foi {maior}')
print(f'O menor valor sorteado foi {menor}')