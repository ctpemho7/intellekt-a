function localWeek(language) {
  const rusWeek = ['Понедельник', 'Вторник', 'Среда', 'Четверг', 'Пятница', 'Суббота', 'Воскресенье'];
  const engWeek = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];

  if (language === 'ru') {
    return rusWeek;
  } else if (language === 'en') {
    return engWeek;
  } else {
    console.log('Некорректное значение языка!');
    return [];
  }
}
