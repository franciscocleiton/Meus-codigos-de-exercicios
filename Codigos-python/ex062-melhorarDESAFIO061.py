# Melhore o DESAFIO 061, perguntando para o usuário se ele quer 
# mostrar mais alguns termos. o programa deve encerrar quando 
# ele disser quer quer mostrar 0 termos

primeiro = int(input('Digite o primeiro elemento da PA: '))
razao = int(input('Digite a razão da PA: '))
próximo = primeiro
termos = 9
contadordetermos = 10

print('PA: {} -> '.format(primeiro), end='')

while termos != 0:
    próximo += razao
    print('{} -> '.format(próximo), end='')
    termos-=1
    
    if termos == 0:
        print('PAUSA')
        termos = int(input('Deseja mostrar mais quantos termos: '))
        contadordetermos += termos
    
print('Progressão finalizada com {} termos mostrados\n'.format(contadordetermos))
