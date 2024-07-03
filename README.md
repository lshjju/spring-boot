# spring-boot
spring-boot-jpa

@GetMapping("/edit/{id}")
String edit(Model model) {
  Optional<Item> result = itemRepository.findById(1L);
  if (result.isPresent()) {
    model.addAttribute("data", result.get());
    return "edit.html";
  } else {
    return "redirect:/list";
  }
}
    
