Actividad 06 - Sistema Biblioteca
---
Cuestionario

## ¿Para qué sirve `package`?

 Lo utilizamos para saber a qué paquete pertenece una clase y para organizar el código. Se indica siempre en la primera línea del archivo


## ¿Para qué sirve `import`?

Permite usar una clase de otro paquete sin escribir su ruta completa. No hace falta importar las clases del mismo paquete.

## ¿Qué relación hay entre paquete y directorio?

Cada paquete es una carpeta con su mismo nombre, y el archivo `.java` debe estar dentro de ella.

```
src/
├── app/
│   └── BibliotecaApp.java
├── modelo/
│   ├── Libro.java
│   ├── Ejemplar.java
│   └── EstadoEjemplar.java
└── servicio/
    └── Prestamo.java
```

Si el paquete es `com.biblioteca.modelo`, la carpeta será `com/biblioteca/modelo/`.

## ¿Qué es Javadoc?

Es una herramienta de Java que convierte ciertos comentarios del código en documentación web. También hace que el IDE muestre la descripción al pasar el cursor sobre un método.

Las etiquetas más usadas son `@param`, `@return`, `@throws`, `@author`.

## Diferencia entre `//` y `/** ... */`

Cada comentario es de una sola línea y sirve para notas rápidas dentro del código.
`/** ... */` Javadoc es documentación que se genera en HTML

La diferencia es que solo Javadoc usa el último para crear documentación, y debe ir justo antes de la clase o método que describe.
