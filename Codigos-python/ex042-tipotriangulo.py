print('-='*20)
print('Analisador de Triangulo')
print('-='*20)

r1 = float(input('Primeiro segmento: '))
r2 = float(input('Segundo segmento: '))
r3 = float(input('Terceiro segmento: '))

if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2:
    print('Os segmentos acima PODEM FORMAR triângulo e', end=' ')
    if r1 == r2 == r3:
        print('o triângulo é EQUILÁTERO\n')
    elif r1 == r2 or r1 == r3 or r2 == r3:
        print('o triângulo é ISÓSCELES\n')   
    else:
        print('o triângulo é ESCALENO\n')    
else:
    print('Os segmentos NÃO PODEM FORMAR triângulo!\n')