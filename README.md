# Spring JPA Relationships – Nurses & Events

Este proyecto implementa dos modelos independientes usando **Spring Data JPA**.

## 1️⃣ Association of Nurses
Modela una asociación con 7 capítulos y sus miembros.

**Entidades:**
- **Chapter**
    - `name`
    - `district`
    - `president` (`Member`)
    - `members` (`List<Member>`)
- **Member**
    - `name`
    - `status` (`ACTIVE` o `LAPSED`)
    - `renewalDate`
    - Relación con `Chapter`
- **MemberStatus** *(enum)*

---

## 2️⃣ Event Management
Modela eventos futuros, que pueden ser conferencias o exposiciones.

**Entidades:**
- **Event** *(abstract)*
    - `date`
    - `duration`
    - `location`
    - `title`
    - `guests` (`List<Guest>`)
- **Guest**
    - `name`
    - `status` (`ATTENDING`, `NOT_ATTENDING`, `NO_RESPONSE`)
    - Relación con `Event`
- **GuestStatus** *(enum)*
- **Conference** *(extiende Event)*
    - `speakers` (`List<Speaker>`)
- **Speaker**
    - `name`
    - `presentationDuration`
    - Relación con `Conference`
- **Exposition** *(extiende Event)*

---

## Tecnologías usadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- Lombok
- Jakarta Persistence API
