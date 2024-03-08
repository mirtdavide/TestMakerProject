# TestMaker

### Disclaimer
Every screen used in this file is in italian language as i made this while i was in italy during highschool but along with the description each image should be easily understandable

## A small description of this repo content

TestMaker is a simple project that i made in high school that allows the user to create a test on a determined subject or attempt one

## Account Creation

To access the app we can either login with an existing account create an account, everything is saved locally in a txt file; every input is checked in order to make sure no blank textfields are left.

![login.jpg](readme_res%2Flogin.jpg) ![register.jpg](readme_res%2Fregister.jpg)
# Admin

admin related frames

## Admin Frame

There is a standard account that is the admin account: this account is the one that is able to create the tests and has its own UI dedicated to the admin operations.

![admin_frame.jpg](readme_res%2Fadmin_frame.jpg)

As an admin we can either create a test or attempt one.

## Test Creation Frame
In order to create a test we must give as input the title, the subject and the number of questions.     
Based on question number a standard time (Ex. 10 Questions = 10 minutes) will be assigned for the completion of the test to the students, if time runs out and the test is not completed the score will be 0.

![test_create_math.jpg](readme_res%2Ftest_create_math.jpg)

## Question Creation Frame

When we are adding a question to our test we can decide if it will be a single-answer(radio button) or a multiple answer question(check boxes).
We can even add the option for the question to have an image: if we save our image in the project directory and tipe its name in the image name textfield a preview of our file should appear on the screen if it exists

![question_ui.jpg](readme_res%2Fquestion_ui.jpg)

# User

User related frames

## User Frame

As a user we can either attempt a test or check the scores for each test

![user_frame.jpg](readme_res%2Fuser_frame.jpg)

## Subject Selection

If we want to attempt a test we will be prompted with the following frame where we can select the subject of the test , if we click on a subject a list of available tests will be shown to us from which we can select the test we want to try out.


![subject_selection.jpg](readme_res%2Fsubject_selection.jpg)

![subject_selection_test.jpg](readme_res%2Fsubject_selection_test.jpg)

## Answer Question Frame

Once we select a test we are given a timer and have to answer to all the test questions before the time runs out.

![question.jpg](readme_res%2Fquestion.jpg)

If we answer correctly, it will simply give us a Correct! Window Message,

![question_correct.jpg](readme_res%2Fquestion_correct.jpg)

If our answer is wrong, the app will tell us which was/were the correct answer/s,

![question2.jpg](readme_res%2Fquestion2.jpg)

![question2_wrong.jpg](readme_res%2Fquestion2_wrong.jpg)

Once we finish the test or if the time runs out our score will be saved.

![score.jpg](readme_res%2Fscore.jpg)

And if we want to check out our grades we have to go back to the user frame and select the check the scores option.
The Subject Selection Frame will pop out but this time if we select a test, everybody scores will be shown to us


![scores.jpg](readme_res%2Fscores.jpg)

![scores2.jpg](readme_res%2Fscores2.jpg)

# Conlcusion
And that's it, thank you for your attention.
The app itself is very rough as it misses some basic functions such as a go back button or confirm using the enter key and the code may be poorly written with many repetitions but it was mainly a challenge for myself where i inserted all my knowledge of java at the time; i also made the same project but using a Client/Server architecture in order to test out UDP/TCP protocols in java, it should be up on my github 
