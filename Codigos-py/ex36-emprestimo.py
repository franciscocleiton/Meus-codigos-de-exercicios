print('\nOlá, somos a CredEmprétimo!\nVamos lá saber se tem direito a financiomento!')
poss_cliente = str(input('Primeiro, digite seu nome: '))
valor = float(input('Agora, digite o valor da casa: '))
salario = float(input('Informe seu salário: '))
anos = int(input('Informe em quantos anos deseja quitar o financiamento: '))

#calculos
meses = anos * 12
parcelas = float(valor/meses)
val_sal = float((salario*30)/100)

#testar possibilidade de empréstimo
if anos >= 20:
    print('Infelizmente não podemos financiar sua casa!\nPois temos um prazo máximo de 20 anos')
    print('Tenha um bom dia {}\n '.format(poss_cliente))
elif parcelas <= val_sal:
    print('{} seu financiamento foi aprovado com {} parcelas de R${:.2f}!'.format(poss_cliente, meses, parcelas))
    print('Se dirija a nossa empresa!!!\n')
else:
    print('Infelizmente não podemos financiar sua casa!')
    print('Tenha um bom dia {}\n'.format(poss_cliente))
