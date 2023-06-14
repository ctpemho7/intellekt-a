function browserCheck(browser) {
  switch (browser) {
    case 'Internet Explorer':
      alert('IE не поддерживает функции данного сайта');
      break;
    case 'Chrome':
    case 'Firefox':
    case 'Safari':
    case 'Opera':
      alert('Добро пожаловать!');
      break;
    default:
      alert('Некоторые функции сайта не поддерживаются в данном браузере');
      break;
  }
}
