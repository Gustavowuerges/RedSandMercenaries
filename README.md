# RedSandMercenaries

🧾 RESUMO GERAL — Red Sand Mercenaries

Red Sand Mercenaries é um RPG textual em Java com foco em:

Mundo semiaberto com cidades e regiões exploráveis

Sistema de facções e reputação

Aliados mercenários com falas e personalidades únicas

Missões principais (main quest) e secundárias (sidequests)

Interações em bares, becos, templos, mercados

Navegação por comandos (norte, sul, entrar, conversar, salvar, etc.)

Eventos randômicos e combate baseado em classes

🌍 MUNDO E MAPA

Overworld: Matriz representando o mapa geral (deserto, cidades, ruínas)

Cidades: Cada cidade tem seu próprio mini-mapa (matriz 3x3, 5x5, etc.)

Interiores: Salas internas como bares ou templos também têm seus mapas (1x1 ou 2x2)

Movimentação: por comandos (ir norte, ir sul, etc.)
Transições: mudar de mapa ao entrar/sair de locais específicos

🧭 SALAS E EVENTOS

Cada sala tem:

Nome

Descrição

Tipo (nobre, pobre, comercial, templo, etc.)

Eventos aleatórios por tipo (ex: chance de assalto em áreas pobres)

Eventos únicos (opcionais)

🧠 ALIADOS (PARTY SYSTEM)

Você pode recrutar mercenários

Cada um tem:

Classe (guerreiro, ladino, mago, etc.)

Personalidade e falas únicas

Reações diferentes a missões ou decisões

Influenciam combate e diálogos

🗡️ CLASSES E COMBATE

Classes definem atributos e habilidades

Combate textual com comandos (atacar, usar habilidade, etc.)

Inimigos com IA simples (aleatória ou baseada em padrões)

📜 MISSÕES
Main Quest:

História central (ex: reunir aliados, enfrentar ameaça principal)

Sidequests:

Geradas aleatoriamente ou fixas

Tipos: escolta, entrega, investigação, caça, sabotagem

Ligadas a facções (ganha reputação)

🛡️ FACÇÕES

Nome, descrição, objetivos

Reputação com jogador (0 a 100+)

Benefícios por reputação:

Itens exclusivos

Diálogos únicos

Missões de elite

Aliados especiais

💾 SALVAR E CARREGAR PROGRESSO
Métodos possíveis:
Método	Ideal para você?	Observações
Arquivo .json (com Gson)	✅ Sim	Simples, organizado
Serialização (.dat)	Opcional	Binário, não legível manualmente
Banco de dados	❌ Não por agora	Complexo, desnecessário
✅ REQUISITOS TÉCNICOS PARA CRIAR O JOGO
Linguagem e Estrutura

Java (console/textual)

Organização em pacotes (ex: mapa, personagens, missao, util)

Classes principais:

Sala – Representa cada local no mapa

Jogador – Contém posição, inventário, reputação, etc.

Aliado – Classe base para personagens recrutáveis

Missao – Representa missões (tipo, facção, status)

Faccoes – Controla reputações

GerenciadorDeMapa – Cuida de qual mapa está ativo e navegação

Jogo – Loop principal e comandos do jogador

SistemaDeSave – Salvar/carregar dados em JSON

Funcionalidades mínimas:

 Navegação por texto

 Sistema de mapas (overworld, cidade, interiores)

 Descrições e eventos por área

 Party system (aliados com classes)

 Missões principais e secundárias

 Facções com reputação

 Salvar e carregar progresso (JSON)

💡 SUGESTÃO DE PASSOS PARA COMEÇAR

✅ Criar o mapa overworld e pelo menos 1 cidade com 3 áreas

✅ Implementar navegação entre locais

✅ Criar o sistema de Sala com eventos por tipo

✅ Implementar o jogador e aliados básicos

✅ Criar estrutura de missões simples (estáticas)

✅ Adicionar sistema de facções com reputação

✅ Criar gerador de sidequests aleatórias

✅ Adicionar salvamento e carregamento com JSON

🔜 Expansão: combate, inventário, escolhas morais, etc.
