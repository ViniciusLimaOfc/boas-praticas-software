# Boas Práticas e Controle de Versão

Atividade prática da disciplina de Manutenção e Configuração de Software.

## Estrutura do repositório

- `Sistema.java` — código original, mantido como referência do estado inicial (commit na `main`).
- `src/SistemaAcademico.java` — versão refatorada, criada na branch `melhoria-boas-praticas`.

## Questão final

**1. Qual era o principal problema do código original?**

O código concentrava toda a lógica em um único método `main`, sem separação de responsabilidades. Além disso, usava nomes de variáveis genéricos e não descritivos (`n`, `a`, `b`, `c`), o que dificulta a compreensão do propósito de cada dado sem a necessidade de ler todo o código com atenção. Não havia reuso possível: cálculo de média, verificação de situação e exibição de resultado estavam todos misturados.

**2. Quais melhorias você realizou?**

- Renomeei as variáveis para nomes autoexplicativos (`nomeAluno`, `notaPrimeiraAvaliacao`, `notaSegundaAvaliacao`, `media`, `situacao`).
- Dividi o programa em três métodos com responsabilidade única: `calcularMedia`, `verificarSituacao` e `exibirResultado`.
- Extraí o valor de média mínima para aprovação em uma constante (`MEDIA_MINIMA_APROVACAO`), evitando um "número mágico" solto no meio do código.
- Renomeei a classe de `Sistema` para `SistemaAcademico`, um nome mais específico sobre o domínio do sistema.
- Padronizei a indentação e adicionei comentários curtos (Javadoc) apenas onde agregam valor, sem poluir o código.

**3. Como a modularização facilitou a organização do código?**

Cada método passou a ter uma única responsabilidade clara: um cuida do cálculo, outro da regra de negócio (aprovação/reprovação) e outro da apresentação dos dados. Isso torna o código mais fácil de ler, testar e modificar — por exemplo, se a regra de aprovação mudar no futuro, basta alterar `verificarSituacao` sem mexer no restante do sistema. Também facilita a reutilização: `calcularMedia` poderia ser usado para qualquer par de notas, em qualquer contexto do sistema.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**

O Git permitiu registrar o histórico de evolução do código: um commit guardou o estado original do sistema, e a criação da branch `melhoria-boas-praticas` isolou as alterações de refatoração sem afetar a versão estável na `main`. Isso possibilita comparar as duas versões, reverter alterações se necessário, e revisar as mudanças através do Pull Request antes de integrá-las definitivamente com o merge. Ou seja, o Git tornou o processo de melhoria seguro, rastreável e reversível.
