@InitBinder-Built-in PropertyEditors in Spring MVC

binder.registerCustomEditor(Date.class, "doj", new CustomDateEditor(dateFormat, true/false));
