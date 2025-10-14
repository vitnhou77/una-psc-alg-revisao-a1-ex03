# 🚀 Revisão Java: Análise de Risco Econômico (Vetores, Condicional e Repetição)

### Por que cada vez mais analistas falam em 'bolha' da inteligência artificial prestes a estourar

<p>
"Quando [a bolha] estourar, vai ser muito ruim, e não apenas para quem trabalha com IA", disse. "Vai arrastar o restante da economia junto."

Apesar das preocupações, alguns especialistas veem oportunidades. Na Stanford Graduate School of Business, que formou diversos empreendedores de tecnologia, a professora Anat Admati afirma que é difícil prever uma bolha e só é possível ter certeza após seu estouro.

"É muito difícil prever uma bolha. E você não pode afirmar com certeza que estava em uma até que ela tenha estourado", disse.
</p>

Fonte: https://www.bbc.com/portuguese/articles/cwypj4qxv90o <br>
Acesso em 2025/10/14

Este projeto é um exercício prático de revisão dos conceitos fundamentais de programação em Java, com foco em: **Vetores (`Arrays`), Estruturas Condicionais (`if`, `else`, `else if`) e Estruturas de Repetição (`for`, `for-each`).**

O contexto do exercício é baseado na análise de risco de uma "bolha" econômica, simulando a avaliação de risco feita por um grupo de analistas.

## 🎯 Objetivo do Exercício

O objetivo principal é que você demonstre a capacidade de utilizar as três estruturas listadas 
(Vetores, Condicionais e Repetição) de forma integrada para processar e analisar um conjunto de dados.

## 📋 Requisitos do Programa

Você deve criar uma única classe Java (ex: `ProcessadorRisco.java`) com o método `main` que atenda aos seguintes requisitos:

1.  **Vetor de Dados:**

      * Crie um vetor de inteiros (`int`) chamado `notasRisco` de tamanho **15**.
      * Preencha este vetor com notas de risco de $0$ a $100$ (pode ser preenchimento manual no código).

2.  **Cálculo de Média Ponderada (Usando `for` baseado em índice):**

      * Calcule a **Média Ponderada do Risco** com base na senioridade dos analistas:
          * Analistas $0$ a $4$ (Sêniores): **Peso 3**.
          * Analistas $5$ a $14$ (Juniores): **Peso 1**.
      * **Estrutura Obrigatória:** Use o laço **`for`** tradicional (com índice) para iterar sobre o vetor e calcular a média.

3.  **Contagem e Classificação (Usando `for-each` e `if`):**

      * Conte quantos analistas são "Otimistas" (nota $\leq 20$) e quantos são "Alarmantes" (nota $\geq 90$).
      * **Estruturas Obrigatórias:** Use o laço **`for-each`** para percorrer o vetor e estruturas **`if`** para realizar as contagens.

4.  **Parecer Final (Usando `if-else if-else`):**

      * Emita um parecer final sobre o setor com base na Média Ponderada calculada:
          * Média $> 70$: **"Alto Risco: Venda ou reajuste de portfólio recomendado."**
          * Média $\geq 40$ e $\leq 70$: **"Risco Moderado: Acompanhar de perto, mas manter os ativos."**
          * Média $< 40$: **"Baixo Risco: Excelente momento para capitalização."**
      * **Estrutura Obrigatória:** Use a estrutura **`if-else if-else`**.

## 💻 Como Entregar

1.  **Fork** este repositório para sua conta no GitHub.
2.  Crie um novo arquivo Java (ex: `ProcessadorRisco.java`) dentro da pasta `src` do seu repositório *forkado*.
3.  Implemente a solução atendendo a **todos** os requisitos e utilizando as estruturas obrigatórias.
4.  **Commite** suas alterações.

No seu Commit, inclua o código e a **saída do console (print ou texto)** gerada pelo seu programa.

## Exemplo de Saída Esperada

```
Processamento da Análise de Risco:
------------------------------------------
Média Ponderada do Risco: 58.75 (Exemplo)
Analistas Otimistas (Nota <= 20): 2
Analistas Alarmantes (Nota >= 90): 3
------------------------------------------
Parecer Final: Risco Moderado: Acompanhar de perto, mas manter os ativos.
```

**Bom trabalho e boa revisão\!** ☕