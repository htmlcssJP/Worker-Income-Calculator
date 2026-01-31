# Worker Income Calculator - Java

Sistema para cálculo de pagamentos de funcionários baseado em contratos por hora. O projeto foi desenvolvido para praticar conceitos essenciais de Programação Orientada a Objetos e lógica de negócios em Java.

## Tecnologias e Conceitos Utilizados

* **Java** (JDK 17+)
* **Composição de Objetos:** Implementação da associação entre as classes Trabalhador, Departamento e Contratos.
* **Enumerações (Enum):** Definição de constantes para os níveis de senioridade (Junior, Mid, Senior).
* **Manipulação de Datas:** Utilização de `Calendar` e `SimpleDateFormat` para processamento de períodos.

## Funcionamento

O programa recebe os dados do funcionário, o departamento e a quantidade de contratos associados. Com base na data, valor por hora e duração de cada contrato, o sistema calcula o rendimento total para um mês e ano específicos inseridos pelo usuário.

### Exemplo de Uso

```text
Digite o nome do departamento: Development
Digite os dados do trabalhador:
Nome: João
Nível: MID_LEVEL
Salário base: 1200.00
...
Salário em 02/2026: 3000.00
