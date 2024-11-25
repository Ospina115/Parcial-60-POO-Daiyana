# Parcial-60-POO

Realice un ejercicio en Java que cree una clase para describir las características de los estudiantes de una institución educativa.

La clase estudiante debe contener el documento (int), el nombre (String), el promedio actual (double)  y los créditos aprobados (int).



Los datos deben ser recuperados de un archivo de texto llamado estudiantes.txt, que se adjunta en la actividad.

 

El archivo de texto, contiene la siguiente información:

 

102030;Juan Jerez;3.45;34

112233;Lina Luna;3.82;16

445566;Luis Lopez;4.21;36

708090;Pedro Perez;3.68;28

 

Construya la interfaz gráfica para actualizar el promedio y los créditos de cada estudiante almacenado. Para esto el programa debe pedir los datos del promedio obtenido en el semestre y los créditos aprobado en el semestre para cada estudiante. Con esos datos y los valores que tiene almacenado el objeto de cada estudiante aplicar la siguiente fórmula:

NuevoPromedio= ( (promedio * créditos) + (promedioSemestre * creditosSemestre)) / (créditos + creditosSemestre)

 

El número de créditos también se debe actualizar.

Una vez actualizados todos los datos, el programa debe mostrar la lista de todos los estudiantes ya con los datos actualizados.