# Taller Heroku/SparkWeb

Aplicación web que permite el calculo de las desviación estandar y la media de un arreglo mediante la implementación de una LinkedList.

## Empezando

Pasos para necesarios para correr el programa 

### Prerrequisitos

#### Java
 Para correr el programa es necesario tener java instalado, para esta verificación ejecutamos en la linea de comandos

```
>java -version

java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)
```

#### Maven
El programa corre con maven, para comprobar si esta instalado desde la linea de comandos:

```
>mvn -v

Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T14:00:29-05:00)
Maven home: C:\Program Files\apache-maven-3.6.1\bin\..
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_181\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git
Para hacer el control de versiones es necesario github , para comprobar si esta instalado ejecutamos desde el cmd el comando:

```
> git --version

git version 2.21.0.windows.1
```

#### Heroku
La pagina web esta alojada en heroku, para comprobar si esta instalado y si podemos realizar el despliegue ejecutamos el siguiente comando:

```
> heroku -v

heroku/7.37.0 win32-x64 node-v12.13.0

```

### Instalación

Para instalar el repositorio se instala en la ruta deseada desde git de esta forma

```
> git clone https://github.com/mateu20/Laboratorio2Arep

```
Para compilar el proyecto desde maven:

```
> mvn package
```
## Corriendo el programa
Para ejecutar el programa desde la linea de comandos ejecutamos nuestro proyecto de la siguiente manera:
```
> mvn clean install
> heroku local web
>heroku login
>heroku git:remote -a warm-everglades-04140
>git add .
git commit -m "nombreDelCambio"
>git push origin master
>git push heroku master
```
Y finalmente para abrir la aplicacion utilizamos el comando
```
>heroku master
```


Ya dentro de nuestra pagina insertaremos una serie de numeros separados por un espacio.


## Corriendo los tests

Para correr los tests:

```
> mvn test
...
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running edu.escuelaing.arep.Estadisiticas.EstadisticasTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.031 sec - in edu.escuelaing.arep.Estadisiticas.EstadisticasTest
Running edu.escuelaing.arep.LinkedList.LinkedListTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec - in edu.escuelaing.arep.LinkedList.LinkedListTest

Results :

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.262 s
[INFO] Finished at: 2020-01-30T18:21:19-05:00
[INFO] ------------------------------------------------------------------------
```

El programa usa dos clases de test. LinkedListTest prueba el funcionamiento de la LinkedList y CalculatorTest prueba que la media y la desviación estandar se calculen de la forma adecuada.


## Authors

* **Mateo González**  - [mateu20](https://github.com/mateu20)

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details
