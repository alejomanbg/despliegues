# DevOps Microservice

## Pasos para subir a GitLab

1. Inicia tu repositorio localmente:
   ```bash
   git init
   git add .
   git commit -m "Initial commit"
   ```
2. Crea un proyecto en GitLab y copia la URL del repo.
3. Añade el remoto y haz push:
   ```bash
   git remote add origin <GITLAB_URL>
   git push -u origin main
   ```

## Compilar y ejecutar localmente

```bash
mvn clean package
java -jar target/devops-microservice-0.0.1-SNAPSHOT.jar
```

## Endpoints

- `GET /api/resources` → Lista todos los registros de `devops_recursos`.
- `POST /api/cells`  → Inserta un registro en `devops_celulas`. JSON body:
  ```json
  {
    "numeroCedula": 1234567890,
    "idRequerimiento": 42
  }
  ```

## Docker

```bash
docker build -t devops-microservice .
docker run -p 8080:8080 devops-microservice
```
