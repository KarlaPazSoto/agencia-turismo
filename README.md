# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación Java desarrollada utilizando Programación Orientada a Objetos (POO) para representar personas vinculadas a una agencia de turismo.

El sistema permite modelar clientes y guías turísticos mediante herencia, asociar direcciones mediante composición y validar datos de entrada utilizando excepciones personalizadas.

Este proyecto corresponde a la evaluación Sumativa 1 de la asignatura.

---

## Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Programación Orientada a Objetos (POO)
- Git y GitHub

---

## Estructura del proyecto

```text
src
│
├── app
│   └── Main.java
│
├── model
│   ├── Direccion.java
│   ├── Persona.java
│   ├── Cliente.java
│   └── GuiaTuristico.java
│
└── utils
    ├── ValidacionException.java
    └── Validador.java
```

---

## Clases implementadas

### Persona
Clase base que representa una persona dentro del sistema.

### Direccion
Clase utilizada mediante composición para almacenar la dirección de una persona.

### Cliente
Clase que hereda de Persona y representa a un cliente de la agencia.

### GuiaTuristico
Clase que hereda de Persona y representa a un guía turístico.

### Validador
Clase utilitaria encargada de validar datos como:
- Campos vacíos.
- Formato de RUT.
- Números positivos.

### ValidacionException
Excepción personalizada utilizada para informar errores de validación.

---

## Relaciones entre clases

### Herencia

```text
Persona
├── Cliente
└── GuiaTuristico
```

### Composición

```text
Persona
└── Direccion
```

Cada persona posee una dirección asociada.

---

## Instrucciones de compilación y ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el SDK de Java esté configurado correctamente.
3. Abrir la clase:

```java
app.Main
```

4. Ejecutar el método:

```java
public static void main(String[] args)
```

5. Observar la salida generada en la consola.

---

## Funcionalidades implementadas

- Encapsulamiento mediante atributos privados.
- Constructores parametrizados.
- Métodos getters y setters.
- Sobrescritura del método toString().
- Herencia entre clases.
- Composición entre objetos.
- Validaciones reutilizables.
- Excepciones personalizadas.
- Manejo de errores mediante try-catch.

---

## Autor

**Karla Paz Alejandra Soto Albornoz**