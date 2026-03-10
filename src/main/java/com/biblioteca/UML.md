# Diagrama UML - Proyecto Libro

## Clase Libro

-----------------------------
           Libro
-----------------------------
- titulo : String
- autor : String
- numEjemplares : int
- numPrestados : int
-----------------------------
+ Libro()
+ Libro(titulo, autor, numEjemplares, numPrestados)
+ getTitulo() : String
+ setTitulo(titulo:String)
+ getAutor() : String
+ setAutor(autor:String)
+ prestamo() : boolean
+ devolucion() : boolean
-----------------------------
Actualización UML - commit 2
