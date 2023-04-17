package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.posts.Get;

public class PostsSteps {
    @Steps
    Get get;
    @Given("I set valid GET endpoints")
    public void setValidGetEndpoints(){
        get.setValidGetEndpoints();
    }
    @When("I send GET HTTP requestss")
    public void sendGetHttpRequestss(){
        get.sendGetHttpRequestss();
    }
    @Then("I receive valid HTTP responsess code 200")
    public void receiveValidHttpResponsess(){
        get.receiveValidHttpResponsess();
    }
    @And("I receive valid data for detail posts")
    public void receiveValidData(){
        get.receiveValidData();
    }
    @Given("I set valid GET endpointss")
    public void setValidGetEndpointss(){
        get.setValidGetEndpointss();
    }
    @When("I send GET HTTP requestsss")
    public void sendGetHttpRequestsss(){get.sendGetHttpRequestsss();
    }
    @Then("I receive valid HTTP responsesss code 404")
    public void receiveValidHttpResponsesss(){
        get.receiveValidHttpResponsesss();
    }
}
