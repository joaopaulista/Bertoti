# 🛒 Sistema de E-commerce Multi-Pattern

Este projeto é uma demonstração de arquitetura de software avançada, combinando três padrões de projeto (**Composite**, **Strategy** e **Observer**) para criar um sistema de processamento de pedidos flexível, escalável e desacoplado.

O objetivo é simular um cenário real de E-commerce onde produtos podem ser vendidos individualmente ou em kits, preços variam conforme promoções, e diversos sistemas precisam ser notificados após a venda.

---

## 🏗 Arquitetura e Padrões Utilizados

O sistema foi desenhado para que os padrões trabalhem em harmonia, cada um resolvendo um problema específico:

### 1. Composite (Camada Model)
**Problema:** Necessidade de vender produtos avulsos e "Bundles" (Kits) que contêm vários produtos (ou outros kits).
**Solução:** Permite tratar objetos individuais (`SingleProduct`) e composições (`ProductBundle`) de maneira uniforme através da interface `IProductItem`. O preço de um kit é calculado recursivamente.

### 2. Strategy (Camada Controller)
**Problema:** As regras de precificação mudam frequentemente (Dia normal, Black Friday, Queima de Estoque).
**Solução:** Encapsula os algoritmos de cálculo de preço em classes separadas (`RegularPricing`, `BlackFridayPricing`). O contexto (`OrderContext`) delega o cálculo para a estratégia ativa, permitindo troca em tempo de execução.

### 3. Observer (Camada View/Notification)
**Problema:** Após processar um pedido, vários componentes precisam saber (Log, Interface do Usuário, Estoque, Envio de E-mail), sem acoplar a lógica de negócio a eles.
**Solução:** O `OrderNotifier` atua como sujeito. Quando um pedido é finalizado, ele notifica automaticamente todos os observadores (`LogDisplay`) registrados.

---

## 🎨 Diagrama UML Integrado

O diagrama abaixo ilustra como as classes se relacionam. As cores indicam a responsabilidade de cada padrão.

![UML](.\strategy_observer_composite\uml\uml-strategy-composite-observer.png)