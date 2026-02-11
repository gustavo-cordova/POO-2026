# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git

Antes de fazer commits no código, é necssário que o usuário registre seu **nome** e seu **e-mail** vinculado ao Github. Desta forma, o histórico do arquivo sempre irá mostrar a autoria do editor do código, evitando confusões e ajudando na organização de tarefas.

```bash
# Configurando usuário

git config --global user.name "Seu Nome"

git config --global user.email "Seu E-mail"
```

### Criando Personal Access Token (PAT) no GitHub

O PAT é uma chave de acesso pessoal utilizada pra autenticar ações no Git e Github, como um comando *git push*, por exemplo. O token tem caracteres variados, uma data de validade e é possível editar suas permissões. Por conta destas características, o token se mostra como uma alternativa mais segura que a senha comum, que há algum tempo não é mais aceita para autenticações no Git.

#### Configurando Personal Access Token

1. Acesse seu Github.
1. Clique na foto do seu usuário e entre em **Settings**.
1. Desça com o mouse até a última opção da barra esquerda e clique em **Developer Settings**.
1. Vá em **Personal access token**, depois em **Tokens (classic)** e clique na opção **Generate new token**, e selecione a opçãõ ***classic***.
1. Dê um nome qualquer ao token em **note**, defina uma **expiration date** e escolhas quais permissões atribuir para o token. * *Selecione pelo menos a permissão **repo***.
1. Desça com o mouse até o fim da página, clique em **Generate token** e PRONTO!

### Salvar em cache as credenciais do PAT

A principal motivação para salvar o Personal Access Token (PAT) em cache é a conveniência e produtividade, eliminando a necessidade de inserir credenciais longas e complexas a cada interação com o repositório (push, pull, clone) via linha de comando. Além disso, é muito mais seguro do que guardar o PAT em um texto simples, pois o cache utiliza ferramentas do sistema operacional para protegê-lo.

```bash
# Execute na linha de comando para salvar por 1 hora (3600 segundos)

git config --global credential.helper 'cache --timeout=3600'
```

## Qual a diferença entre git merge e git rebase?

A principal diferença é que o **git merge** salva o histórico da linha do tempo ao integrar os commits, deixando marcado a sequência cronoólogica exata da criação de branches ("os galhos são preservados").

Já o **git rebase** reescreve o histórico ao integrar os commits, fazendo com que tudo pareça ter sido feito em uma única linha ("os galhos são cortados, e todos os seus conteúdos se concentram no tronco principal").

### Quando usar:

- Use **git merge**: Quando precisar integrar branches de longa duração, manter o histórico preciso e seguro, ou em branches compartilhadas (ex: main ou develop).

- Use **git rebase**: Quando quiser manter um histórico limpo, linear e sem merges desnecessários, ideal para branches de funcionalidades (feature branches) curtas antes de enviá-las (push).