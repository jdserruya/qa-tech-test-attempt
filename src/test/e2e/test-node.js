const webdriver = require('selenium-webdriver');

const driver = new webdriver.Builder()
    .forBrowser('chrome')
    .build();

driver.navigate().to('http://127.0.0.1:3000');