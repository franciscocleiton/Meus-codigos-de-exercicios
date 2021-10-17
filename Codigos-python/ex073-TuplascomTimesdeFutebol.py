# Crie uma tupla preenchida com os 20 primeiros colocados da Tabela do Campeonato Brasileiro de Futebol, na ordem de colocação. Depois mostre:
# A) Apenas os 5 primeiros colocados.
# B) Os últimos 4 colocados da tabela
# C) Uma lista com os times em ordem Alfabética
# D) Em que posição está o time da Chapecoense

time = ('Atlético MG', 'Palmeiras', 'Flamengo', 'Fortaleza', 'Bragantino', 'Corinthians', 'Internacional', 'Fluminense', 'Atlético PR', 'Atlético GO', 'Cuiabá', 'Ceará SC', 'São Paulo', 'América MG', 'Juventudo', 'Santos', 'Baiha', 'Grêmio', 'Sport Recife', 'Chapecoense')

print(f'Lista de times do Brasileirão: {time}')
print('-='*20)
print(f'Os 5 primeiros são: {time[:5]}')
print('-='*20)
print(f'Os 4 últimos são: {time[15:]}')
print('-='*20)
print(sorted(time))
print('-='*20)
print('')
