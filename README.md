# Simulación de listas con Java Swing

Aplicación de escritorio de Manejo e Implementación de Archivos que presenta operaciones de una simulación de listas mediante una interfaz Swing. Incluye fuentes Java, formulario y proyecto Maven.

## Requisitos

JDK 23 y Maven, según maven.compiler.release del pom.xml. Requiere escritorio gráfico.

## Ejecución

Los comandos parten de la raíz del repositorio, salvo donde se indica otra terminal.

```bash
cd SimulacionListas_MIA
mvn compile
mvn org.codehaus.mojo:exec-maven-plugin:3.5.0:java
```

## Recorrido de demostración

La clase com.mycompany.simulacionlistas_mia.SimulacionListas_MIA inicia la aplicación. Explorar las operaciones de la ventana gui para observar la representación de los nodos.

## Organización

Carpetas de la entrega: [`SimulacionListas_MIA/`](SimulacionListas_MIA/).

## Alcance y límites

Es una simulación académica acotada. No se presenta como un sistema de particionado físico ni como un gestor completo de discos.

## Contexto y licencia

Trabajo académico o de aprendizaje conservado en el portafolio de [Enner Mendizabal](https://github.com/Ennero). Los créditos de los trabajos en grupo se conservan en sus entregas y manuales.

Consultar [LICENSE](LICENSE) para la licencia de la raíz. Las dependencias y los componentes con avisos o licencias propios conservan sus condiciones.
