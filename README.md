# Criptografia de Palavras

## Contextualização

Neste projeto, temos o objetivo de criar uma função para criptografar palavras ou frases de acordo com regras específicas.

**Regras**:

1. O primeiro caractere da palavra é convertido para o seu código ASCII.
2. O segundo caractere da palavra é trocado com o último caractere.

**Exemplo**:

- `encryptThis("Hello")` retornará '72olle'

## Pré-requisitos

- JDK 8+ instalado
- Maven instalado

## Estrutura do Projeto

O projeto segue a convenção padrão do Maven:

- `src/main/java/`: Contém a implementação da função `encryptThis`.
- `src/test/java/`: Contém os testes unitários para a função `encryptThis`.

## Como Executar os Testes

1. Clone o repositório.
2. Abra um terminal ou prompt de comando.
3. Navegue até a pasta raiz do projeto relacionado à criptografia de palavras.
4. Execute o seguinte comando para rodar os testes:
```bash
mvn clean test
