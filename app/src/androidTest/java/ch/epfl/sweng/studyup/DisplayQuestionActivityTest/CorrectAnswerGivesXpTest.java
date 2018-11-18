package ch.epfl.sweng.studyup.DisplayQuestionActivityTest;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import ch.epfl.sweng.studyup.MainActivity;
import ch.epfl.sweng.studyup.R;
import ch.epfl.sweng.studyup.player.Player;
import ch.epfl.sweng.studyup.player.QuestsActivityStudent;
import ch.epfl.sweng.studyup.questions.Question;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static ch.epfl.sweng.studyup.questions.DisplayQuestionActivity.XP_GAINED_WITH_QUESTION;
import static ch.epfl.sweng.studyup.questions.DisplayQuestionActivity.getIntentForDisplayQuestion;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class CorrectAnswerGivesXpTest extends DisplayQuestionActivityTest {
    @Test
    public void correctAnswerGivesXpTest(){
        /*Question testQuestion = new Question("abc", "test", true, 0);
        Intent i = getIntentForDisplayQuestion(InstrumentationRegistry.getTargetContext(), testQuestion);
        mActivityRule.launchActivity(i);
        int playerXp = Player.get().getExperience();
        onView(withId(R.id.answer_button)).perform(click());
        onView(withText("Make your choice !")).inRoot(withDecorView(not(mActivityRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
        onView(withId(R.id.answer2)).perform(click()).check(matches(isChecked()));
        onView(withId(R.id.answer1)).perform(click()).check(matches(isChecked()));
        onView(withId(R.id.answer3)).check(matches(not(isDisplayed())));
        onView(withId(R.id.answer4)).check(matches(not(isDisplayed())));
        onView(withId(R.id.answer_button)).perform(click());
        onView(withText("Correct answer ! Congrats")).inRoot(withDecorView(not(mActivityRule.getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
        assertEquals(playerXp + XP_GAINED_WITH_QUESTION, Player.get().getExperience());
        Intents.intending(hasComponent(QuestsActivityStudent.class.getName()));
        */
    }


}