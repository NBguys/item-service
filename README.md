타임리프에서 ENUM 직접 접근
```
<div th:each="type : ${T(hello.itemservice.domain.item.ItemType).values()}">
```