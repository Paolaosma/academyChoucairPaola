package co.com.choucair.certification.proyectobasepaola.stepdefinitions;


import co.com.choucair.certification.proyectobasepaola.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobasepaola.questions.Answer;
import co.com.choucair.certification.proyectobasepaola.tasks.Login;
import co.com.choucair.certification.proyectobasepaola.tasks.Openup;
import co.com.choucair.certification.proyectobasepaola.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Paola wants to learn automation at the academy Choucair$")
    public void thanPaolaWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Paola").wasAbleTo(Openup.thePage(), (Login.OnThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));

    }

    @When("^she search for the course on the choucair academy platform$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^she finds the course called$")
    public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}
