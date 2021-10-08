cont = 0
soma = 0
for cont in range(cont, 6):
    num = int(input('Digite um valor: '))
    if num % 2 == 0:
        #print('{} + '.format(num), end='')
        soma += num
print('\nSoma: {}'.format(soma))
