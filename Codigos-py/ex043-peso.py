peso = float(input('Digite seu peso (KG): '))
altura = float(input('Digite sua altura (m): '))
imc = peso / (altura ** 2)

print('Seu IMC é {:.1f} e está '.format(imc), end='')
if imc < 18.5:
    print('ABAIXO DO PESO\n')
elif 18.5 <= imc < 25:
    print('no PESO IDEAL\n')
elif 25 <= imc < 30:
    print('em SOBREPESO\n')
elif 30 <= imc < 40:
    print('em OBESIDADE\n')
else:
    print('em OBESIDADE MÓBIDA, cuidado!\n')
