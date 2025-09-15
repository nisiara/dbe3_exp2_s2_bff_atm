# Desarrollo Backend 3 | Exp2-S2


## Objetivo del proyecto

En este proyecto de la semana 2 de la experiencia 2 implementa un Backend for Frontend (BFF) con Spring Boot.


Este repositorio en particular representa en BFF que tiene los servicios que entregan la información epecífica para cajeros automáticos, por lo que además, consta autenticación y un endpoint que requiere HTTPS.


## 🛠️ Requisitos
- Java 21
- Maven 4.0
- HTTPS Certificate
- Dependencias
  - Spring Security
  - Spring Web
  - Open Feign
  - Spring Boot Dev Tools
  - Lomkok


## 💾 Base de datos

#### La base de datos es de Oracle Cloud.


## 📡 API Reference

#### Endpoint Transacciones
Válida que las transacciones sean de tipo 'valid'. Retorna el id, fecha, monto y tipo de transacción.
- username: user
- password: password

```bash
curl -k -X GET https://localhost:8443/api/atm-mobile/valid-transaction --user "user:password"
```

## 🔗 Link
[![Github](https://img.shields.io/badge/github-000000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/nisiara/dbe3_exp2_s2_bff_atm.git)