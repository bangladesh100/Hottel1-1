package stepdef;

import com.action.ActionClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelsStepdef {

	ActionClass hotelAction = new ActionClass();

	// @Given("^Navigate the URL, WWW\\.hotels\\.com$")
	// public void navigate_the_URL_WWW_hotels_com() throws Throwable {
	// hotelAction.hotelsbooking();}
	@Given("^Navigate the Hotel$")
	public void navigate_the_Hotel() throws Throwable {
		hotelAction.hotelsbooking();
	}

	@When("^select destination as New York, New York, United States of America$")
	public void select_destination_as_New_York_New_York_United_States_of_America() throws Throwable {
		hotelAction.selectDestination();
	}

	@When("^click on close button$")
	public void click_on_close_button() throws Throwable {
		hotelAction.closeDestination();
	}

	@When("^select  check in and  date$")
	public void select_check_in_and_date() throws Throwable {
		hotelAction.selectCheckin();
	}

	@When("^click on check in close button$")
	public void click_on_check_in_close_button() throws Throwable {
		hotelAction.closeCheckin();
	}

	@When("^select check out and date$")
	public void select_check_out_and_date() throws Throwable {
		hotelAction.selectChechOut();
	}

	@When("^click on check out close button$")
	public void click_on_check_out_close_button() throws Throwable {
		hotelAction.closeChechOut();
	}

	@When("^click on  Search button$")
	public void click_on_Search_button() throws Throwable {
		hotelAction.selectSearch();
	}

	// @Then("^successful open next page for see details$")
	// public void successful_open_next_page_for_see_details() throws Throwable {
	// hotelAction.
	// }

}
