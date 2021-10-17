# Crie um programa que tenha uma tupla com várias palavras (não usar acentos). Depois disso, você deve mostrar, para cada palavra, quais são as suas vogais.

palavras = ('casa', 'corinthians', 'sabado', 'janeiro', 'amor')

for p in palavras:
    print(f'Na palavra {p.upper()} temos ', end='')
    for l in p:
        if l.lower() in 'aeiou':
            print(l, end=' ')
    print('')
