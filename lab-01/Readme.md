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



## Qual a diferença entre git merge e git rebase?