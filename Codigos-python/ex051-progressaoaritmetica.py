cont = 1
primeiro = int(input('Digite o primeiro elemento da PA: '))
razao = int(input('Digite a razão da PA: '))
próximo = primeiro

print('PA: {} -> '.format(primeiro), end='')
for cont in range(cont, 10):
    próximo += razao
    print('{} -> '.format(próximo), end='')
print('Acabou!')
