# 📽️ MovieFlix

**MovieFlix** é uma aplicação fullstack construída com Spring Boot, React e React Native.  
O sistema permite que usuários autenticados visualizem e avaliem filmes, enquanto administradores podem gerenciar o catálogo.

---

## 🧰 Tecnologias utilizadas

### ✅ Backend
- Java 11
- Spring Boot
- Spring Security (OAuth2)
- JPA / Hibernate
- PostgreSQL

### ✅ Frontend Web
- React
- TypeScript
- Axios
- React Router

### ✅ Mobile
- React Native
- Expo
- Axios
- AsyncStorage

---

## 🚀 Funcionalidades

- Cadastro e login com autenticação OAuth2
- Listagem de filmes por gênero
- Visualização dos detalhes de cada filme
- Inserção de reviews pelos usuários autenticados
- Área administrativa para gerenciar filmes (web)
- Versão mobile para navegação e review

---

## 📦 Como rodar o projeto localmente

### 🧪 Backend

```bash
cd backend
./mvnw spring-boot:run
```

A aplicação estará em: `http://localhost:8080`

> Lembre-se de configurar o banco PostgreSQL e o `application.properties` conforme seu ambiente.

### 💻 Frontend Web

```bash
cd frontend
yarn install
yarn start
```

Acesse em: `http://localhost:3000`

### 📱 Mobile (Expo)

```bash
cd mobile
yarn install
npx expo start
```

> Altere a `BASE_URL` no arquivo `mobile/src/core/utils/request.ts` para o IP local da sua máquina.

---

## 👤 Autor

Projeto originalmente desenvolvido no Bootcamp **DevSuperior** por **Felipe Gonzales**.
