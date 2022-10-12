# SOLID

## Introdução
Quando se fala de:
- padrões de projetos de software, 
- princípios e boas práticas de desenvolvimento 
- e manutenção

As citações sobres **Clean Code** e os **Princípios SOLID** fazem presentes, sendo este ultimo, abordado neste projeto.

## O que é SOLID?
- É um acrônimo;
- Cinco princípios que fazem sentido para software orientado a objetos;
- Aplicados a qualquer linguagem OO;

```    
    S — Single Responsibility Principle (Princípio da responsabilidade única)

    O — Open-Closed Principle (Princípio Aberto-Fechado)

    L — Liskov Substitution Principle (Princípio da substituição de Liskov)

    I — Interface Segregation Principle (Princípio da Segregação da Interface)

    D — Dependency Inversion Principle (Princípio da inversão da dependência)
    
```

## SRP
- Uma classe deve ter um e apenas um motivo para mudar, o que significa que uma classe deve ter apenas uma função.

## OCP
- Os objetos ou entidades devem estar abertos para extensão, mas fechados para modificação.

## LSP
- Subclasses podem ser substituidas por suas subclasses (classes pai).

## ISP
- Um cliente (classe) nunca deve ser forçado a implementar uma interface que ele não usa, 
- ou os clientes (classes) não devem ser forçados a depender de métodos que não usam.

## DIP
- As entidades (classes) devem depender de abstrações, não de implementações. 
- Classe declara que o módulo de alto nível não deve depender do módulo de baixo nível, mas devem depender de abstrações.

## Porque utilizar?
- Projetos que aderem aos princípios SOLID, podem com um grau de facilidade maior, ser:
  - compartilhados, 
  - estendidos, 
  - modificados, 
  - testados, 
  - e refatorados;

## Referências
- [`DigitalOcean`](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design-pt)
- [`FullCycle`](https://fullcycle.com.br/solid-e-design-de-software-na-pratica/)
- [`resumindo-clean-code-architecture-e-solid-bernardo-rodrigues`](https://www.linkedin.com/pulse/resumindo-clean-code-architecture-e-solid-bernardo-rodrigues/?originalSubdomain=pt)