import random

num = int(input('Digite um número de 0 a 5: '))

lista = [0, 1, 2, 3, 4, 5]
n = random.choice(lista)

if num == n:
    print('Você venceu, número escolhido: {}!\n'.format(n))
else:
    print('Você perdeu, o número correto é: {}!\n'.format(n))
