function sortSales(shopNumbers, shopSales) {
  if (shopNumbers.length !== shopSales.length) {
    console.log("Corrupted Data");
    return;
  }

  if (shopNumbers.length === 0 || shopSales.length === 0) {
    console.log("Empty Data");
    return;
  }

  for (let i = 0; i < shopSales.length - 1; i++) {
    for (let j = 0; j < shopSales.length - i - 1; j++) {
      // отсортировать подразделения по убыванию объемов продаж

      if (shopSales[j] < shopSales[j + 1]) {
        // меняем данные местами

        let tempSale = shopSales[j];
        shopSales[j] = shopSales[j + 1];
        shopSales[j + 1] = tempSale;
        let tempNumber = shopNumbers[j];
        shopNumbers[j] = shopNumbers[j + 1];
        shopNumbers[j + 1] = tempNumber;
      }
    }
  }

  console.log("Shop Numbers:", shopNumbers);
  console.log("Shop Sales:", shopSales);
}
