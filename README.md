
﻿
# Проект по автоматизации тестирования для компании [Alfabank](https://alfabank.ru/)

> Альфа‑Банк — крупнейший частный банк России, предоставляющий полный спектр финансовых услуг для розничных и корпоративных клиентов, включая банковские продукты, инвестиционный банкинг и управление активами

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
<a href="https://www.telegram.org"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a> 
</p>

____
<a id="cases"></a>
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____

- ✓ *Проверка англоязычной версии сайта*
- ✓ *Проверка работы поиска и логики ответа*
- ✓ *Проверка расчетов калькулятора вклада*
- ✓ *Проверка раскрытия меню при наведении*
- ✓ *Проверка переключения кнопок в главном меню*
- ✓ *Проверка логотипа компании на главной странице*
- ✓ *Проверка отображения баннера на главной странице*
- ✓ *Проверка открытия вкладки "Открытие расчетного счета"*


____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/student_alesnp_qa_guru_35_AlfaTest/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/student_alesnp_qa_guru_35_AlfaTest/"><img src="images/screen/jenkins_build.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- *selenoid_url (логин, пароль и адрес удаленного сервера Selenoid)*
- *BROWSER (браузер, по умолчанию chrome)*
- *BROWSER_VERSION (версия браузера, по умолчанию 128.0)*
- *BROWSER_SIZE (размер окна браузера, по умолчанию 1600x900)*

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean alfa_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean alfa_test
-Dselenoid_url=${selenoid_url}
-Dbrowser=${BROWSER}
-Dbrowser.version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE}
```
___
<a id="allure"></a>
## <img alt="Allure_Report" height="25" src="images/logo/Allure_Report.svg" width="25"/></a> <a name="Allure_Report"></a>Allure [отчет](https://jenkins.autotests.cloud/job/Project%20student_alexsnp_qa_guru_AlfaTests/36/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/jenkins.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/jenkins_tests.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/allure_graphs.png" width="850">
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4842/dashboards">Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/allure_overview.png" width="850">  
</p>  

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/manual_tests.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/autotests.png" width="850">  
</p>

___
<a id="jira"></a>
## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-682">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screen/jira.png" width="850">  
</p>

____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/telegram.png" width="550">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/x5.gif" width="550" height="350"  alt="video">   
</p>

