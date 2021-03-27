# boot-oauth2-password-resource-server
Resource Server chamando Authorization server para validar token 

Collection PostMan no diretorio : src/main/resources/collection_postman



URL GET : http://localhost:9090/test
```
Header 
    Authorization : Bearer 0a23fb2e-2c1d-4450-a9e1-e5b759880d99
``` 

Passar token do retorno ao serviço "oauth/token"

```
Resposta :
    Hello World
```


URL GET : http://localhost:9090/whoami

```
Header 
    Authorization : Bearer 0a23fb2e-2c1d-4450-a9e1-e5b759880d99
``` 

Passar token do retorno ao serviço "oauth/token"


```
Resposta :
    javainuse-user
```



