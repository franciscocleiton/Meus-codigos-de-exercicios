num = int(input('Digite um número: '))
cont = 1
contador = 0

for cont in range(cont, num+1):
    if num % cont == 0:
        contador = contador + 1

if contador == 2:
    print('O número {} é primo!\n'.format(num))
else:
    print('O número {} não é primo!\n'.format(num))
