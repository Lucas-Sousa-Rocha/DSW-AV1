# 📊 Calculadora de IMC — DSW AV1

Este projeto é uma calculadora de IMC (Índice de Massa Corporal), desenvolvida como parte da Avaliação 2 da disciplina **Desenvolvimento de Sistemas para Web (DSW)**. O sistema foi construído utilizando **Java Servlet** e **HTML/CSS**, com foco em processar dados inseridos pelo usuário e apresentar o resultado diretamente no navegador.

---

## 🎯 Funcionalidades

- Tela inicial com navegação entre páginas
- Página de apresentação da equipe
- Formulário para cálculo do IMC
- Processamento dos dados via Servlet
- Cálculo do IMC com classificação automática
- Estilização com CSS

---

## 🧱 Tecnologias Utilizadas

- Java Servlet (Java EE)
- HTML5
- CSS3
- Apache Tomcat (para deploy)
- IDE recomendada: Eclipse ou NetBeans

---

## 📁 Estrutura de Pastas

DSW-AV2/
├── src/
│ └── servlets/
│ ├── IMC.java
│ └── IMCServlet.java
├── WebContent/
│ ├── css/
│ │ └── style.css
│ ├── index.html
│ ├── apresentacao.html
│ └── imc.html

yaml
Copiar
Editar

## 🚀 Como Executar o Projeto

1. **Importar o projeto na IDE**  
   Abra o Eclipse (ou NetBeans) e importe o projeto como um **Dynamic Web Project**.

2. **Configurar o servidor Tomcat**  
   Certifique-se de que o Apache Tomcat está instalado e configurado na IDE.

3. **Executar o projeto**  
   Clique com o botão direito no projeto → *Run on Server* → selecione o Tomcat.

4. **Acessar a aplicação**  
   Acesse no navegador:  
http://localhost:8080/DSW-AV2/

yaml
Copiar
Editar

---

## 📄 Descrição das Páginas

### 🔹 `index.html`
Página inicial com links para:
- Apresentação da equipe
- Calculadora de IMC

### 🔹 `apresentacao.html`
Exibe o nome e matrícula do integrante da equipe.

### 🔹 `imc.html`
Formulário onde o usuário informa **altura** e **peso**.

### 🔹 `IMCServlet.java`
Classe que recebe os dados do formulário e retorna uma página HTML com:
- Altura
- Peso
- Valor do IMC
- Classificação (ex: "Peso normal", "Sobrepeso"...)

### 🔹 `IMC.java`
Classe responsável por calcular o IMC e retornar o resultado/classificação.

---

## 📊 Fórmula do IMC

O cálculo é feito pela fórmula:

IMC = peso / (altura * altura)

yaml
Copiar
Editar

Classificação usada:

| Faixa de IMC      | Resultado        |
|-------------------|------------------|
| Menor que 18.5    | Abaixo do peso   |
| 18.5 a 24.9       | Peso normal      |
| 25 a 29.9         | Sobrepeso        |
| 30 ou mais        | Obesidade        |

---

## 👨‍💻 Autor

| Nome                 | Matrícula       |
|----------------------|-----------------|
| Lucas Sousa Da Rocha | 1-2022223361    |

---

## 📝 Licença

Este projeto é apenas para fins acadêmicos, conforme a avaliação da disciplina. Livre para estudo e aprendizado

