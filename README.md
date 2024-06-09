# Koch Snowflake

Este é um programa Java que desenha um floco de neve de Koch usando a biblioteca gráfica Swing.

## Descrição

O floco de neve de Koch é uma curva fractal que pode ser gerada recursivamente. A profundidade da curva determina o número de iterações usadas para desenhar o floco de neve. Cada iteração divide os segmentos da curva em três partes iguais.

O código utiliza a classe `JPanel` para criar um painel onde o floco de neve será desenhado. A classe `FlocoDeKoch` herda dessa classe e sobrescreve o método `paintComponent(Graphics g)` para desenhar o floco de neve utilizando o objeto `Graphics` fornecido. O método `drawSnowflake` é responsável por desenhar os segmentos do floco de neve recursivamente.

## Como usar

1. Certifique-se de ter o JDK (Java Development Kit) instalado no seu sistema.
2. Clone ou faça o download deste repositório.
```bash
git clone https://github.com/igorpdm/Koch-Snowflake.git
```
3. Abra o terminal ou prompt de comando e navegue até o diretório onde o código está localizado.
4. Compile o código executando o seguinte comando:
```bash
javac FlocoDeKoch.java.
```
5. Execute o programa com o comando:
```bash
java FlocoDeKoch.
```
6. Uma janela será aberta mostrando o floco de neve de Koch desenhado.

## Personalização

Você pode personalizar o programa alterando os seguintes parâmetros:

- `depth`: Define a profundidade da curva de Koch, ou seja, o número de iterações para desenhar o floco de neve. Você pode modificar o valor passado para o construtor `FlocoDeKoch` no método `main` para alterar a profundidade.

- `frame.setSize(600, 600)`: Define o tamanho da janela onde o floco de neve será exibido. Você pode alterar os valores para personalizar o tamanho da janela.

- `frame.setBackground(Color.WHITE)`: Define a cor de fundo da janela. Você pode alterar o valor para outras cores disponíveis na classe `Color` ou usar valores RGB personalizados.

