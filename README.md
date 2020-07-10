# WebTestingMiniProject

## Project Aim:
The object of the program is to give testers an easier way to test the Sparta Gloabl Registration form website, using Page Object Models to all for more efficient testing.


## Technology:
GitHub: GitHub: Used for project management. Using it to manage the quality of code and also to back up everything needed for the project.

Intellij: IDE of choice, allowed for easy access to GitHub as I was able to push individual classes as and files when ever I desired.

ChromeDriver: Used to allow for the code created to control the google chrome browser.

## Languages, Libraries and dependencies:
- Java 14
- Git
- Maven
- JUNIT 4.6.2
- Selenium 3.141.59
- ruby 2.6.3p62

## Building Tests:
This is a breakdown of some tests that testers could possibly run, hopefully this also gives you an understanding of what you should be looking for when testing. 

1. Testing URL Connection:
    - Checking the URL connection is something that falls under the should test category. By testing this you are able to see if your connection to the website is running correctly and if you are at the correct URL. This can be done using the getURL method in the page object model.

2. Testing Website Design:
    - Testing website design is very important as it is what all the users see. It can determine how inclined a user is to reuse the site. Testing things such as if there is a placeholder where text should go allows you to check what the user can see. The firstNamePlacholder method is just one of the methods where this is possible.

    - This can be taken a step further in testing the design of tick boxes, if they work how they are meant to. For example using the isMaleClikced method will show you if Male was selected as the gender.

    - Drop down menus is also something that effects the design of the website. Can the options given be selected? How many options are there? Is there an option for if none of the other options apply to the user?
