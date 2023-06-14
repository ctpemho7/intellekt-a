function UserAgeException(message) {
  this.message = message;
}

function checkAge(age) {
  try {
    if (!age) {
      throw new UserAgeException("В поле ввода ничего не введено");
    }
    if (isNaN(age)) {
      throw new UserAgeException("Введено не число");
    }
    if (age < 16 || age > 120) {
      throw new UserAgeException("Неподходящий возраст");
    }

    console.log("Доступ разрешен");

  } catch (exception) {
    console.log(exception.message);
  }
}