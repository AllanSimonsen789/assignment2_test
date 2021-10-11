# 1 Reflections

## 1.1 Computer mouse

1. plug-in the mouse to a computer via the usb port

*Test 1: Does the computer register the mouse as an input device

2. Move the mouse up and down. Left and right. and diagonally.

*Test 2: The cursor on the screen moves corresponding to the movement described above. 
*Test 2.1: Test different surfaces with the movement described in test 2. Try desktop table, mousepad, book, magazine, chair, pants, floor etc.

3. Move the cursor over a icon on the computer. press the left mouse button. (prerequisites: the cursor is on a icon)

*Test 3: The icon should be in focus(highlighted) after the left button click.

4. press the Right mouse button. (prerequisites: the cursor is on a icon)

*Test 4: The icon should be highlighted and a sub menu should open on the icon.

5. Open a webbrowser of you choice and go to a website of your choosing. 

Scroll on the mousewheel up and down. 

press on the mouse wheel and move the mouse up and down.

*Test 5: The webpage should scroll up and down according to your movement on the mouse wheel.

6. (optional) Go to a new webpage. Press one of the the buttons on the side of the mouse, right above your thumb. After press the other one.

*Test 6: The webpage should load the previous webpage then go back to the new webpage when pressing the second button.


## 1.2 CATASTROPHIC FAILURE

The Nissan Airbag glitch.
Nissan has reportedly recalled countless airbag units from their cars the last 3 years.
This was due to a software glitch where the airbag did not register that a person was sitting in the passenger seat, and not inflate properly during accidents.

To fix this we could do the following steps:

unit testing the sensor.(should be done by the manufacturer of the sensor)

Unit testing the code that triggers the airbag.

integration test with the sensor, test that the information from the sensor can actually be read an processed by the airbag.

manual test of the sensor with a crash test dummy in the seat.


# 2 Two Katas

## 2.1 String Utility
Can be found in the project folder -> src/main folder as MyStringUtilityTool and TestStringUtility

## 2.2 Bowling Game Kata
Can be found in the project folder -> src/main folder as BowlingGameTest and Game

# 3 Investigation of tools

## 3.1 junit 5

### @tag
tag is a annotation used for taging test, forexample; "unit test", "integration test", etc or "slow" "fast" etc
The tag annotation takes a string value which is the tag. a tag cannot be empty and must be one word.

### @disabled
the disabled annotation is used for disabling test classes or methods so they are not executed. This a handy way to temporarily disable tests instead of using comments

### @RepeatedTest
The repeatedTest annotation is used for repeating the same the same test x amount of times. Each of these runs act as their own independet test execution.
Can be very handy to run multiple test with different input but can also make the code at little more complex.

### @beforeEach, @AfterEach
beforeEach annotation is used to declare code to be executed before each test in a test class.
afterEach annotation is used to declare code to be executed after each test in a test class.
This can be used forexample in integration test to setup database connection or clean/delete files for i/O test etc

### @beforeAll, @AfterAll
beforeAll annotation is used to declare code to be executed once before all other tests in a test class.
afterAll annotation is used to declare code to be executed once after all other tests in the test class.
This can also be used in integration tests to setup database connections or i/o filereaders.

### @displayName
The displayname annotation can be used to display a custom name for a test with less restrictions than the method name. You can use whitespaces, special characters and emojis.

### @nested
The nested annotation is used to signal that the class shares setup and state with an instance of its inclosig class.

### @assumeFalse, assumeTrue
assumeFalse and assumeTrue is part of the Assumptions Utility methods collection.
contrary to assertions, assumptions does not result in test failure, but instead the test is aborted.

## 3.2

mockito vs. easymock

Both are easily implemented through maven in java. Both implement mocking capabilities for your test cases through annotations. 
however easymock can only make mocks where mockito also has spy, fakes etc.
easymock is by definition "easier" to use, its certainly more simple, however this does not necessarily translate to better tests cases.
Mockito is well known and the most used in the Java community, therefore there are more ressources online for learning and trouble shooting.
i would definetely look into using mockito as the support for more (and better) test doubles is more attractive than the oversimplified framework easymock.

