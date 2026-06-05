public class Tutoria4 {
    
}

// operaciones aritmeticas + - * / %


// git comandos nuevo
// git init
// git add (. o nombre)
// git commit -m "mensaje"
// git remote add origin (url)
// git branch -M (nombre)
// git push -u origin (nombre)

// git comandos para actualizar
// git add (. o nombre)
// git commit -m "mensaje"
// git push

//por si se hizo alguna actualizacion
// git pull = descarga y actualiza el repositorio local con los cambios del remoto
// git fetch = descarga los cambios del remoto pero no los aplica al repositorio local, se necesita hacer un merge para integrar los cambios descargados al repositorio local

// para forzar
// git push --force o git push -f = sobreescritura total del repositorio remoto con los cambios locales, se recomienda usarlo con precaucion ya que puede causar perdida de datos si no se usa correctamente

// descartando los cambios locales
// git fetch
// git reset --hard origin/main = descarta los cambios locales y actualiza el repositorio local con los cambios del remoto
// git fetch --all -- prune = forzando actualizacion pero sin tocar nuestro trabajo

// git diff = muestra las diferencias entre los archivos modificados y los archivos en el repositorio local, se puede usar para revisar los cambios antes de hacer un commit

// merge = proceso de combinar los cambios de dos ramas diferentes, se puede usar para integrar los cambios de una rama de desarrollo a la rama principal (main) o para integrar los cambios de una rama de características a la rama de desarrollo

// git checkout -b (nombre de la rama) = crea una nueva rama y cambia a esa rama
// git checkout main
// git merge feature
// git merge feature-branch

// cambiar de url
// git remote -v = muestra las url de los repositorios remotos configurados
// git remote set-url origin (nueva url) = cambia la url del repositorio remoto, se puede usar para actualizar la url si el repositorio remoto ha cambiado o si se ha movido a una nueva ubicación
// git remote -v

//eliminar una rama
// git branch -d (nombre de la rama) = elimina una rama local, se recomienda
// eliminar una rama remota
// git push origin --delete (nombre de la rama) = elimina una rama remota,

// git rm nombre archivo o carpeta ( /Carpeta ) = elimina un archivo o carpeta del repositorio y del sistema de archivos
// git commit -m "mensaje" = confirmar de eliminacion del archivo o carpeta
// git push = subir los cambios al repositorio remoto
// git rm -f nombre archivo o carpeta = fuerza la eliminacion de un archivo o carpeta del repositorio y del sistema de archivos, se recomienda usarlo con precaucion ya que puede causar perdida de datos si no se usa correctamente
// git commit -m "mensaje" --amend = modificar el mensaje del ultimo commit, se recomienda usarlo con precaucion ya que puede causar problemas si el commit ya ha sido compartido con otros colaboradores, se recomienda usarlo solo para corregir errores menores en el mensaje del commit o para agregar cambios adicionales al ultimo commit antes de compartirlo con otros colaboradores.

// git switch main = cambiar a la rama main
// git switch -c feature = crear y cambiar a la rama feature

// git stach = guardar temporalmente los cambios no confirmados en una pila, se puede usar para cambiar de rama sin perder los cambios no confirmados, se puede recuperar los cambios guardados con git stash pop o git stash apply


package Modulo1;

public class Tutoria4 {
    public static void main(String[] args) {
        Persona obj = new Persona("Juan", 30);
        System.out.println("Nombre: " + obj.nombre);
    }
}

//

package com.ejemplo.Modulo2;

import com.ejemplo.Modulo1.Tutoria4;

public class Tutoria5 {
    public static void main(String[] args) {
        Persona obj = new Persona("Juan", 30);
        System.out.println("Nombre: " + obj.nombre);
    }
}

//com
//com.modulo1
//com.modulo1.tutoria4
//com.modulo1.calculadora
//com.modulo1.calculadora.logica
//com.modulo1.calculadora.ui