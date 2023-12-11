**Alunos**: Lucas Mendonça Sacchi, Eduardo Monteiro Costa Pires, Felipe Paiva, Thomaz 

<ins>*Como baixar e compilar o trabalho*</ins>:

<ins>Passo a passo</ins>: 
1. Entre no github
2. Acesse o repositório 
3. Clique em "< > Code" e selecione a opção "Download zip"
4. Extraia o arquivo 
5. Abra o folder no IntelliJ
6. Execução: Ctrl + Shift + F9

<ins>Explicação do código</ins>:
                 
Para maior organização do código, utilizamos parcialmente a ideia do padrão de projeto MVC. Dividimos em package controller e package model.

No package controller, criamos as classes ControladorJogo para criar as equipes e delimitar o tempo de jogo. O ControladorRobo é a classe
que irá controlar o Robo, com métodos como prospectar, mover, aterrisagem e verificarMovimentacao, prospectar chama todos os métodos de Robo
e extrai o Helio3 da célula em questão, mover é uma função que lê os dados do json dos robôs e movimenta de acordo com a regra estipulada na entrada de dados, 
aterrissagem é o posicionamento dos robôs, realiza checagem para garantir que não exista um robô na célula que o outro está tentando aterrissar, e verificar
movimentação é justamente checar se já existe um robô na célula que o respectivo robô deseja se movimentar. E a classe ControladorTerreno, que a princípio utilizava
leitura de texto com BufferedReader para testes e posteriormente mudamos para leitura de json com a bibliotecas Gson, onde encontrarmos problemas ao importar essas.
Essa classe realiza apenas leituras json.

Ela a princípio realizava leitura do erro, mas achamos mais adequado mover o atributo erro de leitura para a classe Robo, o que seria mais lógico, já que o robo que
percorre as células e ele pode vir a cometer falhas com seu equipamento. As informações lidas são usadas para criar uma instância da classe "Celula" e são adicionadas 
em uma lista de celulas. Nosso construtor mantém o controle do tamanho do terreno. Após toda a leitura, o construtor cria uma matriz terreno com as dimensões apropriadas 
com base nas coordenadas lidas. Além de possuirmos os getters e setters que facilitam a checagem das células e as modificações necessárias.

Ademais, o package model é composto pelas classes célula, equipe, robô e terreno. A classe célula majoritariamente detêm muitos atributos importantes para delimitação de terreno,
e possui muitos getters e setters, além de possuir o método isOcupada que colabora com a checagem. A classe robô detêm as funções principais de robo, como checar posição, também
checa concentração de hélio na célula, concentração de hélio no tanque do robô, checagem de rugosidade e tempo de prospecção. Além disso, a classe terreno inicializa a matriz com os valores
estipulados no json, e a classe Equipe possui um método para criação de robôs e uma lista de robôs para melhor gerenciamento, além de atributos como nome do robô.

E a main, que se chama Programa, onde inicializamos tudo e iniciamos o jogo.
