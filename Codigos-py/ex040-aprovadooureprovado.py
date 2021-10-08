n1 = float(input('Digite a nota 1: '))
n2 = float(input('Digite a nota 2: '))

media = float((n1+n2)/2)

print('A média do aluno foi: {},'.format(media), end=' ')
#resultado 
if media < 5:
    print('Aluno REPROVADO!\n')
elif media >= 5 and media < 7:
    print('Aluno em RECUPERAÇÃO!\n')
else:
    print('Aluno APROVADO!\n')
 