# Practica5.2

### a) Los elementos que te has encontrado en UML y que tienen mapeo sobre conceptos orientados a objetos.

1. **Clases**  
   - **UML**: Rectángulo con nombre, atributos y métodos.  
   - **POO**: Clases en el código con propiedades y funciones.

2. **Atributos**  
   - **UML**: Propiedades con visibilidad (+, -, #).  
   - **POO**: Campos o propiedades (`public`, `private`, `protected`).

3. **Métodos**  
   - **UML**: Operaciones dentro de una clase.  
   - **POO**: Métodos que definen el comportamiento.

4. **Relaciones**  
   - **Asociación**: Relación "tiene un" (atributos).  
   - **Agregación**: Relación independiente (listas).  
   - **Composición**: Relación dependiente (contenedores).  
   - **Dependencia**: Uso temporal de otra clase.

5. **Herencia**  
   - **UML**: Flecha con triángulo (especialización).  
   - **POO**: Clases derivadas (`class Hijo : Padre`).

6. **Interfaces**  
   - **UML**: `<<interface>>`.  
   - **POO**: Interfaces implementadas por clases.

7. **Multiplicidad**  
   - **UML**: `1..*`, `0..1`.  
   - **POO**: Cardinalidad (`List`, opcional con `null`).

8. **Clases abstractas**  
   - **UML**: Nombre en cursiva.  
   - **POO**: Clases que no se instancian directamente.

9. **Paquetes**  
   - **UML**: Agrupación de clases.  
   - **POO**: `package` o `namespace`.

10. **Mensajes (Secuencia)**  
   - **UML**: Flechas entre objetos.  
   - **POO**: Llamadas a métodos entre instancias.



### b) Herramienta utilizada para generar el diagrama UML

He utilizado Lucidchart, una plataforma online para crear diagramas técnicos, incluidos UML.

¿Por qué elegir Lucidchart?

- Facilidad de uso: Tiene una interfaz intuitiva y permite editar el diagrama directamente.

- Colaboración: Permite trabajar de manera colaborativa en tiempo real, lo cual es útil para equipos.

- Compatibilidad con estándares: Sigue las normas de UML para asegurar que los diagramas sean correctos y comprensibles.

- Versatilidad: Soporta varios formatos (UML, ERD, flujos de procesos), haciéndolo flexible.

### c) Explicación sobre la conversión del diagrama UML al código, explicando las decisiones que has tomado. No tiene porque ser el codigo completo, pero si un esquema de lo que podría llegar a ser. 


### **1. Clases y Atributos**
   - **Decisión**: Cada clase del diagrama UML se traduce a una clase en el código.  
   - Los atributos se implementan como propiedades con su tipo y visibilidad.  
   - Si en el diagrama aparece `+` (público), lo convierto en `public`. Si es `-` (privado), lo traduzco como `private`.  

### **2. Relaciones entre Clases**
   - **Decisión**:  
     - Una **asociación** se traduce en que una clase tenga como atributo a otra clase.  
     - Si hay **multiplicidad**, implemento listas (`List` o `MutableList`) para relaciones `1..*` o `0..*`.  


### **3. Métodos**
   - **Decisión**: Las operaciones del diagrama UML se traducen a métodos en el código.  
   - Uso la visibilidad definida en el diagrama. Si no está especificada, asumo `public`.


### **4. Herencia**
   - **Decisión**: Si una clase tiene una relación de herencia (flecha con triángulo), la implemento con el mecanismo de herencia del lenguaje (`open` y `: ClasePadre`).  
   - Las clases abstractas (`nombre en cursiva`) se traducen como `abstract`.


### **5. Interfaces**
   - **Decisión**: Si una clase implementa una interfaz (`<<interface>>`), traduzco eso al uso de `interface` y hago que las clases la implementen.


### **6. Composición y Agregación**
   - **Decisión**:  
     - Si el diagrama indica **composición** (rombo relleno), implemento una relación donde el objeto contenido depende del contenedor y no puede existir sin él.  
     - Para **agregación** (rombo vacío), los objetos pueden existir independientemente.  

### **7. Métodos de gestión de relaciones**
   - **Decisión**: Cuando se necesita manipular una relación (como agregar o quitar elementos en una lista), implemento métodos auxiliares.


### **8. Multiplicidad y Opcionalidad**
   - **Decisión**:  
     - Si la multiplicidad es `0..1`, implemento una propiedad que puede ser `null` (tipo opcional).  
     - Si es `*` o `1..*`, uso una colección (`List` o `MutableList`).

