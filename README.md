# WebTestingMiniProject

## Project Aim:
The object of the program is to give testers an easier way to test the Sparta Gloabl Registration form website, using Page Object Models to all for more efficient testing.


## Technology:
GitHub: Used for project management. Using it to manage the quality of code and also to back up everything needed for the project.

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

    - This can be taken a step further in testing the design of tick boxes, if they work how they are meant to. For example using the isMaleClicked method will show you if Male was selected as the gender.

    - Drop down menus is also something that effects the design of the website. Can the options given be selected? How many options are there? Is there an option for if none of the other options apply to the user?

## What I wanted to test, what I did test and what I couldn't test
   ### What I wanted to test:
   - I wanted to test more of the background application of the website. What happens when I submit all the information? Do the textboxes work properly. How do I know what Information is needed for a successful submission.
   - A test I didnt build was to check if the information written was correct for example, can I give a surname with numbers in it? Or is there an age restriction on submitting the form (18 or older)?
   
   ### What I did test: 
   - I tested a lot of the site design. Do tick boxes and drop down menus work? Am I getting error messages for information not being filled in? I also looked at if the site has default messages within textboxes to give the user an indication of what to write in the box or the format of how it should be written.
   
   ### What I couldn't test:
   - I struggled with testing a few areas of the website. One of them being the Age section. I wanted to do some testing on if the up and down arrows worked but failed to find a way to do that. I also wanted to look more into the page after submitting the form but felt I was not able to.