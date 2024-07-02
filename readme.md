# Descripción del proyecto: V3
El juego "Tower Defense" es un videojuego de consola donde el jugador debe defender su base de
oleadas de enemigos colocando torres en lugares estratégicos del mapa. El proyecto incluirá el uso de
mocks, stubs y fakes para pruebas unitarias y de integración utilizando Mockito y pruebas de mutación.
Estructura del proyecto
Clases principales:

1. Microservicio de Juego (GameService): Maneja la lógica general del juego.
2. Microservicio de Mapa (MapService): Gestiona la representación y manipulación del mapa del juego.
3. Microservicio de Enemigos (EnemyService): Gestiona la creación y el comportamiento de los
enemigos.
4. Microservicio de Torres (TowerService): Gestiona la creación y el comportamiento de las torres.
5. Microservicio de Oleadas (WaveService): Maneja la lógica de las oleadas de enemigos.
6. Microservicio de Jugador (PlayerService): Representa al jugador y sus estadísticas.

Entrada y salida

Entrada:

- Comandos del usuario para colocar torres, iniciar oleadas, etc.
- Datos iniciales del mapa y configuración de juego.

Salida:

- Estado del juego después de cada comando.
- Puntuación y estado de salud de la base.

## Crear Dockerfile para cada microservicio

### Dockerfile para GameService

![alt text](image-2.png)

### Dockerfile para MapService

![alt text](image.png)

### Dockerfile para PlayerService
![alt text](image-3.png)
### Dockerfile para TowerService

### Dockerfile para WaveService
![alt text](image-4.png)
### Dockerfile para EnemyService

![alt text](image-1.png)

## Crear Docker Compose para microservicios

## Crear archivos de servicio para Kubernetes

## Aplicar los archivos de configuración en Kubernetes

###  GameService
kubectl apply -f game-deployment.yaml

![alt text](image-5.png)

kubectl apply -f game-service.yaml
![alt text](image-11.png)

### MapService
kubectl apply -f map-deployment.yaml
![alt text](image-6.png)

kubectl apply -f map-service.yaml

![alt text](image-12.png)

### PlayerService
kubectl apply -f player-deployment.yaml

![alt text](image-7.png)

kubectl apply -f player-service.yaml

![alt text](image-13.png)

### TowerService
kubectl apply -f tower-deployment.yaml

![alt text](image-8.png)

kubectl apply -f tower-service.yaml

![alt text](image-14.png)
### WaveService
kubectl apply -f wave-deployment.yaml
![alt text](image-9.png)

kubectl apply -f wave-service.yaml

![alt text](image-15.png)

### EnemyService
kubectl apply -f enemy-deployment.yaml
![alt text](image-10.png)

kubectl apply -f enemy-service.yaml

![alt text](image-16.png)

## Verificar el estado del despliegue

kubectl get pods

![alt text](image-17.png)

kubectl get services

![alt text](image-18.png)

## Implementación de pruebas

Usar mockito para pruebas unitarias y de integración

Clase de prueba con Mockito

![alt text](image-19.png)
## Configuración de Pitest en Gradle

![alt text](image-20.png)

### Ejecutar Pitest con Gradle

![alt text](image-21.png)

# Paso a paso para completar el proyecto
## 1. Preparación del entorno:
### Instalar Docker, Docker Compose y Minikube (o un clúster Kubernetes equivalente).

Verificamos la version de cada uno

![alt text](image-22.png)

## 2. Desarrollar los microservicios:
### Crear los archivos Java para cada microservicio (GameService, MapService, PlayerService,TowerService, WaveService).

- GameService

    ![alt text](image-23.png)

- MapService

    ![alt text](image-24.png)

- PlayerService

    ![alt text](image-25.png)

- TowerService

    ![alt text](image-26.png)

- WaveService

    ![alt text](image-27.png)

## 3. Configurar Docker:
### Crear un Dockerfile para cada microservicio.
- GameService

    ![alt text](image-28.png)

- MapService

    ![alt text](image-29.png)

- PlayerService

    ![alt text](image-30.png)

- TowerService

    ![alt text](image-31.png)

- WaveService

    ![alt text](image-32.png)
### Construir las imágenes Docker usando el comando docker build.
- GameService

    ![alt text](image-33.png)

- MapService

    ![alt text](image-34.png)

- PlayerService

    ![alt text](image-35.png)

- TowerService

    ![alt text](image-36.png)

- WaveService

    ![alt text](image-37.png)
    
## 4. Configurar Docker Compose:
### Crear un archivo docker-compose.yml para definir cómo los contenedores interactuarán entre sí.

docker-compose.yml

![alt text](image-38.png)

### Levantar los servicios definidos en Docker Compose usando docker-compose up.

![alt text](image-40.png)

## 5. Desplegar en Kubernetes:
### Crear archivos de despliegue (deployment.yaml) y servicio (service.yaml) para cada microservicio.

- GameService

    ![alt text](image-41.png)


- MapService

    ![alt text](image-42.png)

- PlayerService

   ![alt text](image-43.png)

- TowerService

    ![alt text](image-44.png)

- WaveService

    ![alt text](image-45.png)
    

###  Aplicar las configuraciones de Kubernetes usando kubectl apply.

- GameService

    ![alt text](image-49.png)

- MapService

    ![alt text](image-48.png)

- PlayerService

   ![alt text](image-50.png)

- TowerService

    ![alt text](image-47.png)

- WaveService

    ![alt text](image-46.png)


## 6. Verificar despliegue:
### Usar comandos kubectl para verificar que los pods y servicios estén funcionando correctamente (kubectl get pods, kubectl get services).

- kubectl get pods
    ![alt text](image-51.png)
- kubectl get services
    ![alt text](image-52.png)
## 7. Implementar pruebas:
### Escribir pruebas unitarias e integración usando Mockito.

- GameServiceTest

    ![alt text](image-55.png)

- MapServiceTest

    ![alt text](image-54.png)

- PlayerServiceTest

   ![alt text](image-56.png)

- TowerServiceTest

    ![alt text](image-57.png)

- WaveServiceTest
    ![alt text](image-53.png)
    

### Configurar y ejecutar pruebas de mutación para asegurar la robustez del código.

#### Configurar build.gradle
![alt text](image-58.png)

#### Resultado de las pruebas
![alt text](image-59.png)

#### Resultado de las pruebas corregidas
![alt text](image-60.png)