cont = 1
soma = 0
n = 0
#print('A soma é: ', end='')
for cont in range(cont, 501):
    if cont % 2 != 0:
        if cont % 3 == 0:
            #print('{} + '.format(cont), end='')
            soma += cont
            n += 1

print('A soma dos {} valores solicitados é {}\n'.format(n, soma))
