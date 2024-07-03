(list.html)

<div class="card" th:each="i : ${items}">
    <img src="https://placehold.co/300">
    (생략)
    <a th:href="/???">✏️</a>
</div>
  
@GetMapping("/edit")
String edit() {
  return "edit.html";
}

@GetMapping("/edit")
