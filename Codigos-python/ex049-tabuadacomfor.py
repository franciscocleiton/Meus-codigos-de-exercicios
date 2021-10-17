tab = int(input('Digite um número para ver sua tabuada: '))
print('-='*7)
for c in range(1, 11):
    print('{} x {:2} = {}'.format(tab, c, tab*c))
print('-='*7)
