print('{:=^40}'.format('CLEYTON SUPERMERCADOS'))
valor = float(input('Digite o valor a ser pago: '))
tipo = str(input('Cartão ou dinhero/cheque: ')).lower().strip()

if tipo == 'cartão' or tipo == 'cartao':
    parcelas = int(input('Quantas vezes no cartão: '))
    if parcelas == 1:
        apagar = valor - ((valor * 5)/100)
        print('Você tem 5% de desconto, vai pagar R${:.2f}\n'.format(apagar))
    elif parcelas == 2:
        apagar = valor/2
        print('Você vai pagar 2 parcelas de R${:.2f}\n'.format(apagar))
    else:
        valor = valor + ((valor*20)/100)
        apagar = valor/parcelas
        print('Você pagar {} parcelas de R${:.2f}, valor total a pagar = R${:.2f}\n'.format(parcelas, apagar, valor))
elif tipo == 'dinheiro' or tipo == 'cheque':
    valor = valor - ((valor*10)/100)
    print('Com desconto de 10%, valor a pagar = R${}\n'.format(valor))
else:
    print('Pagamento indisponível\n')
